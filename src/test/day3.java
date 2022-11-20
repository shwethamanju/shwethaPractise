package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@Parameters({"URL"})
	@Test
	public void WebLoginCarloan(String urlname) {
		System.out.println("WebLoginCarloan");
		System.out.println(urlname);
		
	}
   	

	public void mobileLoginCarloan() {
		System.out.println("MobileLoginCarloan");
		
	}
	
	@Parameters({"API/Key"})
	@Test
	public void mobileLoginCarloan2(String key) {
		System.out.println("MobileLoginCarloan");
		System.out.println("API Key value"+key);
		
	}
	@Test(groups= {"Smoke"})
	public void mobileLoginCarloan3() {
		System.out.println("MobileLoginCarloan");
		
	}
	
	@Test
	public void RestAPILoginCarloan() {
		System.out.println("RestLoginCarloan");
		
	}
	
}
