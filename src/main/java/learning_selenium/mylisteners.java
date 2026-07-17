package learning_selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class mylisteners implements ITestListener{
	
	public void onTestStart(ITestResult result) {
	    // not implemented
	  }

	 public void onTestSuccess(ITestResult result) {
	    
		 System.out.println("on success");
	  }

	  
	public void onTestFailure(ITestResult result) {
	    System.out.println("on failure");
	  }

	  
	public void onTestSkipped(ITestResult result) {
		System.out.println("on skipped");
	}
	

}
