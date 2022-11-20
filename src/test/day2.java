package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day2 {
	
	
	@Test(dataProvider="dataSet")
	public void ploanLogin(String username,String password) {
		System.out.println("Good");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] dataSet() {
		
		Object[][] data =new Object[3][2];
		data[0][0]="firstUserName";
		data[0][1]="firstPwd";
		
		data[1][0]="secondtUserName";
		data[1][1]="secondPwd";
		
		data[2][0]="thirdUserName";
		data[2][1]="thirdPwd";
		
		return data;
	}


}
