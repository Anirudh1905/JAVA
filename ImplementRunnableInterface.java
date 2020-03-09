class ImplementRunnableInterface
{
    public static void main(String a[])
    {
        Test obj1=new Test();
        Thread obj2=new Thread(obj1);
        obj2.start();
        for(int i=0;i<5;i++)
        {
            System.out.println("Main Thread "+i);
        }
    }
}
class Test implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Test Thread "+i);
        }
    }
}