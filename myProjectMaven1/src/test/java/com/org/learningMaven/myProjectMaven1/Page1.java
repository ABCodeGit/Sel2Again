package com.org.learningMaven.myProjectMaven1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Page1 {
	
	WebDriver driver = new FirefoxDriver();
	
  @Test

  public void InvokeBrowser() {
	  
	  driver.get("http://www.sprintervansusa.com/portal/home");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[1]/a/span")).click();
	  
	  boolean pageCheck = driver.findElement(By.xpath(".//*[@id='toppage']/div[1]/div/nav/div/div[1]/a/picture/img")).isDisplayed();
	  
	  Assert.assertEquals(pageCheck, true);
  }

}
