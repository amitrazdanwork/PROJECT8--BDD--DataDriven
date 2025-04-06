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
public class SalePage {

	private WebDriver driver;
	ConfigUtil config = new ConfigUtil();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
	/* Page Elements / OR */
	@FindBy(xpath = "//*[@id=\"search\"]")
	WebElement SearchTextbox;

	@FindBy(xpath = "//*[@id=\"search_mini_form\"]/div[2]/button")
	WebElement SearchIconButton;

	/* Constructor */
	public SalePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* Page Actions */

	public void OpenSalePage() {
		driver.get(config.getSalePageURL());
	}


	
	public void EnterSearchTextbox(String string) {
		SearchTextbox.sendKeys(string);
	}

	public void ClickSearchIconButton() {
		SearchIconButton.click();
	}

	public int getNumberOfRecords(String search_val) {
		int numElements = 0;
		List<WebElement> listElements = driver.findElements(By.tagName("a"));
		for (int i = 0; i < listElements.size(); i++) {

			System.out.println("Link text :" + listElements.get(i).getText());
			if (listElements.get(i).getText().endsWith(search_val)) {
				numElements = numElements + 1;
			}
		}

		return numElements;
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public Boolean isSearchTextboxPresent() {
		return SearchTextbox.isDisplayed();
	}

	public Boolean isSearchIconButtonEnabled() throws InterruptedException {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='search_mini_form']/div[2]/button")));
		return SearchIconButton.isEnabled();
	}
}
