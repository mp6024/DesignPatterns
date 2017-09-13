package lifeform;
import static org.junit.Assert.*; 

import org.junit.Test;

import lifeform.LifeForm;
import lifeform.MockLifeForm;

/**
 * 
 *  Michael Pulliam
 * september 5 2017
 * 
 * Test the functionality provided by the LifeForm Class
 *
 */


public class TestLifeForm 
{
	/**
	 * When a LifeFrom is created, it should know its name and how
	 * many life points it has.
	 */
	@Test
	public void testInitialization()
	{
		LifeForm entity;
		entity = new MockLifeForm("Bob", 40);
		assertEquals("Bob", entity.getName());
		assertEquals(40, entity.getCurrentLifePoints());
	}
	
	

	
}