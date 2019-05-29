package br.com.americanas.commons;

import br.com.americanas.selenium.pageObjects.HomeObjects;

public class Objects {

	public Utils utils = new Utils();

	public OpenBrowser openBrowser = new OpenBrowser(utils);
	public CloseBrowser closeBrowser = new CloseBrowser(utils);
	public HomeObjects homeObjects = new HomeObjects(utils);

}
