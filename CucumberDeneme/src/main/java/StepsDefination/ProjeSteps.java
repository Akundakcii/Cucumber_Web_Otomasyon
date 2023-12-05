package StepsDefination;

import POM.Proje_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProjeSteps {
    Proje_Page projePage = new Proje_Page();

    @Given("Proje Git")
    public void proje_git() {
        projePage.ProjeLink();
    }

    @Given("Proje Ekle")
    public void proje_ekle() {
        projePage.ProjeEkle();
    }

    @Given("Proje Bilgileri")
    public void proje_bilgileri() {
        projePage.ProjeIcerik();
    }

    @When("Kaydet")
    public void kaydet() {
        projePage.Gonder();
    }

    @Then("Proje Assert")
    public void proje_assert() {

    }
}
