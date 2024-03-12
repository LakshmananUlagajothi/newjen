package org.defination;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
		
		@Before()
		public void browserOpen() throws IOException
		{
			browseropen();
		}	
		@After(order = 2)
		public void browserClose() {
			browsercl();
		}
		@After(order = 1)
		public void name(Scenario s) {
			if(s.isFailed()) {
				TakesScreenshot ts=(TakesScreenshot)s;
				byte[] ss=ts.getScreenshotAs(OutputType.BYTES);
				s.embed(ss, "image/png");
				System.out.println("getscrshot"+s.getName());
			}
			
		}
	}


