package br.com.americanas.commons;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	Utils utils;

	public OpenBrowser(Utils utils) {

		this.utils = utils;
	}

	public void doOpenBrowser() {
		/*----------------Windows---------------------*/
		System.setProperty("webdriver.gecko.driver", "lib\\geckodriver.exe");
		utils.setDriver(new FirefoxDriver());
		utils.getDriver().manage().window().maximize();

		/*----------------linux--------------*/
		// ChromeOptions chromeOptions = new ChromeOptions();
		// utils.setDriver(new ChromeDriver(chromeOptions));
		// chromeOptions.addArguments("--headless");
		// chromeOptions.addArguments("--no-sandbox");

	}

}
