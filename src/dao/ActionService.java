package dao;

import java.util.*;
import javax.persistence.EntityTransaction;

import metier.Action;

public class ActionService extends EntityService {
	
	public void insertAction(Action action)
	{
		try
		{
			EntityTransaction transaction = startTransaction();
			if(!entityManager.contains(action))
			{
				transaction.begin();
				entityManager.persist(action);
				entityManager.flush();
				transaction.commit();
			}
			entityManager.close();
		} catch (Exception e)
		{
			
		}
	}
	
	public Action find(int id)
	{
		Action action = null;
		try 
		{
			EntityTransaction transaction = startTransaction();
			transaction.begin();
			action=entityManager.find(Action.class, id);
			entityManager.close();
			emf.close();
		} catch (Exception e)
		{
			
		}
		return action;
	}
	
	public List<Action> findAll()
	{
		List<Action> actions = null;
		try 
		{
			EntityTransaction transaction = startTransaction();
			transaction.begin();
			actions=(List<Action>) entityManager.createQuery("SELECT a FROM action a ORDER By a.id").getResultList();
			entityManager.close();
		} catch (Exception e)
		{
			
		}
		return actions;
	}
}
