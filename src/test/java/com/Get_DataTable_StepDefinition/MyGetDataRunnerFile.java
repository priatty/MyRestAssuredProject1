package com.Get_DataTable_StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/Get_DataTable/MyDataTableFeatureFile.feature"},
		glue={"com.Get_DataTable_StepDefinition"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report1.json",
		}
		)

public class MyGetDataRunnerFile {

}
