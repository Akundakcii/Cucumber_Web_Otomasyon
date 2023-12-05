package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import unDrivers.Driver;

public class Form_Page extends AbstractClass {

    WebDriver driver;

    public Form_Page() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "(//a[@href='/forum'])[1]")
    private WebElement formLink;
    @FindBy(css = "a[href='https://aramizdakioyuncu.com/forum/olustur']")
    private WebElement KonuAc;
    @FindBy(id = "forum-konu")
    private WebElement KonuBasligi;
    @FindBy(id = "forum-icerik")
    private WebElement Formicerik;
    @FindBy(css = "select[name='forumtipi']")
    private WebElement ForumTipi;
    @FindBy(css = "select[name='forumkategori']")
    private WebElement ForumKategori;
    @FindBy(id = "forumkaydet")
    private WebElement ForumKaydet;
    @FindBy(css = "h1[style]")
    private WebElement formAssertion;

    public void FormSayfasinaGit() {
        click(formLink);
    }

    public void FormAc() {
        click(KonuAc);
    }

    public void FormDoldur() {
        write(KonuBasligi, "Deneme Konu");
        write(Formicerik, "Test Deneme Yapma");
        SelectElement(ForumTipi, "REHBER");
        SelectElement(ForumKategori, "Yazılım");
    }

    public void Kaydet() {

        click(ForumKaydet);
    }

    public void FormAssert() {
        Asssertion(formAssertion, "FORUMLAR");
    }

}
