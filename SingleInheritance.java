class SingleInheritance
{
    public static void main(int x,int y)
    {   int c,d;
        B ob=new B();
        c=ob.add(x,y);
        d=ob.mult();
        System.out.println("Addition is: "+c);
        System.out.println("Multiplication is: "+d);
    }
}
class A
{   int m,n;
    int add(int x,int y)
    {   m=x;n=y;
        return(x+y);
    }
}
class B extends A
{
    int mult()
    {
        return(m*n);
    }
}