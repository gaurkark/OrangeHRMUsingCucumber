package pageclasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
     @FindBy(xpath="//*[@class='oxd-main-menu-item-wrapper']")
     public List<WebElement> menu;
     @FindBy(xpath="(//*[@class='oxd-topbar-body-nav-tab --parent'])[1]")
     public WebElement job;
     @FindBy(xpath="(//*[@class='oxd-topbar-body-nav-tab-link'])")
     public List<WebElement> jobLinks;
     @FindBy(xpath="(//*[@class='oxd-topbar-body-nav-tab-item'])[2]")
     public WebElement jobAfterCLick;
	 public AdminPage(WebDriver driver) {
		PageFactory.initElements(driver, this);}
	  

}
