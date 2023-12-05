package StepsDefination;

import POM.BilgilerSag_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BilgilerSagSteps {

    BilgilerSag_Page bilgilerSagPage = new BilgilerSag_Page();

    @Given("Meslek Sec")
    public void meslekSec() {
        bilgilerSagPage.meslekSec();
    }

    @And("Mail Girme")
    public void mailGirme() {
        bilgilerSagPage.eposta();
    }
    @And("Telefon Gir")
    public void telefonGir() {
        bilgilerSagPage.telefon();
    }

    @And("ulkeSec")
    public void ulkeSec() {
        bilgilerSagPage.ulke();
    }

    @And("Dogum Yil Gir")
    public void dogumYilGir() {
        bilgilerSagPage.dogumTarih();
    }

    @When("Güncelle Tik")
    public void guncelleTik() {
        bilgilerSagPage.guncelle();
    }

    @And("Cikis Yap")
    public void CikisYap() {

        bilgilerSagPage.cik();
    }

}
