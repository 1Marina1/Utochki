import Pages.HomePage;
import Pages.RubberDucks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class TestRubberDucks extends TestBase{

    @Test
    public void sortName() {

        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.getRubberDucksMenuButton().click();

        RubberDucks rubberDucks = PageFactory.initElements(driver, RubberDucks.class);
        rubberDucks.sortByName();

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

        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.getRubberDucksMenuButton().click();

        RubberDucks rubberDucks = PageFactory.initElements(driver, RubberDucks.class);
        rubberDucks.sortByPrice();

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
