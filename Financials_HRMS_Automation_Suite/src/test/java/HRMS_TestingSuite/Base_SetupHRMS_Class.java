package HRMS_TestingSuite;
import web.Pages.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Base_SetupHRMS_Class {
	
	public static WebDriver driver=null;	
	@Parameters({ "StagingUrl1", "Browser", "username", "password"})
	@Test
	public void openbrowser(String StagingUrl1, String Browser,String username, String password)
	{
		
		driver= HrmsLogin.login(StagingUrl1, Browser, username, password);

		
	}

}
