package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		//Find dropdown element
		WebElement eledropdown = driver.findElement(By.id("dropdown1"));
		
		//Convert the select class
		Select dd = new Select(eledropdown);
		
		//choose value from dropdown
		
		//select by visible text
		dd.selectByVisibleText("Selenium");
		
		//select by value
		dd.selectByValue("1");
		
		//Select by index
		dd.selectByIndex(1);
		
		//To get list of elements in the option
		//List<WebElement> Options = dd.getOptions();
		//To get option size
		int size = dd.getOptions().size();
		dd.selectByIndex(size-2);
		WebElement selected = dd.getFirstSelectedOption();
		System.out.println(selected);
		
		
	}

}
