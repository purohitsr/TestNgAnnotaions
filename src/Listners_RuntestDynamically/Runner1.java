package Listners_RuntestDynamically;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;


public class Runner1 {
	
	public static void main(String[]args){
		
		List<String> file = new ArrayList<String>();
		file.add(System.getProperty("user.dir")+"\\runfailedtest.xml");
		TestNG testng = new TestNG();
		testng.setTestSuites(file);
		testng.run();
	}

}
