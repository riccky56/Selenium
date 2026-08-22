package pagesfortest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;

// Retry analyzer that reruns a failed test up to a fixed number of times.
public class Retry implements IRetryAnalyzer{

	private int retryCount = 0;
	private static final int maxRetryCount = 4;

	@Override
	public boolean retry(ITestResult failed) {
		// Retry the failed test while the retry limit has not yet been reached.
		if (retryCount < maxRetryCount) {
			retryCount++;
			// Return true so TestNG knows this test should be executed again.
			return true;
		}
		// Return false once the retry limit is reached so the failure is kept.
		return false;
	}
}
