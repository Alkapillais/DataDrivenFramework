package testcases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.DataUtil;

public class AddCustomerTest extends BaseTest {
	
	
	@Test(dataProviderClass = DataUtil.class, dataProvider="dp")
	public void addCustomerTest(String firstName,String lastName,String postCode) throws InterruptedException {
		
		
		click("addCustBtn_CSS");
		type("firstName_CSS",firstName);
		type("lastName_CSS",lastName);
		type("postCode_CSS",postCode);
		click("addCustomer_CSS");
		
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("Customer added successfully"),"Customer not added successfully");
		alert.accept();
		Thread.sleep(2000);
		//Assert.fail("Add Customer Test failed");
		
	}
	
	

	

}
