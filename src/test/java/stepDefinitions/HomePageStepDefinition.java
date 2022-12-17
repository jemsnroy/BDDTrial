package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class HomePageStepDefinition extends TestBase {

	 LoginPage lp = new LoginPage();
	 HomePage hp;

	@Given("user is already on home page")
	public void user_is_already_on_home_page(DataTable credTable) {
		initilize();

		List<Map<String, String>> credList = credTable.asMaps();
		String email = credList.get(0).get("email");
		String pass = credList.get(0).get("password");

		hp = lp.enterAndClick(email, pass);
	}

	@When("user get the user name")
	public void user_get_the_user_name() {
		boolean flag = hp.vldUserName();
		Assert.assertTrue(flag);
	}

	@Then("user name should be {string}")
	public void user_name_should_be(String uN) {
		String expUserName = uN;
		String actUserName = hp.getUserName();
		Assert.assertEquals(expUserName, actUserName);
	}
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
	   String actURL = hp.getHPURL();
	   Assert.assertTrue(actURL.equals(actURL));
	   
	}

	@Then("user gets list of webelements")
	public void user_gets_list_of_webelements(DataTable expList) {
		List<String> expEleList = expList.asList();
		List<String> actualEleList = hp.getElement();
		Assert.assertTrue(expEleList.containsAll(actualEleList));
	}

	@Then("number of elements should be {int}")
	public void number_of_elements_should_be(Integer numEle) {
		int expNumEle = numEle;
		int actNumEle = hp.numOfele();
		Assert.assertTrue(expNumEle == actNumEle);

	}

	/*@Then("user click on marketplace")
	public void user_click_on_marketplace() {
		hp.clkMktBtn();

	}*/

}
