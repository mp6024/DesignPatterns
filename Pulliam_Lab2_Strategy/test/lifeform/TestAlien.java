package lifeform;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lifeform.Alien;
import recovery.RecoveryLinear;

public class TestAlien {
	
	@Test
	public void testInitialization()
	{
		int maxLifePts = 30;
		int timesToRecover = 1;
		int check1;
		Alien entity;
		entity = new Alien("Alien",maxLifePts);
		
		
	for(int i = 0; i<timesToRecover; i++)
		{
		check1 = entity.takenDamage(5);
		entity.linearRecovery(3);
		}
		assertEquals(28,entity.getLifePoints());


	   
	   
	//	}
		 
	}
	@Test
	public void testNoRecover()
	{
		int value;
		int maxLifePts = 50;
		Alien hank;
		hank = new Alien("hank", maxLifePts);
		hank.takenDamage(6);
		hank.noRecovery();
		assertEquals(44,hank.getLifePoints());
	}
	
	@Test 
	public void multipleHits()
	{
		int maxLifePts = 30;
		int timesToRecover = 5;
		int check2;
		Alien entity;
		entity = new Alien("Alien",maxLifePts);
		
		for(int i = 0; i<timesToRecover; i++)
		{
		//check2 = morty.lifePointsWithDamage(5);
	  // morty.calculateRecovery(check2, maxLifePts);
			
				check2 = entity.takenDamage(5);
				entity.linearRecovery(3);
				
				
	   
		}
		assertEquals(20,entity.getLifePoints());

		 //assertEquals(20,morty.getLifePoints());
		
	}

}