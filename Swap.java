import java.util.Scanner;
class Swap
{
    public static void main(String a[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER 2 NUMBER");
        int x=obj.nextInt();
        int y=obj.nextInt();
        System.out.println("BEFORE SWAPPING");
        System.out.println("X= "+x+" Y= "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("AFTER SWAPPING");
        System.out.println("X= "+x+" Y= "+y);
    }
}