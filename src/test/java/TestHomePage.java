import Pages.HomePage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestHomePage extends TestBase{

    @Test
    public void goToHome() throws Exception {

        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.getHomeIcon().click();

        String title= driver.getTitle();
        assertEquals(title,"Online Store | My Store1");

    }
    @Test
    public void goToRubberDucks() {

        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.getRubberDucksMenuButton().click();

        String title= driver.getTitle();
        assertEquals(title,"Rubber Ducks | My Store1");

    }
    @Test
    public void goToDeliveryInfo() {

        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.getDeliveryInfoMenuButton().click();

        String title= driver.getTitle();
        assertEquals(title,"Delivery Information | My Store1");

    }
    @Test
    public void goToTermsConditions() {

        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.getTermsConditionsMenuButton().click();

        String title= driver.getTitle();
        assertEquals(title,"Terms & Conditions | My Store1");

    }
    @Test
    public void goToSubcategory(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);

        Actions builder = new Actions(driver);
        builder.moveToElement(homePage.getRubberDucksMenuButton()).perform();

        homePage.getSubcategoryDropDownMenuButton().click();

        String title= driver.getTitle();
        assertEquals(title,"Subcategory | My Store1");

    }


}