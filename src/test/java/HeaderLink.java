import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class HeaderLink {
    WebDriver driver;
    @BeforeTest
    public void setup() {

        driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");

    }
    @Test
    public void goToHome() {

        WebElement element = driver.findElement(By.cssSelector("li.general-0"));

        Actions builder = new Actions(driver);
        builder.click(element).perform();

        String title= driver.getTitle();
        assertEquals(title,"Online Store | My Store1");

    }
    @Test
    public void goToRubberDucks() {

        WebElement element = driver.findElement(By.cssSelector("li.category-1"));

        Actions builder = new Actions(driver);
        builder.click(element).perform();

        String title= driver.getTitle();

        assertEquals(title,"Rubber Ducks | My Store1");

    }
    @Test
    public void goToDeliveryInfo() {

        WebElement element = driver.findElement(By.cssSelector("li.page-2"));
        Actions builder = new Actions(driver);
        builder.click(element).perform();

        String title= driver.getTitle();
        assertEquals(title,"Delivery Information | My Store1");

    }
    @Test
    public void goToTermsConditions() {

        WebElement element = driver.findElement(By.cssSelector("li.page-4"));
        Actions builder = new Actions(driver);
        builder.click(element).perform();

        String title= driver.getTitle();
        assertEquals(title,"Terms & Conditions | My Store1");

    }
    @Test
    public void goToSubcategory(){
        WebElement element = driver.findElement(By.cssSelector("li.category-1"));

        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();

        WebElement subcategory = driver.findElement(By.cssSelector("li.category-1 > ul > li.category-2"));
        builder.click(subcategory).perform();

        String title= driver.getTitle();
        assertEquals(title,"Subcategory | My Store1");

    }
    @AfterTest
    public void finish(){
        driver.quit();
    }


}