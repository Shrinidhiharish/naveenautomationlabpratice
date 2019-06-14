package demo;

public class Sheep implements Animal
{
	public Sheep()
	{
		System.out.println("Sheep is made");
	}
	
public Animal makeCopy()
{
	System.out.println("Sheep is Being made");
	Sheep sheepobject = null;
	try {
		
		sheepobject = (Sheep)super.clone();
	    } 
	catch (CloneNotSupportedException e) 
	{
		e.printStackTrace();
	}
	
	return sheepobject;
	
}
public String toString()
{
	return "dolly was first cloned";
	
}
}
