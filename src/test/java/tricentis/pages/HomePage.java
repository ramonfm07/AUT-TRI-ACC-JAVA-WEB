package tricentis.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import tricentis.utils.Utils;

public class HomePage {
	
	
	
	
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "tricentis_logo")
    private WebElement logo;
    
    @FindBy(id = "entervehicledata")
    private WebElement aba_vehicle;
    
    @FindBy(id = "enterinsurantdata")
    private WebElement aba_insurant;
    
    @FindBy(id = "enterproductdata")
    private WebElement aba_product;
    
    @FindBy(id = "selectpriceoption")
    private WebElement aba_price;
    
    @FindBy(id = "sendquote")
    private WebElement aba_sendquote;
    
    
    @FindBy(xpath = "//h2[text()='Sending e-mail success!']")
    private WebElement msg_send;
    
    
    
    
    public void validar_home_logo() {
    	
    	Utils.aguardar_elemento(10, logo);
    	Assert.assertEquals(true, logo.isDisplayed());
    }
    
    public void validar_aba(String aba) {
    
    	switch (aba) { 
        case "Enter Vehicle Data":
        	Utils.aguardar_elemento(10, aba_vehicle);
        	Assert.assertEquals(true, aba_vehicle.isDisplayed());
        	Utils.takeScreenshot("");
            break;
            
        case "Enter Insurant Data":
        	Utils.aguardar_elemento(10, aba_insurant);
        	Assert.assertEquals(true, aba_insurant.isDisplayed());
        	Utils.takeScreenshot("");
            break;
            
        case "Enter Product Data":
        	Utils.aguardar_elemento(10, aba_product);
        	Assert.assertEquals(true, aba_product.isDisplayed());
        	Utils.takeScreenshot("");
            break;
            
        case "Select Price Option":
        	Utils.aguardar_elemento(10,aba_price);
        	Assert.assertEquals(true, aba_price.isDisplayed());
        	Utils.takeScreenshot("");
            break;
            
        case "Send Quote":
        	Utils.aguardar_elemento(10, aba_sendquote);
        	Assert.assertEquals(true, aba_sendquote.isDisplayed());
        	Utils.takeScreenshot("");
            break;
        default:
            System.out.println(" \n Opção Inválida. ");
            
    }

 }

	public void validar_mensagem(String msg) throws InterruptedException {
		Utils.aguardar_elemento(12, msg_send);
		Thread.sleep(5000);
    	Assert.assertEquals(msg, msg_send.getText().trim());
    	Utils.takeScreenshot("");
 }
    
}
    

