import java.util.Scanner;
class HeirarchalInheritance
{
    public static void main(int x, int y)
    {   int b;
        Two obj1=new Two();
        Three obj2=new Three();
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter 1 for ADDITION");
        System.out.println("Enter 2 for MULTIPLICATION");
        b=obj.nextInt();
        if(b==1)
        {
            obj1.getno(x,y);
            obj1.add();
        }
        else if(b==2)
        {
            obj2.getno(x,y);
            obj2.mult();
        }
        else
        {
             System.out.println("INVALID INPUT");
        }
    }
}
class One
{   int m,n;
    void getno(int x,int y)
    {
        m=x;
        n=y;
    }
}
class Two extends One
{
    void add()
    {
        System.out.println("Addition is: "+(m+n));
    }
}
class Three extends One
{
    void mult()
    {
        System.out.println("Multiplication is: "+(m*n));
    }
}