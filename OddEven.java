import java.util.Scanner;
class OddEven
{
    public static void main(String args[])
    {   int n;
        System.out.println("Enter a no. ");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        if(n%2==0)
        {
           System.out.println("Even"); 
        }
        else
        {
            System.out.println("Odd");
        }
    }
}