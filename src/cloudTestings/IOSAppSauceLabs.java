package cloudTestings;


	
/*	https://guides.instructure.com/m/4214/l/83393-how-do-i-install-and-use-curl-on-a-windows-machine

		rahulonlinetutor@gmail.com
		
		First Install Curl in your window machine and then download the app which you want to test and convert it into zip file and place at any location.
		Now go to cmd and navigate to app location and hit the below command
		

		curl -u $SAUCE_USERNAME:$SAUCE_ACCESS_KEY -X POST "http://saucelabs.com/rest/v1/storage/$SAUCE_USERNAME/my_app.zip?overwrite=true" -H "Content-Type: application/octet-stream" --data-binary @my_app.zip

		http://sauceUsername:sauceAccessKey@ondemand.saucelabs.com:80/wd/hub

		Code*/

		import java.net.MalformedURLException;

		import java.net.URL;

		import java.util.concurrent.TimeUnit;

		import io.appium.java_client.ios.IOSDriver;

		import org.openqa.selenium.remote.DesiredCapabilities;

		public class IOSAppSauceLabs {

		public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities dc=DesiredCapabilities.iphone();

		dc.setCapability("platformName", "iOS");

		//cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.IOS);

		dc.setCapability("platformVersion", "7.1");

		//cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1");

		dc.setCapability("appiumVersion", "1.3.4");

		dc.setCapability("deviceName", "iPhone Simulator");

		dc.setCapability("browserName", "");

		dc.setCapability("app","sauce-storage:UICatalog.app.zip");

		IOSDriver driver=new IOSDriver(new URL("http://rahul1:e950d779-1817-4c3c-b122-06715b814dfd@ondemand.saucelabs.com:80/wd/hub"),dc);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.quit();

		//normal code

		}

		}

