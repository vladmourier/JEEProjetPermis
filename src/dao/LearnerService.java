package dao;

import java.util.*;
import javax.persistence.EntityTransaction;

import metier.Learner;

public class LearnerService extends EntityService {
	
	public void insertGoal(Learner learner)
	{
		try
		{
			EntityTransaction transaction = startTransaction();
			if(!entityManager.contains(learner))
			{
				transaction.begin();
				entityManager.persist(learner);
				entityManager.flush();
				transaction.commit();
			}
			entityManager.close();
		} catch (Exception e)
		{
			
		}
	}
	
	public Learner find(int id)
	{
		Learner learner = null;
		try 
		{
			EntityTransaction transaction = startTransaction();
			transaction.begin();
			learner=entityManager.find(Learner.class, id);
			entityManager.close();
			emf.close();
		} catch (Exception e)
		{
			
		}
		return learner;
	}
	
	public List<Learner> findAll()
	{
		List<Learner> learners = null;
		try 
		{
			EntityTransaction transaction = startTransaction();
			transaction.begin();
			learners= (List<Learner>) entityManager.createQuery("SELECT l FROM Learner l ORDER BY l.id").getResultList();
			entityManager.close();
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		return learners;
	}
}
