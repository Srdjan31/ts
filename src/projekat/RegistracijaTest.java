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
public class RegistracijaTest {
	private Logger l = Logger.getLogger(RegistracijaTest.class.getName());
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
  public void registracija() {
    driver.get("https://www.militaryshop.rs/");
    driver.manage().window().setSize(new Dimension(1051, 806));
    driver.findElement(By.cssSelector(".account-item:nth-child(1) span")).click();
    driver.findElement(By.id("reg_email")).click();
    driver.findElement(By.id("reg_email")).sendKeys("ranmacookie@gmail.com");
    driver.findElement(By.cssSelector(".woocommerce-form-register")).click();
    driver.findElement(By.name("register")).click();
    driver.findElement(By.cssSelector(".woocommerce-error")).click();
    assertThat(driver.findElement(By.cssSelector(".message-container")).getText(), is("Greška: Nalog je već registrovan sa vašom e-mail adresom. Prijavite se."));
    
    WebElement poruka = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/ul/li/div"));
    String reg = poruka.getText();
    assertEquals(poruka.getText(),"Greška: Nalog je već registrovan sa vašom e-mail adresom. Prijavite se.");
    String string ="\nNaziv testa : Resgistracija test \n"+
            "Opis testa : Otvaranje registracije korisnika\n"+
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
