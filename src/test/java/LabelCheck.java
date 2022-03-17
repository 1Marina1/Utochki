import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LabelCheck {
    WebDriver driver;

    @BeforeTest
    public void setup() {

        driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        WebElement element = driver.findElement(By.cssSelector("li.category-1"));

        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();

        WebElement subcategory = driver.findElement(By.cssSelector("li.category-1 > ul > li.category-2"));
        subcategory.click();

    }
    @Test
    public void yellowDuckLabelCheck(){
        WebElement yellowDuck = driver.findElement(By.cssSelector("a[title='Yellow Duck'] > div > .sticker"));
        String label = yellowDuck.getText();

        assertEquals(label,"SALE");

    }
    @Test
    public void greenDuckLabelCheck(){
        WebElement yellowDuck = driver.findElement(By.cssSelector("a[title='Green DucK'] > div > .sticker"));
        String label = yellowDuck.getText();

        assertEquals(label,"NEW");
    }
    @Test
    public void pinkDuckLabelCheck(){
        WebElement yellowDuck = driver.findElement(By.cssSelector("a[title='Розовая уточка'] > div > .sticker"));
        String label = yellowDuck.getText();

        assertEquals(label,"NEW");
    }

    @AfterTest
    public void finish(){
        driver.quit();
    }
}

