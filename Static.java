class Static
{
    public static void main(String ar[])
    {
        Test.cube(5);
    }
}
class Test
{
    static void cube(int x)
    {
        System.out.println("Cube is : "+(x*x*x));
    }
}