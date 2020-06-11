package Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class Jquery {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.get("https://jqueryui.com/draggable/");
        driver.get("https://jqueryui.com/sortable/");
        driver.switchTo().frame(0);

        List<WebElement> elements=driver.findElements(By.id("sortable"));

        WebElement fromElement=elements.get(2);
        WebElement toElement=elements.get(1);

        Actions actions= new Actions(driver);

        actions.clickAndHold(fromElement);
        actions.moveToElement(toElement);
        actions.release(toElement);
        actions.build().perform();


       // driver.manage().window().maximize();
       // Actions nunu = new Actions(driver);

        //nunu.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
        //nunu.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();


    }
}
