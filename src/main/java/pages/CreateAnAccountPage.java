package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.ConfigUtil;

public class CreateAnAccountPage {
	private WebDriver driver;
	ConfigUtil config = new ConfigUtil();

	// Web Elements or OR
	@FindBy(xpath = "//*[@id=\"form-validate\"]/fieldset[1]/div[1]/label")
	WebElement FirstName_Label;

	@FindBy(xpath = "//*[@id=\"form-validate\"]/fieldset[1]/div[2]/label")
	WebElement LastName_Label;

	@FindBy(xpath = "//*[@id=\"form-validate\"]/fieldset[2]/div[1]/label")
	WebElement Email_Label;

	@FindBy(xpath = "//*[@id=\"form-validate\"]/fieldset[2]/div[2]/label")
	WebElement Password_Label;

	@FindBy(xpath = "//*[@id=\"form-validate\"]/fieldset[2]/div[3]/label")
	WebElement ConfirmPassword_Label;

	@FindBy(xpath = "//*[@id='firstname']")
	WebElement FirstName_Textbox;

	@FindBy(xpath = "//*[@id='lastname']")
	WebElement LastName_Textbox;

	@FindBy(xpath = "//*[@id=\"email_address\"]")
	WebElement Email_Textbox;

	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement Password_Textbox;

	@FindBy(xpath = "//*[@id=\"password-confirmation\"]")
	WebElement ConfirmPassword_Textbox;

	@FindBy(xpath = "//*[@id=\"form-validate\"]/div/div[1]/button")
	WebElement CreateAnAccount_Button;

	@FindBy(xpath = "//*[@id='password-error']")
	WebElement Password_Error_Message;

	@FindBy(xpath = "//*[@id=\"firstname-error\"]")
	WebElement FirstName_Mandatory_Error;

	@FindBy(xpath = "//*[@id=\"lastname-error\"]")
	WebElement LastName_Mandatory_Error;

	@FindBy(xpath = "//*[@id=\"email_address-error\" or @id=\"email_address\"]")
	WebElement Email_Mandatory_Error;

	@FindBy(xpath = "//*[@id=\"password-error\"]")
	WebElement Password_Mandatory_Error;

	@FindBy(xpath = "//*[@id=\"password-confirmation-error\"]")
	WebElement Confirm_Password_Mandatory_Error;

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")
	WebElement CreateAccountSuccessMessage;

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")
	WebElement CreateAccountError;

	// Constructor
	public CreateAnAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Page methods/ page actions

	// Method 1: Open Create An Account page
	public void OpenCreateAnAccountPage() {
		driver.get(config.getCreateAnAccountPageURL());
	}

	// Method1: Get page title
	public String getPageTitle() {
		return driver.getTitle();
	}

	// Method2: Get status of EmailLabel label
	public boolean isEmailLabelPresent() {
		return Email_Label.isDisplayed();
	}

	// Method2: Get status of First Name label
	public boolean isFirstNameLabelPresent() {
		return FirstName_Label.isDisplayed();
	}

	// Method2: Get status of Last Name label
	public boolean isLastNameLabelPresent() {
		return LastName_Label.isDisplayed();
	}

	// Method2: Get status of Password label
	public boolean isPasswordLabelPresent() {
		return Password_Label.isDisplayed();
	}

	// Method2: Get status of Confirm-Password label
	public boolean isConfirmPasswordLabelPresent() {
		return ConfirmPassword_Label.isDisplayed();
	}

	// Method2: Get status pf Email Text-box
	public boolean isEmailTextboxlPresent() {
		return Email_Textbox.isDisplayed();
	}

	// Method2: Get status of Password Text-box
	public boolean isPasswordTextboxlPresent() {
		return Password_Textbox.isDisplayed();
	}

	public boolean isConfirmPasswordTextboxlPresent() {
		return ConfirmPassword_Textbox.isDisplayed();
	}

	public boolean isFirstNameTextboxlPresent() {
		return FirstName_Textbox.isDisplayed();
	}

	public boolean isLastNameTextboxlPresent() {
		return LastName_Textbox.isDisplayed();
	}

	// Method2: Get status of Create An Account link
	public boolean isCreateAnAccountButtonPresent() {
		return CreateAnAccount_Button.isDisplayed();
	}

	public String getCreateAccountError() {
		return CreateAccountError.getText();
	}

	public String getPasswordErrorMessage() throws InterruptedException {
		Thread.sleep(5000);
		return Password_Error_Message.getText();
	}

	public String getPasswordMandatoryErrorMessage() {
		return Password_Mandatory_Error.getText();
	}

	public String getEmailMandatoryErrorMessage() {
		return Email_Mandatory_Error.getText();
	}

	public String getFirstNameMandatoryErrorMessage() {
		return FirstName_Mandatory_Error.getText();
	}

	public String getLastNameMandatoryErrorMessage() {
		return LastName_Mandatory_Error.getText();
	}

	public String getConfirmPasswordMandatoryErrorMessage() {
		return Confirm_Password_Mandatory_Error.getText();
	}

	// We have to create methods that can be helpful to steps of feature that we are
	// supposed to step.
	// Method1
	public void EnterEmail(String email) {
		Email_Textbox.sendKeys(email);
	}

	// Method2
	public void EnterPassword(String password) {
		Password_Textbox.sendKeys(password);
	}

	// Method3
	public void EnterFirstName(String firstname) {
		FirstName_Textbox.sendKeys(firstname);
	}

	// Method4
	public void EnterLastName(String lastname) {
		LastName_Textbox.sendKeys(lastname);
	}

	// Method5
	public void EnterConfirmPassword(String confirm_password) {
		ConfirmPassword_Textbox.sendKeys(confirm_password);
	}

	// Method6
	public void ClickCreateAnAccountButton() {
		CreateAnAccount_Button.click();
	}

	public String GetAccountCreationSuccessMessage() throws InterruptedException {
		Thread.sleep(5000);
		return CreateAccountSuccessMessage.getText();
	}

}
