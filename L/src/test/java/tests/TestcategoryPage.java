package tests;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import pages.facilaties;
import pages.categoryPage;
public class TestcategoryPage extends TestBase {

	facilaties facility;
	categoryPage category;
	CSVReader reader;
	
	
	
	
	@Test
	
	public void UsercancreateAndEditCategory() throws InterruptedException, CsvValidationException, IOException
	{
		
		String csvFile = System.getProperty("user.dir") + "/src/test/java/data/data.csv";
		reader = new CSVReader(new FileReader(csvFile));
		String[] csvCell;

		while ((csvCell = reader.readNext()) != null) {
			String englishname = csvCell[2];
			String arabicname = csvCell[3]; 
		facility = new facilaties(driver);
        category = new categoryPage(driver); 
		facility.gotoFacilitiesPage();
		category.gotocategoryPage();
		category.createCategoryPage(englishname, arabicname);
		
	}
}
}