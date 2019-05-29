package br.com.americanas.stepdefinition;

import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.americanas.commons.Objects;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmericanasSteps {
	Objects objects;

	@Before
	public void before() {
		this.objects = new Objects();
		System.setProperty("webdriver.gecko.driver", "lib/linux/geckodriver");
		objects.utils.setDriver(new FirefoxDriver());
		objects.utils.getDriver().manage().window().maximize();
	}

	@Given("Estou na tela inicial")
	public void estou_na_tela_inicial() {

		objects.utils.getDriver().get("https://www.americanas.com.br");
	}

	@When("Eu clico no botão CLiente novo? Cadastrar")
	public void eu_clico_no_botão() {
		objects.homeObjects.boxAcesso().click();
		objects.homeObjects.cadastrar().click();
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
