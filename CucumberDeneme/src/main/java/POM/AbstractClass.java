package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import unDrivers.Driver;

import java.time.Duration;

public abstract class AbstractClass {

    private WebDriver driver = Driver.getDriver();
    // WebDriverWait wait2 = (WebDriverWait) driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    public void click(WebElement clickElement) {

        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void write(WebElement sendKeysElement, String value) {
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }

    public void SelectElement(WebElement dropdown, String element) {

        Select slc = new Select(dropdown);
        slc.selectByVisibleText(element);
    }


    public void Asssertion(WebElement actual, String expected) {

        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(), expected);
        //  Gelen Alan  -- Bizim Orjinal alan
        System.out.println("My Massege" + actual.getText());
    }

    public Boolean isDisplayed(WebElement Locator) {
        wait.until(ExpectedConditions.elementToBeClickable(Locator));
        return Locator.isDisplayed();
    }
}
