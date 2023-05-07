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
public class InformacijeTest {
	private Logger l = Logger.getLogger(InformacijeTest.class.getName());
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
  public void informacije() {
    driver.get("https://www.militaryshop.rs/");
    driver.manage().window().setSize(new Dimension(1056, 808));
    {
      WebElement element = driver.findElement(By.cssSelector(".has-dropdown > .header-cart-link"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.linkText("O NAMA")).click();
    driver.findElement(By.id("content")).click();
    assertThat(driver.findElement(By.cssSelector(".page-inner > p:nth-child(2)")).getText(), is("Naši krajnji korisnici su Policija, Ministarstvo unutrašnjih poslova, Vojska Srbije, Ministarstvo odbrane, zaštitno bezbednosne agencije i firme, te brojna lovačka društva i pojedinci."));
    
    WebElement txt = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[1]"));
    String oNama = txt.getText();
    WebElement txt2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[2]"));
    String oNama2 = txt2.getText();
    WebElement txt3 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[3]"));
    String oNama3 = txt3.getText();
    WebElement txt4 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[4]"));
    String oNama4 = txt4.getText();
    WebElement txt5 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[6]"));
    String oNama5 = txt5.getText();

    String string ="\nIme testa : O nama \n"+
            "Opis testa : Test uzima podatke o kompaniji Oprema za sport doo Beograd \n"+
            oNama.toString() + "\n" +
            oNama2.toString() + "\n" +
            oNama3.toString() + "\n" +
            oNama4.toString() + "\n" +
            oNama5.toString() +
    "\nTest je uspesan \n\n";
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