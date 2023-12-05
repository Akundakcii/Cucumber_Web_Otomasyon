package StepsDefination;

import POM.SingUp_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import unDrivers.Driver;

import java.util.concurrent.TimeUnit;

public class SingUpSteps {
    private WebDriver driver;
    SingUp_Page singUpPage = new SingUp_Page();

    @Given("SingUp Armoyu")
    public void sing_up_armoyu() {
        driver = Driver.getDriver();

        driver.manage().window().maximize();//Sayfayı Büyütme
        driver.get("https://aramizdakioyuncu.com/kayit-ol/");//Ulaşacağımız Site
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @And("write Ad {string}")
    public void writeAd(String name) {
        singUpPage.writeAd(name);
    }

    @And("write Soyad {string}")
    public void writeSoyad(String lastname) {
        singUpPage.writeSoyad(lastname);
    }

    @And("write kullanici adi {string}")
    public void writeKullaniciAdi(String kname) {
        singUpPage.writeKadi(kname);
    }

    @And("select DGun")
    public void selectDGun() {

        singUpPage.selectedGun();
    }

    @And("select DAy")
    public void selectDAy() {
        singUpPage.selectedAy();
    }

    @And("select DYil")
    public void selectDYil() {
        singUpPage.selectedYil();
    }

    @And("write parola {string}")
    public void writeParola(String parola) {
        singUpPage.writesifre(parola);
    }

    @And("write confirm {string}")
    public void writeconfirm(String confirm) {
        singUpPage.writesifre2(confirm);

    }

    @And("write eposta {string}")
    public void writeEposta(String email) {
        singUpPage.writeepsota(email);
    }


    @And("select il")
    public void selectIl() {
        singUpPage.selectedCity();
    }

    @And("select Gender Man")
    public void selectGenderMan() {
        singUpPage.Selectgender();
    }

    @When("click KayitOl")
    public void clickKayitOl() {
        singUpPage.KayitButton();
    }

    @Then("Pop get Popup Message")
    public void popGetPopupMessage() {
    }
}
