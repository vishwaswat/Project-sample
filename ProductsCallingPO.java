package projectSelenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Swati Khot
 * This class used to login into site https://www.saucedemo.com/ and adding product into shopping cart
 * and fill personal details for the checkout
 */
public class ProductsCallingPO {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		ProductsPO p = PageFactory.initElements(driver, ProductsPO.class);
		p.username.sendKeys("standard_user");
		p.password.sendKeys("secret_sauce");
		p.login.click();
		Thread.sleep(4000);
		p.saucebag.click();
		Thread.sleep(3000);
		p.addtocart.click();
		Thread.sleep(3000);
		p.cart.click();
		Thread.sleep(3000);
		p.checkout.click();
		Thread.sleep(5000);
		p.firstname.sendKeys("Swati");
		p.lastname.sendKeys("Khot");
		p.pincode.sendKeys("411061");
		Thread.sleep(2000);
		p.conti.click();
		p.finish.click();
		Thread.sleep(4000);
		p.backtohome.click();
		Thread.sleep(3000);
		driver.close();
	}

}
