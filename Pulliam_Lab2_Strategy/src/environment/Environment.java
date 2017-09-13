package environment;
import lifeform.LifeForm;

/*
 *  Michael Pulliam
 * september 5 2017
 */


public  class Environment {
	
	private Cell[][] cells; // is a 2d array of cells with unknown size right now
	
	private int rowMax; // max size of rows
	private int colMax; // max size of coloums
	public Environment(int first, int second)
	{
		rowMax = first; // max size
		colMax = second; // max size
		 this.cells =  new Cell[first][second]; // creates and instance of that cell given the parameters
		// basically walks through the array creating it
		 for(int x = 0;x<first;x++)
		{
			for(int w = 0;w<second;w++)
			{
				 cells[x][w] = new Cell();
			}
		}
		
	}
	// walks through the array return what ever is in that exact spot
	// I call get lifeFrom in the cell class and that checks to make sure it is not null at that space,
	// if it is not null then it returns true
	public  LifeForm getLifeForm(int row, int coloumn)
	{
		if(row <= rowMax && coloumn <= colMax && row <= 0 && coloumn <= 0)
		{
			return cells[row][coloumn].getLifeForm();
		}
		
		else
		{
			return null;
		}
	}	
	
	// it just gets the entity which might a person or just a null character which means its empty
	public boolean addedLifeForm(int row, int coloumn, LifeForm entity)
	{
		return cells[row][coloumn].addLifeForm(entity);
	}
	
	// walks through the array and can never go off the array and calls the remove function in cell class
	// remove function will return null which means its empty then and then it returns true if it makes the space a null
	// else its a false
	public 	boolean removeLifeForm(int row, int coloumn)
	{	
		if(row <= rowMax && coloumn <= colMax && row >= 0 && coloumn >= 0)
		{
			
			cells[row][coloumn].remove();
			return true;
		}
		
		else
		{
			return false;
		}
		
			
	}
		
		
	
	
	
	
	
	
}

