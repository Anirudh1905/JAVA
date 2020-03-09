class ParameterConstructor
{
    public static void main(String ar[])
    {
        Rectangle obj=new Rectangle(5,10);
    }
}
class Rectangle
{
    Rectangle(int x,int y)
    {
        System.out.println("Area is "+(x*y));
    }
}