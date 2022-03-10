import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class HeaderLink {
    @Test
    public static void goToHome() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement element = driver.findElement(By.cssSelector("li.general-0"));

        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
        builder.doubleClick(element).perform();

        String title= driver.getTitle();
        assertEquals(title,"Online Store | My Store1");

        driver.quit();

    }
    @Test
    public static void goToRubberDucks() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement element = driver.findElement(By.cssSelector("li.category-1"));

        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
        builder.doubleClick(element).perform();

        String title= driver.getTitle();

        assertEquals(title,"Rubber Ducks | My Store1");

        driver.quit();
    }
    @Test
    public static void goToDeliveryInfo() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement element = driver.findElement(By.cssSelector("li.page-2"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
        builder.doubleClick(element).perform();

        String title= driver.getTitle();
        assertEquals(title,"Delivery Information | My Store1");

        driver.quit();
    }
    @Test
    public static void goToTermsConditions() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement element = driver.findElement(By.cssSelector("li.page-4"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
        builder.doubleClick(element).perform();

        String title= driver.getTitle();
        assertEquals(title,"Terms & Conditions | My Store1");

        driver.quit();
    }


}