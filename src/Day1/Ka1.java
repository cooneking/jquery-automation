package Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ka1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        Select select = new Select(driver.findElement(By.name("birthday_month")));
        //select.selectByValue("7");
        select.selectByVisibleText("Jun");

        driver.findElement(By.id("u_0_y")).click();
    }
}
