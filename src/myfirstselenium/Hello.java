package myfirstselenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Hello {

	public static void main(String[] args) {
		System.setProperty("webDriver.edge.driver", "C:\\Users\\pc\\Desktop\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		

	}

}