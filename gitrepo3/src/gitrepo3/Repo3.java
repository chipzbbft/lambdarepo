package gitrepo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Repo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        System.setProperty("webdriver.gecko.driver", "C://Users//user//Downloads//geckodriver-v0.26.0-win64//geckodriver.exe");
		        WebDriver driver = new FirefoxDriver();
		        
		            driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
		            driver.findElement(By.name("email")).sendKeys("Sdfgh567@123");
		            driver.findElement(By.name("password")).sendKeys("poqer2345");
		            driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/form/input")).click();
		            
		            System.out.println("Successfully logged in");
		            


	}

}
