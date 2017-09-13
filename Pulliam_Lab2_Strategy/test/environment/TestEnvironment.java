package environment;
import static org.junit.Assert.*; 
import org.junit.Test;
import environment.Environment;
import lifeform.LifeForm;
import lifeform.MockLifeForm;

/*
 * Michael Pulliam
 * september 5 2017
 * 
 */


public class TestEnvironment {
	
	@Test
	public void testCell()
	{
		Environment space;
		space = new Environment(1, 1); // creates a 1 by 1 2d array cell
		LifeForm person; // creates the lifeform
		person = space.getLifeForm(1, 1); // checks to see what is at that place right now
		assertNull(person); // if null then its empty
		Environment space2; // second cell
		space2 = new Environment(2, 3); // 2 by 3
		LifeForm bob; // new lifeform bob
		bob = new MockLifeForm("Bob", 40); // bob name and life points
		boolean added;
		added = space2.addedLifeForm(1, 2, bob); // addes bob
		assertTrue(added); // checks to make sure bob added
				
		assertEquals("Bob",bob.getName()); // make sure thats bob
		assertEquals(40,bob.getCurrentLifePoints()); // gets his life points
		assertTrue(space2.removeLifeForm(1, 2)); // makes bob where bob was is a null character

	}
	

	
}