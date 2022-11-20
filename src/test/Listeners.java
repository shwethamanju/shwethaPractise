package test;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listeners implements ITestListener

{
	
	public  void onTestFailure(ITestResult result) {
	    // not implemented
		
		System.out.println("hi.... The test case falied.... and its ben redirected here"+result.getName());
	  }

}
