package recovery;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lifeform.Alien;
import lifeform.LifeForm;
import lifeform.MockLifeForm;
import recovery.RecoveryLinear;
import recovery.RecoveryNone;

public class TestRecovery 
{
	
	
	@Test
	public void testInitialization()
	{
		RecoveryNone entity;
		entity = new RecoveryNone();
		assertEquals(40, entity.getLifePoints(40));
		
		
		
		
	}
	@Test
	public void damageWithNone()
	{
		RecoveryNone entity;
		entity = new RecoveryNone();
	assertEquals(35, entity.damageTaken(5));
	assertEquals(0, entity.damageTaken(60));
	assertEquals(0, entity.damageTaken((-5)));
	}
	
	
	@Test
	public void noRecoveryWhenNotHurtLinear()
	{
		int maxLifePts = 30;
		RecoveryLinear rl = new RecoveryLinear(3, maxLifePts);
		RecoveryLinear r1 = null;
		int result = r1.lifePointsWithDamage(5);
		 //int result = rl.calculateRecovery(result, maxLifePts);
		
		assertEquals(27, result);
	}
	
	@Test
	public void recvoeryWithAlotOfDamage()
	{
		int maxLifePts = 30;
		RecoveryLinear morty = new RecoveryLinear(3, maxLifePts);
		
	    int current = morty.lifePointsWithDamage(10);
	    morty.calculateRecovery(current, maxLifePts);
	   
	    assertEquals(23,morty.getLifePoints());
	}
	@Test 
	public void fullrecoveryTest()
	{
		int maxLifePts = 30;
		RecoveryLinear morty = new RecoveryLinear(3, maxLifePts);
		
	   int something = morty.lifePointsWithDamage(10);
	   morty.calculateRecovery(something, maxLifePts);
	    assertEquals(30,morty.fullRecovery());
	    
		
	}
	
	@Test
	public void wontPassMax()
	{
		int maxLifePts = 50;
		RecoveryLinear Rick = new RecoveryLinear(10, maxLifePts);
		int anotherOne = Rick.lifePointsWithDamage(2);
		Rick.calculateRecovery(anotherOne, maxLifePts);
		assertEquals(50,Rick.getLifePoints());
		
	}
	
	@Test 
	public void deadAlien()
	{
		int maxLifePts = 0;
		RecoveryLinear ichigo = new RecoveryLinear(3, maxLifePts);
		
	    int ahh = ichigo.lifePointsWithDamage(10);
	   
	    assertEquals(0,ichigo.calculateRecovery(ahh, maxLifePts));
		
	}
}


