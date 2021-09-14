package com.mindtree.utility;


import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReport {
	public static String htmlFilename = null;
	public static ExtentReports generateReport()  {
		ExtentReports report = new ExtentReports();	
		try {
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss").format(new Date());
			ExtentHtmlReporter htmlReporter =new ExtentHtmlReporter(".\\report\\"+timeStamp+".html");
			htmlFilename = timeStamp+".html";
			report.attachReporter(htmlReporter);
			
			return report;}
			catch(Exception c) {
				System.out.println("Extent Report could not be created");
				return report;
			}			
	}

}
