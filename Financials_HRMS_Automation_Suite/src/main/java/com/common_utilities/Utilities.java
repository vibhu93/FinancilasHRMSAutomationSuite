package com.common_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities{

	public static WebElement element;
	public static WebDriver driver;
	
public static void main(String[] args) throws IOException {

}
	// Fetch Values From Properties File
	public static Properties FetchPropertyValues(String repositoryName) throws IOException {
		String ProjectPath = System.getProperty("user.dir"); 
		FileInputStream input = new FileInputStream(ProjectPath +"\\src\\main\\java\\web\\PropertiesFiles\\"+repositoryName);
		Properties Pro = new Properties();
		Pro.load(input);
		return Pro;

	}
	
	public static boolean isDisplayed(WebElement element) {
		boolean isPre = false;
		if(element.isDisplayed()) {
			
		}
		return isPre;
	}

	public static boolean isclickElement(WebElement element){
	
		boolean isclick =false;
		if(isDisplayed(element)) {
			
			if(element.isEnabled()) {
				isclick=true; 
			}
		}return isclick;

	
	}

	public static void enterText(String text, String expForname, WebDriver driver) throws InterruptedException
	{	
		WebElement enterText=
				new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath(expForname)));
		enterText.clear();
		Thread.sleep(500);
		enterText.sendKeys(text);
		Thread.sleep(100);
	}





}
