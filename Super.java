class Super
{
    public static void main(String ar[])
    {
        Ba obj=new Ba();
    }
}
class Ab
{
    Ab()
    {
        System.out.println("Constructor in class A");
    }
}
class Ba extends Ab
{
    Ba()
    {   super();
        System.out.println("Constructor in class B");
    }
}