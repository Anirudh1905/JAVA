class Test extends Student
{   int m1,m2;
    void getmark(int x,int y)
    {
        m1=x;
        m2=y;
    }
    void putmark()
    {
        System.out.println("Test1: "+m1);
        System.out.println("Test2: "+m2);
    }
}