package br.com.americanas.selenium.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.americanas.commons.Utils;

public class HomeObjects {
	Utils utils;

	public HomeObjects(Utils utils) {
		this.utils = utils;
	}

	private WebElement boxAcesso = utils.getDriver().findElement(By.id("h_user"));
	private WebElement cadastrar = utils.getDriver().findElement(By.xpath("//a[@class='usr-signup']"));

	public WebElement boxAcesso() {
		return this.boxAcesso;
	}

	public WebElement cadastrar() {
		return this.cadastrar;
	}

}
