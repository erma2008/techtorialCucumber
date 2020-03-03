package Pages.WebOrderPages;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//ul[@id='ctl00_menu']//li")
    public List<WebElement> orderMenu;

    @FindBy(xpath = "//a[.='View all products']")
    public WebElement viewAllProductsButton;

    // This is Just for Example, normally it should come from API response
    // or dataBase
   public List<String> orderMenuData(){
       List<String> menus=new ArrayList<>();
       menus.add("View all orders");
       menus.add("View all products");
       menus.add("Orders");
       return menus;
   }

   public void getOrderButton(String buttonName){
       HomePage page=new HomePage();
       for(WebElement element:page.orderMenu){
           if(element.getText().equals(buttonName)){
               element.click();
           }
       }
   }


}
