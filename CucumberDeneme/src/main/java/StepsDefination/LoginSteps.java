package StepsDefination;

import POM.Login_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import unDrivers.Driver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    private WebDriver driver;
    Login_Page loginS = new Login_Page(); //Farklı yerden nesne çağrıma


    @Given("Go to Armoyu Website")
    public void go_to_armoyu_website() {

        driver = Driver.getDriver();

        driver.manage().window().maximize();//Sayfayı Büyütme
        driver.get("https://aramizdakioyuncu.com");//Ulaşacağımız Site
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @Given("Click Login Button")
    public void click_login_button() {
        loginS.clickLogin(); //Olusturdugumuz methodu cagır
    }

    @When("Click Sing up")
    public void click_sing_up() {
        loginS.clickSingUpButton();
    }


    @Then("Get text ayitol Assertions")
    public void get_text_ayitol_assertions() {
        loginS.asssertion();
    }


}
