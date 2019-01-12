package testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class MyFirstMaven {
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver64bit.exe");
	  driver=new FirefoxDriver();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
