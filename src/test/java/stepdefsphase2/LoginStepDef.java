package stepdefsphase2;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDef {
	
	WebDriver driver= Hooksproject.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}

	@When("I enter the correct username and password")
	public void i_enter_the_correct_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName=driver.findElement(By.id("user-name"));
		UserName.sendKeys("standard_user");
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys("secret_sauce");
	}

	@When("I clicked on Login Button")
	public void i_clicked_on_Login_Button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Loginbutton=driver.findElement(By.id("login-button"));
		
//		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
		Loginbutton.click();
	}

	@Then("I should land on home page")
	public void i_should_land_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		String Title = driver.getTitle();
		System.out.println(Title);
		String actual= "Swag Labs";
		Assert.assertEquals(actual, Title);
		}
	
	@When("I enter the incorrect username as {string} and password as {string}")
	public void i_enter_the_incorrect_username_as_and_password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName=driver.findElement(By.id("user-name"));
		UserName.sendKeys("standard_user");
		
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys("Abc@1234");
	}

	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String Actual) {
	    // Write code here that turns the phrase above into concrete actions
		String error = driver.findElement(By.xpath("//div[@class='error-message-container error']/h3")).getText();
		Assert.assertEquals(Actual, error);
	}
	
	@When("I enter the correct username as {string} and password as  {string}")
	public void i_enter_the_correct_username_as_and_password_as(String UserNameVal, String PwdVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName=driver.findElement(By.id("user-name"));
		UserName.sendKeys(UserNameVal);
		
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys(PwdVal);
	}
	
}
