import java.util.Scanner;

class Reactangle
{
    public static void main(String arr[])
    {
        int length,breadth,area;
        
        Scanner ob = new Scanner (System.in);
        
        System.out.print("Enter rectangle length : ");
        length = ob.nextInt();
        
        System.out.print("Enter rectangle breadth : ");
        breadth = ob.nextInt();
        
        area = length * breadth;
        
        System.out.println("Area of reactangle : "+area);
    }
}
