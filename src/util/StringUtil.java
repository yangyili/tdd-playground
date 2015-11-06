package util;

/**
 * @author : Chen
 * @fileName : util.StringUtil.java
 * 
 * @date: Nov 6, 2015 12:57:52 AM
 * @user: Chen
 * @version:
 * @describe :
 * 
 */
public class StringUtil {

	private StringUtil() {
		// private access modifier
	}

	public static String newline(String s) {
		return String.format("%s%n", s);
	}
}
