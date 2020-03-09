class ExceptionHandling
{
    public static void main(String a[])
    {   int i,valid=0,invalid=0,n;
        for(i=0;i<a.length;i++)
        {
            try
            {
                n=Integer.parseInt(a[i]);
            }
            catch(NumberFormatException e)
            {
                System.out.println("INVALID NUMBER: "+a[i] );
                invalid++;
                continue;
            }
            valid++;
        }
        System.out.println("VALID NUMBER : "+valid);
        System.out.println("INVALID NUMBER : "+invalid);
    }
}