package testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.DataUtil;
import utilities.ExcelReader;

public class BankManagerLoginTest extends BaseTest {
	
	
	
	@Test
	public void loginTest() {
		
		
		click("bmlBtn_CSS");
		Assert.assertTrue(isElementPresent("addCustBtn_CSS"),"Bank Mananger not logged in");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Assert.fail("Bank Manager Test failed");
	}
	
	


}
