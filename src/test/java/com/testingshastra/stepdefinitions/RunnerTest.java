package com.testingshastra.stepdefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources",glue={"com.testingshastra.stepdefinitions"},tags="Regression",dryRun=false)

public class RunnerTest extends AbstractTestNGCucumberTests{

}
