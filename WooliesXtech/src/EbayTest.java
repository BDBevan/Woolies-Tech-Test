import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
I would typically add additional web drivers here for cross browser testing eg:
import org.openqa.selenium.firefox.FirefoxDriver;
Or I would add the required capabilities to run this script on a multi-platform cloud testing service such as BrowserStack.
*/
import java.util.concurrent.TimeUnit;

public class EbayTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.ebay.com.au");
        WebElement searchBox1;
        searchBox1 = ((ChromeDriver) driver).findElement(By.id("gh-ac"));
        searchBox1.sendKeys("Woolworths");
        WebElement searchbutton;
        searchbutton = ((ChromeDriver) driver).findElement(By.id("gh-btn"));
        searchbutton.click();

        WebElement searchitem1;
        searchitem1 = ((ChromeDriver) driver).findElementByCssSelector("a[href*='rk:1']");
        searchitem1.click();

        WebElement cartitem1;
        cartitem1 = ((ChromeDriver) driver).findElementById("atcRedesignId_btn");
        cartitem1.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement gotocart;
        gotocart = ((ChromeDriver) driver).findElementByCssSelector("a[href*='cart.ebay.com.au?");
        gotocart.click();


        WebElement searchbox2;
        searchbox2 = ((ChromeDriver) driver).findElement(By.id("gh-ac"));
        searchbox2.sendKeys("Woolworths");
        searchbox2.submit();

        WebElement searchitem2;
        searchitem2 = ((ChromeDriver) driver).findElementByCssSelector("a[href*='rk:4']");
        searchitem2.click();

        WebElement cartitem2;
        cartitem2 = ((ChromeDriver) driver).findElementById("atcRedesignId_btn");
        cartitem2.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement checkout;
        checkout = ((ChromeDriver) driver).findElementByCssSelector("a[href*='cart.ebay.com.au/api");
        checkout.click();


        driver.quit();























    }
}



