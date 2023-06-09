package projekat;
// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.util.logging.Logger;
import java.io.FileWriter;
import java.net.MalformedURLException;
import java.net.URL;
public class ProveraInformacijaTest {
	private Logger l = Logger.getLogger(ProveraInformacijaTest.class.getName());
	private String exePath="C:\\Users\\jevre\\OneDrive\\Radna površina\\chromedriver\\chromedriver.exe";
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", exePath);
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void proveraInformacija() {
    driver.get("https://www.militaryshop.rs/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.cssSelector(".account-item:nth-child(1) span")).click();
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("ranmacookie@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Testiranje27");
    driver.findElement(By.name("login")).click();
    driver.findElement(By.linkText("edit-account")).click();
    driver.findElement(By.id("account_email")).click();
    driver.findElement(By.id("account_email")).click();
    {
      WebElement element = driver.findElement(By.id("account_email"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.id("account_email")).click();
    {
      WebElement element = driver.findElement(By.id("account_email"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("account_email"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("account_email"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("account_email")).click();
    String ime = driver.findElement(By.name("account_display_name")).getAttribute("value");
    String IP = ime.toString();
    assertEquals("ranmacookie", IP);
    
    String email = driver.findElement(By.name("account_email")).getAttribute("value");
    String EMAIL = email.toString();
    assertEquals("ranmacookie@gmail.com", EMAIL);
    String string ="\nIme testa : Provera korisnickih podataka \n"+
            "Opis testa : Proverava se validnost korisnickih podataka\n"+
            "Ime:" + ime.toString() + "\n" +
    		"Email:" + email.toString() +
    		
 
     "\n\nTest je uspesan \n\n";
    l.info(string.toString());
    try {

    	FileWriter fw = new FileWriter("D:\\Programiranje\\eclipse-workspace\\TSWProjekat\\test-report.txt", true);
    	fw.write(string.toString());
    	fw.flush();
    	fw.close();
    }catch (Exception e) {
    	System.out.println(e.getMessage());
  	}
  }
}
