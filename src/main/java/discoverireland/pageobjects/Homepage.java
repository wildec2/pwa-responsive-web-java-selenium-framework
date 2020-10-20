package discoverireland.pageobjects;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;
import static discoverireland.constants.URLs.HOMEPAGE;

@Getter
public class Homepage extends PageObject {

    @FindBy(css = "div.qnjgez-0.fJKyKi > span")
    private WebElement heading;

    public Homepage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(20)), this);
    }

    public Homepage openHomePage() {
        driver.get(HOMEPAGE);
        return new Homepage(driver);
    }
}
