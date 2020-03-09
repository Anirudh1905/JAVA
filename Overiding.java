class Overiding
{
    public static void main(String ar[])
    {
        Sub obj=new Sub();
        obj.disp();
    }
}
class Super
{
    int x=10;
    void disp()
    {
        System.out.println("Super: "+x);
    }
}
class Sub extends Super
{
    int y=10;
    void disp()
    {
        System.out.println("Super: "+x);
        System.out.println("Sub: "+y);
    }
}