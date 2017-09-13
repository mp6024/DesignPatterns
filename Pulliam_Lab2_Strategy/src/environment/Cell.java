package environment;

import lifeform.LifeForm;

/**
 * Michael Pulliam
 * 
 * A Cell that can hold a lifeForm.
 * 
 *
 */

public class Cell 
{
	
	private LifeForm lifeFormInCell;

	/**
	 * @return the LifeForm in this Cell.
	 */
		public LifeForm getLifeForm()
		{
			return lifeFormInCell;
		}
		
	/**
	 * Tries to add the lifeForm to the cell. Will not add if a 
	 * LifeForm is already present.
	 * checks to make sure the space is empty and if it adds the entity to that space such as bob
	 * @return true if the LifeForm was added to the Cell, false otherwise.
	 */
		public boolean addLifeForm(LifeForm entity)
		{
			boolean added = false;
			if(lifeFormInCell == null)
			{
				
				lifeFormInCell = entity;
				
				return added = true;
				
			}
			return added;
			
				
		}
		// makes what ever was in the space a null so if bob was there it would now be null which is empty
		public boolean remove()
		{	
			
			this.lifeFormInCell = null;
			
			return true;
		
			
		}
}