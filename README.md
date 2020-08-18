# super-java_ExceptionHandling

Exception - is a unwated events that interrups the normal flows of the program. 

The good thing about exception is that they can handle by Java. We can provide the meaningful message to the users rather than
a system generated messages.

Error - It is that something severe enought has gone wrong and application should crash rather than try to handle the error.


Keywords:

- Try

- Catch

- Finally

-Throw

- Throws

(Example: How to use)

try

{

// Statement that may cause an exception

{

catch (exception (type) e (object))

{

// error handling codes

}


** Errors in Java**

(1) Compile time error

(2) Runtime error

(3) Execption 


** Categories of Exception**


* Checked Execption

Any exception which is directly inheriting from exception class is called checked exception. 

This type of exception comes whenever u r trying to access any resource outside jvm like databaseconnection, files. 

It is must to handle checked exception,if u dont handle them it gives u compile time error.

IOException

FileNotFoundException

SQLException


* UncheckedException/RuntimeException

It is not necessary to handle unchecked exception.

These are exception which is inheriting from RuntimeException that is sub class of Exception.

It is not necessary to handle uncheckedexception if u dont handle them it will be handed by jvm.

* ArrayIndexOutOfBoundsException

* NullPointerException

* NumberFormatException

Explained : The NumberFormatException is thrown when we try to convert a string into a numeric value such as float or integer, but the format of the input string is not appropriate or illegal. By illegal format, it is meant that if you are trying to parse a string to an integer but the String contains a boolean value, it is of illegal format. For example - if we try to parse a string to integer but the string is null.


* FileNotFoundException, 

* SecurityException

* ArrayStoreException


---- Importance ----

(Execption e) IS A PARENTS , Can't write BEFORE any others child Exceptions (as above) 
