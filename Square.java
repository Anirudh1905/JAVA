import java.util.Scanner;
class Square
{
    public static void main(String args[])
    {   int a;
        System.out.println("Enter no. ");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        System.out.println("Square of the no. is "+ (a*a));
    }
}