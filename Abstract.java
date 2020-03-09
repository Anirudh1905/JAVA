class Abstract
{
    public static void main(String ar[])
    {
        Y obj=new Y();
        obj.disp();
        obj.display();
    }
}
abstract class X
{
    abstract void disp();
    void display()
    {
        System.out.println("METHOD FROM X CLASS");
    }
}
class Y extends X
{
    void disp()
    {
        System.out.println("METHOD DEFINED IN Y CLASS");
    }
}