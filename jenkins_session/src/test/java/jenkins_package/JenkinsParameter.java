package jenkins_package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsParameter {
	@Test
	public void recieveParameter() {
		String browservalue = System.getProperty("Browser");
		Reporter.log(browservalue,true);
	}

}
