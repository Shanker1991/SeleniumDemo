import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class GridTest {
    public static void main(String args[]) {
        try {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setBrowserName("chrome");
            capabilities.setPlatform(Platform.LINUX);
            RemoteWebDriver driver = new RemoteWebDriver(new URL("http://172.17.0.1:4444/wd/hub"),capabilities);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.get("https://www.flipkart.com");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}