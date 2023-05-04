//SWAPPING TWO VARIABLE WITH OUT THRED VARIABLE
import java.util.Scanner;

class Swapping
{
	public static void main(String arr[])
	{
		int a,b;
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter a first number : ");
		a = obj.nextInt();
		
		System.out.print("Enter a second number : ");
		b = obj.nextInt();
		
		System.out.println("Before Swapping");
		System.out.println("a = "+a+" b = "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping");
		System.out.println("a = "+a+" b = "+b);
		
	}
}