import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale; // To get the local currency
import java.text.NumberFormat; // To get the local currency

public class ExceptionHomeWork {
	private Scanner sc;
	final double price = 2.50;
	String mark;
	
	//Numberformatexception
	public void get ()
	{
		
		sc=new Scanner(System.in);
		System.out.println("How many boxes we have?: ");
		String box=sc.next();
		
		//// Steps to get the local currency
        Locale locale = new Locale ("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		
		try {
			int boxin = Integer.parseInt(box);
			System.out.println("The value for " + boxin + " boxes are: " + currencyFormatter.format(boxin * price));
			
		    }
		catch (NumberFormatException e) 
		    {
			System.out.println("Exception (Translated) = That's not a number");
			System.out.println("Please try again!!!!!");
			System.out.println();
			//String mark = "T";
			//System.out.println(mark);
			
			sc=new Scanner(System.in);
			System.out.println("How many boxes we have?: ");
			String box1=sc.next();
			
		    //// Steps to get the local currency
	        Locale locale1 = new Locale ("en", "US");
	        NumberFormat currencyFormatter1 = NumberFormat.getCurrencyInstance(locale1);
			int boxin1 = Integer.parseInt(box1);
			System.out.println("The value for " + boxin1 + " boxes are: " + currencyFormatter1.format(boxin1 * price));
			
		    } 
	}
	
	//Arraystoreexception
	void storeexpt1()
	{
		  Number integerArray[] = new Integer[3];
	      	      
	      try {
	    	  System.out.println();
	    	  System.out.println("Next");
	    	  System.out.println("******Checking order numer total from (Jan,Feb.March)*****");
	    	  System.out.println("Total order as follow: ");
	    	  integerArray[0] = 12548;
		      integerArray[1] = 36987;
		      integerArray[2] = 555.00;
	          System.out.println(Arrays.toString(integerArray));
	      }
	      catch (ArrayStoreException e) 
		    {
			System.out.print("Array Store Exception WARNING: ");
			System.out.println("Cannot store the Wrong Datatype in Array !!!!");
		    } 
		System.out.println("Please try again.");
		System.out.println();
	}
	
	
	void storeexpt2()
	{
		Number integerArray1[] = new Integer[3];
		sc=new Scanner(System.in);
		for (int i=0; i<integerArray1.length; i++)
  	  {
  		System.out.println("Enter value : ");
  		integerArray1[i]=sc.nextInt();
  	  }
		System.out.println("Total order for 3 months are: " + Arrays.toString(integerArray1));
	}
	
	
	public static void main(String args[])
	{
		ExceptionHomeWork hw= new ExceptionHomeWork();
		hw.get();
		hw.storeexpt1();
		hw.storeexpt2();
	}

}


