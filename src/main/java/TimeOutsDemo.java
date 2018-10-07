import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TimeOutsDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        long start;
        long end;
        WebDriver driver = new ChromeDriver();
        //Implicit wait
    //    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        /*
        start = System.nanoTime();
        driver.get("https://www.googleq.com");
        try {
            driver.findElement(By.id("lst-ib"));
        } catch (NoSuchElementException e) {
            System.out.println("Element is not found" + e.getMessage());
        }
        end = System.nanoTime();
        System.out.println("Took: " + getSeconds(end, start));


        //Explicitly wait
        start = System.nanoTime();
        driver.get("https://www.googleq.com");
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lst-ib")));
        } catch (TimeoutException e) {
            System.out.println("Couldn't locate element." + e.getMessage());
        }
        end = System.nanoTime();
        System.out.println("Took: " + getSeconds(end, start));
        driver.close();

  */

        //Fluent wait

        start = System.nanoTime();
        driver.get("https://www.googleq.com");
        try {
            Wait wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(20))
                    .pollingEvery(Duration.ofSeconds(10))
                    .ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lst-ib")));
        }catch (Exception e){
            System.out.println("Couldn't locate element." + e.getMessage());
        }
        end = System.nanoTime();
        System.out.println("Took: " + getSeconds(end, start));
        //driver.close();

    }

    private static double getSeconds(long end, long start) {
        return ((double) (end - start) / 1000000000.0);
    }
}
