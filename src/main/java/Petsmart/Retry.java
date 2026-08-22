package Petsmart;

import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;

// Class declaration that groups the related example logic in one place.
public class Retry implements IRetryAnalyzer{

	private int retryCount = 0;
	private static final int maxRetryCount = 4;

	@Override
	public boolean retry(ITestResult failed) {
		// Check the condition before deciding whether this block should run.
		if (retryCount < maxRetryCount) {
			retryCount++;
			// Return the final result back to the caller.
			return true;
		}
		// Return the final result back to the caller.
		return false;
	}
}
