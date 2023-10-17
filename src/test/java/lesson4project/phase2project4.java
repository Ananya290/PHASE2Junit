package lesson4project;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class phase2project4 {
	

		
		WebDriver driver;
		
		@BeforeAll
		public void startbrowser()
		{
	        driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
		}
		@ParameterizedTest(name = "CSV source {arguments}")
		@CsvSource({
				"Ananya ,  1234",  // row and column
				"annya ,   2114",
				"Vaishnavi , 234545",
				"Manya ,  52340"		
		})
		
        @Test
		public void Testmethod()
		{
	        driver.findElement(By.cssSelector("input#email")).sendKeys("admin");
			
			driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("admin");
			
	  
		
	        
		}
        
     
		
		

		
		@AfterAll
		public void closebrowser()
		{
			driver.close();
		}
		
	

}
