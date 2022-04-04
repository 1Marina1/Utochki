import helpers.ScreenshotListener;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import pages.WebDriverContainer;

@Listeners({ScreenshotListener.class})
public class TestBase {
    protected WebDriver driver = WebDriverContainer.initDriver();
    protected String baseUrl = "https://litecart.stqa.ru/en/";
    protected static Logger logger = Logger.getLogger(TestBase.class);

    @BeforeTest
    public void setup() {
        logger.debug("Instantiating driver");
        WebDriverContainer.getDriver().get(baseUrl);
        logger.debug("Driver initiated successfully");
    }

    @AfterTest
    public void tearDown(){
        logger.debug("Closing webdriver");
        WebDriverContainer.closeDriver();
        logger.debug("Webdriver closed");
    }
}
