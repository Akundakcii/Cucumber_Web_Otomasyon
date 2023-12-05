package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import unDrivers.Driver;

public class Giris_Page extends AbstractClass {

    WebDriver driver;

    public Giris_Page() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "girisyapbutton")
    private WebElement girisButton;
    @FindBy(id = "user_login")
    private WebElement kullaniciText;
    @FindBy(id = "user_pass")
    private WebElement passwordText;
    @FindBy(css = "button[name='wp-submit']")
    private WebElement uyeGirisButton;
    /// 1. Steps


    @FindBy(css = "img[class='profilavatar']")
    private WebElement SagUstAvatar;
    @FindBy(css = "button[class='btn btn-sm btn-primary profilegitbutton waves-effect waves-light']")
    private WebElement profileGit;
    //2. Steps
    @FindBy(css = "svg[class='svg-inline--fa fa-camera']")
    private WebElement kapakResimButton;
    @FindBy(xpath = "(//input[@type='file'])[2]")
    private WebElement kapakResimDosyaTik;
    @FindBy(xpath = "(//input[@value='Güncelle'])[2]")
    private WebElement kapakResimGuncelle;
    //3.Steps
    @FindBy(xpath = "(//img[@class='profilavatar'])[2]")
    private WebElement profilAvatarButton;

    public void Giris() {
        click(girisButton);
        write(kullaniciText, "Kullanıcı Ad Yazınız"); //******* Giris *******///
        write(passwordText, "Sifre Yazın");     ////******Sifre*******///
        click(uyeGirisButton);
    }

    public void GoToProfile() {
        click(SagUstAvatar);
        click(profileGit);
    }

    public void addKapakimage() {
        // Berkay Yapması Bekleniyor İd eklenemesi Lazım
  /*
        click(kapakResimButton);
      click(kapakResimDosyaTik);
//write(kapakResimDosyaTik,"C:\\Users\\Kundakcii\\Desktop\\test2.png");
click(kapakResimGuncelle);

   */
    }


}
