class ExceptionHandling1
{
    public static void main(String ar[])
    {   int a,b;
        try
        {
                a=Integer.parseInt(ar[0]);
                b=Integer.parseInt(ar[1]);
                try
                {
                    System.out.println("RESULT: "+(a/b));
                }
                catch(ArithmeticException e)
                {
                    System.out.println("DIVISION BY ZERO");
                }
        }
        catch(NumberFormatException e)
        {
                System.out.println("INCORRECT ARGUMENT TYPE");
                
        }
    }
}