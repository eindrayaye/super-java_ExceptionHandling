/*The printStackTrace() method in Java is a tool used to handle exceptions and errors.
 * will pinpoint the exact line in which the method raised the exception.*/

package ExecptionDemo;

public class PrintStackTraceDemo {
	public static void test() {
	      try {
	        int num1 = 5/0;
	      }
	      //catch (ArithmeticException e) {
	        //System.out.println("You can divide number by 0 ");
	        
	        catch (Throwable e) {
	            e.printStackTrace();
	      }
	    }

	    public static void main( String args[] ) {
	      test();
	    }
}
