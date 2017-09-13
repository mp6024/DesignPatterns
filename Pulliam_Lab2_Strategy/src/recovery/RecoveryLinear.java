package recovery;

public class RecoveryLinear implements RecoveryBehavior
{
	private int recoveryValue;
	private int maxLife;
	private int currentLife;
	
	
	
	public RecoveryLinear( int recovery, int max, int current)
	{
		maxLife = max;
		recoveryValue = recovery;
		currentLife = current;
		
		
	}
	
	


	




	public int fullRecovery()
	{
		return currentLife  = maxLife;
	}
	
	@Override
	public int calculateRecovery(int currentLife, int maxLife) 
	{
			if(currentLife == maxLife)
			{
				return currentLife;
			}
			if((currentLife + recoveryValue) > maxLife)
			{
				return currentLife = maxLife;
			}
			if(currentLife <= 0)
			{
				return currentLife;
			}
			if(currentLife > 0)
			{
			
				currentLife = currentLife + recoveryValue;
				return currentLife;
			}
				return currentLife;
		
	}

	
//	public int lifePointsWithDamage(int damage)
//	{
//		if(currentLife <= 0 )
//		{
//			return currentLife = 0;
//		}
//		
//		if((currentLife == maxLife) || (currentLife > 0 && damage > 0))
//		{
//		 return currentLife = currentLife - damage;
//		}
//		
//		if((currentLife - damage)< 0)
//		{
//			return currentLife = 0;
//		}
//		 
//		return currentLife;
//	}
}