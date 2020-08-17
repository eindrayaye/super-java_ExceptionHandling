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

It is not necessary to handle uncheckedexception if u dont handle them it will be handed by jvm



