package projectSelenium1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Swati Khot
 * This class used to construct WebElement for page object model
 */
public class LoginPagePOM {

	@FindBy(id="user-name")WebElement username;
	@FindBy(id="password")WebElement password;
	@FindBy(name="login-button")WebElement login;
	
}
