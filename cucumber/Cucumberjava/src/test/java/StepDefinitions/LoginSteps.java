package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.demo.common.SupportMethods;
import com.demo.pages.HomePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps{


	@Given("user opens app url")
	public void user_opens_app_url() {
		driver.get(SupportMethods.getPropertyValue("url"));
	}
	
	@When("user select single toggle button on ui")
	public void user_select_single_toggle_button_on_ui() {
		HomePage homePage = new HomePage(driver);
		homePage.toggleSingle.click();
		
	}
	
	@When("user selects zero dependent on ui")
	public void user_selects_zero_dependent_on_ui() throws InterruptedException {
		
		HomePage homePage = new HomePage(driver);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);",homePage.dropdownNumberOfDep);
		Thread.sleep(3000);
		homePage.dropdownNumberOfDep.click();
		selectValueFromDropdown("0");
		
		Thread.sleep(150000);
	}
	
	/*@When("user selects home to live in toggle button on ui")
	public void user_selects_home_to_live_in_toggle_button_on_ui() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters value to income field")
	public void user_enters_value_to_income_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters value to other income")
	public void user_enters_value_to_other_income() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters value to living expenses field")
	public void user_enters_value_to_living_expenses_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters value to current home loan repayments")
	public void user_enters_value_to_current_home_loan_repayments() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters value to other loan repayments")
	public void user_enters_value_to_other_loan_repayments() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters value to other Commitments")
	public void user_enters_value_to_other_commitments() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters value to total card limits")
	public void user_enters_value_to_total_card_limits() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user clicks on work out how much i could borrow button")
	public void user_clicks_on_work_out_how_much_i_could_borrow_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("user clicks on start over button")
	public void user_clicks_on_start_over_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on work out how much i could borrow button")
	public void user_clicks_on_work_out_how_much_i_could_borrow_button2() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user gets error message")
	public void user_gets_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/


	
	public void selectValueFromDropdown(String count) {
		driver.findElement(By.xpath("//option[text()='"+count+"']")).click();
		driver.findElement(By.xpath("(//label[@class=\"btn\"])[3]")).click();
		driver.findElement(By.xpath("(//div[@class=\"input__wrapper\"])[2]")).sendKeys("80000");
		driver.findElement(By.xpath("(//div[@class=\"input__wrapper\"])[3]")).sendKeys("10000");
		driver.findElement(By.xpath("(//div[@class=\"input__wrapper\"])[6]")).sendKeys("500");
		driver.findElement(By.xpath("(//div[@class=\"input__wrapper\"])[7]")).sendKeys("0");
		driver.findElement(By.xpath("(//div[@class=\"input__wrapper\"])[8]")).sendKeys("100");
		driver.findElement(By.xpath("(//div[@class=\"input__wrapper\"])[9]")).sendKeys("0");
		driver.findElement(By.xpath("(//div[@class=\"input__wrapper\"])[10]")).sendKeys("10000");
		driver.findElement(By.xpath("//button[@class=\"btn btn--action btn--borrow__calculate\"]")).click();
		driver.findElement(By.xpath("(//span[@class=\"icon icon_restart\"])[2]")).click();
		
		driver.findElement(By.xpath("//option[text()='"+count+"']")).click();
		driver.findElement(By.xpath("(//label[@class=\"btn\"])[3]")).click();
		driver.findElement(By.xpath("(//div[@class=\"input__wrapper\"])[2]")).sendKeys("0");
		driver.findElement(By.xpath("(//div[@class=\"input__wrapper\"])[3]")).sendKeys("0");
		driver.findElement(By.xpath("(//div[@class=\"input__wrapper\"])[6]")).sendKeys("1");
		driver.findElement(By.xpath("(//div[@class=\"input__wrapper\"])[7]")).sendKeys("0");
		driver.findElement(By.xpath("(//div[@class=\"input__wrapper\"])[8]")).sendKeys("0");
		driver.findElement(By.xpath("(//div[@class=\"input__wrapper\"])[9]")).sendKeys("0");
		driver.findElement(By.xpath("(//div[@class=\"input__wrapper\"])[10]")).sendKeys("0");
		driver.findElement(By.xpath("//button[@class=\"btn btn--action btn--borrow__calculate\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn--action btn--borrow__calculate\"]")).click();
		driver.findElement(By.xpath("//span[@class=\"borrow__error__text\"]")).getText();
		
		
		//button[@class="btn btn--action btn--borrow__calculate"]
	}
	
	
	
	public static WebDriver driver;

	@Before
	public void preStep() throws InterruptedException {
		if(SupportMethods.getPropertyValue("browser").equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("disable-geolocation");
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
		}

		else if(SupportMethods.getPropertyValue("browser").equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
	}

	@After
	public void tearDown() {
		driver.quit();
	}


}
