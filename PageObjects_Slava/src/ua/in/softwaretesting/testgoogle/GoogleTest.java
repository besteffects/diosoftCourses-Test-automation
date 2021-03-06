package ua.in.softwaretesting.testgoogle;

import java.io.File;

import org.apache.xpath.operations.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class GoogleTest {
	
	private GooglePage google;
	private WebDriver driver;
	
	@BeforeMethod
	public void appstate(){
		File file = new File("lib\\ieDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		driver = new InternetExplorerDriver();	
		driver.get("http:\\\\google.com.ua");
	} 
	
	@Test
	public void verifyFootballUASearch(){
		java.lang.String footballUA = "football.ua";
		google = new GooglePage(driver);
		google = google.setValue(footballUA);
		google = google.clickFind();
		FootballUaPage footballUAPage = google.clickLink(footballUA);
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();	
	}	
}

