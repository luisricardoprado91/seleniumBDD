package br.com.americanas.selenium.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.americanas.commons.Utils;

public class HomeObjects {

	Utils utils;
	private WebElement loginCadastrese;
	private WebElement loginButton;
	private WebElement cadastreButton;

	public HomeObjects(Utils utils) {
		this.utils = utils;
	}

	public WebElement getLoginCadastrese() {

		loginCadastrese = utils.getDriver().findElement(By.id("h_usr-link"));
		return loginCadastrese;
	}

	public WebElement getLoginButton() {

		loginButton = utils.getDriver().findElement(By.id("h_usr-signin"));
		return loginButton;

	}

	public WebElement getCadastreseButton() {
		cadastreButton = utils.getDriver().findElement(By.xpath("//a[@class='usr-signup']"));
		return cadastreButton;
	}

}
