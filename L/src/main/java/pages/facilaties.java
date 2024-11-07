package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class facilaties extends PageBase {

	public facilaties(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//span[contains(text(), 'Dashboard')]")
	private WebElement dashboard;
	
	@FindBy(css = "a[href='/admin-dashboard']")
	private WebElement admindashboard;
	
	@FindBy(css = "a.flex.items-center.hover\\:bg-primary.hover\\:text-white.gap-2.rounded-md.px-5.py-3.duration-300[href='/facilities']")
	private WebElement facilityBtn;
	
	@FindBy(xpath = "//a[text()='Facilities']")
	private WebElement facilaties;
	
	public void gotoFacilitiesPage() throws InterruptedException
	{
		WebElement menuList = driver.findElement(By.xpath("//span[contains(text(), 'Dashboard')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(menuList).perform();
	//	clickButton(dashboard);
		clickButton(admindashboard);
		Thread.sleep(2000);
		clickButton(facilaties);
	}
}
