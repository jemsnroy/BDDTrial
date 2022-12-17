package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.TestBase;

public class HomePage extends TestBase {

	public boolean vldUserName() {

		return driver.findElement(By.partialLinkText("Jemish Roy")).isDisplayed();

	}

	public String getUserName() {
		return driver.findElement(By.partialLinkText("Jemish Roy")).getText();
	}
	
	public String getHPURL() {
	return 	driver.getCurrentUrl();
	}

	public List<String> getElement() {
		List<String> eleList = new ArrayList<>();
		List<WebElement> list = driver.findElements(By.xpath("(//div[@class='x1iyjqo2']/div/ul)[1]/li"));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {

			String textList = list.get(i).getText();
			eleList.add(textList);

		}
		return eleList;
	}

	public int numOfele() {
		List<WebElement> list = driver.findElements(By.xpath("(//div[@class='x1iyjqo2']/div/ul)[1]/li"));
		return list.size();
	}

	public MarketplacePage clkMktBtn() {

		driver.findElement(By.xpath("//span[contains(text(),'Marketplace')]")).click();
		return new MarketplacePage();
	}

}
