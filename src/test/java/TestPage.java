import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestPage {
	WebDriver dr;
	
	@Given("^open Browser$")
	public void open_Browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/masumparvezapu/Downloads/chromedriver");
		dr = new ChromeDriver();
	}
	@Given("^navigate to Macys URL$")
	public void navigate_to_Macys_URL() throws Throwable {
		dr.get("https://www.macys.com/");
	}
	@When("^user click on shop by department button$")
	public void user_click_on_shop_by_department_button() throws Throwable {
		dr.findElement(By.xpath(".//*[@id='shopByDepartmentLabelText']")).click();
	}
	@When("^user click on men button$")
	public void user_click_on_men_button() throws Throwable {
		dr.findElement(By.xpath(".//*[@id='flexid_1']/a")).click();
	}
	@When("^user click on jeans button$")
	public void user_click_on_jeans_button() throws Throwable {
	    dr.findElement(By.xpath(".//*[@id='mainNavigationFlyouts']/div[3]/div[1]/ul/li[12]/a")).click();
	}
	@Then("^user should be in mens jeans page$")
	public void user_should_be_in_mens_jeans_page() throws Throwable {
	   System.out.println("User in the men's jeans page");
	}
	@Then("^user will click on a pant$")
	public void user_will_click_on_a_pant() throws Throwable {
		dr.findElement(By.xpath(".//*[@id='2713461']/div[1]/a/picture/div")).click();
	}
	@Then("^choose a color$")
	public void choose_a_color() throws Throwable {
		dr.findElement(By.xpath(".//*[@id='mainContent']/div/div[1]/div[2]/div[3]/div/div[1]/div[3]/div/div[2]/div/div/ul/li[2]/div")).click();
	}
	@Then("^pick a size$")
	public void pick_a_size() throws Throwable {
		dr.findElement(By.xpath(".//*[@id='mainContent']/div/div[1]/div[2]/div[3]/div/div/div[1]/div[4]/div/div[2]/div/ul/li[5]")).click();
	}
	@Then("^user will add to bag$")
	public void user_will_add_to_bag() throws Throwable {
		dr.findElement(By.xpath(".//*[@id='bag-add-2713461']")).click();
	}
	@Then("^user will view bag & checkout$")
	public void user_will_view_bag_checkout() throws Throwable {
		dr.findElement(By.xpath(".//*[@id='modal-c239-content']/div[2]/div/div/div/div[1]/div[2]/div[2]/div[2]/div[1]/div/a")).click();
	}
	@Then("^again user will click on keep shopping$")
	public void again_user_will_click_on_keep_shopping() throws Throwable {
		dr.findElement(By.xpath(".//*[@id='continueShoppingButton']")).click();
	}
	@Then("^user will land on Macys home page$")
	public void user_will_land_on_Macys_home_page() throws Throwable {
	    System.out.println("User in a home page again");
	    dr.quit();
	}
	



}
