import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverScript {

	public static void main(String[] args) throws MalformedURLException, Exception {
		
		// TODO Auto-generated method stub
		SwapmintTest drScript = new SwapmintTest();
		drScript.setup("chrome");
		//System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.swapmint.io/");
		//set path to chromedriver.exe
		/*System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
		//create chrome instance
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swapmint.io/");
		//driver.findElement(By.className("LM6RPg")).sendKeys("Dell");
*/	}

}
