package com.Get_datadriven_SD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/Get_datadriven_FF/MyDataDrivenFile.feature"},
		glue={"com.Get_datadriven_SD"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report3.json",
		}
		)

public class MyGetDataDrivenRunnerFile {

}
