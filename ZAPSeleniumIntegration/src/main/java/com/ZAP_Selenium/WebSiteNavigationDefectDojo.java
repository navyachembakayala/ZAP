package com.ZAP_Selenium;

import java.text.DateFormat;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import jdk.internal.jline.internal.Log;

public class WebSiteNavigationDefectDojo {
	static Logger log = Logger.getLogger(WebSiteNavigationDefectDojo.class.getName());
	WebDriver driver;
	    final static String BASE_URL = "http://localhost:8080/login?next=/";
	    final static String CRT_PRD_URL = "http://localhost:8080/dashboard";
	    final static String ADD_PRD_URL = "http://localhost:8080/product/add";
	    final static String PRODUCT_SCREEN = "http://localhost:8080/product/3";
	    final static String IMPORT_SCAN_RESULT = "http://localhost:8080/product/2/import_scan_results";
	    final static String USERNAME = "admin";
	    final static String PASSWORD = "kSVbFyzIZPz60WRgezcxG4";
	    
	    public WebSiteNavigationDefectDojo(WebDriver driver) {
	        this.driver = driver;
	        this.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	        this.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    }
	   
	    /*
	     * User navigates before Login
	     *  - Automate the steps to navigate to pages without performing Login
	     *   - Selenium Webdriver commands are used to identify the elements 
	     */
	    public void navigateBeforeLogin() {
	    	driver.manage().window().maximize();
	        driver.get(BASE_URL);
	    }
	    /*
	     * User performs Login Operation
	     *  - Automate the steps to perform login operation in the application
	     *   - Selenium Webdriver commands are used to identify the elements 
	     */
	    
		public void loginAsUser() throws Exception {    
	        driver.findElement(By.id("id_username")).clear();
	        driver.findElement(By.id("id_username")).sendKeys(USERNAME);
	        driver.findElement(By.id("id_password")).clear();
	        driver.findElement(By.id("id_password")).sendKeys(PASSWORD);
	        driver.findElement(By.cssSelector(".btn-success")).click();
	        
	   }
	    public void SelectProduct() throws Exception {
	    WebDriverWait wait1=new WebDriverWait(driver, 20);
	    WebElement SelectPrd=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/nav/div[2]/div/ul/li[2]/a/i")));
 	    Actions actions = new Actions(driver);
 	    actions.moveToElement(SelectPrd).click().build().perform();
 	    Thread.sleep(3000);
 	   WebDriverWait wait2=new WebDriverWait(driver, 20);
 	   WebElement AllPrd=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/nav/div[2]/div/ul/li[2]/ul/li[2]/a")));
 	    //WebElement AllPrd = driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/div/ul/li[2]/ul/li[2]/a"));
	    Actions actions1 = new Actions(driver);
	    actions1.moveToElement(AllPrd).click().build().perform();
	 	Thread.sleep(3000);
//	        //driver.get(ADD_PRD_URL);
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		/*
		 * WebElement
		 * name=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_name"
		 * ))); name.clear(); String Datevalue = GetDateinJava();
		 * name.sendKeys("Banking_Accounts" + Datevalue); driver.findElement(By.xpath(
		 * "/html/body/div/div/div/div[3]/div/form/div[2]/div/div[2]/div[1]/textarea")).
		 * sendKeys("Test description"); Select PRDTYPE = new
		 * Select(driver.findElement(By.name("prod_type")));
		 * PRDTYPE.selectByVisibleText("Research and Development"); Thread.sleep(5000);
		 * driver.findElement(By.xpath(
		 * "/html/body/div/div/div/div[3]/div/form/div[20]/div/input")).click();
		 */
		//driver.findElement(By.cssSelector(".btn-primary")).click();
	    }
	    public String GetDateinJava() {
	    	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	    	Date date1 = new Date();
	    	String date2 = dateFormat.format(date1);
	    	return date2;
	    }
	    
 	    public void Product_Screen() throws Exception{
 	    	//driver.get(PRODUCT_SCREEN);
 	    	//Thread.sleep(5000);
 	    	WebDriverWait wait=new WebDriverWait(driver, 20);
 	    	WebElement SelectCreatedPrd=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div[3]/div/div/div/div[3]/div/table/tbody/tr[3]/td[2]/a/b")));
 	    	Actions actions1 = new Actions(driver);
 	    	actions1.moveToElement(SelectCreatedPrd).click().build().perform();
 	    	Thread.sleep(5000);
 	    	WebDriverWait wait1=new WebDriverWait(driver, 20);
 	    	WebElement SelectFindings = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/ul/li[4]/a/span[2]"));
 	    	Actions actions2 = new Actions(driver);
 	    	actions2.moveToElement(SelectFindings).click().build().perform();
 	    	Thread.sleep(5000);
 	    	WebElement ImportScreenSelect = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/ul/li[4]/ul/li[10]/a/i"));
 	    	Actions actions3 = new Actions(driver);
 	    	actions3.moveToElement(ImportScreenSelect).click().build().perform();
 	    	Thread.sleep(3000);
 	    }

	    
	    public void ImportScan() throws Exception  {
		 	//driver.get(IMPORT_SCAN_RESULT);
		 	WebDriverWait wait=new WebDriverWait(driver, 20);
//		 	WebElement date = driver.findElement(By.name("scan_date"));
//		 	date.clear();
//		 	String Datevalue = GetDateinJava();
//		 	date.sendKeys(Datevalue);
		 	Select PRTY = new Select(driver.findElement(By.name("minimum_severity")));
			PRTY.selectByVisibleText("High");
			Select SCAN = new Select(driver.findElement(By.name("scan_type")));
			SCAN.selectByVisibleText("ZAP Scan");
			driver.findElement(By.id("id_file")).sendKeys("/root/Downloads/report.xml");
			WebDriverWait wait2=new WebDriverWait(driver, 20);
 	    	WebElement TestResultScreen = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/form/div[10]/div/button"));
 	    	Actions actions2 = new Actions(driver);
 	    	actions2.moveToElement(TestResultScreen).click().build().perform();
		 	log.info("import successful");
			Thread.sleep(15000);
			
			

		    }

		
	    }
	