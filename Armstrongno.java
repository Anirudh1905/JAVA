class Armstrongno
{
    public static void ser(int n)
    {   int x;
        int l=0;
        double sum=0;
        while(n>0)
        {
            x=n%10;
            n=n/10;
            l++;
        }
        while(n>0)
        {  
            int y;
            y=n%10;
            sum=sum+Math.pow(y,l);
            n=n/10;
        }
        if(n==sum)
        System.out.println("Amstrong no.");
        else
        System.out.println("Not a Amstrong no.");
    }
}