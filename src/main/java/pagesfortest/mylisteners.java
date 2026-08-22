package pagesfortest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// Class declaration that groups the related example logic in one place.
public class mylisteners implements ITestListener{
	
	public void onTestStart(ITestResult result) {
	    // not implemented
	  }

	 public void onTestSuccess(ITestResult result) {
	    
		 // Display information to the console for the user.
		 System.out.println("on success");
	  }

	  
	public void onTestFailure(ITestResult result) {
	    // Display information to the console for the user.
	    System.out.println("on failure");
	  }

	  
	public void onTestSkipped(ITestResult result) {
		// Display information to the console for the user.
		System.out.println("on skipped");
	}
	

}
