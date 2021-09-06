package testcase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week5.day1.Assignment.BaseClass;


public class CreateLead extends BaseClass {
	@Test(dataProvider = "sendData")
	public void runCreateLead(String firstName , String lastName, String company, String phNo ) {
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		
	}
	@DataProvider
	public String[][] sendData(){
		String[][] data = new String[2][4];
		data[0][0] = "Hari";
		data[0][1] = "R";
		data[0][2] = "TestLeaf";
		data[0][3] = "99";
		
		
		data[1][0] = "Sheriba";
		data[1][1] = "T";
		data[1][2] = "TestLeaf";
		data[1][3] = "98";
		return  data;
	}	
}
