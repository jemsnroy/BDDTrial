package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.MarketplacePage;

public class MarketplacePageStepDefinition extends TestBase {

	LoginPage lp = new LoginPage();
	HomePage hp;
	MarketplacePage mp;

	@Given("user is already on marketplace page")
	public void user_is_already_on_marketplace_page(DataTable credTable) {

		initilize();

		List<Map<String, String>> credList = credTable.asMaps();
		String email = credList.get(0).get("email");
		String pass = credList.get(0).get("password");

		hp = lp.enterAndClick(email, pass);

	}

	@Given("user is on marketplace page")
	public void user_is_on_marketplace_page() {
		mp = hp.clkMktBtn();
	}

	@When("user get the header")
	public void user_get_the_header() {

		String actHeader = mp.vldMPHeader();
		System.out.println(actHeader);
	}

	@Then("the header should be {string}")
	public void the_header_should_be(String header) {
		String expHeader = header;
		String actHeader = mp.vldMPHeader();
		Assert.assertEquals(expHeader, actHeader);

	}

	@When("user get the search box")
	public void user_get_the_search_box() {
		boolean flag = mp.vldSearchbox();
		Assert.assertTrue(flag);
	}

	@Then("user enter {string}")
	public void user_enter(String entText) {

		mp.enterText(entText);
	}

	@Then("user get the suggestion list")
	public void user_get_the_suggestion_list(DataTable dataTable) {
		List<String> expTotalList = dataTable.asList();
		System.out.println(expTotalList);
		List<String> totalText = mp.suggList();
		System.out.println(totalText);
		Assert.assertTrue(expTotalList.containsAll(totalText));
	}

	@Then("number of suggestion should be {int}")
	public void number_of_suggestion_should_be(Integer expNum) {
		int expnum = expNum;
		int actnum = mp.vldNumOfList();
		Assert.assertTrue(expnum == actnum);
	}

	@Then("user take the screenshot")
	public void user_take_the_screenshot() throws IOException {

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destFile = System.getProperty("user.dir");
		System.out.println(destFile);
		FileUtils.copyFile(srcFile,
				new File(destFile + "/screenshots/marketplacePage/" + System.currentTimeMillis() + ".png"));

	}

}
