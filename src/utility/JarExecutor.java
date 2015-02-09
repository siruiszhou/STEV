package utility;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;




public class JarExecutor {
	public static void main(String[] args) {
		   //TODO Auto-generated method stub
		  TestListenerAdapter tla = new TestListenerAdapter();
		  TestNG testng = new TestNG();
		  List<String> suites=new ArrayList<String>();
		  suites.add("testng.xml");
		  testng.setTestSuites(suites);
		  //testng.setTestClasses(new Class[] { IllySmoke1_TestLogin.class, IllySmoke2_TestLogin_log4jversion.class});
		  testng.addListener(tla);
		  testng.run();
	}
}