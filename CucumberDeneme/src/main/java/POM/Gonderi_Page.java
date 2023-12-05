package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import unDrivers.Driver;

public class Gonderi_Page extends AbstractClass {
    WebDriver driver;

    public Gonderi_Page() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(css = "img[title='ARMOYU - Topluluğu Ve Grupları|| Teknoloji ve Güncel Haberler']")
    private WebElement gonderiLink;
    @FindBy(id = "sosyalpaylasimicerik")
    private WebElement gonderiText;

    @FindBy(css = "button[class='btn btn-sm btn-primary text-right waves-effect waves-light']")
    private WebElement gonderButton;
    @FindBy(css = "svg[class='svg-inline--fa fa-pen-to-square']")
    private WebElement gonderiAssert;


    public void gonderiSayfasinaGit() {
        click(gonderiLink);
    }

    public void gonderiTextolustur() {
        write(gonderiText, "Deneme Bir 2 üç ŞŞŞŞ ÇÇ İİ ĞĞĞ JJ ");

    }

    public void gonderButton() {
        click(gonderButton);
    }

    public boolean varmiGonderi() {
        return isDisplayed(gonderiAssert);

    }
}
