package com.ZAP_Selenium;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.junit.*;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import com.ZAP_Selenium_BrowserDriver.BrowserDriverFactoryDefectDojo;
import com.ZAP_Selenium.WebSiteNavigationDefectDojo;

public class ZapSecurityTestDefectDojo {

private WebDriver driver;
static Logger log = Logger.getLogger(ZapSecurityTestDefectDojo.class.getName());
// Provide Chrome driver path
private static final String BROWSER_DRIVER_PATH = "/root/Downloads/geckodriver";

private WebSiteNavigationDefectDojo siteNavigation;
    @Before
    public void setUp()
    {
	    // Create driver object   
	    driver = BrowserDriverFactoryDefectDojo.createChromeDriver(BROWSER_DRIVER_PATH);
	    siteNavigation = new WebSiteNavigationDefectDojo(driver);
	   // First test the "Register a new user"
	    //siteNavigation.registerNewUser();
	    }
    /*
     * Method to close the driver connection
     */
    @After
    public void tearDown()
    {
    driver.quit();
    }
// ******************************************************* TESTS START FROM HERE **********************************
    @Test
    public void testVulnerabilitiesAfterLogin() throws Exception 
    {
    	log.info("Url loading started");
    	siteNavigation.navigateBeforeLogin();
    	log.info("Url loaded successfully");
    	siteNavigation.loginAsUser();
    	Thread.sleep(15000);
    	siteNavigation.SelectProduct();
    	siteNavigation.Product_Screen();
    	siteNavigation.ImportScan();
    }
}
