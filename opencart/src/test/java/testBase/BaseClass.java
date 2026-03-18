package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass  {
	
	public Properties properties;
	public WebDriver driver;
	
	@BeforeClass
	public void setup()throws IOException {
		
		 properties=new Properties();
		 FileReader fileReader=new FileReader("src\\test\\resources\\config.properties");
		 properties.load(fileReader);
		 
		 driver=new ChromeDriver();
		 driver.get(properties.getProperty("url"));
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().deleteAllCookies();
		 	
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
