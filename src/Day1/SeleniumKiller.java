package Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumKiller {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("as roma");
        Thread.sleep(3000);
        List<WebElement> suggestion = driver.findElements(By.className("sbct"));
        suggestion.get(6).click();




//        for (int a = 0; a < suggestion.size(); a++) {
//            if (suggestion.get(a).getText().equalsIgnoreCase("as roma store")) {
//                suggestion.get(a).click();
//            }
        }

//
//        for (WebElement elements : suggestion) {
//            System.out.println(elements.getText());
//            if (elements.getText().equalsIgnoreCase("lutpulla mutellip")) {
//                elements.click();
//            }
//        }
    }

