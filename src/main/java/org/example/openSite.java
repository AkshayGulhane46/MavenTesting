package org.example;
import org.apache.http.HttpConnection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class openSite {
        WebDriver drv;

        @Before
        public void setUp() throws Exception {
                System.setProperty("webdriver.chrome.driver", "C:\\chromeDrivetr\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                String url = "https://www.exampleurl.com/example.htm";
                driver.get(url);
        }

        @After
        public void tearDown() throws Exception {
                drv.quit();

        }


        @Test
        public void Test() throws Exception {
                String url = drv.getCurrentUrl();
                HttpURLConnection huc = null;
                int responseCode = 200;
                drv.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
                drv.findElement(By.cssSelector("input[id='search']")).sendKeys("Selenium"); //Using id tagname attribute combination for css expression and get the element from findElement()
                huc =  (HttpURLConnection)(new URL(url).openConnection());
                huc.setRequestMethod("HEAD");
                huc.connect(); // connecting to the url
                responseCode = huc.getResponseCode();
                drv.close();
        }
}



        // driver.navigate
        // driver.get

        //driver.navigate().to()// this will navigate to URL without waiting

        // driver.close() or driver.quit()
        //Assert: Assert condition stops the execution of the testing
        // if the given condition is false else would continue with the further tests.
        //Verify: Verify the condition doesn’t stop the flow of execution irrespective of the
        // condition being true or false


        // automate right click --->
        //actions action = newActions(driver);
        //WebElement element = driver.findElement(By.id("elementId"));
        //action.contextClick(element).perform();

        //Locating by ID:--->
        //driver.findElement(By.id("q")).sendKeys("Selenium 3");
        //Location by Name:--->
        //driver.findElement(By.name("q")).sendKeys ("Selenium 3");
        //Location by Xpath:--->
        //driver.findElement(By.xpath("//input[@id==’q’])).sendKeys("Selenium 3");
        //Locating Hyperlinks by Link Text:--->
        //driver.FindElement(By.LinkText("edit this page")).Click();
        //Locating by ClassName--->
        //driver.findElement(By.className("profileheader"));
        //Locating by TagName--->
        //driver.findElement(By.tagName("select')).click();
        //Locating by LinkText--->
        //driver.findElement(By.linkText("NextPage")).click();
        //Locating by PartialLinkText--->
        //driverlindElement(By.partialLinkText(" NextP")).click();

        // Waits->
        //Implicit Wait: It sets a fixed, definite time for all the webdriver interactions.
        //It’s slightly unreliable as web driver response times are usually unpredictable.
        // Implicit wait instructs Selenium to wait a specified amount of time before throwing a "No such element" exception
        // Eg:driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Explicit Wait: This type of wait condition sets an expected condition to occur on the web page or
        //a maximum wait time for all the webdriver interactions. Eg:
        //WebElement messageElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginResponse")))

        //The following are the features of Jenkins:

        //Jenkins generates a list of all changes made in SVN repositories, for example.
        //Jenkins gives permanent links to the most recent build or failed build, which can be utilized for convenient communication.
        //Jenkins is simple to install using either a direct installation file (exe) or a war file for deployment via the application server.
        //Jenkins can be set up to send the content of the build status to an email address.
        //Simple Configuration: Jenkins makes it simple to set up multiple tasks.
        //Jenkins can be configured to run the automated test build on TestNg following every SVN build.
        //Jenkins documents the details of the jar, its version, and the mapping of build and jar numbers.
        //Plugins: Jenkins can be set to utilize features and additional functionality provided by third-party plugins.
        //Following are the reasons we use Jenkins with Selenium:
        //
        //When you run Selenium tests in Jenkins, you can run them every time your program changes, and when the tests pass, you may deploy the software to a new environment.
        //Jenkins may execute your tests at a predetermined time.
        //The execution history as well as the Test Reports can be saved.
        //Jenkins allows you to develop and test a project in continuous integration using Maven.

        //How do I retrieve the value of an attribute in Selenium WebDriver?
        //String attributeValue = driver.findElement(By.name("nameSeleniumWebDriver")).getAttribute("value");
        //System.out.println("Available attribute value is :"+attributeValue);

        //What are test design techniques? Explain BVA and ECP with some examples.
        //Black Box Testing: Testing the functionality of the software without looking into the internal structure or code.
        //White Box Testing: Testing the internal structure or code of the software.
        //Grey Box Testing: Combining both Black Box and White Box testing methods.
        //Boundary Value Analysis (BVA): This technique is used to test the software's behaviour at its input and output boundaries.
        // It involves testing the software with input values that are just above and just below the valid range, as well as testing the
        // software with the maximum and minimum valid input values.

        //Equivalence Class Partitioning (ECP): This technique is used to divide the input domain of the software into a
        // finite number of classes or partitions, where each class represents a group of input values that are expected to
        // behave in the same way.
        // The goal of ECP is to test the software with a representative sample of input values from each partition.







