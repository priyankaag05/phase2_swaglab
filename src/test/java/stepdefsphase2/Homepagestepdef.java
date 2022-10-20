package stepdefsphase2;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepagestepdef {
	
	WebDriver driver= Hooksproject.driver;
	
	@Given("I entered correct username as {string} and password as {string}")
	public void i_entered_correct_username_as_and_password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement UserName=driver.findElement(By.id("user-name"));
		UserName.sendKeys(string);
		
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys(string2);
	}

	@Given("I click on Login button")
	public void i_click_on_Login_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Loginbutton=driver.findElement(By.id("login-button"));
		Loginbutton.click();
		
	}

	@When("I want to select product as {string} to add to cart")
	public void i_want_to_select_product_as_to_add_to_cart(String ProductName) {
	    // Write code here that turns the phrase above into concrete actions
		
	  String Xpath= "//div[text()='" + ProductName + "']//following::button[1]";
	  WebElement product=driver.findElement(By.xpath(Xpath));
	  product.click();
	  
	}

	@Then("Basket item number should be {int}")
	public void basket_item_number_should_be(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement cart = driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a"));
		Assert.assertEquals(cart.getText(),"1");	
	}



}
