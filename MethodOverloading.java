class MethodOverloading
{
    void calc(int x,int y)
    {
        System.out.println("Add is: "+(x+y));
    }
    void calc(int x)
    {
        System.out.println("Square is: "+(x*x));
    }
}