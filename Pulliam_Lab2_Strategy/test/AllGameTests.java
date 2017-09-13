import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import environment.*;
import lifeform.*;
import recovery.*;

/**
 * mp6024@cs.ship.edu
 * 0100380mp
 */

/**
 * Michael Pulliam
 * september 5 2017 Michael Pulliam
 * 
 * Runs all of the tests in this project
 * 
 */ 
@RunWith(Suite.class)
@Suite.SuiteClasses(
{
	TestCell.class, TestEnvironment.class, TestLifeForm.class, TestHuman.class, TestAlien.class, TestRecovery.class	
})

public class AllGameTests {}