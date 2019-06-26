package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signup {
	WebDriver driver;
	@Given("^ User is on the application Web Site$")
	public void user_is_on_the_application_Web_Site() {
		System.setProperty("webdriver.chromedriver","C:\\Users\\Kalai\\Desktop\\Selenium\\Driver\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		
	}
@When("^ User Opens the SignUp Link$")
 public void  User_Opens_the_SignUp_Link() {
	String title=driver.getTitle();
	Assert.assertEquals("https://www.myntra.com/register?", "https://www.myntra.com/register?");	
}
@Then("^ user enter email and password and phone number$")
public void user_enter_email_and_password_and_phone_number() {
	driver.findElement(By.className("desktop-userTitle")).click();
	driver.findElement(By.className("desktop-linkButton")).click();
	driver.findElement(By.name("email")).sendKeys("mani.kalai36@gmail.com");
	driver.findElement(By.name("password")).sendKeys("keerthikalai");
	driver.findElement(By.name("mobile")).sendKeys("9600479393");

	driver.findElement(By.id("male")).click();
	Assert.assertEquals("REGISTER","REGISTER");	
}
}

