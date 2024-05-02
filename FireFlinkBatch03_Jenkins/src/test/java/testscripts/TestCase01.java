package testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase01 {
	
	@Test
	public void royalEnfieldTestCase() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.royalenfield.com/in/en/home/");
		
		Assert.assertEquals(driver.getTitle(), "Bikes in India | New Bike Model 2024 | Royal Enfield India");
		Reporter.log("Royal Enfield Test Case Pass..",true);
		
		driver.close();
		
	}

}
