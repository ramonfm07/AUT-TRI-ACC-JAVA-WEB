package tricentis.pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tricentis.setup.Hooks;
import tricentis.utils.Utils;

public class SendQuotePage {

	 public SendQuotePage(WebDriver driver) {
	        PageFactory.initElements(driver, this);

}
	 
		JavascriptExecutor executor = (JavascriptExecutor) Hooks.getDriver();
	 
	 
	 
	 @FindBy(id = "email")
	 private WebElement cmp_email;
	 
	 @FindBy(id = "username")
	 private WebElement cmp_username;
	 
	 @FindBy(id = "password")
	 private WebElement cmp_password;
	 
	 @FindBy(id = "confirmpassword")
	 private WebElement cmp_confirmpassword;
	 
	 @FindBy(id = "sendemail")
	 private WebElement btn_send;
	 
	 
	 
	 
		public void input_cmp_email(String input) {
			cmp_email.sendKeys(input);
		}

		public void input_cmp_user(String input) {
			cmp_username.sendKeys(input);
		}

		public void input_cmp_password(String input) {
			cmp_password.sendKeys(input);
		}

		public void input_cmp_confirmpassword(String input) {
			cmp_confirmpassword.sendKeys(input);
		}
	 
	 
		public void clicar_btn_send() {
			Utils.aguardar_elemento(5, btn_send);
			executor.executeScript("arguments[0].scrollIntoView(true);", btn_send);
			Assert.assertEquals(true, btn_send.isDisplayed());
			btn_send.click();

		}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
