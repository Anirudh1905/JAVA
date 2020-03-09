class Fibonacci
{
    public static void main(int x)
    {   int F[]=new int[100];
        F[0]=0;
        F[1]=1;
        for(int i=2;i<x+1;i++)
        {
            F[i]=F[i-1]+F[i-2];
            System.out.println(" "+F[i]);
        }
    }
}
