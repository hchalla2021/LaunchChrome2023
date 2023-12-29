package G;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class chromelaunch {
@Test
public void Launchg() {
		System.out.println("This is dev ops selenium Project 2023");
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver",path+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String gtitle = driver.getTitle();
		System.out.println("The google title is : " + gtitle);
		driver.close();
	}
}
