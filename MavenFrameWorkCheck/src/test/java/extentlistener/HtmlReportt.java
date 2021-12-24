package extentlistener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testclass.BaseTest;

public class HtmlReportt {

	static ExtentReports extent;
	
	public static ExtentReports extentReportGenerator()
	{
		String path = System.getProperty("user.dir")+"\\reports\\index2.html";
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		
		reporter.config().setReportName("Regression Test Report");

		reporter.config().setDocumentTitle("Regression Test cases");

		reporter.config().setTheme(Theme.DARK);
		
		 extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Organization", "Velocity");		
		return extent;
		
				
	}

}
