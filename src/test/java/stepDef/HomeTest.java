package stepDef;


import io.cucumber.java.en.Given;
import master.pages.Home;
import net.thucydides.core.annotations.Steps;


public class HomeTest {
	@Steps
	public Home home;
	
	@Given("get url")
	public void get_url() {
	   home.getCurrentPageUrl();
	}
	
	@Given("list all items present in HomePage")
	public void list_all_items_present_in_home_page() throws InterruptedException {
	   home.listallitems();
	}

}
