class Udc
{   static int l,b,h,v;
    public static void main()
    {
        Udc obj=new Udc();
        obj.calc();
    }
    public void value(Udc obj1)
    {
        obj1.l=5;
        obj1.b=4;
        obj1.h=3;
    }
    public void calc()
    {
        Udc obj1=new Udc();
        value(obj1);
        v=l*b*h;
        System.out.println("VOLUME : "+v);
    }
}