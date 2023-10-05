package projectSelenium1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Swati Khot
 * This class used to construct WebElement for page object model
 */
public class ProductsPO {
	@FindBy(id="user-name")WebElement username;
	@FindBy(id="password")WebElement password;
	@FindBy(name="login-button")WebElement login;
	@FindBy(xpath="//*[@id=\"item_4_title_link\"]/div")WebElement saucebag;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")WebElement addtocart;
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")WebElement cart;
	@FindBy(name="checkout")WebElement checkout;
	@FindBy(name="firstName")WebElement firstname;
	@FindBy(name="lastName")WebElement lastname;
	@FindBy(id="postal-code")WebElement pincode;
	@FindBy(xpath="//*[@id=\"continue\"]")WebElement conti;
	@FindBy(name="finish")WebElement finish;
	@FindBy(name="back-to-products")WebElement backtohome;
}
