package Petsmart;

import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;

// Retry analyzer that reruns failed tests up to a configured maximum count.
public class Retry implements IRetryAnalyzer{

	private int retryCount = 0;
	private static final int maxRetryCount = 4;

	@Override
	public boolean retry(ITestResult failed) {
		// Retry only while maximum retry count has not been reached.
		if (retryCount < maxRetryCount) {
			retryCount++;
			// Return true so TestNG executes the failed test again.
			return true;
		}
		// Return false to stop retry attempts.
		return false;
	}
}
