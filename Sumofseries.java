class Sumofseries
{
    public static void ser(int x,int n)
    {   int f=1;
        double y;
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
            y=(Math.pow(x,i))/f;
            sum=sum+y;
        }
        System.out.println("Sum= "+sum);
    }
}