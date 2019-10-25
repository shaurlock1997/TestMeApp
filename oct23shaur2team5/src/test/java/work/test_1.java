package work;
import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"json:target/cucumber.json"},features = {"C:\\Shaurya\\git\\oct23shaur2team5\\src\\test\\resources\\features\\demo.feature"}, 
				glue= {"steps"},
				monochrome=true,
				dryRun=false)
public class test_1 {
	@Test
	public void test()  {
	}

}
