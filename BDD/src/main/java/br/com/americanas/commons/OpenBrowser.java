package br.com.americanas.commons;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenBrowser {

	Utils utils;

	public OpenBrowser(Utils utils) {

		this.utils = utils;
	}

	public void doOpenBrowser() {

		String so = (String) System.getProperties().get("os.name");
		if (so.contains("Win")) {
			/*----------------Windows---------------------*/
			System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
			utils.setDriver(new ChromeDriver());
			utils.getDriver().manage().window().maximize();
		} else {
			// *----------------linux--------------*/
			System.setProperty("webdriver.chrome.driver", "lib\\chromedriver");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless");
			chromeOptions.addArguments("start-maximized");
			utils.setDriver(new ChromeDriver(chromeOptions));
		}
	}
}
