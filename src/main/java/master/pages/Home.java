package master.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Home extends PageObject {
	
	@FindBy(css="div.menu-item-wrapper") List<WebElement> items;
	@FindBy(xpath="//span[text()='Calendar']") WebElement cal;
	
	@Step
	public void getCurrentPageUrl() {
		String url = getDriver().getCurrentUrl();
		System.out.println(url);
	}
	
	@Step
	public void listallitems() throws InterruptedException {
		cal.click();
		Thread.sleep(3000);
		for(WebElement ele:items) {
			System.out.println(ele.getText());
		}
		Assert.assertEquals("Hello","some");
	}

}
