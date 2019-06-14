package testNG_demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {
@Test
//@Parameters({"A","B"})
//	public void test(String Firstname, String LastName )
//	{
//		System.out.println("be you more often written by "+Firstname);
//		System.out.println("Iam your dad "+LastName);
//
//	}
@Parameters({"C"})
	public void optional(@Optional("nidhi") String name)
	{
		System.out.println("Iam optional parameter "+name);
	}
	
}
