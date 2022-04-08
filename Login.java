package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	//Launches new browser for every exection
	public static void main(String[] args) {
	
		//Setup the driver
		WebDriverManager.chromedriver().setup();//static
		//System.setProperty("webdriver.chrome.driver", "Path of chromedriver");
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Virtusa");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Srikaviya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
	    //Selecting dropdown value
		WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(dropdown);
		dd.selectByVisibleText("Employee");
		driver.findElement(By.className("smallSubmit")).click();
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text);
		
		//to get title of the application
		String Title = driver.getTitle();
		System.out.println(Title);
		
		// driver.close();
		
		

	}

}
