import org.openqa.selenium.By;






import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.awt.List;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.util.*;




public class SwapmintTest {

	
		/*System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.swapmint.io/");
		//driver.findElement(By.className("LM6RPg")).sendKeys("Dell");
*/	public static WebDriver driver=null;
		
		/**
		 * This function will execute before each Test tag in testng.xml
		 * @param browser
		 * @throws Exception
		 */
        @BeforeTest
        @Parameters({"browser"})
		public static void setup(String browser) throws MalformedURLException,Exception{
			//Check if parameter passed from TestNG is 'firefox'
			if(browser.equalsIgnoreCase("firefox")){
			//create firefox instance
				System.setProperty("webdriver.firefox.driver", ".\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.get("https://www.swapmint.io/");
				driver.manage().window().maximize();
			}
			//Check if parameter passed as 'chrome'
			else if(browser.equalsIgnoreCase("chrome")){
				//set path to chromedriver.exe
				System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
				//create chrome instance
				driver = new ChromeDriver();
				driver.get("https://www.swapmint.io/");
				driver.manage().window().maximize();
			}
			//Check if parameter passed as 'Edge'
					else if(browser.equalsIgnoreCase("Edge")){
						//set path to Edge driver.exe
						System.setProperty("webdriver.edge.driver",".\\MicrosoftWebDriver.exe");
						//create Edge instance
						driver = new EdgeDriver();
						driver.get("https://www.swapmint.io/");
						driver.manage().window().maximize();
					}
					else if (browser.equalsIgnoreCase("InternetExplorer")) {
						   System.out.println("Running Internet Explorer");
						   System.setProperty("webdriver.ie.driver", ".\\IEDriverServer.exe");
						   DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
						      dc.setCapability
						    (InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
						   //If IE fail to work, please remove this line and remove enable protected mode for all the 4 zones from Internet options
						      driver = new InternetExplorerDriver(dc);
						      driver.get("https://www.swapmint.io/");
						      driver.manage().window().maximize();
						   } else
						 {
							try
							{
								//If no browser passed throw exception
								throw new Exception("Browser is not correct");
							}
						 catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				 }
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
  
        

        @AfterMethod
        public void tearDown(){
        	System.out.println("Browser is closing");
        driver.close();
        }

         

        @AfterClass()
        public static void finish(){
        driver.quit();
        }
        
        
        
        }

	


