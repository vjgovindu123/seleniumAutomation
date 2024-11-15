package seleniumsampletest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SampleTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		String titlepage=driver.getTitle();
		if(titlepage.equals("OpenCart - Open Source Shopping Cart Solution"))
			System.out.println("Verified Title");
		else
			System.out.println("Invalid Title");
			
		
		
		driver.close();
		

	}

}
