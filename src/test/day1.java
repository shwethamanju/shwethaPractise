package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day1 {

	@Test
	public void Demo() {
		System.out.println("Hello");
		Assert.assertTrue(false);
		
	}
	//create multiple test cases in a single class whereas in Java we have used void main(String[] args)
	@Test
	public void SecondDemo() {
		System.out.println("Bye");
		
	}

}
