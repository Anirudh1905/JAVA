class SecondLargest
{
    public static void main(int a[])
    {
        int largest=a[0];
        int Slargest=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>largest)
            {
                Slargest=largest;
                largest=a[i];
            }
            else if(Slargest>a[i] && Slargest!=largest)
            Slargest=a[i];
        }
        System.out.println("Second Largest: "+Slargest);
        
    }
}