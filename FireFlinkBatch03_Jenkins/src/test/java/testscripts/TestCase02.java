package testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase02 {
	
	@Test
	public void jawaMotorsTestCase() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jawamotorcycles.com/");
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.jawamotorcycles.com/");
		Reporter.log("Jawa Motors Test Case Pass..",true);
		
		driver.close();
		
	}


}
