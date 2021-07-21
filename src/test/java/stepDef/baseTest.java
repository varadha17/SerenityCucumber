package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import master.base.ApplicationLogin;
import net.thucydides.core.annotations.Steps;

public class baseTest {
	
	@Steps
	public ApplicationLogin app;
	
	@Given("Open browser")
	public void open_browser() {
		app.openBrowser();
	}
	
	@Then("user enters username, password to login")
	public void user_enters_username_password_to_login() throws InterruptedException {
		app.cred();
	}

}
