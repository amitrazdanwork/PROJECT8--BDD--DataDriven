package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.ConfigUtil;

public class ForgotPasswordPage {
	private WebDriver driver;
	ConfigUtil config = new ConfigUtil();

	/* WebElements / OR */
	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]/h1/span")
	WebElement ForgotPassword_Label;

	@FindBy(xpath = "//*[@id=\"form-validate\"]/fieldset/div[1]")
	WebElement Message_Label;

	@FindBy(xpath = "//*[@for='email_address' and @class='label']")
	WebElement Email_Label;

	@FindBy(xpath = "//*[@id=\"email_address\"]")
	WebElement Email_Textbox;

	@FindBy(xpath = "//*[@id=\"email_address-error\"]")
	WebElement Email_Mandatory_Error;

	@FindBy(xpath = "//*[@id=\"form-validate\"]/div/div[1]/button")
	WebElement Reset_My_Password_Button;

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")
	WebElement ResetPasswordSuccess_Message;

	// Constructor
	public ForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* Action Methods */
	// Method 1

	public void OpenForgotPasswordPage() {
		driver.get(config.getForgotPasswordPageURL());
	}

	public boolean isForgotPasswordLabelPresent() {
		return ForgotPassword_Label.isDisplayed();
	}

	// Method 2
	public boolean isMessageLabelPresent() {
		return Message_Label.isDisplayed();
	}

	// Method 3
	public boolean isEmailLabelPresent() {
		return Email_Label.isDisplayed();
	}

	// Method 4
	public boolean isEmailTextboxPresent() {
		return Email_Label.isDisplayed();
	}

	// Method 5
	public String getEmailMandatoryMessage() {
		return Email_Mandatory_Error.getText();
	}

	// Method 7
	public boolean isResetMyPasswordButtonPresent() {
		return Reset_My_Password_Button.isDisplayed();
	}

	// Method 8
	public void ClickResetMyPasswordButton() {
		Reset_My_Password_Button.click();
	}

	// Method 9
	public void EnterEmail(String string) {
		Email_Textbox.sendKeys(string);
	}

	// Method 10
	public String getResetSuccessMessage() {
		return ResetPasswordSuccess_Message.getText();
	}
}
