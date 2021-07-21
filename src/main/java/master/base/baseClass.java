package master.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

@DefaultUrl("https://ui.cogmento.com/")
public class baseClass extends PageObject{
	
	@FindBy(name="email") WebElement email;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath="//div[text()='Login']") WebElement btn;
	
	@Step
	public void loginCredentials() throws InterruptedException {
		Thread.sleep(8000);
		
		$(email).sendKeys("varadharajan1792@gmail.com");
		$(password).sendKeys("Anishabi@17");
		$(btn).click();
		
		Thread.sleep(5000);
	}
	
	
}
