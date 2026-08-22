package Base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// Simple TestNG listener that prints a message when a test succeeds, fails, or is skipped.
public class listeners implements ITestListener{
	
	public void onTestStart(ITestResult result) {
	    // not implemented
	  }

	 public void onTestSuccess(ITestResult result) {
	    
		 // Print a success message when a test finishes without errors.
		 System.out.println("on success");
	  }

	  
	public void onTestFailure(ITestResult result) {
	    // Print a failure message when a test ends with an error.
	    System.out.println("on failure");
	  }

	  
	public void onTestSkipped(ITestResult result) {
		// Print a skipped message when a test is not executed.
		System.out.println("on skipped");
	}
	

}
