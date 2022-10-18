import java.util.Scanner;
//declaring a class
class DataTypeDemo1
{
	public static void main(String args[])
	{
		//creating Scanner Object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character:");
		
		//taking the character input 
		char charValue = sc.next().charAt(0);
		
		//converting char to asciiValue
		int asciiValue= charValue;
	    // print ASCii Value
		System.out.println("The ASCII value of "+ charValue + " is: "+asciiValue );
		
		int num1=9;
		num1= num1+1; // new value 10
	
		int number1= 36;
		int sum= number1++;
		System.out.println("value of sum using number1++ :"+ sum);
		
		int number2= 62;
		 sum= ++number2;
		System.out.println("value of sum using ++number2 :"+ sum);
		
		int n=44;
		System.out.println("Not n :"+ ~n);
		
		boolean status = true;
		System.out.println("!Status : "+ !status);
		
	}	
	
	// end of main
}
// end of class 
