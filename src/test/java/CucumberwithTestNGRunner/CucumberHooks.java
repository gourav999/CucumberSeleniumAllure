package CucumberwithTestNGRunner;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberHooks {

	/*
	 * Java static variable If you declare any variable as static, it is known as a
	 * static variable. The static variable can be used to refer to the common
	 * property of all objects (which is not unique for each object), for example,
	 * the company name of employees, college name of students, etc. The static
	 * variable gets memory only once in the class area at the time of class
	 * loading.
	 */
	public static WebDriver driver; // This can be use in different class also.
	// WebDriver driver; Note: This is not a static variable. its only useful in
	// class level.
	// Before is the cucumber hooks

	@Before
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

	}

	@After
	public void tearDown(Scenario scenario) {
		driver.close();
	}

}
