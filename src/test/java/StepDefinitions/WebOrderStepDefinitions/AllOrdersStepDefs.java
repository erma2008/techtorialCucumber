package StepDefinitions.WebOrderStepDefinitions;

import Pages.WebOrderPages.AllOrdersPage;
import Pages.WebOrderPages.HomePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AllOrdersStepDefs {
    AllOrdersPage allOrdersPage=new AllOrdersPage();
    HomePage homePage=new HomePage();


    @Then("the user click on View All Orders")
    public void the_user_click_on_View_All_Orders() {
        homePage.getOrderButton("View All Orders");
    }


    @Then("validate {string} header is displayed")
    public void validate_header_is_displayed(String expectedHeader) {
        String actualHeader=allOrdersPage.listOfOrdersHeader.getText();
        Assert.assertEquals(actualHeader,expectedHeader);


    }

}
