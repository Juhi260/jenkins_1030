package jenkins_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Jenkins_Test {
@Test

public void launch()
{
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Reporter.log("jenkins_repo",true);
			}
}
