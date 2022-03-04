package testcases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.DataUtil;

public class OpenAccountTest extends BaseTest {
	
	
	@Test(dataProviderClass = DataUtil.class, dataProvider="dp")
	public void openAccountTest(String customer, String currency) throws InterruptedException {
		
		click("openAccBtn_CSS");
		select("customer_CSS",customer);
		select("currency_CSS",currency);
		click("process_CSS");
		
		
		
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("Account created successfully"),"Account not created successfully");
		alert.accept();
		Thread.sleep(2000);
		//Assert.fail("Open Account Test failed");
		
		
	}
	
	

	

}
