import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class XpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("file:///home/shanker/IdeaProjects/SelTest/src/main/resources/xpathTest.html");
/*
        WebElement element = driver.findElement(By.xpath("//p[@id='labelText' and @align='center']"));
        System.out.println(element.getText());

        WebElement element1 = driver.findElement(By.xpath("//p[@id='labelText' or @align='center']"));
        System.out.println(element1.getText());

        WebElement element5 = driver.findElement(By.xpath("//p[starts-with(@id,'label')]"));
        System.out.println(element5.getText());

        WebElement element6 = driver.findElement(By.xpath("//p[contains(@id,'label')]"));
        System.out.println(element6.getText());

        WebElement element7 = driver.findElement(By.xpath("//p[contains(text(),'Hello')]"));
        System.out.println(element7.getText());


/*
        /*
        //ends-with is not supported for browser queries.
        WebElement element6 = driver.findElement(By.xpath("//p[ends-with(@id,'Text')]"));
        System.out.println(element6.getText());


        WebElement element2 = driver.findElement(By.xpath("//tr/th[1]"));
        System.out.println(element2.getText());


/*
        WebElement element3 = driver.findElement(By.xpath("//*[text()='Age']"));
        System.out.println(element3.getTagName());


        List<WebElement> elements = driver.findElements(By.xpath("//table/ancestor::*"));
        for (WebElement elem :
                elements) {
            System.out.println(elem.getTagName());
        }


//The TBODY element defines a group of data rows in a table. A TABLE must have one or more TBODY elements, which must follow the optional TFOOT. The TBODY end tag is always optional. The start tag is optional when the table contains only one TBODY and no THEAD or TFOOT.

    //Ancestor gets all the parent,grandparents tags of the current tag, here the current tag is 1st td inside second tr.

        List<WebElement> elements1 = driver.findElements(By.xpath("//tr[2]/td/ancestor::*"));
        for (WebElement elem :
                elements1) {
            System.out.println(elem.getTagName());
        }



        List<WebElement> elements1 = driver.findElements(By.xpath("//tr[2]/td/ancestor::body/p"));
        for (WebElement elem :
                elements1) {
            System.out.println(elem.getTagName() + "-" + elem.getText());
        }


    // Decendent everytag inside the last tag mentioned. Here all the tags inside table tag.

        List<WebElement> elements1 = driver.findElements(By.xpath("//table/descendant::*"));
        for (WebElement elem :
                elements1) {
            System.out.println(elem.getTagName());
        }


        //All the tags above the current tag, except for the parent,grandparent (ancestors)
        List<WebElement> elements1 = driver.findElements(By.xpath("//th[1]/preceding::*"));
        for (WebElement elem :
                elements1) {
            System.out.println(elem.getTagName());
        }
        */
/*
        List<WebElement> elements1 = driver.findElements(By.xpath("//body/descendant::tr[2]/td[3]"));
        for (WebElement elem :
                elements1) {
            System.out.println(elem.getText());
        }



        //All the tags above the current tag and at the same level.
        List<WebElement> elements1 = driver.findElements(By.xpath("//th[3]/preceding-sibling::*"));
        for (WebElement elem :
                elements1) {
            System.out.println(elem.getTagName() + " " + elem.getText());
        }
*/
        //All the tags after the current tag which doesn't include any of its child nodes.
        List<WebElement> elements1 = driver.findElements(By.xpath("//tr[1]/th[1]/following::*"));
        for (WebElement elem :
                elements1) {
            System.out.println(elem.getTagName() + " " + elem.getText());
        }

/*

        ////All the tags after the current tag which doesn't include any of its child nodes..
        List<WebElement> elements1 = driver.findElements(By.xpath("//th[1]/following::*"));
        for (WebElement elem :
                elements1) {
            System.out.println(elem.getTagName());
        }



        //All the nodes after the current node at the same level or they are siblings.
        List<WebElement> elements1 = driver.findElements(By.xpath("//th[1]/following-sibling::*"));
        for (WebElement elem :
                elements1) {
            System.out.println(elem.getTagName() + " " + elem.getText());
        }

*/


/*        //Selects the immediate parent
        List<WebElement> elements1 = driver.findElements(By.xpath("//th[2]/parent::*"));
        for (WebElement elem :
                elements1) {
            System.out.println(elem.getTagName());
        }


        //All child elements of current node..
        List<WebElement> elements1 = driver.findElements(By.xpath("//tr[1]/child::*"));
        for (WebElement elem :
                elements1) {
            System.out.println(elem.getTagName());
        }


        //.. Moves 1 level above
        List<WebElement> elements1 = driver.findElements(By.xpath("//table/.."));
        for (WebElement elem :
                elements1) {
            System.out.println(elem.getTagName());
        }
*/

    }
}
