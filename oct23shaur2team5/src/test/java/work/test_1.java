package work;
import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Shaurya\\shaureclipse\\oct23shaur2team5\\src\\test\\resources\\features\\demo.feature"}, 
				glue= {"steps"},
				monochrome=true,
				dryRun=true)
public class test_1 {
	@Test
	public void test()  {
		//System.out.print("hi");
	}

}
