import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class LabelCheck {
    WebDriver driver;

    @BeforeTest
    public void setup() {

        driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");

    }
    @Test
    public void yellowDuckLabel(){
        List<WebElement> yellowDuck = driver.findElements(By.cssSelector("a[title='Yellow Duck'] > div > .sticker"));
        String label = yellowDuck.get(1).getText();

        assertEquals(label,"SALE");

    }
    @Test
    public void greenDuckLabel(){
        List<WebElement> yellowDuck = driver.findElements(By.cssSelector("a[title='Green DucK'] > div > .sticker"));
        String label = yellowDuck.get(1).getText();

        assertEquals(label,"NEW");
    }
    @Test
    public void pinkDuckLabel(){
        List<WebElement> yellowDuck = driver.findElements(By.cssSelector("a[title='Розовая уточка'] > div > .sticker"));
        String label = yellowDuck.get(1).getText();

        assertEquals(label,"NEW");
    }

    @AfterTest
    public void finish(){
        driver.quit();
    }
}

