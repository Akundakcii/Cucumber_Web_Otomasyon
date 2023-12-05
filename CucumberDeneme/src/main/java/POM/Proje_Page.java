package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import unDrivers.Driver;

public class Proje_Page extends AbstractClass {
    WebDriver driver;

    public Proje_Page() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@href='/projeler/'])[1]")
    private WebElement projeLinlk;
    @FindBy(css = "svg[class='svg-inline--fa fa-plus']")
    private WebElement ProjeEkle;
    @FindBy(css = "input[name='projeadi']")
    private WebElement ProjeAdi;
    @FindBy(css = "select[name='projedili']")
    private WebElement projeDil;
    @FindBy(css = "textarea[name='projeaciklamasi']")
    private WebElement projeAciklama;
    @FindBy(xpath = "(//button[@name='button'])[1]")
    private WebElement Gonder;


    public void ProjeLink() {
        click(projeLinlk);
    }

    public void ProjeEkle() {

        click(ProjeEkle);
    }

    public void ProjeIcerik() {
        write(ProjeAdi, "Test Deneme12223");
        SelectElement(projeDil, "C#");
        write(projeAciklama, "test denemee :D dsfafs adsfjdsaf fdsa dsaf dsaf dsaf dsaf dsaf ");
    }

    public void Gonder() {
        click(Gonder);
    }

}
