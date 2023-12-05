package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import unDrivers.Driver;

public class BilgilerSag_Page extends AbstractClass {

    WebDriver driver;

    public BilgilerSag_Page() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "mesleksecim")
    private WebElement meslekSec;

    @FindBy(css = "input[name='kullanicieposta']")
    private WebElement email;

    @FindBy(css = "input[name='cepnumara']")
    private WebElement cepnumara;
    @FindBy(css = "input[name='dogumyili']")
    private WebElement dogumText;
    @FindBy(css = "select[name='ulke']")
    private WebElement ulkeText;
    @FindBy(css = "select[name='sehir']")
    private WebElement sehirText;
    @FindBy(css = "button[class='btn btn-primary  w-50']")
    private WebElement GuncellemeButton;
    @FindBy(id = "guvenlikkontrolparola")
    private WebElement sifreguvenlik;
    @FindBy(css = "button[class='btn btn-primary dogrulakontrolparolamiz waves-effect waves-light']")
    private WebElement onayla;
    @FindBy(xpath = "(//span[@aria-hidden='true'])[2]")
    private WebElement cikis;

    public void meslekSec() {
        SelectElement(meslekSec, "Mühendis");
    }

    public void eposta() {

        email.clear();
        write(email, "hahahah@gmail.com");
    }

    public void telefon() {
        write(cepnumara, "5445568574");
    }

    public void dogumTarih() {
        write(dogumText, "24071997");
    }

    public void ulke() {

        SelectElement(ulkeText, "AFGHANISTAN");

    }

    public void guncelle() {
        click(GuncellemeButton);
        write(sifreguvenlik, "123456");
        click(onayla);
    }

    public void cik() {
        click(cikis);
    }

}

