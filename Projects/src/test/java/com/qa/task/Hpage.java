package com.qa.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Hpage extends ParentClass{
	public Hpage(WebDriver driver) {
		this.driver=driver;
	}
	
	By linksLocator=By.tagName("a");
	
	public void textLinks() {
		List<WebElement> links=driver.findElements(linksLocator);
		for (WebElement webElement : links) {
			System.out.println(webElement.getText());
		}
	}
	
	
	public int totalCount() {
		
		List<WebElement> links=driver.findElements(linksLocator);
		
		int tcount = links.size();
		
		return tcount;
	}
	
public int visableCount() {
		
		List<WebElement> links=driver.findElements(linksLocator);
		
	
		
		int vcount=0;
		for (WebElement webElement : links) {
			if (webElement.isDisplayed()) {
			    vcount++;
			}
		}
		return vcount;
	}

public int invisableCount() {
	
	List<WebElement> links=driver.findElements(linksLocator);
	
	
	int total = links.size();
	
	int visable=0;
	
	for (WebElement webElement : links) {
		if (webElement.isDisplayed()) {
		    visable++;
		}
	}
	int icount = total-visable;
	
	return icount;
}
}
