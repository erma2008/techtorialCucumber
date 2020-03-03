package StepDefinitions.WebOrderStepDefinitions;

import Pages.WebOrderPages.HomePage;
import Utils.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePageStepDef {
    WebDriver driver= Driver.getDriver();
    HomePage page=new HomePage();

    @Then("the user validate order menu list")
    public void the_user_validate_order_menu_list() {
        // This is for Api response or DataBase
        List<String> expected=page.orderMenuData();
        //This is coming fro Website
        List<String> actual=new ArrayList<>();
        //Used this loop for assertion
        for(WebElement element:page.orderMenu){
            actual.add(element.getText());
        }

        for(int i=0;i<actual.size();i++){
            Assert.assertEquals(actual.get(i),expected.get(i));
        }
    }
}
