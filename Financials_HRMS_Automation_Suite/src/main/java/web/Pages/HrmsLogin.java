package web.Pages;

import web.ObjectRepos.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.batik.util.io.UTF16Decoder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.common_utilities.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HrmsLogin {

	public static WebDriver login(String StagingUrl1, String Browser, String username, String password) {
		WebDriver driver = null;

		try {
			if (Browser.equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			} else if (Browser.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (Browser.equalsIgnoreCase("Edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			} else {
				System.out.println("**Please Set Browser Value In Suite Xml File**");
				System.out.println("**Incorrect Browser Name**");
			}
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(StagingUrl1);
			Common_xpaths cXP = new Common_xpaths();
			Utilities ut = new Utilities();
			Properties Pro = Utilities.FetchPropertyValues("com_login.properties");
			// String UserName = Pro.getProperty("id");
			// System.out.println(UserName);
			  driver.findElement(cXP.usernameField).sendKeys(username);
			  driver.findElement(cXP.pwdField).sendKeys(password);
			  driver.findElement(cXP.loginBtn).click();
			 

		} catch (Exception ex) {
			System.out.println("This is Not Run Due TO: " + ex.getCause());
			System.out.println("This is Reason Message: " + ex.getMessage());
			ex.printStackTrace();
		}

		return driver;

	}

}
