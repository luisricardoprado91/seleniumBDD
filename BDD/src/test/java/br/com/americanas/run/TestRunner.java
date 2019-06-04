package br.com.americanas.run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", glue = "", features = "../BDD/src/main/java/br/com/americanas/features")

public class TestRunner {
}
