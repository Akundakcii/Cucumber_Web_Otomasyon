package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import unDrivers.Driver;

public class SingUp_Page extends AbstractClass {

    WebDriver driver;

    public SingUp_Page() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[name='adi']")
    private WebElement adText;
    @FindBy(css = "input[name='soyadi']")
    private WebElement soyadiText;
    @FindBy(id = "kullanici_adi")
    private WebElement kullaniciAdiText;
    @FindBy(id = "select_day")
    private WebElement Gun;
    @FindBy(id = "select_month")
    private WebElement Ay;
    @FindBy(id = "select_year")
    private WebElement yil;
    @FindBy(id = "sifre")
    private WebElement sifre1;
    @FindBy(css = "input[name='sifretekrar']")
    private WebElement sifre2;
    @FindBy(css = "input[name='e_posta']")
    private WebElement email;

    @FindBy(css = "select[name='ilim']")
    private WebElement il;
    @FindBy(id = "success-outlined")
    private WebElement erkek;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement kayitOl;


    public void writeAd(String name) {
        write(adText, name);
    }

    public void writeSoyad(String lastname) {
        write(soyadiText, lastname);
    }

    public void writeKadi(String kadi) {
        write(kullaniciAdiText, kadi);
    }

    public void selectedGun() {

        SelectElement(Gun, "10");
    }

    public void selectedAy() {
        SelectElement(Ay, "7");
    }

    public void selectedYil() {
        SelectElement(yil, "1997");
    }

    public void writesifre(String parola) {
        write(sifre1, parola);
    }

    public void writesifre2(String confirm) {
        write(sifre2, confirm);
    }

    public void writeepsota(String eposta) {
        write(email, eposta);
    }

    public void selectedCity() {
        SelectElement(il, "BALIKESİR");
    }

    public void Selectgender() {
        click(erkek);
    }

    public void KayitButton() {
        //   click(kayitOl);
    }
}
