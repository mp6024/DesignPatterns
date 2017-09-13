package lifeform;
/*
 *  Michael Pulliam
 * september 5 2017
 * 
 * 
 */


public abstract class LifeForm 
{
	private String myName;
	private int currentLifePoints;
	private int maxPoints;
	
	/**
	 * Create an instance
	 * 
	 *  @param name the name of the life form
	 *  @param points the current starting life points of the life form
	 *  
	 */
	
	public LifeForm(String name, int points)
	{
		myName = name;
		maxPoints = points;
		currentLifePoints = maxPoints;
	}
	
	/**
	 * @return the name of the life form.
	 */
	public String getName()
	{
		return myName;
	}
	
	/**
	 * @return the amount of life points the life form has.
	 */
	public int getCurrentLifePoints()
	{
		return currentLifePoints;
	}
	
	public int update(int number)
	{
		return currentLifePoints = number;
	}
	
	public int lifePointsWithDamage(int damage)
	{
		if(currentLifePoints <= 0 )
		{
			return currentLifePoints = 0;
		}
		
		if((currentLifePoints == maxPoints) || (currentLifePoints > 0 && damage > 0))
		{
		 return currentLifePoints = currentLifePoints - damage;
		}
		
		if((currentLifePoints - damage)< 0)
		{
			return currentLifePoints = 0;
		}
		 
		return currentLifePoints;
	}
	

}