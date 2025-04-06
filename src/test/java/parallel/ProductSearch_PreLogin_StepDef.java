package parallel;

import org.testng.Assert;
import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.*;

public class ProductSearch_PreLogin_StepDef {

	WhatsNewPage wnpg = new WhatsNewPage(DriverFactory.getDriver());
	WomenPage wpg = new WomenPage(DriverFactory.getDriver());
	MenPage mpg = new MenPage(DriverFactory.getDriver());
	GearPage gpg = new GearPage(DriverFactory.getDriver());
	TrainingPage tpg = new TrainingPage(DriverFactory.getDriver());
	SalePage spg = new SalePage(DriverFactory.getDriver());

	@Given("User is on What's new page")
	public void user_is_on_what_s_new_page() {
		wnpg.OpenWhatsNewPage();
	}

	@Given("Search textbox is displayed on What's new page")
	public void search_textbox_is_displayed_on_what_s_new_page() {
		wnpg.isSearchTextboxPresent();
	}

	@When("User enters {string} in Search textbox on What's new page")
	public void user_enters_in_search_textbox_on_what_s_new_page(String string) {
		wnpg.EnterSearchTextbox(string);
	}

	@When("User clicks on Search icon on What's new page")
	public void user_clicks_on_search_icon_on_what_s_new_page() {
		wnpg.ClickSearchIconButton();
	}

	@Then("User gets the result outcome for {string} on What's new page")
	public void user_gets_the_result_outcome_for_on_what_s_new_page(String string) {
		if (string.equals("Jacket")) {
			Assert.assertEquals(wnpg.getNumberOfRecords(string), 12);
		} else if (string.equals("Bag")) {
			Assert.assertEquals(wnpg.getNumberOfRecords(string), 4);
		}
	}

	@Then("Search Icon button gets enabled on What's new page")
	public void search_icon_gets_enabled_on_whats() throws InterruptedException {
		Assert.assertTrue(wnpg.isSearchIconButtonEnabled());
	}

	@Then("Search Icon button gets enabled on Women page")
	public void search_icon_gets_enabled_on_women() throws InterruptedException {
		Assert.assertTrue(wpg.isSearchIconButtonEnabled());
	}

	@Then("Search Icon button gets enabled on Men page")
	public void search_icon_gets_enabled_on_men() throws InterruptedException {
		Assert.assertTrue(mpg.isSearchIconButtonEnabled());
	}

	@Then("Search Icon button gets enabled on Training page")
	public void search_icon_gets_enabled_on_training() throws InterruptedException {
		Assert.assertTrue(tpg.isSearchIconButtonEnabled());
	}

	@Then("Search Icon button gets enabled on Sale page")
	public void search_icon_gets_enabled_on_sale() throws InterruptedException {
		Assert.assertTrue(spg.isSearchIconButtonEnabled());
	}

	@Then("Search Icon button gets enabled on Gear page")
	public void search_icon_gets_enabled_on_gear() throws InterruptedException {
		Assert.assertTrue(gpg.isSearchIconButtonEnabled());
	}

	@Given("User is on Women page")
	public void user_is_on_women_page() {
		wpg.OpenWomenPage();
	}

	@Given("Search textbox is displayed on Women page")
	public void search_textbox_is_displayed_on_women_page() {
		Assert.assertTrue(wpg.isSearchTextboxPresent());
	}

	@When("User enters {string} in Search textbox on Women page")
	public void user_enters_in_search_textbox_on_women_page(String string) {
		wpg.EnterSearchTextbox(string);
	}

	@When("User clicks on Search icon on Women page")
	public void user_clicks_on_search_icon_on_women_page() {
		wpg.ClickSearchIconButton();
	}

	@Then("User gets the result outcome for {string} on Women page")
	public void user_gets_the_result_outcome_for_on_women_page(String string) {
		if (string.equals("Jacket")) {
			Assert.assertEquals(wpg.getNumberOfRecords(string), 12);
		} else if (string.equals("Bag")) {
			Assert.assertEquals(wpg.getNumberOfRecords(string), 4);
		}
	}

