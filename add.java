import java.util.Scanner;

class Add
{
    public static void main(String arr[])
    {
        int a,b;
        Scanner ob = new Scanner (System.in);

       
        System.out.print("Enter a First number = ");
        a = ob.nextInt();

        
        System.out.print("Enter a Second number = ");
        b = ob.nextInt();
        int sum = a+b;
        System.out.println("Sum of two number = "+sum);
    }
}