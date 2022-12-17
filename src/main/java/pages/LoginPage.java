package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class LoginPage extends TestBase {

	public String vldLPURL() {
		return driver.getCurrentUrl();
	}

	public boolean vldLoginPageElement() {
		return driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
	}

	public boolean vldCNABtn() {
		return driver.findElement(By.xpath("//a[@role='button' and @data-testid = 'open-registration-form-button']"))
				.isDisplayed();
	}

	public void clkCNABtn() {
		driver.findElement(By.xpath("//a[@role='button' and @data-testid = 'open-registration-form-button']")).click();
	}

	public void enterDetails(String fn, String ln, String em, String ps) {
		driver.findElement(By.name("firstname")).sendKeys(fn);
		driver.findElement(By.name("lastname")).sendKeys(ln);
		driver.findElement(By.name("reg_email__")).sendKeys(em);
		driver.findElement(By.id("password_step_input")).sendKeys(ps);
	}

	/*
	 * public void enterDOB() { WebElement day = driver.findElement(By.id("day"));
	 * Select s1 = new Select(day); s1.deselectByVisibleText("10");
	 * 
	 * WebElement month = driver.findElement(By.id("month")); Select s2 = new
	 * Select(month); s2.deselectByVisibleText("Sep");
	 * 
	 * WebElement year = driver.findElement(By.id("year")); Select s3 = new
	 * Select(year); s3.deselectByVisibleText("2005"); }
	 */

	public void enterGender() {
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
	}

	public void closePop() {
		driver.findElement(By.xpath("//div[@class='_8ien']/img")).click();
	}

	public void enterCred(String em, String ps) {
		driver.findElement(By.id("email")).sendKeys(em);
		driver.findElement(By.id("pass")).sendKeys(ps);

	}

	public HomePage clkLgnBtn() {
		driver.findElement(By.name("login")).click();
		return null;
		
	}
	
	public HomePage enterAndClick(String em, String ps) {
		driver.findElement(By.id("email")).sendKeys(em);
		driver.findElement(By.id("pass")).sendKeys(ps);
		driver.findElement(By.name("login")).click();
		return new HomePage();
	}

	public String vldHPTitle() {
		return driver.getTitle();
	}

	public void closeBrowser() {
		driver.quit();
	}

}
