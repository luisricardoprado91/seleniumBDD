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

public class AmericanasSteps {
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

	@Given("Estou na tela inicial")
	public void estou_na_tela_inicial() {
		utils.getDriver().get("https://www.americanas.com.br");
	}

	@When("Eu clico no botao CLiente novo? Cadastrar")
	public void eu_clico_no_botao() {

		homeObjects = new HomeObjects(this.utils);
		Actions act = new Actions(utils.getDriver());
		act.moveToElement(homeObjects.getLoginCadastrese()).build().perform();
		utils.waitForElement(homeObjects.getCadastreseButton());
		homeObjects.getCadastreseButton().click();
	}

	@When("Insiro {string} {string} {string} {string} {string} <telefone> validos")
	public void insiro_telefone_validos(String string, String string2, String string3, String string4, String string5) {

	}

	@When("Clico no botao")
	public void clico_no_botao() {
	}

	@Then("Cadastro deve ser concluido com sucesso")
	public void cadastro_deve_ser_concluido_com_sucesso() {
	}

}
