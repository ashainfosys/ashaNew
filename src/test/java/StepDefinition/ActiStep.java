package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiStep {
	WebDriver driver;
	@Given("Browser gets open")
	public void browser_gets_open() {
		    WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@And("User is on login page")
	public void user_is_on_login_page() {
		driver.get("https://demo.actitime.com/login.do");
	}

	@When("^user enters valid (.*) and (.*)$")
	public void user_enters_valid_admin_and_manager(String UN,String PWD) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UN);
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(PWD);
	}

	@And("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

	@Then("User should navigate to homepage")
	public void user_should_navigate_to_homepage() {
		String exp="Aug 29 - Sep 04, 2022";
	    String Act=driver.findElement(By.xpath("//button[text()='Aug 29 - Sep 04, 2022']")).getText();
	    if(exp.equals(Act))
	    {
	    	System.out.println("PASS");
	    }
	    else
	    {
	    	System.out.println("Fail");
	    }
	}
}
