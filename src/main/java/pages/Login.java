package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.jayway.jsonpath.JsonPath;

// https://curiosity.partner.testinsights.io/app/#!/module-collection/guid/03799374-b4c9-4182-8837-37f882c220f3
@TestModellerModule(guid = "03799374-b4c9-4182-8837-37f882c220f3")
public class Login extends BasePage
{
	public Login (WebDriver driver)
	{
		super(driver);
	}


	
	private By PasswordElem = By.xpath("//label[normalize-space()= 'Password']/../input");

	private By Sign_InElem = By.xpath("//A[@class='nav-item nav-link active el-selection']");

	private By SubmitElem = By.xpath("//BUTTON[contains(text(),'Submit')]");

	private By UsernameElem = By.xpath("//label[normalize-space()= 'Username']/../input");


	
     
	/**
 	 * Assert Sign In
     * @name Assert Sign In
     */
	public void Assert_Sign_In()
	{
	    
		WebElement elem = getWebElement(Sign_InElem);

		if (elem == null) {
			Assert.fail("Unable to locate object: " + Sign_InElem.toString());
        }
        
	}
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://practise.usemango.co.uk/login";

        if (!currentUrl.equals("https://practise.usemango.co.uk/login")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Click Submit
     * @name Click Submit
     */
    public void Click_Submit()
    {
         
        WebElement elem = getWebElement(SubmitElem);

        if (elem == null) {
            ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Submit", "Click_Submit failed. Unable to locate object: " + SubmitElem.toString());

            TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Submit", "Click_Submit failed. Unable to locate object: " + SubmitElem.toString());

            Assert.fail("Unable to locate object: " + SubmitElem.toString());
         }

        elem.click();
         

        ExtentReportManager.passStepWithScreenshot(m_Driver, "Click_Submit");

        TestModellerLogger.PassStepWithScreenshot(m_Driver, "Click_Submit");
    }
      
	/**
 	 * Enter Password
     * @name Enter Password
     */
 	public void Enter_Password(String Password)
 	{
 	    
 		WebElement elem = getWebElement(PasswordElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Password", "Enter_Password failed. Unable to locate object: " + PasswordElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Password", "Enter_Password failed. Unable to locate object: " + PasswordElem.toString());

 			Assert.fail("Unable to locate object: " + PasswordElem.toString());
         }

 		elem.sendKeys(Password);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Password " + Password);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Password " + Password);
 	}

      
	/**
 	 * Enter Username
     * @name Enter Username
     */
 	public void Enter_Username(String Username)
 	{
 	    
 		WebElement elem = getWebElement(UsernameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Username", "Enter_Username failed. Unable to locate object: " + UsernameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Username", "Enter_Username failed. Unable to locate object: " + UsernameElem.toString());

 			Assert.fail("Unable to locate object: " + UsernameElem.toString());
         }

 		elem.sendKeys(Username);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Username " + Username);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Username " + Username);
 	}

	public void GoToUrl()
	{
		m_Driver.get("https://practise.usemango.co.uk/login");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://practise.usemango.co.uk/login");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://practise.usemango.co.uk/login");
	}
}