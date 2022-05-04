package pages;

//import helpers.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(css = "li.general-0")
            //Locators.getLocator("HomePage.homeIcon")
    private WebElement homeIcon;

    @FindBy(css = "li.category-1")
    private WebElement rubberDucksMenuButton;

    @FindBy(css = "li.page-2")
    private WebElement deliveryInfoMenuButton;

    @FindBy(css = "li.page-4")
    private WebElement termsConditionsMenuButton;

    @FindBy(css = "li.category-1 > ul > li.category-2")
    private WebElement subcategoryDropDownMenuButton;


    public HomePage() throws Exception {
    }


    public WebElement getHomeIcon(){
        return homeIcon;
    }

    public WebElement getRubberDucksMenuButton(){
        return rubberDucksMenuButton;
    }

    public WebElement getDeliveryInfoMenuButton(){
        return deliveryInfoMenuButton;
    }

    public WebElement getTermsConditionsMenuButton(){
        return termsConditionsMenuButton;
    }

    public WebElement getSubcategoryDropDownMenuButton(){
        return subcategoryDropDownMenuButton;
    }
}
