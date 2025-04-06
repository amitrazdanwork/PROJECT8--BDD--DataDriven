package parallel;

import org.testng.Assert;
import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.*;
import org.openqa.selenium.WebDriver;

import pages.*;

public class ForgotPassword_StepDef {

	private WebDriver driver;
	// ForgotPasswordPage forgotpasswordpage = new ForgotPasswordPage(DriverFactory.getDriver());

	ForgotPasswordPage forgotpasswordpage = new ForgotPasswordPage(DriverFactory.getDriver());

	@Given("User is on Forgot Password page")
	public void user_is_on_forgot_password_page() {
		forgotpasswordpage.OpenForgotPasswordPage();
	}

	@Then("Forgot Password label is displayed")
	public void user_get_label() {
		Assert.assertTrue(forgotpasswordpage.isForgotPasswordLabelPresent());
	}

	@Then("Please enter your email address below to receive a password reset link. label is displayed")
	public void user_get_label_message() {
		Assert.assertTrue(forgotpasswordpage.isMessageLabelPresent());
	}

	@Then("Email label")
	public void email_label() {
		Assert.assertTrue(forgotpasswordpage.isEmailLabelPresent());
	}

	@Then("Reset My Password button")
	public void reset_my_password_button() {
		Assert.assertTrue(forgotpasswordpage.isResetMyPasswordButtonPresent());
	}

	@When("User clicks on {string} button")
	public void user_clicks_on_button(String string) {
		forgotpasswordpage.ClickResetMyPasswordButton();
	}

	@When("User enters {string} in email textbox on Forgot Password page")
	public void user_enter_email_in_email_textbox_on_fp(String string) {
		forgotpasswordpage.EnterEmail(string);
	}

	@Then("Email label is displayed")
	public void Email_label_is_displayed() {
		Assert.assertTrue(forgotpasswordpage.isEmailLabelPresent());
	}

	@Then("Email textbox is displayed")
	public void Email_textbox_is_displayed() {
		Assert.assertTrue(forgotpasswordpage.isEmailTextboxPresent());
	}

	@Then("Reset My Password button is displayed")
	public void Reset_My_Password_button_is_displayed() {
		Assert.assertTrue(forgotpasswordpage.isResetMyPasswordButtonPresent());
	}

	@Then("{string} is displayed under Email textbox")
	public void Mandatory_Message_Email_textbox(String string) {
		Assert.assertEquals(forgotpasswordpage.getEmailMandatoryMessage(), string);
	}

	@Then("{string} message is displayed")
	public void Message_forgot_password_success(String string) {
		Assert.assertEquals(forgotpasswordpage.getResetSuccessMessage(), string);
	}

}
