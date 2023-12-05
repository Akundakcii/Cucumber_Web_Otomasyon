package unDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            System.setProperty("webdriver.chorome.driver", "drivers/chromedriver");
            driver = new ChromeDriver();



        }
        return driver;
    }
/*
    public static void  closeDriver(){

        driver.quit();
        driver=null;
}

 */
}
