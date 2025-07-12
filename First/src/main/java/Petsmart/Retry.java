package Petsmart;

import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{

	private int retryCount = 0;
	private static final int maxRetryCount = 4;

	@Override
	public boolean retry(ITestResult failed) {
		if (retryCount < maxRetryCount) {
			retryCount++;
			return true;
		}
		return false;
	}
}