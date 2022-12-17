package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageStepDefinition extends TestBase {

	LoginPage lp = new LoginPage();
	

	@Given("user is already on login page")
	public void user_is_already_on_login_page() {
		initilize();
		// lp.openLoginPage();
	}

	@When("user get the link of login page")
	public void user_get_the_link_of_login_page() {
		String actLPURL = lp.vldLPURL();
		System.out.println(actLPURL);
	}

	@Then("login page link should be {string}")
	public void login_page_link_should_be(String lpURL) {
		String expLPURL = lpURL;
		String actLPURL = lp.vldLPURL();
		Assert.assertEquals(expLPURL, actLPURL);
	}

	@Then("user quit")
	public void user_quit() {
		lp.closeBrowser();
	}

	@When("user get the element of login page")
	public void user_get_the_element_of_login_page() throws IOException {
		File srcFile = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"))
				.getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		System.out.println(currentDir);
		FileUtils.copyFile(srcFile, new File(currentDir + "/screenshots/logo/" + System.currentTimeMillis() + ".png"));
	}

	@Then("login page element should be displayed")
	public void login_page_element_should_be_displayed() {
		lp.vldLoginPageElement();
	}

	@When("user get the create new account button")
	public void user_get_the_create_new_account_button() {
		boolean flag = lp.vldCNABtn();
		Assert.assertTrue(flag);
	}

	@Then("user click create new account button")
	public void user_click_create_new_account_button() {
		lp.clkCNABtn();
	}

	@Then("user enter {string} and {string} and {string} and {string}")
	public void user_enter_and_and_and(String fname, String sname, String eml, String mnum) {
		lp.enterDetails(fname, sname, eml, mnum);
	}

	/*@Then("user select date of birth")
	public void user_select_date_of_birth() {
		lp.enterDOB();
	}*/

	@Then("user select Gender")
	public void user_select_gender() {
		lp.enterGender();
	}
	
	@Then("user close")
	public void user_close() {
	    lp.closePop();
	}

	@Then("user enter email {string} and {string}")
	public void user_enter_email_and(String email, String pass) {
		lp.enterCred(email, pass);
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		lp.clkLgnBtn();
	}

	@Then("user get the title of home page")
	public void user_get_the_title_of_home_page() {
		String actTitle = lp.vldHPTitle();
		System.out.println(actTitle);
	}

	@Then("home page title should be {string}")
	public void home_page_title_should_be(String title) {

		String expTitle = title;
		String actTitle = lp.vldHPTitle();
		Assert.assertEquals(expTitle, actTitle);
	}

}
