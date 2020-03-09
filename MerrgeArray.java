import java.util.Scanner;
class MerrgeArray
{
    public static void main(String a[])
    {   int A[]=new int[100];
        int B[]=new int[100];
        int C[]=new int[100];
        int i,j;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter NUMBER OF ELEMENTS");
        int m=obj.nextInt();
        for(i=0;i<m;i++)
        {   System.out.println("Enter "+(i+1)+" ELEMENT");
            A[i]=obj.nextInt();
        }
        System.out.println("Enter NUMBER OF ELEMENTS");
        int n=obj.nextInt();
        for(i=0;i<n;i++)
        {   System.out.println("Enter "+(i+1)+" ELEMENT");
            B[i]=obj.nextInt();
        }
        int p=m+n;
        for(i=0;i<m;i++)
        {   C[i]=A[i];}
        for(i=m,j=0;i<p;i++,j++)
        {   C[i]=B[j];}
        for(i=0;i<p;i++)
        {System.out.println(" \n"+C[i]);}
    }   
}