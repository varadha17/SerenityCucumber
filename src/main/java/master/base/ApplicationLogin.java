package master.base;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class ApplicationLogin extends PageObject {
	
	public baseClass base;
	
	@Step
	public void openBrowser() {
		getDriver().manage().window().maximize();
		base.open();
	}
	
	@Step
	public void cred() throws InterruptedException {
		base.loginCredentials();
	}
	
	

}
