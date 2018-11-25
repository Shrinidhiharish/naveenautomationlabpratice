package Part2Pratice;

public class ConstructorConcepts {
//constructor is a class entity used to define class feature while creating the objects.
	//properties: not a function
	//no return value
	//same name as class name
	public ConstructorConcepts() //default constructor no parameter
	{
System.out.println("default constructor");		//constructor overloading
	}
	public ConstructorConcepts(int i)
	{
System.out.println("1 param");	
System.out.println("1 param value is " +i);	
	}
	
	public ConstructorConcepts(int i , int j)
	{
		System.out.println("2 param values" +i);
		System.out.println("2 param values" +j);
	}
	public static void main(String[] args) {
	
		ConstructorConcepts obj=new ConstructorConcepts();//calling default constructor 
		ConstructorConcepts obj1=new ConstructorConcepts(10);
		ConstructorConcepts obj2=new ConstructorConcepts(10,20);
	}

}
