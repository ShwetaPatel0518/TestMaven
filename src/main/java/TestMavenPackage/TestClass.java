package TestMavenPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
	@Test
	public void TC01_TestGoogle()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\spatel\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://iwe-test.uclanet.ucla.edu/Forms/dashboard");
	}
}
