package com.Post_Request_SD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/Post_Request_FF"},
		glue={"com.Post_Request_SD"},
		tags="@regression",
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report6.json",
		}
		)

public class Post_Request_Runner {

}
