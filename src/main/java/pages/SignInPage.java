package pages;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.ConfigUtil;
public class SignInPage {

	private WebDriver driver;
	ConfigUtil config = new ConfigUtil();

	/* Page Objects/ Object Repository */

	@FindBy(xpath = "//*[@id=\"login-form\"]/fieldset/div[2]/label")
	WebElement EmailLabel;

	@FindBy(xpath = "//*[@id=\"login-form\"]/fieldset/div[3]/label")
	WebElement PasswordLabel;

	@FindBy(xpath = "//*[@id='email' or @name='login[username]']")
	WebElement EmailTextbox;

	@FindBy(xpath = "//*[@id='pass' and @name='login[password]']")
	WebElement PasswordTextbox;

	@FindBy(xpath = "//*[@id=\"send2\" and @class='action login primary']")
	WebElement SignInButton;

	@FindBy(xpath = "//*[@id=\"login-form\"]/fieldset/div[4]/div[2]/a")
	WebElement ForgotPasswordLink;

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]/div[2]/div/div/a")
	WebElement CreateAnAccountButton;

	/* Constructor */
	public SignInPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/* Page Actions / Action Methods */

	public void OpenSignInPage() {
		driver.get(config.getSignInPageURL());
	}

	public String GetPageTitle() {
		return driver.getTitle();
	}

	public boolean isEmailLabelPresent() {
		return EmailLabel.isDisplayed();
	}

	public boolean isPasswordLabelPresent() {
		return PasswordLabel.isDisplayed();
	}

	public boolean isEmailTextboxPresent() {
		return EmailTextbox.isDisplayed();
	}

	public boolean isPasswordTextboxPresent() {
		return PasswordTextbox.isDisplayed();
	}

	public boolean isSignInButtonPresent() {
		return SignInButton.isDisplayed();
	}

	public boolean isCreateAnAccountButtonPresent() {
		return CreateAnAccountButton.isDisplayed();
	}

	public boolean isForgotPasswordLinkPresent() {
		return ForgotPasswordLink.isDisplayed();
	}

	public void EnterEmail(String email) {
		EmailTextbox.sendKeys(email);
	}

	public void EnterPassword(String password) {
		PasswordTextbox.sendKeys(password);
	}

	public void ClickSignInButton() {
		SignInButton.click();
	}
}
