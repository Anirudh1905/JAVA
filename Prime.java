class Prime
{
    public static void main(int x)
    {   int c=0;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                c++;
            }
        }
        if(c!=0)
        System.out.println("NOT A PRIME");
        else
        System.out.println("PRIME");
    }
}