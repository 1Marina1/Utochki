import pages.HomePage;
import pages.Subcategory;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.WebDriverContainer;

import static org.testng.Assert.assertEquals;

public class TestSubcategory extends TestBase{

    @Test
    public void checkYellowDuckLabel(){
        HomePage homePage = PageFactory.initElements(WebDriverContainer.getDriver(),HomePage.class);

        Actions builder = new Actions(WebDriverContainer.getDriver());
        builder.moveToElement(homePage.getRubberDucksMenuButton()).perform();

        homePage.getSubcategoryDropDownMenuButton().click();
        logger.info("Trying to go to subcategory page");

        Subcategory subcategory = PageFactory.initElements(WebDriverContainer.getDriver(),Subcategory.class);
        String label = subcategory.getYellowDuckSticker().getText();
        logger.info("Got sale label from yellow duck");
        assertEquals(label,"SALE");

    }
    @Test
    public void checkGreenDuckLabel(){
        HomePage homePage = PageFactory.initElements(WebDriverContainer.getDriver(),HomePage.class);

        Actions builder = new Actions(WebDriverContainer.getDriver());
        builder.moveToElement(homePage.getRubberDucksMenuButton()).perform();

        homePage.getSubcategoryDropDownMenuButton().click();
        logger.info("Trying to go to subcategory page");

        Subcategory subcategory = PageFactory.initElements(WebDriverContainer.getDriver(),Subcategory.class);
        String label = subcategory.getGreenDuckSticker().getText();
        logger.info("Got new label from green duck");
        assertEquals(label,"NEW");
    }
    @Test
    public void checkPinkDuckLabelCheck(){
        HomePage homePage = PageFactory.initElements(WebDriverContainer.getDriver(),HomePage.class);

        Actions builder = new Actions(WebDriverContainer.getDriver());
        builder.moveToElement(homePage.getRubberDucksMenuButton()).perform();

        homePage.getSubcategoryDropDownMenuButton().click();
        logger.info("Trying to go to subcategory page");

        Subcategory subcategory = PageFactory.initElements(WebDriverContainer.getDriver(),Subcategory.class);
        String label = subcategory.getPinkDuckSticker().getText();
        logger.info("Got new label from pink duck");
        assertEquals(label,"NEW");
    }


}

