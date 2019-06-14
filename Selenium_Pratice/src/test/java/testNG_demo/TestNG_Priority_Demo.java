package testNG_demo;

import org.testng.annotations.Test;

public class TestNG_Priority_Demo
{
@Test(priority = 1)	
public void test1()
{
	System.out.println("Iam inside test 1");
}
@Test(priority = -1)
public void test2()
{
	System.out.println("Iam inside test 2");
	
}
@Test(priority = 0)
public void test3()
{
	System.out.println("Iam inside test 3");

}

}
