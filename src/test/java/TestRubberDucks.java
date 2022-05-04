import pages.HomePage;
import pages.RubberDucks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.WebDriverContainer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class TestRubberDucks extends TestBase{

    @Test
    public void sortName() {

        HomePage homePage = PageFactory.initElements(WebDriverContainer.getDriver(),HomePage.class);
        homePage.getRubberDucksMenuButton().click();
        logger.info("Went to Rubber Ducks page");
        RubberDucks rubberDucks = PageFactory.initElements(WebDriverContainer.getDriver(), RubberDucks.class);
        rubberDucks.sortByName();
        logger.info("Sorted ducks by name");
        List<String> namesList = rubberDucks.getProductName().stream().map(WebElement::getText)
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

        HomePage homePage = PageFactory.initElements(WebDriverContainer.getDriver(),HomePage.class);
        homePage.getRubberDucksMenuButton().click();
        logger.info("Went to Rubber Ducks page");
        RubberDucks rubberDucks = PageFactory.initElements(WebDriverContainer.getDriver(), RubberDucks.class);
        rubberDucks.sortByPrice();
        logger.info("Sorted ducks by price");
        List<String> pricesList = rubberDucks.getProductPrice().stream().map(WebElement::getText)
                .collect(Collectors.toList());
        ArrayList<String> rightSorting = new ArrayList<>();
        rightSorting.add("0 €");
        rightSorting.add("14.60 €");
        rightSorting.add("14.60 €");
        rightSorting.add("14.60 €");
        rightSorting.add("65.70 €");

        assertEquals(pricesList, rightSorting);

    }


}
