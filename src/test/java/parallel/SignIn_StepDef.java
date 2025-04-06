package parallel;

import org.testng.Assert;
import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.*;

public class SignIn_StepDef {

	//SignInPage sipg = new SignInPage(DriverFactory.getDriver());
	
	SignInPage sipg = new SignInPage(DriverFactory.getDriver());
	String title = null;

	@Given("User is on Sign-In page")
	public void user_is_on_sign_in_page() {
		sipg.OpenSignInPage();
	}

	@Then("Email label is displayed on sign-in page")
	public void email_label_is_displayed_on_sign_in_page() {
		Assert.assertTrue(sipg.isEmailLabelPresent());
	}

	@Then("Email textbox is displayed on sign-in page")
	public void email_textbox_is_displayed_on_sign_in_page() {
		Assert.assertTrue(sipg.isEmailTextboxPresent());
	}

	@Then("Password label is displayed on sign-in page")
	public void password_label_is_displayed_on_sign_in_page() {
		Assert.assertTrue(sipg.isPasswordLabelPresent());
	}

	@Then("Password textbox is displayed on sign-in page")
	public void password_textbox_is_displayed_on_sign_in_page() {
		Assert.assertTrue(sipg.isPasswordTextboxPresent());
	}

	@Then("Forgot Password Link is displayed")
	public void forgot_password_link_is_displayed() {
		Assert.assertTrue(sipg.isForgotPasswordLinkPresent());
	}

	@Then("Create An Account button is displayed")
	public void create_an_account_button_is_displayed() {
		Assert.assertTrue(sipg.isCreateAnAccountButtonPresent());
	}

	@Then("Sign-In button is displayed")
	public void sign_in_button_is_displayed() {
		Assert.assertTrue(sipg.isSignInButtonPresent());
	}

	@When("User enters {string} in email textbox")
	public void user_enters_in_email_textbox(String string) {
		sipg.EnterEmail(string);
	}

	@When("User enters {string} in password textbox")
	public void user_enters_in_password_textbox(String string) {
		sipg.EnterPassword(string);
	}

	@When("User clicks Sign-In button")
	public void user_clicks_sign_in_button() {
		sipg.ClickSignInButton();
	}

}
