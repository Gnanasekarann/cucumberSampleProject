package org.stepref;

import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepRef extends LoginPage {
	
	@Given("User should launch the chrome browser")
	public void user_should_launch_the_chrome_browser() {
	   BaseClass.browserLaunch();
	}


	@When("User should enter into the cura website")
	public void user_should_enter_into_the_cura_website() throws Exception {
	    BaseClass.urlLaunch("https://www.demoblaze.com/index.html");
	    BaseClass.driver.findElement(By.id("login2")).click();
	    BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*Thread.sleep(4000);

	    WebElement loginButton = l.getLoginbtn();
	    loginButton.click();*/
	    
		/*try {
		    WebElement login = driver.findElement(By.xpath("//button[@onClick='logIn()']"));
		    login.click();

		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}

	@When("user should enter {string} and {string} and enter")
	public void user_should_enter_and_and_enter(String string, String string2) throws Exception {
		LoginPage l = new LoginPage();
	    BaseClass.sendValue(l.getUsername(), string);
	    BaseClass.sendValue(l.getPassword(), string2);
	    l.getBtnlogin().click();
	}

	@When("User should enter into appointment page")
	public void user_should_enter_into_appointment_page() {
		String actial = BaseClass.driver.getTitle();
		String expected = "STORE";
		Assert.assertEquals(expected, actial);
	}

}
