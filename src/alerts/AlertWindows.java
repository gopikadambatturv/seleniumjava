package alerts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AlertWindows {
	WebDriver driver;
  @Test
  public void Techlearn() {
	  driver.get("https://www.techlearn.in");
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
