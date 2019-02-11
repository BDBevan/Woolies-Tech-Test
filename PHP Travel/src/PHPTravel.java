import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;


import java.util.concurrent.TimeUnit;


public class PHPTravel {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/login/");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement username;
        username = ((ChromeDriver) driver).findElementByName("username");
        username.sendKeys("user@phptravels.com");

        WebElement password;
        password = ((ChromeDriver) driver).findElementByName("password");
        password.sendKeys("demouser");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement login;
        login = ((ChromeDriver) driver).findElementByCssSelector("#loginfrm > button");
        login.click();

        WebElement hotel;
        hotel = ((ChromeDriver) driver).findElementByCssSelector("a[href*='https://www.phptravels.net/m-hotels");
        hotel.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement hoteltrigger;
        hoteltrigger = ((ChromeDriver) driver).findElementByCssSelector(".hotelsearch .select2-choice");

        hoteltrigger.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement hotelcity;
        hotelcity = ((ChromeDriver) driver).findElementByCssSelector("#select2-drop .select2-input");

        hotelcity.click();
        hotelcity.sendKeys("Sydney");


        try {
            Thread.sleep(2000);
            hotelcity.sendKeys(Keys.RETURN);
            Thread.sleep(2000);
            WebElement checkin;
            checkin = ((ChromeDriver) driver).findElementByName("checkin");
            checkin.click();
            Thread.sleep(2000);
            checkin.sendKeys("01/04/2019");
            Thread.sleep(2000);
            checkin.sendKeys(Keys.RETURN);
            Thread.sleep(2000);
            WebElement checkout;
            checkout =((ChromeDriver) driver).findElementByName("checkout");
            checkout.click();
            Thread.sleep(2000);
            checkout.sendKeys("15/04/2019");
            Thread.sleep(2000);
            checkout.sendKeys(Keys.RETURN);
            Thread.sleep(2000);
            WebElement searchresults;
            searchresults = ((ChromeDriver) driver).findElementByXPath("//*[@id=\"body-section\"]/div[5]/div/div[3]/div[1]/div/table/tbody/tr[1]/td/div[3]/a/button");
            searchresults.click();
            Thread.sleep(2000);
            WebElement body = ((ChromeDriver) driver).findElementByTagName("body");
            body.sendKeys(Keys.SPACE);
            Thread.sleep(2000);
            WebElement roomscheckbox;
            roomscheckbox = ((ChromeDriver) driver).findElementByCssSelector("#ROOMS tbody tr:first-child label.control--checkbox");
            roomscheckbox.click();
            Thread.sleep(2000);
            WebElement booknow;
            booknow = ((ChromeDriver) driver).findElementByCssSelector("#ROOMS button[type='submit']");
            booknow.click();
            Thread.sleep(2000);
            WebElement confirmbooking;
            confirmbooking = ((ChromeDriver) driver).findElementByCssSelector(".loadinvoice button[type='submit']");
            confirmbooking.click();
            Thread.sleep(2000);




        } catch (InterruptedException o) {





        }
    }}
