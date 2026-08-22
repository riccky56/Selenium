package pagesfortest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// Simple TestNG listener that prints status messages for basic test lifecycle events.
public class mylisteners implements ITestListener{
	
	public void onTestStart(ITestResult result) {
	    // not implemented
	  }

	 public void onTestSuccess(ITestResult result) {
	    
		 // Print a message when a test completes successfully.
		 System.out.println("on success");
	  }

	  
	public void onTestFailure(ITestResult result) {
	    // Print a message when a test fails.
	    System.out.println("on failure");
	  }

	  
	public void onTestSkipped(ITestResult result) {
		// Print a message when a test is skipped.
		System.out.println("on skipped");
	}
	

}
