package com.mindtree.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mindtree.reusablecomponents.ReusableMethods;
import com.mindtree.uistore.HomePageUI;

public class HomePage {

	public static boolean search(WebDriver driver, String searchKey, Logger log) {
		if(ReusableMethods.getElement(HomePageUI.searchBox, driver)) {
			log.info("Clicked on searchbox");
			if(ReusableMethods.sendKeys(HomePageUI.searchBox, searchKey, driver)) {
				if(ReusableMethods.click(HomePageUI.searchButton, driver)) {
					return true;
				}
			}
		}
		return false;
	}
	
}
