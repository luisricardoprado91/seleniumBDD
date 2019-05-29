package br.com.americanas;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "/home/luis_prado/workspace/seleniumBDD/BDD/src/main/java/br/com/americanas/features")

public class TestRunner {

}
