package testNG_demo;

import org.testng.annotations.Test;
@Test(groups = {"AllClassTests"})
public class TestNG_Groups_Demo 
{
	@Test(groups= {"sanity"})
	public void test1()
	{
		System.out.println("This is Test1");
	}
	@Test(groups = {"smoke"})
	public void test2()
	{
		System.out.println("This is Test2");
	}
	@Test(groups= {"regression","sanity"})
	public void test3()
	{
		System.out.println("This is Test3");
	}
	@Test
	public void test4()
	{
		System.out.println("This is Test4");
	}
	@Test(groups= {"windows.sanity"})
	public void test5()
	{
		System.out.println("This is Test5");
	}
}
