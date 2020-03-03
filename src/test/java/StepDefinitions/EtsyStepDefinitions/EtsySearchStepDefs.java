package StepDefinitions.EtsyStepDefinitions;

import Pages.EtsyPages.EtsyPage;
import Utils.ConfigReader;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class EtsySearchStepDefs {
    WebDriver driver= Driver.getDriver();
    EtsyPage etsyPage=new EtsyPage();


    @Given("navigate to etsy website")
    public void navigate_to_etsy_website() {
      driver.get(ConfigReader.getProperty("etsyUrl"));
    }

    @Then("enter in search bar {string}")
    public void enter_in_search_bar(String seacrhValue) {
        etsyPage.searchBox.sendKeys(seacrhValue);
    }

    @Then("click search button")
    public void click_search_button() {
       // etsyPage.searchBox.sendKeys(Keys.ENTER);
        etsyPage.searchButton.click();
    }

    @Then("validate the title is {string}")
    public void validate_the_title_is(String expectedTitle) {
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }

}
