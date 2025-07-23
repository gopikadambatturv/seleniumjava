package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jFrameWork {
	WebDriver driver;
  @Test
  public void Login() {
	  Logger log= Logger.getLogger("techlearnlogin");
	  PropertyConfigurator.configure("Log4j.properties"); 
	  
	  driver = new ChromeDriver();
	  log.info("Chromebrowser Launched");
	  
	  driver.manage().window().maximize();
	  log.info("Browser Window Maximized");
	  
	  driver.get("https://www.techlearn.in/");
	  log.info("Techlearn website opened");
	  
	  driver.findElement(By.xpath("//*[@id=\"mega-menu-item-20\"]/a")).click();
	  log.info("Jobs link clicked on main menu");
  }
}
