package basicsOfSelenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestLocalFirefox {

    @Test

    public void mailTest() throws MalformedURLException{

             DesiredCapabilities dr=null;

             dr=DesiredCapabilities.firefox();

             dr.setBrowserName("firefox");

             dr.setPlatform(Platform.LINUX);

             RemoteWebDriver driver=new RemoteWebDriver(new URL("http://10.110.2.184:4444/wd/hub"), dr);

             driver.navigate().to("https://www.google.co.in");

             driver.findElement(By.name("q"))) .sendKeys("Search me");

             driver.findElement(By.name("btnG")).click();

             driver.close();

}
}
