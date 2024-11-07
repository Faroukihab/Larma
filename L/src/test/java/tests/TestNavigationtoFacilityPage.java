package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.facilaties;

public class TestNavigationtoFacilityPage extends TestBase {

	facilaties facility;

	@Test
	public void usercannavigatetofacilotypage() throws InterruptedException
	{

		facility = new facilaties(driver);

		facility.gotoFacilitiesPage();
		
		String ExpectedURL = "http://194.37.80.195:8000/facilities";
		String CurrentURL = driver.getCurrentUrl();
		Assert.assertEquals(CurrentURL,  ExpectedURL, "The current URL is not as expected.");
	}
}
