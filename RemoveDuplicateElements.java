import java.util.Scanner;
class RemoveDuplicateElements
{
    public static void main(String a[])
    {   int A[]=new int[100];int i;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter NUMBER OF ELEMENTS");
        int n=obj.nextInt();
        for(i=0;i<n;i++)
        {   System.out.println("Enter "+(i+1)+" ELEMENT");
            A[i]=obj.nextInt();
        }
        for(i=0;i<n;i++)
        {   
            for(int j=i+1;j<n;j++)
            {   if(A[i]==A[j])
                {
                    A[j]=A[n-1];
                    n--;
                }
            }
        }
        for(i=0;i<n;i++)
        {   System.out.println(" \n"+A[i]);
        }
    }
}