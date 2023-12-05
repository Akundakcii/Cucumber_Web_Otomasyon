package StepsDefination;

import POM.Giris_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import unDrivers.Driver;

import java.util.concurrent.TimeUnit;

public class GirisSteps {
    Giris_Page girisPage = new Giris_Page();
    WebDriver driver;

    @Given("Arm oyu Siteye Git")
    public void armOyuSiteyeGit() {
        driver = Driver.getDriver();

        driver.manage().window().maximize();//Sayfayı Büyütme
        driver.get("https://aramizdakioyuncu.com");//Ulaşacağımız Site
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @And("üye Girisi yap")
    public void uyeGirisiYap() {
        girisPage.Giris();
    }

    @And("Sol usteki armaya tikla")
    public void solUstekiArmayaTikla() {
        girisPage.GoToProfile();
    }

    @And("Kapak resmi Ekle")
    public void kapakResmiEkle() {
        girisPage.addKapakimage();
    }

    @And("Profil Foto Değiştir")
    public void profilFotoDegistir() {
    }


}
