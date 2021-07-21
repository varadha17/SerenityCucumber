package master.util;

import java.io.FileInputStream;
import java.util.Properties;

import net.thucydides.core.pages.PageObject;

public class common extends PageObject{
	
	Properties prop;
	
	public Properties setProperty(String path) {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return prop;
	}

}
