/**
 * 
 */
package com.yash.java;

import java.util.stream.Collectors;

/**
 * @author Yashwanth
 *
 */
public class Strings {
	
public static void main(String[] args) {
    isBlank();
    System.out.println();
    stringInLinesToList();
    System.out.println();
    strippingOfString();
    System.out.println();
    repeatTheString("Never Give Up\n");
    
}

/**
 * The repeat method simply repeats the string that many numbers of times as mentioned in the method in the form of an int.
 * 
 * @param string
 */
private static void repeatTheString(String repeatStr) {
	String repeatVal = repeatStr.repeat(2);
	System.out.println(repeatVal);
}

/**
 * Removes the white space from both, beginning and the end of string.
 */
private static void strippingOfString() {
	String firstName=" Yashwanth ";
	String lastName=".P";
	System.out.println("Before stripping:"+firstName+lastName);
	System.out.println("After stripping:"+firstName.strip()+lastName);
	
}

/**
 * This method returns a stream of strings, which is a collection of all substrings split by lines.
 */
private static void stringInLinesToList() {
	 String val = "Yashwanth\nAlphaGeek\nVampire"; 
     System.out.println(val);
     System.out.println(val.lines().collect(Collectors.toList()));
	
}

/**
 * This instance method returns a boolean value. Empty Strings and Strings with only white spaces are treated as blank.
 */
private static void isBlank() {
	System.out.println(" ".isBlank()); //true
    String yash = "Yashwanth";
    System.out.println(yash.isBlank()); //false
    String s1 = "";
    System.out.println(s1.isBlank()); //true
}
}
