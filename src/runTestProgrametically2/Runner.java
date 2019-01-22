package runTestProgrametically2;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class Runner {
	XmlSuite suite;
	XmlTest test;
	List<XmlClass> classes;
	List<XmlSuite> suites;
	List<Class> listnersClass;
	
	public void runTestProgrametically(){
		
		listnersClass = new ArrayList<Class>();
		
		suite = new XmlSuite();
		suite.setName("Test Suite");
		
		test = new XmlTest(suite);
		test.setName("My Test");
		
		classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("runTestProgrametically2.ClassA"));
		
		test.setXmlClasses(classes);
		
		suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		
		TestNG testng = new TestNG();
		testng.setXmlSuites(suites);
		testng.run();
	}
	
	public static void main(String[]args){
		Runner r = new Runner();
		r.runTestProgrametically();
	}
	

}
