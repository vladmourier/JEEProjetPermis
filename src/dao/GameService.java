package dao;

import java.util.*;
import javax.persistence.EntityTransaction;

import metier.Game;

public class GameService extends EntityService {
	
	public void insertGame(Game game)
	{
		try
		{
			EntityTransaction transaction = startTransaction();
			if(!entityManager.contains(game))
			{
				transaction.begin();
				entityManager.persist(game);
				entityManager.flush();
				transaction.commit();
			}
			entityManager.close();
		} catch (Exception e)
		{
			
		}
	}
	
	public Game find(int id)
	{
		Game game = null;
		try 
		{
			EntityTransaction transaction = startTransaction();
			transaction.begin();
			game=entityManager.find(Game.class, id);
			entityManager.close();
			emf.close();
		} catch (Exception e)
		{
			
		}
		return game;
	}
	
	public List<Game> findAll()
	{
		List<Game> games = null;
		try 
		{
			EntityTransaction transaction = startTransaction();
			transaction.begin();
			games= (List<Game>) entityManager.createQuery("SELECT g FROM Game g ORDER BY g.id").getResultList();
			entityManager.close();
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		return games;
	}
}
