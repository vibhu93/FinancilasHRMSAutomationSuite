package com.ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public static void main(String[] args) {
	
		//// We are generate extentreport here
		
		// Start Report
		ExtentHtmlReporter HtmlReporters = new ExtentHtmlReporter("EnterModulesName.html");


		//Create ExtentReport 
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(HtmlReporters);

		// creates Your Test  
		ExtentTest varible = extent.createTest("Enter Test Name", "Description About Test");
	}

}
