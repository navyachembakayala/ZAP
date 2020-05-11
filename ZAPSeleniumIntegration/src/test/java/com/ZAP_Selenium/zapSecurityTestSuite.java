package com.ZAP_Selenium;
import org.junit.runner.RunWith;		
import org.junit.runners.Suite;		

@RunWith(Suite.class)				
@Suite.SuiteClasses({
	ZapSecurityTest.class,
	ZapSecurityTestDefectDojo.class 			
})	
public class zapSecurityTestSuite {

}
