package StepDefinitions.WebOrderStepDefinitions;

import io.cucumber.java.en.Given;

public class RunnerTestStepDefs {
    @Given("The user send key")
    public void the_user_send_key() {
        System.out.println("This is for test 1");
    }



    @Given("The User click the button")
    public void the_User_click_the_button() {
        System.out.println("This is for test 2");

    }
}
