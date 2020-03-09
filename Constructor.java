class Constructor
{
    public static void main(String ar[])
    {
        Test obj=new Test();
        obj.disp();
    }
}
class Test
{   int a,b;
    Test()
    {
        a=10;
        b=5;
    }
    void disp()
    {
        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);
    }
}