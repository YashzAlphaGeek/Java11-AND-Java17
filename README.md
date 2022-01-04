# Java11-AND-Java17

For Java 11 we need to download Amazon Corretto - https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html
Corretto is a distribution of Open JDK with patches included by Amazon that are not yet integrated in the corresponding OpenJDK update projects. We focus on patches that improve performance or stability in OpenJDK, chosen based on Amazon's observations running large services.

Tips :
## Standard Naming Conventions in Java

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
