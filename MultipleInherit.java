class MultipleInherit
{
    public static void main(String a[])
    {
        Result obj=new Result();
        obj.getmark(80,90);
        obj.disp();
    }
}
class Student
{   int m1,m2;
    void getmark(int x,int y)
    {
        m1=x;m2=y;
    }
    void putmark()
    {
        System.out.println("First: "+m1+"\nSecond: "+m2);
    }
}
interface Sport
{
    int sp=6;
    void spmark();
}
class Result extends Student implements Sport
{
    public void spmark()
    {
        System.out.println("Sport marks: "+sp);
    }
    void disp()
    {
        putmark();
        spmark();
        int t=m1+m2+sp;
        System.out.println("Total: "+t);
    }
}