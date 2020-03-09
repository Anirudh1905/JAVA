import java.util.Scanner;
class SelectionSort
{
    public static void main(String a[])
    {   int A[]=new int[100];int MV,MI;int i,t;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter NUMBER OF ELEMENTS");
        int n=obj.nextInt();
        for(i=0;i<n;i++)
        {   System.out.println("Enter "+(i+1)+" ELEMENT");
            A[i]=obj.nextInt();
        }
        for(i=0;i<n-1;i++)
        {   MV=A[i];
            MI=i;
            for(int j=i+1;j<n;j++)
            {   
                if(A[j]<MV)
                {
                    MV=A[j];
                    MI=j;
                }
                t=A[i];
                A[i]=A[MI];
                A[MI]=t;
            }
        }
        for(i=0;i<n;i++)
        {   System.out.println(" \n"+A[i]);
        }
    }
}
