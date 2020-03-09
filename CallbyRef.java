class CallbyRef
{   int x,y;
    public static void main(int x,int y)
    {   
        CallbyRef obj=new CallbyRef();
        System.out.println("x= "+x+" y= "+y);
        obj.Test(x,y);
        obj.swap(obj);
        System.out.println("x= "+obj.x+" y= "+obj.y);
    }
    void Test(int a,int b)
    {
        x=a;y=b;
    }
    void swap(CallbyRef obj)
    {   int c;
        c=obj.x;
        obj.x=obj.y;
        obj.y=c;
    }
}