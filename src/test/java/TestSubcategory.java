import Pages.HomePage;
import Pages.Subcategory;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestSubcategory extends TestBase {

    @BeforeTest
    public void subCategorySetup() {

        HomePage homePage = PageFactory.initElements(driver,HomePage.class);

        Actions builder = new Actions(driver);
        builder.moveToElement(homePage.getRubberDucksMenuButton()).perform();

        homePage.getSubcategoryDropDownMenuButton().click();

    }
    @Test
    public void checkYellowDuckLabel(){
        Subcategory subcategory = PageFactory.initElements(driver,Subcategory.class);
        String label = subcategory.getYellowDuckSticker().getText();

        assertEquals(label,"SALE");

    }
    @Test
    public void checkGreenDuckLabel(){
        Subcategory subcategory = PageFactory.initElements(driver,Subcategory.class);
        String label = subcategory.getGreenDuckSticker().getText();

        assertEquals(label,"NEW");
    }
    @Test
    public void checkPinkDuckLabelCheck(){
        Subcategory subcategory = PageFactory.initElements(driver,Subcategory.class);
        String label = subcategory.getPinkDuckSticker().getText();

        assertEquals(label,"NEW");
    }

}

