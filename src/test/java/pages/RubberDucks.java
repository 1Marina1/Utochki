package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RubberDucks {

    @FindBy(css = "#box-category > nav > a:first-child")
    private WebElement nameSortingButton;

    @FindBy(css =".filter > span")
    private WebElement priceSortingButton;

    @FindBy(css = ".price")
    private List<WebElement> productPrice;

    @FindBy(css = ".name")
    private List<WebElement> productName;


    public void sortByName(){
        nameSortingButton.click();
    }

    public void sortByPrice(){
        priceSortingButton.click();
    }
    public List<WebElement> getProductPrice(){
        return productPrice;
    }
    public List<WebElement> getProductName(){
        return productName;
    }
}
