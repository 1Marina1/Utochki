import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class Sorting {
    WebDriver driver;

    @BeforeTest
    public void setup() {

        driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");

    }
    @Test
    public void sortName() {

        WebElement pageDucks = driver.findElement(By.cssSelector("li.category-1"));

        Actions builder = new Actions(driver);
        builder.moveToElement(pageDucks).perform();
        builder.doubleClick(pageDucks).perform();

        WebElement name = driver.findElement(By.cssSelector("#box-category > nav > a:first-child"));
        builder.moveToElement(name).perform();
        builder.doubleClick(name).perform();

        List<String> namesList = driver.findElements(By.cssSelector(".name")).stream().map(WebElement::getText)
                .collect(Collectors.toList());
        ArrayList<String> rightSorting = new ArrayList<>();
        rightSorting.add("Blue Duck");
        rightSorting.add("Green DucK");
        rightSorting.add("Purple Duck");
        rightSorting.add("Red Duck");
        rightSorting.add("Розовая уточка");
        
        assertEquals(namesList, rightSorting);

    }
    @Test
    public void sortPrice() {

        WebElement pageDucks = driver.findElement(By.cssSelector("li.category-1"));

        Actions builder = new Actions(driver);
        builder.moveToElement(pageDucks).perform();
        builder.doubleClick(pageDucks).perform();

        WebElement name = driver.findElement(By.cssSelector(".filter > span"));
        builder.moveToElement(name).perform();
        builder.doubleClick(name).perform();

        List<String> namesList = driver.findElements(By.cssSelector(".price")).stream().map(WebElement::getText)
                .collect(Collectors.toList());
        ArrayList<String> rightSorting = new ArrayList<>();
        rightSorting.add("0 €");
        rightSorting.add("14.60 €");
        rightSorting.add("14.60 €");
        rightSorting.add("14.60 €");
        rightSorting.add("65.70 €");

        assertEquals(namesList, rightSorting);

    }

    @AfterTest
        public void finish(){
            driver.quit();
    }

}
