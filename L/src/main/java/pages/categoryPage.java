package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class categoryPage extends PageBase {

	public categoryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css = "a.flex.items-center[href='/facilities/category']")
	private WebElement categoryButton;
	
	@FindBy(css = "a.btn-primary[href='/facilities/category/create']")
	private WebElement categoryAddButton;
	
	@FindBy(name = "name.en_name")
	private WebElement categoryEnglishName;
	
	@FindBy(name = "name.ar_name")
	private WebElement categoryArabicName;
	
	@FindBy(xpath = "//div[text()='ar']")
	private WebElement changelanguageButton;
	
	@FindBy(css = "span.flex.items-stretch.transition-all.duration-200.rounded-md.px-4.py-2.text-sm")
	private WebElement saveButton;
	
	public void gotocategoryPage()
	{
		categoryButton.click();
	}
	
	public void createCategoryPage(String CategoryEnglishName, String CategoryArabicName)
	{
		categoryAddButton.click();
		categoryEnglishName.sendKeys(CategoryEnglishName);
		changelanguageButton.click();
		categoryArabicName.sendKeys(CategoryArabicName);
		saveButton.click();
		
		
	}
}
