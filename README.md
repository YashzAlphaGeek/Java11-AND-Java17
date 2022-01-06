# Dive Into Java11 & Java17 

For Java 11 we need to download Amazon Corretto - https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html
Corretto is a distribution of Open JDK with patches included by Amazon that are not yet integrated in the corresponding OpenJDK update projects. We focus on patches that improve performance or stability in OpenJDK, chosen based on Amazon's observations running large services.

For Java 17 we need to download Java SE Development Kit 17.0.1 - https://www.oracle.com/java/technologies/downloads/#jdk17-windows

Frequently used Java features are covered as part of this page

## Java 11 Features :

### Running Java File with single command

<pre><code>
<b>java</b> "C:\Users\Yashwanth\Documents\Alpha Geek\Yash_World\JDK11_17\src\com\yash\java\HelloJava11.java"
</code></pre>

<kbd> <img src="https://github.com/YashzAlphaGeek/Java11-AND-Java17/blob/master/Images/SingleJavaCommand.png"/> </kbd>

### Java String Methods

+ <b>IsBlank()</b>

This instance method returns a boolean value. Empty Strings and Strings with only white spaces are treated as blank.

<pre><code>
    System.out.println(" ".<b>isBlank()</b>); //true
    String yash = "Yashwanth";
    System.out.println(yash.<b>isBlank()</b>); //false
    String s1 = "";
    System.out.println(s1.<b>isBlank()</b>); //true
</code></pre>


+ <b>lines()</b>

This method returns a stream of strings, which is a collection of all substrings split by lines.

<pre><code>
     String val = "Yashwanth\nAlphaGeek\nVampire"; 
     System.out.println(val);
     System.out.println(val.<b>lines()</b>.collect(Collectors.toList()));
</code></pre>

+ <b>strip(), stripLeading(), stripTrailing()</b>

Removes the white space from both, beginning and the end of string.

<pre><code>
        String firstName=" Yashwanth ";
	String lastName=".P";
	System.out.println("Before stripping:"+firstName+lastName);
	System.out.println("After stripping:"+firstName.<b>strip()</b>+lastName);
</code></pre>

+ <b>repeat(int)</b>

The repeat method simply repeats the string that many numbers of times as mentioned in the method in the form of an int.

<pre><code>
        String repeatStr = "Never Give Up\n";
        String repeatVal = repeatStr.<b>repeat(2)</b>;
	System.out.println(repeatVal);
</code></pre>

<kbd> <img src="https://github.com/YashzAlphaGeek/Java11-AND-Java17/blob/master/Images/StringMethodsOutcome.png"/> </kbd>

### Local-Variable Syntax for Lambda Parameters

Declaring of formal parameters of an implicitly typed lambda expression

<pre><code>
        Adder adder=(<b>double</b> a, <b>int</b> b)->((int)a+b);
	System.out.println(adder.add(10, 10));
</code></pre>

### Nested Based Access Control

<pre><code>
public class Main {
 
    public void myPublic() {
    }
 
    private void myPrivate() {
    }
 
    class Nested {
 
        public void nestedPublic() {
            <b>myPrivate();</b>
        }
    }
}
</code></pre>

private method of the main class is accessible from the above-nested class in the above manner.

### HTTP Client
Java 11 standardizes the Http CLient API.
The new API supports both HTTP/1.1 and HTTP/2. It is designed to improve the overall performance of sending requests by a client and receiving responses from the server. It also natively supports WebSockets.

### Reading/Writing Strings to and from the Files

Java 11 strives to make reading and writing of String convenient

+ readString()
+ writeString()

<pre><code>
        Path path = Files.writeString(Files.createTempFile("test", ".txt"), "Yashwanth");
	System.out.println(path);
	String s = Files.readString(path);
	System.out.println(s);
</code></pre>

<kbd> <img src="https://github.com/YashzAlphaGeek/Java11-AND-Java17/blob/master/Images/ReadingAndWritingOfFileOutcome.png"/> </kbd>

## Java 17 Features :

### Pattern Matching for switch

We can reduce the if else statement into switch case as shown below

+ if…else chain

<pre><code>
            public static String test(Object obj) {
	    return <b>switch(obj)</b> {
	    case Integer i -> "It is an integer";
	    case String s -> "It is a string";
	    default -> "It is none of the known data types";
	    };
</code></pre>

+ null

<pre><code>
            public static String test(Object obj) {
	    return switch(obj) {
	    case Integer i -> "It is an integer";
	    case String s -> "It is a string";
	    <b>case null -> "Null Pointer Exception";</b>
	    default -> "It is none of the known data types";
	    };
</code></pre>

+ Refining patterns in switch

<pre><code>
            public static String test(Object obj) {
	    return switch(obj) {
	    case Integer i -> "It is an integer";
	    case String s -> "It is a string";
	    case null -> "Null Pointer Exception";
	    case Boolean bool && <b>bool==true</b> -> performOperation(bool);	    
	    default -> "It is none of the known data types";
	    };
	}
	
	public static String performOperation(Boolean bool)
	{
		return "Boolean is "+bool;
	}
</code></pre>

<kbd> <img src="https://github.com/YashzAlphaGeek/Java11-AND-Java17/blob/master/Images/Java17SwitchFeature.png"/> </kbd>

## Info :
Pattern matching for switch statements and expressions. Since this is a preview feature, we need to use --enable-preview option to enable it.

<kbd> <img src="https://github.com/YashzAlphaGeek/Java11-AND-Java17/blob/master/Images/Java17CompilerSwitchPreview.png"/> </kbd>

## Tips :
### Standard Naming Conventions in Java

<b>Package :</b>  Always lower case, use your internet domain name, reversed

Eg : java.lang

<b>Classes :</b> CamelCase , Class names should be nouns, Start with capital letter

Eg : LinkedList, Main

<b>Inerfaces :</b> CamelCase , Consider what objects implementing the interface will become of what they will be able to do

Eg : Comparbale

<b>Methods :</b> mixedCase, Verbs

Eg : getName()

<b>Constants :</b> All Uppercase, Separate words with underscore, Declared with final keyword

Eg : Static final int MAX_NUMB

<b>Variables :</b> mixedCase, Meaningful and indicative, Start with lower case letter, Do not use underscore

Eg : league

<b>Type Parameters :</b> Single Character, captial letters

Eg : E - Element (used extensively by the Java Collections Framework)

------------------------------------------------------------------------------------
“Thanks for watching. If you liked this page, make sure to subscribe for more!”

	First, solve the problem. Then, write the code. 
------------------------------------------------------------------------------------
:grinning:
