/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/#configuration
*/

import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.Dimension
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions


waiting {
	timeout = 6
}

environments {
	
	// run via “./gradlew chromeTest”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chrome {
		driver = {
			WebDriverManager.chromedriver().setup()
			def driverInstance = new ChromeDriver()
			driverInstance.manage().window().maximize()
			driverInstance
		}
	}

	// run via “./gradlew chromeHeadlessTest”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chromeHeadless {
		driver = {
			WebDriverManager.chromedriver().setup()
			ChromeOptions options = new ChromeOptions()
			options.addArguments("headless")
			options.addArguments("--no-sandbox")
			def driverInstance = new ChromeDriver(options)
			driverInstance.manage().window().setSize(new Dimension(1920, 1080))
			driverInstance
		}
	}
	


}


//identify website base url
baseUrl = "http://justinebuddie.com/"