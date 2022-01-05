/**
 * 
 */
package com.yash.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author Yashwanth
 *
 */
public class FileAdvancement {
public static void main(String[] args) throws IOException {
	Path path = Files.writeString(Files.createTempFile("test", ".txt"), "Yashwanth");
	System.out.println(path);
	String s = Files.readString(path);
	System.out.println(s);
}
}
