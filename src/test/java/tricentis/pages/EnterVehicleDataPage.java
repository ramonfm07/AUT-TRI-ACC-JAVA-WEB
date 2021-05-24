package tricentis.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import tricentis.setup.Hooks;
import tricentis.utils.Utils;

public class EnterVehicleDataPage {

	public EnterVehicleDataPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	Select make = new Select(Hooks.getDriver().findElement(By.id("make")));
	Select numberseats = new Select(Hooks.getDriver().findElement(By.id("numberofseats")));
	Select numberseatsmotocycle = new Select(Hooks.getDriver().findElement(By.id("numberofseatsmotorcycle")));
	Select fueltype = new Select(Hooks.getDriver().findElement(By.id("fuel")));
	Select model = new Select(Hooks.getDriver().findElement(By.id("model")));
	
	
	@FindBy(id = "engineperformance")
	private WebElement cmp_engineperformance;
	
	@FindBy(id = "cylindercapacity")
	private WebElement cmp_cylindercapacity;
	
	@FindBy(id = "dateofmanufacture")
	private WebElement cmp_datamanufatura;
	
	@FindBy(id = "payload")
	private WebElement cmp_payload;
	
	@FindBy(id = "totalweight")
	private WebElement cmp_totalweight;
	
	@FindBy(id = "listprice")
	private WebElement cmp_listprice;
	
	@FindBy(id = "annualmileage")
	private WebElement cmp_annualmileage;
	
	@FindBy(id = "nextenterinsurantdata")
	private WebElement btn_next;

	
	
	public void input_cmp_cylindercapacity(String input) {
		cmp_cylindercapacity.sendKeys(input);
	} 
	
	public void input_cmp_engineperformance(String input) {
		cmp_engineperformance.sendKeys(input);
	} 
	
	public void input_cmp_datamanufatura(String input) {
		cmp_datamanufatura.sendKeys(input);
	} 
	
	
	public void input_cmp_payload(String input) {
		cmp_payload.sendKeys(input);
	} 
	
	public void input_cmp_totalweight(String input) {
		cmp_totalweight.sendKeys(input);
	} 
	
	public void input_cmp_listprice(String input) {
		cmp_listprice.sendKeys(input);
	} 
	
	public void input_cmp_annualmileage(String input) {
		cmp_annualmileage.sendKeys(input);
	} 
	

	public void selecionar_opcao_make(String opcao) {
		make.selectByVisibleText(opcao);
	}
	
	public void selecionar_opcao_model(String opcao) {
		model.selectByVisibleText(opcao);
	}
	 
	public void selecionar_opcao_numberseatsmotocycle(String opcao) {
		numberseatsmotocycle.selectByVisibleText(opcao);
	}
	
	public void selecionar_opcao_numberseats(String opcao) {
		numberseats.selectByVisibleText(opcao);
	}
	
	public void selecionar_opcao_fueltype(String opcao) {
		fueltype.selectByVisibleText(opcao);
	}
	 
	
	public void clicar_btn_next() {
		Assert.assertEquals(true, btn_next.isDisplayed());
		btn_next.click();
	}
	 
	 
	 
	 
	 
	 
}