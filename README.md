# Dive Into Java11 & Java17 

For Java 11 we need to download Amazon Corretto - https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html
Corretto is a distribution of Open JDK with patches included by Amazon that are not yet integrated in the corresponding OpenJDK update projects. We focus on patches that improve performance or stability in OpenJDK, chosen based on Amazon's observations running large services.

## Java 11 Features :

### Running Java File with single command

<pre><code>
<b>java</b> "C:\Users\Yashwanth\Documents\Alpha Geek\Yash_World\JDK11_17\src\com\yash\java\HelloJava11.java"
</code></pre>


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
