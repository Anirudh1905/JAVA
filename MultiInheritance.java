import java.util.Scanner;   
class MultiInheritance
{
    public static void main(String ar[])
    {   int a,b,c;
        Result ob=new Result();
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your ROLL NO.: ");
        a=obj.nextInt();
        System.out.println("Enter your Test1 mark: ");
        b=obj.nextInt();
        System.out.println("Enter your Test2 mark: ");
        c=obj.nextInt();
        ob.getroll(a);
        ob.getmark(b,c);
        ob.disp();
    }
}
class Student
{   int roll;
    void getroll(int x)
    {   
        roll=x;
    }
    void putroll()
    {
        System.out.println("ROLL NO.: "+roll);
    }
}
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
class Result extends Test
{   int sum;
    void disp()
    {
        putroll();
        putmark();
        sum=m1+m2;
        System.out.println("Total: "+sum);
    }
}