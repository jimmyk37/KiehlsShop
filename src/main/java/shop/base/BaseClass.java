package shop.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BaseClass {
	
	public static WebDriver driver;
	
	public void launchurl(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jimmy\\eclipse-workspace\\TestingBabaProject\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kiehls.com/");
	}
	
	@AfterTest
	public void teardown() 
	{
		driver.quit();
	}
	

}
