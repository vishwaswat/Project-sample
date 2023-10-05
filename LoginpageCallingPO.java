package projectSelenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import seleniumProject1.POLoginPage;

/**
 * @author Swati Khot
 * This class used to login into site https://www.saucedemo.com/
 */
public class LoginpageCallingPO {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		LoginPagePOM l = PageFactory.initElements(driver, LoginPagePOM.class);
		l.username.sendKeys("standard_user");
		l.password.sendKeys("secret_sauce");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		l.login.click();
	}

}
