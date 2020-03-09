import java.util.Scanner;
class BinarySearch
{
    public static void main(String a[])
    {   int A[]=new int[100];int F=0;int i,t;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter NUMBER OF ELEMENTS");
        int n=obj.nextInt();
        int L=n-1;
        for(i=0;i<n;i++)
        {   System.out.println("Enter "+(i+1)+" ELEMENT");
            A[i]=obj.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {   if(A[i]>A[j])
                {
                t=A[i];
                A[i]=A[j];
                A[j]=t;
                }
            }
        }
        System.out.println("Enter the ELEMENT");
        int S=obj.nextInt();
        while(F<=L)
        {
            int M=(F+L)/2;
            if(S==A[M])
            {
                System.out.println("Element available at index "+M);
                break;
            }
            else if(S>A[M])
            F=M+1;
            else
            L=M-1;
        }
        
    }
}