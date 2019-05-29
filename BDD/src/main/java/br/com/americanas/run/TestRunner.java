package br.com.americanas.run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
// @CucumberOptions(plugin = "pretty", features =
// "/home/luis_prado/workspace/seleniumBDD/BDD/src/main/java/br/com/americanas/features")
@CucumberOptions(plugin = "pretty", glue = "", features = "c:/Users/luis_prado/Desktop/GitHub/seleniumBDD/BDD/src/main/java/br/com/americanas/features")

public class TestRunner {

}
