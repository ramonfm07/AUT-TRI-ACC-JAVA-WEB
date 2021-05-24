package tricentis.pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tricentis.setup.Hooks;
import tricentis.utils.Utils;

public class SelectPriceOptionPage {

	public SelectPriceOptionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	JavascriptExecutor executor = (JavascriptExecutor) Hooks.getDriver();

	@FindBy(id = "selectsilver")
	private WebElement radio_silver;

	@FindBy(id = "selectgold")
	private WebElement radio_gold;

	@FindBy(id = "selectplatinum")
	private WebElement radio_platinum;

	@FindBy(id = "selectultimate")
	private WebElement radio_ultimate;
	
	@FindBy(id = "nextsendquote")
	private WebElement btn_next;
	
	
	
	

	public void selecionar_price(String price) {
		switch (price) {
		case "Silver":

			Assert.assertEquals(false, radio_silver.isSelected());
			executor.executeScript("arguments[0].click();", radio_silver);
			Utils.takeScreenshot("");
			break;

		case "Gold":

			Assert.assertEquals(false, radio_gold.isSelected());
			executor.executeScript("arguments[0].click();", radio_gold);
			Utils.takeScreenshot("");
			break;

		case "Platinum":

			Assert.assertEquals(false, radio_platinum.isSelected());
			executor.executeScript("arguments[0].click();", radio_platinum);
			Utils.takeScreenshot("");
			break;

		case "Ultimate":

			Assert.assertEquals(false, radio_ultimate.isSelected());
			executor.executeScript("arguments[0].click();", radio_ultimate);
			Utils.takeScreenshot("");
			break;

		default:
			System.out.println(" \n Opção Inválida. ");

		}

  }	 
	 
	 
	public void clicar_btn_next() {
		Utils.aguardar_elemento(5, btn_next);
		executor.executeScript("arguments[0].scrollIntoView(true);", btn_next);
		Assert.assertEquals(true, btn_next.isDisplayed());
		btn_next.click();

	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
