class ExtendThreadClass
{
    public static void main(String a[])
    {
        A obja=new A();
        B objb=new B();
        obja.start();
        objb.start();
    }
}
class A extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("FROM A "+i);
        }
        System.out.println("EXIT FROM A");
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("FROM B "+i);
        }
        System.out.println("EXIT FROM B");
    }
}