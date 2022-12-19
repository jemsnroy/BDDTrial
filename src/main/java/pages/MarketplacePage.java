package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.TestBase;

public class MarketplacePage extends TestBase {

	public String vldMPHeader() {

		return driver.findElement(By.xpath("//h1[contains(text(),'Marketplace')]")).getText();
	}

	public boolean vldSearchbox() {
		return driver
				.findElement(By.xpath(
						"//div[@aria-label='Marketplace sidebar']/div/div[2]/div/div/div/span/div/div/div/div//input"))
				.isDisplayed();
	}

	public void enterText(String text) {
		driver.findElement(
				By.xpath("//div[@aria-label='Marketplace sidebar']/div/div[2]/div/div/div/span/div/div/div/div//input"))
				.sendKeys(text);
	}

	public List<String> suggList() {

		List<String> alllist = new ArrayList<String>();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='__fb-light-mode']//ul/li"));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {

			String listText = list.get(i).getText();
			alllist.add(listText);

		}
		return alllist;
	}
	
	public int vldNumOfList() {
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='__fb-light-mode']//ul/li"));
		return list.size();
		
	}

}
