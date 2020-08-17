/* Keywords are
 * Try
 * Catch
 * Finally
 * Throw
 * Throws
 */
 

class ExceptionHandelExam {
	
	public static void main(String args[])
	{
	int num1, num2;
	
	try {  
		  num1=0;
	      num2=62/num1;
		  System.out.println(num2);
		  System.out.println("I am at the end of try block");
		}
	
		catch (ArithmeticException e){
			System.out.println("You should not divide a number by zero");
		}
	
		catch (Exception e){
			System.out.println("Exception occured");
		}
		System.out.println("I am out of try - catch block");
	}
	  
}
