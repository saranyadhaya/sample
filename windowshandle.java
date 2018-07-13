package test;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowshandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com");
		String pw=driver.getWindowHandle();
		Set<String> aw=driver.getWindowHandles();
		for(String w:aw)
		{
			if(!w.equals (pw))
			{
				driver.switchTo().window(w);
				driver.close();
			}
		}

	}

}
