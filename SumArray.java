import java.util.Scanner;
class SumArray
{   static int B[]=new int[10];
    static void amar(int A[])
    {
        int sum=0,i,l;
        l=A.length;
        for(i=0;i<A.length;i++)
        {
            sum=sum+A[i];
        }
        System.out.println("Sum is: "+sum);
    }
    static void Input()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=obj.nextInt();
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++)
        {
            B[i]=obj.nextInt();
        }
    }
    public static void main(String a[])
    {
        SumArray obj=new SumArray();
        obj.Input();
        obj.amar(B);
    }
}

