import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
        pageDucks.click();

        WebElement name = driver.findElement(By.cssSelector("#box-category > nav > a:first-child"));
        name.click();

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
        pageDucks.click();

        WebElement price = driver.findElement(By.cssSelector(".filter > span"));
        price.click();

        List<String> pricesList = driver.findElements(By.cssSelector(".price")).stream().map(WebElement::getText)
                .collect(Collectors.toList());
        ArrayList<String> rightSorting = new ArrayList<>();
        rightSorting.add("0 €");
        rightSorting.add("14.60 €");
        rightSorting.add("14.60 €");
        rightSorting.add("14.60 €");
        rightSorting.add("65.70 €");

        assertEquals(pricesList, rightSorting);

    }

    @AfterTest
        public void finish(){
            driver.quit();
    }

}
