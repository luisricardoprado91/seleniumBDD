package br.com.americanas.actions;

import org.openqa.selenium.interactions.Actions;

import br.com.americanas.commons.Utils;
import br.com.americanas.selenium.pageObjects.HomeObjects;

public class Login {
	Utils utils;

	public Login(Utils utils) {

		this.utils = utils;
	}

	public void doLogin() {

		HomeObjects homeObjects = new HomeObjects(utils);
		Actions act = new Actions(utils.getDriver());

		act.moveToElement(homeObjects.getLoginCadastrese()).build().perform();
		utils.waitForElement(homeObjects.getLoginButton());
		homeObjects.getLoginButton().click();
	}
}
