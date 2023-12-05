package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import unDrivers.Driver;

public class BilgilerSol_Page extends AbstractClass {
    WebDriver driver;

    public BilgilerSol_Page() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "button_profilayarlar")
    private WebElement profilAyarlar;
    //1.Steps
    @FindBy(id = "ayarlardegistirfacebook")
    private WebElement facebookText;
    @FindBy(id = "ayarlardegistirins")
    private WebElement instagramText;
    @FindBy(id = "ayarlardegistirlinkedin")
    private WebElement linkedin;
    @FindBy(id = "ayarlardegistiryt")
    private WebElement youtube;
    @FindBy(id = "ayarlardegistirtw")
    private WebElement twitch;
    @FindBy(css = "input[placeholder='Reddit']")
    private WebElement reddit;
    @FindBy(css = "input[placeholder='GitHub']")
    private WebElement github;

    @FindBy(id = "sosyalhesaplaryolla")
    private WebElement sosyalMedyaYolla;

    @FindBy(id = "guvenlikkontrolparola")
    private WebElement sifreguvenlik;
    @FindBy(xpath = "(//h5[@class='modal-title'])[2]")
    private WebElement assertionSosyalMedya;
    @FindBy(css = "button[class='btn btn-primary dogrulakontrolparolamiz waves-effect waves-light']")
    private WebElement onayla;

    public void profilGit(){

        click(profilAyarlar);
    }

    public void Sosyalmedya(){
        write(facebookText,"Ahmet");
        write(instagramText,"111aaa");
        write(linkedin,"-----1");
        write(youtube,"*123sdsad");
        write(twitch,":)Dene BAKAM");
        write(reddit,"?? Beys sad");
        write(github,"....1");


    }
    public void kaydet(){

        click(sosyalMedyaYolla);
        write(sifreguvenlik,"123456");
        click(onayla);
    }
    public void AsserSosyalMedya(){
        Asssertion(assertionSosyalMedya,"Ayarlarım");

    }
}
