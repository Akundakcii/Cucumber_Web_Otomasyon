package StepsDefination;

import POM.BilgilerSol_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BilgilerSolSteps {

    BilgilerSol_Page bilgilerSolPage = new BilgilerSol_Page();

    @And("Ayarlara Tikla")
    public void ayarlaraTikla() {
        bilgilerSolPage.profilGit();
    }

    @And("Ayarladaki Tüm Sosyol Medya Yaz")
    public void ayarladakiTumSosyolMedyaYaz() {
        bilgilerSolPage.Sosyalmedya();
    }

    @When("Güncelle Bastınğında")
    public void guncelleBastıngında() {
        bilgilerSolPage.kaydet();
    }

    @Then("Assertions Kontrol")
    public void assertionsKontrol() {
        bilgilerSolPage.AsserSosyalMedya();
    }
}
