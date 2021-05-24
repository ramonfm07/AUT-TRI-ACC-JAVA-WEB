package tricentis.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import tricentis.setup.Hooks;
import tricentis.utils.Utils;

public class EnterInsurantDataPage {
	
	
	public EnterInsurantDataPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	JavascriptExecutor executor = (JavascriptExecutor) Hooks.getDriver();

	Select country = new Select(Hooks.getDriver().findElement(By.id("country")));
	Select occupation = new Select(Hooks.getDriver().findElement(By.id("occupation")));

	@FindBy(id = "firstname")
	private WebElement cmp_firstname;

	@FindBy(id = "lastname")
	private WebElement cmp_lastname;

	@FindBy(id = "birthdate")
	private WebElement cmp_birthdate;

	@FindBy(id = "zipcode")
	private WebElement cmp_zipcode;

	@FindBy(xpath = "//input[@id='speeding']")
	private WebElement cx_speeding;

	@FindBy(xpath = "//input[@id='bungeejumping']")
	private WebElement cx_bungeejumping;

	@FindBy(xpath = "//input[@id='cliffdiving']")
	private WebElement cx_cliffdiving;

	@FindBy(xpath = "//input[@id='skydiving']")
	private WebElement cx_skydiving;

	@FindBy(xpath = "//input[@id='other']")
	private WebElement cx_other;

	@FindBy(id = "nextenterproductdata")
	private WebElement btn_next;

	public void input_cmp_firstname(String input) {
		cmp_firstname.sendKeys(input);
	}

	public void input_cmp_lastname(String input) {
		cmp_lastname.sendKeys(input);
	}

	public void input_cmp_zipcode(String input) {
		cmp_zipcode.sendKeys(input);
	}

	public void input_cmp_birthdate(String input) {
		cmp_birthdate.sendKeys(input);
	}

	public void selecionar_opcao_country(String opcao) {
		country.selectByVisibleText(opcao);

	}

	public void selecionar_opcao_occupation(String opcao) {
		occupation.selectByVisibleText(opcao);
	}

	public void selecionar_hobbie(String hobbie) {
		switch (hobbie) {
		case "Speeding":

			Assert.assertEquals(false, cx_speeding.isSelected());
			executor.executeScript("arguments[0].click();", cx_speeding);
			Utils.takeScreenshot("");
			break;

		case "Bungee Jumping":

			Assert.assertEquals(false, cx_bungeejumping.isSelected());
			executor.executeScript("arguments[0].click();", cx_bungeejumping);
			Utils.takeScreenshot("");
			break;

		case "Skydiving":

			Assert.assertEquals(false, cx_skydiving.isSelected());
			executor.executeScript("arguments[0].click();", cx_skydiving);
			Utils.takeScreenshot("");
			break;

		case "Other":

			Assert.assertEquals(false, cx_other.isSelected());
			executor.executeScript("arguments[0].click();", cx_other);
			Utils.takeScreenshot("");
			break;

		default:
			System.out.println(" \n Opção Inválida. ");

		}

	}

	public void clicar_btn_next() {
		Assert.assertEquals(true, btn_next.isDisplayed());
		btn_next.click();

	}
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 


