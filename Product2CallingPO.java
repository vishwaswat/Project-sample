package projectSelenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Swati Khot
 * This class used to login into site https://www.saucedemo.com/ and adding product into shopping cart
 * and fill personal details for the checkout
 *
 */
public class Product2CallingPO {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Product2PO p2 = PageFactory.initElements(driver,Product2PO.class);
		p2.username.sendKeys("standard_user");
		p2.password.sendKeys("secret_sauce");
		p2.login.click();
		Thread.sleep(4000);
		p2.jecket.click();
		Thread.sleep(3000);
		p2.addtocart.click();
		Thread.sleep(3000);
		p2.cart.click();
		Thread.sleep(3000);
		p2.checkout.click();
		Thread.sleep(5000);
		p2.firstname.sendKeys("Avaneesh");
		p2.lastname.sendKeys("Khot");
		p2.pincode.sendKeys("411027");
		Thread.sleep(2000);
		p2.conti.click();
		p2.finish.click();
		Thread.sleep(4000);
		p2.backtohome.click();
		Thread.sleep(3000);
		driver.close();

	}

}
