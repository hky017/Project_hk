package campaignTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice {
	@Test
	public void demo() {
		String actualStringResult="abc";
		String expectedStringResult="abc";
		
		Assert.assertEquals(actualStringResult,expectedStringResult);
		System.out.println("Pass");
	}
	
	@Test
	public void demo2() {
		boolean actualBooleanResult=true;
		boolean expectedlBooleanResult=false;
		
		Assert.assertEquals(actualBooleanResult, expectedlBooleanResult);
		System.out.println("Pass");

		
		System.out.println("Change in local");

		System.out.println("making Direct changes to Global");
	}
}
