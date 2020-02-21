package GridTest;
 
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
import java.net.MalformedURLException;
import java.net.URL;
 
import org.junit.Assert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 
public class TestLocalFirefox {
 static WebDriver driver;
 static String nodeUrl;
 
 @BeforeTest
 public void setup() throws MalformedURLException {
 DesiredCapabilities capabilities = DesiredCapabilities.chrome();
 capabilities.setBrowserName("chrome");
 capabilities.setPlatform(Platform.LINUX);
 driver = new RemoteWebDriver(new URL("http://10.110.2.184:4444/wd/hub"), capabilities);
 }
 
 @Test
 public void simpleTest() {
 driver.get("https://www.amazon.com");
String ActualTitle = driver.getTitle();
String ExpectedTitle = “Amazon.com: Online Shopping for Electronics, Apparel,
    Computers, Books, DVDs & more”;
Assert.assertEquals(ActualTitle, ExpectedTitle);
System.out.println(“Assert passed”);
 }
 
 @AfterTest
 public void afterTest() {
 driver.quit();
 }
}
