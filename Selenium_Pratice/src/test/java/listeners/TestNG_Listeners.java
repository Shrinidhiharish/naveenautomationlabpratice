package listeners;

import javax.naming.spi.DirStateFactory.Result;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNG_Listeners implements ITestListener
{

	public void onFinish(ITestContext result) {
		System.out.println("******* Test Started "+result.getName());
		
	}

	public void onStart(ITestContext result) {
      System.out.println("****** Test is successfull" +result.getName());		
	}

//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//	      System.out.println("****** Test failed" +result.getName());			
//	}

	public void onTestFailure(ITestResult result) {
	      System.out.println("****** Test failed" +result.getName());		
	}

	public void onTestSkipped(ITestResult result) {
	      System.out.println("****** Test failed" +result.getName());		
	}

	public void onTestStart(ITestResult arg0) {
		
	}

	public void onTestSuccess(ITestResult arg0) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
