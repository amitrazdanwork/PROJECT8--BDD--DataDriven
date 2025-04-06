package parallel;

import org.testng.Assert;
import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.*;

public class Background_StepDef {
	SignInPage sp = new SignInPage(DriverFactory.getDriver());
	CreateAnAccountPage capg = new CreateAnAccountPage(DriverFactory.getDriver());

	String title = null;

	@When("User gets the page title")
	public void user_gets_the_page_title() {
	//	title = DriverFactory.getDriver().getTitle();
		
		title=DriverFactory.getDriver().getTitle();
		System.out.println("Title :" + title);
	}

	@Then("title of the page is {string}")
	public void title_of_the_page_is(String string) {
		Assert.assertEquals(title, string);
	}

}
