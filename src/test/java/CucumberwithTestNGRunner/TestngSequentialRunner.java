package CucumberwithTestNGRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;	
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;



@CucumberOptions(features = "src/test/java/CucumberwithTestNGRunner/BlogTest.feature", 
glue = {"CucumberwithTestNGRunner"})
public class TestngSequentialRunner extends AbstractTestNGCucumberTests {
	
	
}


