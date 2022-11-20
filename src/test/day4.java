package test;

import org.testng.annotations.Test;

public class day4 {
	
	@Test(groups= {"Smoke"})
	public void WebLoginHomeloan() {
		System.out.println("WebLoginCarloan");
		
	}
   
	
	@Test
	public void MobileLoginHomeloan() {
		System.out.println("MobileLoginHomeloan");
		
	}
	

	public void RestAPILoginHomeloan() {
		System.out.println("RestLoginHomeloan");
		
	}

}
