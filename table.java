import java.util.Scanner;
class Table
{
    public static void main(String arr[])
    {
        int table,i,a;
        
        Scanner obj = new Scanner (System.in);
        
        System.out.print("Enter a number : ");
        table = obj.nextInt();
        
        for(i=1; i<=10; i++)
        {
          
            System.out.println(i+" X "+table+" = "+i*table);
        }
    }
}
