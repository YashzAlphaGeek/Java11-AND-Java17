/**
 * 
 */
package com.yash.java;

/**
 * @author Yashwanth
 *
 */
public class CoolJava17 {
	public static void main(String[] args) {
		System.out.println(test(7));
		System.out.println(test("Hello Yash"));
		System.out.println(test(70000000));
		System.out.println(test(null));
		System.out.println(test(true));
	}

	public static String test(Object obj) {
	    return switch(obj) {
	    case Integer i -> "It is an integer";
	    case String s -> "It is a string";
	    case null -> "Null Pointer Exception";
	    case Boolean bool && bool==true -> performOperation(bool);	    
	    default -> "It is none of the known data types";
	    };
	}
	
	public static String performOperation(Boolean bool)
	{
		return "Boolean is "+bool;
	}
}
