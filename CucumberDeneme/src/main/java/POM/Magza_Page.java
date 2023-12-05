package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import unDrivers.Driver;

public class Magza_Page extends AbstractClass {

    WebDriver driver;

    public Magza_Page() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@href='/magaza/'])[1]")
    private WebElement magzaLink;
    @FindBy(css = "a[title='Ürün Ekle']")
    private WebElement UrunEkleLink;
    @FindBy(css = "img[src='https://aramizdakioyuncu.com/galeri/ana-yapi/galeriac.png']")
    private WebElement ResimEkle;
    @FindBy(id = "armoyugalerifotoekleinput")
    private WebElement DosyaSec;
    @FindBy(xpath = "(//button[@class='btn btn-primary waves-effect waves-light'])[2]")
    private WebElement ResimOnay;


}
