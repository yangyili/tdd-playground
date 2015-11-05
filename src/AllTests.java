import junit.framework.Test;
import junit.framework.TestSuite;

/**
 *  @author   :   Chen
 *  @fileName :   .AllTests.java
 *           
 *  @date:  Nov 5, 2015  3:07:40 AM
 *  @user:  Chen   
 *  @version: 
 *  @describe :
 *
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(BoardTest.class);
		suite.addTestSuite(PawnTest.class);
		//$JUnit-END$
		return suite;
	}

}
