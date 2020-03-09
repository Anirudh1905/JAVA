class NestingMethod
{   
    void largest(int m,int n)
    {
        if(m>n)
        disp(m);
        else
        disp(n);
    }
    void disp(int c)
    {
        System.out.println("Largest no. is: "+c);
    }
}