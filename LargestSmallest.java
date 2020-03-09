import java.util.Scanner;
class LargestSmallest
{
    public static void main(String a[])
    {   int A[]=new int[100];
        int largest=A[0];
        int s;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter NUMBER OF ELEMENTS");
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {   System.out.println("Enter "+(i+1)+" ELEMENT");
            A[i]=obj.nextInt();
        }s=A[0];
        for(int i=0;i<n;i++)
        {
           if(A[i]<=s)
            {
                s=A[i];
            } 
        }
        for(int i=0;i<n;i++)
        {
           if(A[i]>=largest)
            {
                largest=A[i];
            } 
        }
        System.out.println("LARGEST ELEMENT IS :"+largest);
        System.out.println("SMALLEST ELEMENT IS :"+s);
    }
}