package parallel;

import org.testng.Assert;
import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.*;

public class CreateAnAccount_StepDef {

	CreateAnAccountPage capage = new CreateAnAccountPage(DriverFactory.getDriver());
	String title = null;

	@Given("User is on Create An Account page")
	public void user_is_on_create_an_account_page() {
		capage.OpenCreateAnAccountPage();
	}

	@Then("Email label is displayed on create an account page")
	public void email_label_is_displayed_on_create_an_account_page() {
		Assert.assertTrue(capage.isEmailLabelPresent());
	}

	@Then("Email textbox is displayed on create an account page")
	public void email_textbox_is_displayed_on_create_an_account_page() {
		Assert.assertTrue(capage.isEmailTextboxlPresent());
	}

	@Then("Password label is displayed on create an account page")
	public void password_label_is_displayed_on_create_an_account_page() {
		Assert.assertTrue(capage.isPasswordLabelPresent());
	}

	@Then("Password textbox is displayed on create an account page")
	public void password_textbox_is_displayed_on_create_an_account_page() {
		Assert.assertTrue(capage.isPasswordTextboxlPresent());
	}

	@Then("First Name label is displayed")
	public void first_name_label_is_displayed() {
		Assert.assertTrue(capage.isFirstNameLabelPresent());
	}

	@Then("First Name textbox is displayed")
	public void first_name_textbox_is_displayed() {
		Assert.assertTrue(capage.isFirstNameTextboxlPresent());
	}

	@Then("Last Name label is displayed")
	public void last_name_label_is_displayed() {
		Assert.assertTrue(capage.isLastNameLabelPresent());
	}

	@Then("Last Name textbox is displayed")
	public void last_name_textbox_is_displayed() {
		Assert.assertTrue(capage.isLastNameTextboxlPresent());
	}

	@Then("Confirm Password label is displayed")
	public void confirm_password_label_is_displayed() {
		Assert.assertTrue(capage.isConfirmPasswordLabelPresent());
	}

	@Then("Confirm Password textbox is displayed")
	public void confirm_password_textbox_is_displayed() {
		Assert.assertTrue(capage.isConfirmPasswordTextboxlPresent());
	}

	@Then("Create An Account button is displayed on create an account page")
	public void create_an_account_button_is_displayed_on_create_an_account_page() {
		Assert.assertTrue(capage.isCreateAnAccountButtonPresent());
	}

	@When("User enters {string} in password textbox on create an account page")
	public void user_enters_in_password_textbox_on_create_an_account_page(String string) {
		capage.EnterPassword(string);
	}

	@Then("User gets error message as {string}")
	public void user_gets_error_message_as(String string) throws InterruptedException {
		if (string.equals(
				"There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.")) {
			Assert.assertEquals(capage.getCreateAccountError(), string);
		} else {
			Assert.assertEquals(capage.getPasswordErrorMessage(), string);
		}
	}

	@When("User clicks on Create An Account button")
	public void user_clicks_on_create_an_account_button() {
		capage.ClickCreateAnAccountButton();
	}

	@Then("User gets {string} under First Name textbox")
	public void user_gets_under_first_name_textbox(String string) {
		Assert.assertEquals(capage.getFirstNameMandatoryErrorMessage(), string);
	}

	@Then("User gets {string} under Last Name textbox")
	public void user_gets_under_last_name_textbox(String string) {
		Assert.assertEquals(capage.getLastNameMandatoryErrorMessage(), string);
	}

	@Then("User gets {string} under Email textbox")
	public void user_gets_under_email_textbox(String string) {
		Assert.assertEquals(capage.getEmailMandatoryErrorMessage(), string);
	}

	@Then("User gets {string} under Password textbox")
	public void user_gets_under_password_textbox(String string) {
		Assert.assertEquals(capage.getPasswordMandatoryErrorMessage(), string);
	}

	@Then("User gets {string} under Confirm Password textbox")
	public void user_gets_under_confirm_password_textbox(String string) {
		Assert.assertEquals(capage.getConfirmPasswordMandatoryErrorMessage(), string);
	}

	@When("User enters {string} in First Name textbox")
	public void user_enters_in_first_name_textbox(String string) {
		capage.EnterFirstName(string);
	}

	@When("User enters {string} in Last Name textbox")
	public void user_enters_in_last_name_textbox(String string) {
		capage.EnterLastName(string);
	}

	@When("User enters {string} in email textbox on create an account page")
	public void user_enters_in_email_textbox_on_create_an_account_page(String string) {
		capage.EnterEmail(string);
	}

	@When("User enters {string} in Confirm Password textbox")
	public void user_enters_in_confirm_password_textbox(String string) {
		capage.EnterConfirmPassword(string);
	}

	@Then("User gets success message as {string}")
	public void user_gets_success_message_as(String string) throws InterruptedException {
		Assert.assertEquals(capage.GetAccountCreationSuccessMessage(), string);
	}

	@Then("User gets page title as {string}")
	public void user_gets_page_title_as(String string) {
		Assert.assertEquals(capage.getPageTitle(), string);
	}

}