	@Given("User is on Men page")
	public void user_is_on_men_page() {
		mpg.OpenMenPage();
	}

	@Given("Search textbox is displayed on Men page")
	public void search_textbox_is_displayed_on_men_page() {
		Assert.assertTrue(mpg.isSearchTextboxPresent());
	}

	@When("User enters {string} in Search textbox on Men page")
	public void user_enters_in_search_textbox_on_men_page(String string) {
		mpg.EnterSearchTextbox(string);
	}

	@When("User clicks on Search icon on Men page")
	public void user_clicks_on_search_icon_on_men_page() {
		mpg.ClickSearchIconButton();
	}

	@Then("User gets the result outcome for {string} on Men page")
	public void user_gets_the_result_outcome_for_on_men_page(String string) {
		if (string.equals("Jacket")) {
			Assert.assertEquals(mpg.getNumberOfRecords(string), 12);
		} else if (string.equals("Bag")) {
			Assert.assertEquals(mpg.getNumberOfRecords(string), 4);
		}
	}

	@Given("User is on Gear page")
	public void user_is_on_gear_page() {
		gpg.OpenGearPage();
	}

	@Given("Search textbox is displayed on Gear page")
	public void search_textbox_is_displayed_on_gear_page() {
		Assert.assertTrue(gpg.isSearchTextboxPresent());
	}

	@When("User enters {string} in Search textbox on Gear page")
	public void user_enters_in_search_textbox_on_gear_page(String string) {
		gpg.EnterSearchTextbox(string);
	}

	@When("User clicks on Search icon on Gear page")
	public void user_clicks_on_search_icon_on_gear_page() {
		gpg.ClickSearchIconButton();
	}

	@Then("User gets the result outcome for {string} on Gear page")
	public void user_gets_the_result_outcome_for_on_gear_page(String string) {
		if (string.equals("Jacket")) {
			Assert.assertEquals(gpg.getNumberOfRecords(string), 12);
		} else if (string.equals("Bag")) {
			Assert.assertEquals(gpg.getNumberOfRecords(string), 4);
		}
	}

	@Given("User is on Training page")
	public void user_is_on_training_page() {
		tpg.OpenTrainingsPage();
	}

	@Given("Search textbox is displayed on Training page")
	public void search_textbox_is_displayed_on_training_page() {
		tpg.isSearchTextboxPresent();
	}

	@When("User enters {string} in Search textbox on Training page")
	public void user_enters_in_search_textbox_on_training_page(String string) {
		tpg.EnterSearchTextbox(string);
	}

	@When("User clicks on Search icon on Training page")
	public void user_clicks_on_search_icon_on_training_page() {
		tpg.ClickSearchIconButton();
	}

	@Then("User gets the result outcome for {string} on Training page")
	public void user_gets_the_result_outcome_for_on_training_page(String string) {
		if (string.equals("Jacket")) {
			Assert.assertEquals(tpg.getNumberOfRecords(string), 12);
		} else if (string.equals("Bag")) {
			Assert.assertEquals(tpg.getNumberOfRecords(string), 4);
		}
	}

	@Given("User is on Sale page")
	public void user_is_on_sale_page() {
		spg.OpenSalePage();
	}

	@Given("Search textbox is displayed on Sale page")
	public void search_textbox_is_displayed_on_sale_page() {
		spg.isSearchTextboxPresent();
	}

	@When("User enters {string} in Search textbox on Sale page")
	public void user_enters_in_search_textbox_on_sale_page(String string) {
		spg.EnterSearchTextbox(string);
	}

	@When("User clicks on Search icon on Sale page")
	public void user_clicks_on_search_icon_on_sale_page() {
		spg.ClickSearchIconButton();
	}

	@Then("User gets the result outcome for {string} on Sale page")
	public void user_gets_the_result_outcome_for_on_sale_page(String string) {
		if (string.equals("Jacket")) {
			Assert.assertEquals(spg.getNumberOfRecords(string), 12);
		} else if (string.equals("Bag")) {
			Assert.assertEquals(spg.getNumberOfRecords(string), 4);
		}
	}

}
