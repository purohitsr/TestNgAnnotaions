package extent;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	/*public static ExtentReports extent;
	public static ExtentReports getInstance(){
		if(extent==null){
			Date date = new Date();
			String reportFileName =date.toString().replace(":", "_").replace(" ", "_");
			extent = new ExtentReports("D://"+reportFileName+".html");
			extent.loadConfig(new File(System.getProperty("user.dir")+"\\ReportsConfig.xml"));
			extent.addSystemInfo("Environment", "QA").addSystemInfo("Selenium Version", "3.0.1");
		}
		return extent;
	}
*/
	
	public static ExtentReports extent;
	public static ExtentReports getInstance(){
		if(extent==null){
			
			Date date = new Date();
			String reportFileName= date.toString().replace(":", "_").replace(" ", "_");
			extent = new ExtentReports("D:\\report.html");
			extent.loadConfig(new File(System.getProperty("user.dir")+"\\ReportsConfig.xml"));;
			
		}
		return extent;
	}
}
