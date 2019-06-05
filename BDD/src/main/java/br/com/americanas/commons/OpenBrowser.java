package br.com.americanas.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OpenBrowser {

	Utils utils;

	public OpenBrowser(Utils utils) {

		this.utils = utils;
	}

	public void doOpenBrowser() {

		String so = (String) System.getProperties().get("os.name");
		if (so.contains("Win")) {
			/*----------------Windows---------------------*/
			System.setProperty("webdriver.gecko.driver", "lib\\geckodriver.exe");
			utils.setDriver(new ChromeDriver());
			utils.getDriver().manage().window().maximize();
		} else {
			// *----------------linux--------------*/
			System.setProperty("webdriver.gecko.driver", "lib/geckodriver");
			FirefoxOptions options = new FirefoxOptions();
			options.setHeadless(true);

			// Instantiate Web Driver
			utils.setDriver(new FirefoxDriver(options));
		}
	}
}
