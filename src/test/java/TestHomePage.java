import org.testng.Assert;
import pages.HomePage;
import helpers.ScreenshotListener;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.WebDriverContainer;

import static org.testng.Assert.assertEquals;
@Listeners({ScreenshotListener.class})
public class TestHomePage extends TestBase{

    @Test
    public void goToHome() throws Exception {

        HomePage homePage = PageFactory.initElements(WebDriverContainer.getDriver(),HomePage.class);
        homePage.getHomeIcon().click();
        logger.info("Trying to go to home page");
        String title= WebDriverContainer.getDriver().getTitle();
        assertEquals(title,"Online Store | My Store1");

    }
    @Test
    public void goToRubberDucks() {

        HomePage homePage = PageFactory.initElements(WebDriverContainer.getDriver(),HomePage.class);
        homePage.getRubberDucksMenuButton().click();
        logger.info("Trying to go to Rubber Ducks page");
        String title= WebDriverContainer.getDriver().getTitle();
        assertEquals(title,"Rubber Ducks | My Store1");

    }
    @Test
    public void goToDeliveryInfo() {

        HomePage homePage = PageFactory.initElements(WebDriverContainer.getDriver(),HomePage.class);
        homePage.getDeliveryInfoMenuButton().click();
        logger.info("Trying to go to Delivery Information page");
        String title= WebDriverContainer.getDriver().getTitle();
        assertEquals(title,"Delivery Information | My Store1");

    }
    @Test
    public void goToTermsConditions() {

        HomePage homePage = PageFactory.initElements(WebDriverContainer.getDriver(),HomePage.class);
        homePage.getTermsConditionsMenuButton().click();
        logger.info("Trying to go to Terms and Conditions page");
        String title= WebDriverContainer.getDriver().getTitle();
        assertEquals(title,"Terms & Conditions | My Store1");

    }
    @Test
    public void goToSubcategory(){
        HomePage homePage = PageFactory.initElements(WebDriverContainer.getDriver(),HomePage.class);

        Actions builder = new Actions(WebDriverContainer.getDriver());
        builder.moveToElement(homePage.getRubberDucksMenuButton()).perform();

        homePage.getSubcategoryDropDownMenuButton().click();
        logger.info("Trying to go to Subcategory page");
        String title= WebDriverContainer.getDriver().getTitle();

        Assert.fail();
        assertEquals(title,"Subcategory | My Store1");

    }


}