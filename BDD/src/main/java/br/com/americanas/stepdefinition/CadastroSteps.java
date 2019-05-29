package br.com.americanas.stepdefinition;

import org.openqa.selenium.interactions.Actions;

import br.com.americanas.commons.CloseBrowser;
import br.com.americanas.commons.OpenBrowser;
import br.com.americanas.commons.Utils;
import br.com.americanas.selenium.pageObjects.HomeObjects;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CadastroSteps {
	Utils utils;
	HomeObjects homeObjects;

	@Before
	public void before() {
		this.utils = new Utils();

		OpenBrowser openBrowser = new OpenBrowser(utils);
		openBrowser.doOpenBrowser();
	}

	@After
	public void after() {
		CloseBrowser closeBrowser = new CloseBrowser(utils);
		closeBrowser.doCloseBrowser();
	}

	@Given("I am on home page")
	public void i_am_on_home_page() {
	}

	@When("I click on buttton Cliente novo? Cadastrar")
	public void i_click_on_buttton_Cliente_novo_Cadastrar() {
		homeObjects = new HomeObjects(this.utils);
		Actions act = new Actions(utils.getDriver());
		act.moveToElement(homeObjects.getLoginCadastrese()).build().perform();
		utils.waitForElement(homeObjects.getCadastreseButton());
		homeObjects.getCadastreseButton().click();
	}

	@When("Insiro {string} {string} {string} {string} {string} {string} validos")
	public void insiro_telefone_validos(String string, String string2, String string3, String string4, String string5,
			String string6) {

	}

	@When("Clico no botao")
	public void clico_no_botao() {
	}

	@Then("Cadastro deve ser concluido com sucesso")
	public void cadastro_deve_ser_concluido_com_sucesso() {
	}

	@Given("Que estou na tela de cadastro")
	public void que_estou_na_tela_de_cadastro() {
	}

	@When("Eu nao preencho nenhum campo")
	public void eu_nao_preencho_nenhum_campo() {
	}

	@Then("Deve apresentar mensagens de cmapos obrigatorios")
	public void deve_apresentar_mensagens_de_cmapos_obrigatorios() {
	}

	@Then("The subscribe page must be loaded")
	public void the_subscribe_page_must_be_loaded() {
	}

}
