package Listners_RuntestDynamically;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import RerunFailedTest.Test001;

public class Runner {

	public static void main(String[] args) {
	
		
		XmlSuite suite = new XmlSuite();
		suite.setName("Test Suite");
		
		XmlTest test = new XmlTest(suite);
		test.setName("Sample Test");
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("RerunFailedTest.Test001"));
		test.setXmlClasses(classes) ;

		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		
		
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		

		for(int i=0;i<=3;i++){
			tng.run();
		}


	}
	
	
}
