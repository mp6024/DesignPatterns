package recovery;

public class RecoveryNone implements RecoveryBehavior
{
	private static int AlienStartLifePoints;
	
	
	@Override
	public int calculateRecovery(int currentLife, int maxLife) 
	{
		return AlienStartLifePoints = currentLife;
		
	}
	
//	public RecoveryNone(int points)
//	{
//
//		
//	}
	
//	public int getLifePoints ( int points)
//	{
//		//AlienName = name;
//		//AlienStartLifePoints = points;
//		return this.getCurrentLIfe;
//	}
	
//	public int damageTaken(int damage)
//	{
//		if(damage > 0)
//		{
//		AlienStartLifePoints = AlienStartLifePoints - damage;
//		}
//		if(damage >= AlienStartLifePoints)
//		{
//			AlienStartLifePoints = 0;
//			return AlienStartLifePoints;
//		}
//		
//		if (damage <= 0)
//		{
//			 
//			return AlienStartLifePoints;
//		}
//		return AlienStartLifePoints;
//	}

	

	
	

}