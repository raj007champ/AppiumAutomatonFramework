package iosAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class IOSTests {
/*
	{ Desired Capabilites required for IOS-
	    "platformName": "iOS",
	    "platformVersion": "11.0",
	    "deviceName": "iPhone 7",
	    "automationName": "XCUITest",
	    "app": "/path/to/my.app"
	}
	*/
		public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

			DesiredCapabilities cap =new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.APP, "/path/to/my.app");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 7");
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		IOSDriver<IOSElement> driver= new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		driver.findElementByAccessibilityId("Alert Views").click();
		driver.findElementByXPath("//*[@value='Text Entry']").click();
		driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("hello");
		driver.findElementByName("OK").click();
		
		driver.navigate().back();
		
		//Code To Scroll down in IOS

		Dimension size = driver.manage().window().getSize();
		        int x = (int) (size.getWidth() / 2);
		        int starty = (int) (size.getHeight() * 0.60);
		        int endy = (int) (size.getHeight() * 0.10);
		        driver.swipe(x, starty, x, endy, 2000);
		       
		        
		        driver.findElementByAccessibilityId("Steppers").click();
		        
		        driver.findElementByAccessibilityId("Increment").click();
		        
		        driver.findElementByAccessibilityId("Increment").click();
		        
		        System.out.println(driver.findElementsByClassName("XCUIElementTypeStaticText").get(1).getText());
		        
		        System.out.println(driver.findElementsByClassName("XCUIElementTypeStaticText").get(2).getText());
		        
		        driver.findElementByAccessibilityId("Decrement").click();
		        
		        System.out.println(driver.findElementsByClassName("XCUIElementTypeStaticText").get(1).getText());
		        
		        driver.navigate().back();
		        
		        driver.findElementByAccessibilityId("Picker View").click();
		        
		        driver.findElementByName("Green color component value").sendKeys("220");
		        
		        driver.findElementsByClassName("XCUIElementTypePickerWheel").get(0).sendKeys("55");
		        
		        driver.findElementByXPath("//*[@name='Blue color component value']").sendKeys("130");
		        
		}

		}

