package test.onlineshopping;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
 
public class Testcase1 {
 
 public WebDriver driver;
 
  @Test
  public void openMyBlog() {
 driver.get("https://www.softwaretestingmaterial.com/");
  }
  
  @BeforeClass
  public void beforeClass() {
   
   System.setProperty("webdriver.gecko.driver", "C:\\Users\\naga_\\Desktop\\software download\\selenium\\firefoxwebdriver\\geckodriver-v0.20.1-win64\\geckodriver.exe");
   driver = new FirefoxDriver();
   
  }
 
  @AfterClass
  public void afterClass() {
   driver.quit();
  }
 
}
