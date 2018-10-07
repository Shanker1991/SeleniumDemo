
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();


        driver.get("http://www.flipkart.com");


        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver.manage().window().maximize();


        JavascriptExecutor js = (JavascriptExecutor) driver;


        String sDomain = js.executeScript("return document.domain;").toString();

        System.out.println("Domain = " + sDomain);


        String sURL = js.executeScript("return document.URL;").toString();

        System.out.println("URL = " + sURL);


        String sTitle = js.executeScript("return document.title;").toString();

        System.out.println("Title = " + sTitle);


        js.executeScript("window.scrollBy(0,200)");

        System.out.println("Successfully did the vertical scroll by 200px");
    }
}

