package learning_selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// Minimal TestNG listener that logs success, failure, and skipped events.
public class mylisteners implements ITestListener{
	
	public void onTestStart(ITestResult result) {
	    // not implemented
	  }

	 public void onTestSuccess(ITestResult result) {
	    
		 // Print when a test passes.
		 System.out.println("on success");
	  }

	  
	public void onTestFailure(ITestResult result) {
	    // Print when a test fails.
	    System.out.println("on failure");
	  }

	  
	public void onTestSkipped(ITestResult result) {
		// Print when a test is skipped.
		System.out.println("on skipped");
	}
	

}
