class SuperPara
{
    public static void main(int x,int y)
    {
        Bb obj=new Bb(x,y);
    }
}
class Aa
{   int a;
    Aa(int x)
    {   a=x;
        System.out.println("Value of A= "+a);
    }
}
class Bb extends Aa
{   int b;
    Bb(int x,int y)
    {   super(x);
        b=y;
        System.out.println("Value of B= "+b);
    }
}