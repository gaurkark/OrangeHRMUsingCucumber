package stepdefinition;

import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonfunction.CommonFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageclasses.AdminPage;
import pageclasses.LoginPage;

public class Steps {
	static WebDriver driver;
	LoginPage loginPage;
	AdminPage adminPage;
	@Given("launch orangeHRM on diffrent Browser")
	public void launch_orange_hrm_on_diffrent_browser() {
	    CommonFunction.crossBrowser("https://opensource-demo.orangehrmlive.com/");}
	@Given("lauch orange HRM")
	public void lauch_orange_hrm() {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   loginPage=new LoginPage(driver);
	   adminPage=new AdminPage(driver);}
	@Then("scroll up and Scroll down orangeHRM")
	public void scroll_up_and_scroll_down_orange_hrm() {
	    CommonFunction.scrollDown(driver);
	    CommonFunction.scrollUp(driver);}
	@Then("Enter username and password")
	public void enter_username_and_password() throws IOException {
		loginPage.username.sendKeys(CommonFunction.readDataFromPropertiesFile().getProperty("username"));
		loginPage.password.sendKeys(CommonFunction.readDataFromPropertiesFile().getProperty("password"));}
	@Then("then click on login button and validate")
	public void then_click_on_login_button_and_validate() {
		loginPage.loginButton.click();
		Assert.assertTrue(loginPage.profile.isDisplayed());
		System.out.println("user login successfully with valid data");}
	@Then("enter invalid username and password")
	public void enter_invalid_username_and_password() throws IOException {
	    loginPage.username.sendKeys(CommonFunction.readDataFromPropertiesFile().getProperty("invalidusername"));
	    loginPage.password.sendKeys(CommonFunction.readDataFromPropertiesFile().getProperty("invalidpassword"));}
	@Then("Then click on login button")
	public void then_click_on_login_button() {
		loginPage.loginButton.click();
		Assert.assertTrue(loginPage.invalidCredential.isDisplayed());
		System.out.println("user unable to login with invalid data");}
	@Then("check how many links on login page and it is working")
	public void check_how_many_links_on_login_page_and_it_is_working() {
	    for(int i=0;i<loginPage.links.size();i++) {
	    	loginPage.links.get(i).click();}
	    System.out.println("No.of Links on login page:"+loginPage.links.size());}
	@Then("click on login button and validate")
	public void click_on_login_button_and_validate() {
		loginPage.loginButton.click();
		Assert.assertTrue(loginPage.requiredMessage.isDisplayed());
		System.out.println("user  get field is required message");}
	@Then("click on forgot password")
	public void click_on_forgot_password() {
	    loginPage.forgotPassword.click();
	}
	@Then("enter user name")
	public void enter_user_name() throws IOException {
	    loginPage.username.sendKeys(CommonFunction.readDataFromPropertiesFile().getProperty("username"));
	}
	@Then("then click on reset password button and validate")
	public void then_click_on_reset_password_button_and_validate() {
	    loginPage.loginButton.click();
	    Assert.assertTrue(loginPage.message.isDisplayed());
	    System.out.println("user could reset password");
	}
	
	@Then("click on login button")
	public void click_on_login_button() {
	   loginPage.loginButton.click();
	}
	@Then("click on logout")
	public void click_on_logout() {
	   loginPage.profile.click();
	   loginPage.logout.click();
	   Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   System.out.println("user is able to logout");
	   
	}
	@Then("then click on admin")
	public void then_click_on_admin() {
	    adminPage.menu.get(0).click();
	}
	@Then("click on job dropdown and after that click on one one link")
	public void click_on_job_dropdown_and_after_that_click_on_one_one_link() throws InterruptedException {
	   adminPage.job.click();
	   for(int i=0;i<adminPage.jobLinks.size();i++) {
		   Thread.sleep(1000);
		   adminPage.jobLinks.get(i).click();
		   adminPage.jobAfterCLick.click();
	   }
	}

}





