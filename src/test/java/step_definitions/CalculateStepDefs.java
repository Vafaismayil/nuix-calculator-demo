package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CalculatorPage;
import utilities.BrowserUtil;
import utilities.ConfigurationReader;
import utilities.Driver;

public class CalculateStepDefs {
    CalculatorPage calculatorPage = new CalculatorPage();


    @Given("the calculator application is open")
    public void the_calculator_application_is_open() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env.url"));
    }

    @When("I enter {double}")
    public void i_enter(double number) {
        String [] nums = (number+"").split("");
        for (String each : nums){
            calculatorPage.getElementFor(each).click();
        }

    }


    @And("I press {string}")
    public void i_press_the_button(String operation) {
        calculatorPage.getElementFor(operation).click();
    }


    @Then("the result should be {double}")
    public void the_result_should_be(double expectedResult) { // 20.0
        String result = "";
        if ((expectedResult+"").endsWith(".0")){
            result = (expectedResult+"").substring(0, (expectedResult+"").indexOf(".") );
        } else {
            result = expectedResult + "";
        }
        calculatorPage.getElementFor("=").click();
        Assert.assertEquals( result, calculatorPage.result.getText());
    }


}
