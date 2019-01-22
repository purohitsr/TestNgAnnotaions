package runProgrametically;
import java.util.ArrayList;
import java.util.List;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class Runner {
	
	
//	private List<T> mylist ;
	public  static void runProgrametically(){
	try{
	
	List<XmlSuite> suites = new ArrayList<XmlSuite>();
	List<XmlClass> classes = new ArrayList<XmlClass>();
	List listnerClasses = new ArrayList();
	
	XmlSuite suite = new XmlSuite();
	suite.setName("SampleSuite");
	
	XmlTest test = new XmlTest(suite);
	test.setName("SampleTest");
	
//	XmlClass class1 = new XmlClass(new XmlClass("runProgrametically.ClassA"));
	classes.add(new XmlClass("runProgrametically.ClassA"));
//	XmlClass class2 = new XmlClass("runProgrametically.ClassB");
	classes.add(new XmlClass("runProgrametically.ClassB"));
	
	
	
	test.setXmlClasses(classes);
	
	suites.add(suite);
	listnerClasses.add(Listener.class);
    TestNG tng = new TestNG();
    tng.setXmlSuites(suites);
    tng.setListenerClasses(listnerClasses);
    tng.run();
	}catch(Exception e){
		e.printStackTrace();
	}
	}
	
	public static void main(String[]args){
		
		Runner r = new Runner();
		r.runProgrametically();
		
	}
	

	

}
