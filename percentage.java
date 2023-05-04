import java.util.Scanner;

class Student
{
	public static void main(String arr[])
	{
		int hindi,maths,english,total;
		float percentage;
		Scanner obj = new Scanner (System.in);
		
		System.out.print("Enter hindi marks : ");
		hindi = obj.nextInt();
		
		System.out.print("Enter maths marks : ");
		maths = obj.nextInt();
		
		System.out.print("Enter english marks : ");
		english = obj.nextInt();
		
		total = hindi+maths+english;
		
		percentage = (total*100)/300;
		
		System.out.println("Total marks : "+total);
		
		System.out.println("Percentage : "+percentage);
		
	}
}
