package lifeform;

import recovery.RecoveryLinear;
import recovery.RecoveryNone;

public class Alien extends LifeForm {
	
	private int maxLife;
	private String recoveryType;
	private int recoveryNumber;
	private int currentLife = this.getCurrentLifePoints();
	public  Alien(String name, int points)
	{
		super(name, points);
		maxLife = points;			
		
	}
	
	public int getLifePoints()
	{
		
		return currentLife = this.getCurrentLifePoints();
		
	}
	
	public int noRecovery()
	{
		RecoveryNone morty = morty = new RecoveryNone();
		currentLife = morty.calculateRecovery(currentLife, maxLife);
		update(currentLife);
		return currentLife;
		
	}
	
	public int linearRecovery(int recover)
	{ int checkff;
		RecoveryLinear morty = new RecoveryLinear(recover, maxLife, currentLife);
	 currentLife = morty.calculateRecovery(currentLife, maxLife);
	 update(currentLife);
	 return currentLife;
	 //return currentLife;
		
	}
	
	public int takenDamage(int damage)
	{
				
		return currentLife  = this.lifePointsWithDamage(damage);

	}
	
	

//	public int checkWhatRecoveryType()
//	{
//		int result = 0;
//		
//		if(recoveryType == "none")
//		{
//			RecoveryNone morty = morty = new RecoveryNone();
//			return result;
//		}
//		
//		if(recoveryType == "linear")
//		{
//			
//			
//		}
//		
//		if(recoveryType == "fractional")
//		{
//			
//		}
//		return result;
//	}

}