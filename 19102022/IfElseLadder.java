import java.util.Scanner;
class IfElseLadder
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1,num2,num3;

System.out.println("Enter first no.: ");
num1=sc.nextInt();
System.out.println("Enter second no.: ");
num2=sc.nextInt();
System.out.println("Enter third no.: ");
num3=sc.nextInt();


if((num1>num2)&&(num1>num3))
	System.out.println("The greatest number is "+num1);

else if(num2>num3)
	System.out.println("The greatest number is "+num2);
else
	System.out.println("The greatest number is "+num3);
	
}

}