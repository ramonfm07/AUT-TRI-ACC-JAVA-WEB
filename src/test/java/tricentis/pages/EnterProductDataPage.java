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

public class EnterProductDataPage {

	public EnterProductDataPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}


	JavascriptExecutor executor = (JavascriptExecutor) Hooks.getDriver();

	
	Select insurancesum = new Select(Hooks.getDriver().findElement(By.id("insurancesum")));
	Select meritrating = new Select(Hooks.getDriver().findElement(By.id("meritrating")));
	Select damageinsurance = new Select(Hooks.getDriver().findElement(By.id("damageinsurance")));
	Select courtesycar = new Select(Hooks.getDriver().findElement(By.id("courtesycar")));
	
	
	

	@FindBy(id = "startdate")
	private WebElement cmp_startdate;
	
	@FindBy(id = "EuroProtection")
	private WebElement cx_europrotection;
	
	@FindBy(id = "LegalDefenseInsurance")
	private WebElement cx_legaldefenseinsurance;
	
	@FindBy(id = "nextselectpriceoption")
	private WebElement btn_next;
	
	
	
	

	public void input_cmp_startdate(String input) {
		cmp_startdate.sendKeys(input);
	} 
	 
	
	public void selecionar_opcao_insurancesum(int num) {
		insurancesum.selectByIndex(num);
		
	}
	
	public void selecionar_opcao_meritrating(String opcao) {
		meritrating.selectByVisibleText(opcao);
		
	}
	
	public void selecionar_opcao_damageinsurance(String opcao) {
		damageinsurance.selectByVisibleText(opcao);
		
	}
	
	
	public void selecionar_opcao_courtesycar(String opcao) {
		courtesycar.selectByVisibleText(opcao);
		
	}
	 
	 public void selecionar_optional_products(String products) {
		 switch (products) { 
	        case "Euro Protection":
	        	
	        	Assert.assertEquals(false, cx_europrotection.isSelected());
	        	executor.executeScript("arguments[0].click();", cx_europrotection);
	        	Utils.takeScreenshot("");
	            break;
	            
	        case "Legal Defense Insurance":
	        	
	        	Assert.assertEquals(false, cx_legaldefenseinsurance.isSelected());
	        	executor.executeScript("arguments[0].click();", cx_legaldefenseinsurance);
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