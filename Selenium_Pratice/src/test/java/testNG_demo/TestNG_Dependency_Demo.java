package testNG_demo;

import org.testng.annotations.Test;

public class TestNG_Dependency_Demo {

//	@Test(dependsOnMethods= {"test2"},priority=1)
//	public void test1()
//	{
//		System.out.println("iam in test one");
//	}
//	
//	@Test()
//	public void test2()
//	{
//		System.out.println("iam in test two");
//	}
//	@Test()
//	public void test3()
//	{
//		System.out.println("iam in test two");
//	}
	
	@Test(dependsOnGroups= {"sanity.*"},priority=1)
	public void test1()
	{
		System.out.println("iam in test one");
	}
	
	@Test(groups= {"sanity1"})
	public void test2()
	{
		System.out.println("iam in test two");
	}
	
	@Test(groups= {"sanity2"})
	public void test3()
	{
		System.out.println("iam in test three");
	}
}
