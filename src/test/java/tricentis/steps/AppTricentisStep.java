package tricentis.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import tricentis.setup.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tricentis.pages.EnterInsurantDataPage;
import tricentis.pages.EnterProductDataPage;
import tricentis.pages.EnterVehicleDataPage;
import tricentis.pages.HomePage;
import tricentis.pages.SelectPriceOptionPage;
import tricentis.pages.SendQuotePage;
import tricentis.utils.Utils;

public class AppTricentisStep {
	
	 
	 private HomePage homePage = new HomePage(Hooks.getDriver());
	 private EnterVehicleDataPage enterVehiclePage = new EnterVehicleDataPage(Hooks.getDriver());
	 private EnterInsurantDataPage enterInsurantPage = new EnterInsurantDataPage(Hooks.getDriver());
	 private EnterProductDataPage enterProductPage = new EnterProductDataPage(Hooks.getDriver());
	 private SelectPriceOptionPage selectPricePage = new SelectPriceOptionPage(Hooks.getDriver());
	 private SendQuotePage sendQuotePage = new SendQuotePage(Hooks.getDriver());
	 
	 
	
	@Given("que eu esteja na tela home inicial")
	public void validar_pagina_home() throws InterruptedException {

        homePage.validar_home_logo();
        Utils.takeScreenshot("");
    }

	
	@And("faço preenchimento dos campos do formulário da aba Enter Vehicle Data")
	public void faço_preenchimento_dos_campos_do_formulário_da_aba_Enter_Vehicle_Data() {
	    homePage.validar_aba("Enter Vehicle Data");
		enterVehiclePage.selecionar_opcao_make("BMW");
		enterVehiclePage.selecionar_opcao_model("Scooter");
		enterVehiclePage.input_cmp_cylindercapacity("1000");
	    enterVehiclePage.input_cmp_engineperformance("500");
	    Utils.takeScreenshot("");
	    enterVehiclePage.input_cmp_datamanufatura("02/05/2021");
	    enterVehiclePage.selecionar_opcao_numberseats("2");
	    enterVehiclePage.selecionar_opcao_numberseatsmotocycle("2");
	    enterVehiclePage.selecionar_opcao_fueltype("Gas");
	    enterVehiclePage.input_cmp_payload("200");
	    enterVehiclePage.input_cmp_totalweight("5000");
	    enterVehiclePage.input_cmp_listprice("90000");
	    enterVehiclePage.input_cmp_annualmileage("1000");
	    Utils.takeScreenshot("");
	    enterVehiclePage.clicar_btn_next();
	}

	@And("faço preenchimento dos campos do formulário da aba Enter Insurant Data")
	public void faço_preenchimento_dos_campos_do_formulário_da_aba_Enter_Insurant_Data() {
		homePage.validar_aba("Enter Insurant Data");
		enterInsurantPage.input_cmp_firstname("Joao");
		enterInsurantPage.input_cmp_lastname("Silva");
		enterInsurantPage.input_cmp_birthdate("05/02/1990");
		enterInsurantPage.selecionar_opcao_country("Brazil");
		Utils.takeScreenshot("");
		enterInsurantPage.input_cmp_zipcode("99999");
		enterInsurantPage.selecionar_opcao_occupation("Employee");
		enterInsurantPage.selecionar_hobbie("Speeding");
		Utils.takeScreenshot("");
		enterInsurantPage.selecionar_hobbie("Skydiving");
		Utils.takeScreenshot("");
		enterInsurantPage.clicar_btn_next();
		
		
	}

	@And("faço preenchimento dos campos do formulário da aba Enter Product Data")
	public void faço_preenchimento_dos_campos_do_formulário_da_aba_Enter_Product_Data() {
		homePage.validar_aba("Enter Product Data");
		enterProductPage.input_cmp_startdate("09/09/2021");
		enterProductPage.selecionar_opcao_insurancesum(4);
		Utils.takeScreenshot("");
		enterProductPage.selecionar_opcao_meritrating("Bonus 9");
		enterProductPage.selecionar_opcao_damageinsurance("No Coverage");
		enterProductPage.selecionar_optional_products("Euro Protection");
		enterProductPage.selecionar_optional_products("Legal Defense Insurance");
		enterProductPage.selecionar_opcao_courtesycar("Yes");
		Utils.takeScreenshot("");
		enterProductPage.clicar_btn_next();
		
		
	}

	@And("seleciono uma opção de preço da aba Select Price Option")
	public void seleciono_uma_opção_de_preço_da_aba_Select_Price_Option() {
		homePage.validar_aba("Select Price Option");
		selectPricePage.selecionar_price("Platinum");
		selectPricePage.clicar_btn_next();
		Utils.takeScreenshot("");
		
	}

	@And("faço preenchimento dos campos do formulário da aba Send Quote")
	public void faço_preenchimento_dos_campos_do_formulário_da_aba_Sendo_Quote() {
		homePage.validar_aba("Send Quote");
		sendQuotePage.input_cmp_email("qatesterd8@outlook.com");
		sendQuotePage.input_cmp_user("qatester");
		sendQuotePage.input_cmp_password("test@Test123");
		sendQuotePage.input_cmp_confirmpassword("test@Test123");
		
		
		
	}

	@When("clico no botão Send")
	public void clico_no_botão_Send() {
		sendQuotePage.clicar_btn_send();
	}

	@Then("valido a mensagem Send e-mail success!")
	public void valido_a_mensagem_Send_e_mail_success() throws InterruptedException {
	    homePage.validar_mensagem("Sending e-mail success!");
	}



	
}
