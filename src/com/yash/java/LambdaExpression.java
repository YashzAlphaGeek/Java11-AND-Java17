/**
 * 
 */
package com.yash.java;

/**
 * @author Yashwanth
 *
 *Local-Variable Syntax for Lambda Parameters
 *
 */
public class LambdaExpression {
public static void main(String[] args) {
	Adder adder=(double a, int b)->((int)a+b);
	System.out.println(adder.add(10, 10));
}
}
