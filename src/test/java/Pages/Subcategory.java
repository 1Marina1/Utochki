package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Subcategory {
    @FindBy(css = "a[title='Yellow Duck'] > div > .sticker")
    private WebElement yellowDuckSticker;

    @FindBy(css = "a[title='Green DucK'] > div > .sticker")
    private WebElement greenDuckSticker;

    @FindBy(css = "a[title='Розовая уточка'] > div > .sticker")
    private WebElement pinkDuckSticker;

    private WebDriver driver;

    public WebElement getYellowDuckSticker(){
        return yellowDuckSticker;
    }

    public WebElement getGreenDuckSticker(){
        return greenDuckSticker;
    }

    public WebElement getPinkDuckSticker(){
        return pinkDuckSticker;
    }
}
