package stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef {
WebDriver dr;
@Given("launch fb")
public void launch_fb() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\shalom daniel\\eclipse-workspace\\Cucumbertask1\\chromedriver.exe");
dr=new ChromeDriver();
dr.get("https://www.facebook.com/");
}

@When("user enters credentials {string} {string}")
public void user_enters_credentials(String username, String password) {
    dr.findElement(By.id("email")).sendKeys(username);
    dr.findElement(By.id("pass")).sendKeys(password);
}

@When("hits login button")
public void hits_login_button() {
   dr.findElement(By.id("loginbutton")).click();
}

@Then("goes to home page")
public void goes_to_home_page() {
    String t = dr.getTitle();
    System.out.println(t);
    Assert.assertTrue(t.contains("log in"));
    dr.quit();

}

}
