package CucumberwithTestNGRunner;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CucumberSteps {
	// public WebDriver driver;

	@Given("I Open blog link of gourav")
	public void openPage() {
		CucumberHooks.driver.get("http://jaingourav999.blogspot.com/");

	}

	@Given("I Verify the title of page")
	public void verifyTitle() {
		String title = CucumberHooks.driver.getTitle();
		System.out.println("This is the title" + title);
		assertEquals("Software Testing", title, "Title of the page is incorrect, Please verfiys");
	}

	
	
	@Then("I click and verify the {int} link")
	public void i_click_and_verify_the_link(int blogYear) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement oldBlogLink = CucumberHooks.driver.findElement(By.xpath("//a[contains(text(),"+blogYear+")]"));
		oldBlogLink.click();
		;
	    
	}


}
