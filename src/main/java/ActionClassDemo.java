import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionClassDemo {

    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com");

        Actions actions = new Actions(driver);
        Action hoverOverElectronics = actions.moveToElement(
                driver.findElement(
                        By.cssSelector("span:contains('Electronics')")))
                .click()
                .build();
        hoverOverElectronics.perform();

        WebElement element = driver.findElement(By.cssSelector("a[title='MI']"));
        element.click();
    }
}
