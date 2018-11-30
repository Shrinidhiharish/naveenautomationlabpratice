package Pratice_2;
//finally is a block
//though there is exception finally block statement will get executed
//finally keyword is always used with try catch 
//it gets executed after try catch block but before the control transfer black to its origin
public class FinallyConcept {
public static void main(String[] args) 
{
jerry();
testmode();
div();
}

	public static void jerry()
     {
	try {
		System.out.println("jerry is inside");
		throw new RuntimeException("error");	          
	}catch(Exception e)
	{
		System.out.println("inside catch block");
	}
	finally 
	{
		System.out.println("finally iam learning something :)");
	}
}
	public static void testmode()
	{
		try {
			System.out.println("testmodeon");
		}
		finally {
			System.out.println("finally its finalized to be final ");
		}
	}
	
	public static void div()
	{
		int i=20;
		try {
			System.out.println("lets divide");
			int k=i/0;
		}
		catch(ArithmeticException e){
			System.out.println("inside catch");
			System.out.println("dividing by zero ");
		}
		finally
		{
			System.out.println("yes iam here tooo");
		}
	}
}