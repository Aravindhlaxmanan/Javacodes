package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenerstry implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		// not implemented

		System.out.println("onTestStart");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// not implemented
		System.out.println("onTestSuccess");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		// not implemented
		System.out.println("onTestFailure");
	}
	@Override
	public void onStart(ITestContext context) {
		// not implemented
		System.out.println("onStart");
	}
	@Override
	public void onFinish(ITestContext context) {
		// not implemented
		System.out.println("onFinish");
	}

}
