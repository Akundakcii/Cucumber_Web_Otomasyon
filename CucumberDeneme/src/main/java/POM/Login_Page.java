package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import unDrivers.Driver;

public class Login_Page extends AbstractClass {
    WebDriver driver;

    public Login_Page() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "girisyapbutton")
    private WebElement loginbutton; // yukarıdakini çağırır

    public void clickLogin() {
        click(loginbutton);
    }

    @FindBy(css = "a[href='https://aramizdakioyuncu.com/kayit-ol']")
    private WebElement singUpButton;

    public void clickSingUpButton() {
        click(singUpButton);

    }

    @FindBy(xpath = "(//div[@class='col-md-12'])/h1")
    private WebElement Kayit_Text;

    public void asssertion() {
        Asssertion(Kayit_Text, "KAYIT OL");

    }
}
