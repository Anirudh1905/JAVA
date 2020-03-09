import java.util.Scanner;
class SI
{
    public static void main(String args[])
    {   int p,t;
        double si,r;
        Scanner obj=new Scanner (System.in);
        System.out.println("Enter principal amt.");
        p=obj.nextInt();
        System.out.println("Enter time ");
        t=obj.nextInt();
        System.out.println("Enter rate of interest ");
        r=obj.nextDouble();
        si=((p*r*t)/100);
        System.out.println("Simple Interest is "+ si);
    }
}