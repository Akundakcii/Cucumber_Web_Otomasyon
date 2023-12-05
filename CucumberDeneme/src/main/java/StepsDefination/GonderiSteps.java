package StepsDefination;

import POM.Gonderi_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class GonderiSteps {

    Gonderi_Page gonderiPage = new Gonderi_Page();

    @Given("Armaya Tikla")
    public void armaya_tikla() {
        gonderiPage.gonderiSayfasinaGit();

    }

    @Given("Gönderi Yaz")
    public void gönderi_yaz() {
        gonderiPage.gonderiTextolustur();

    }

    @When("Gönderiyi Paylas")
    public void gönderiyi_paylas() {
        gonderiPage.gonderButton();
    }

    @Then("Gonderiyi Assert Et")
    public void gonderiyi_assert_et() {
        Assert.assertTrue(gonderiPage.varmiGonderi());

    }

}
