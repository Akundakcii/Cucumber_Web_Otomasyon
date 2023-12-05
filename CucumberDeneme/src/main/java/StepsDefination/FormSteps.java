package StepsDefination;

import POM.Form_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FormSteps {

    Form_Page formPage = new Form_Page();

    @Given("Form Sayfasına Git")
    public void formSayfasınaGit() {
        formPage.FormSayfasinaGit();
    }

    @And("Yeni Konu Ac")
    public void yeniKonuAc() {
        formPage.FormAc();
    }

    @And("Formu bilgisini gir")
    public void formuBilgisiniGir() {
        formPage.FormDoldur();
    }

    @When("Olustur Tik")
    public void olusturTik() {

        formPage.Kaydet();
    }


    @Then("Form Assertion")
    public void FormAssertion() {
        formPage.FormAssert();

    }
}
