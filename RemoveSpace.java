class RemoveSpace
{
    public static void main(String a[])
    {
        String S1="I LOVE YOu";
        StringBuilder obj=new StringBuilder(S1);
        String S2="";
        for(int i=0;i<S1.length();i++)
        {
            if(S1.charAt(i)!=' ')
            {
                S2=S2+S1.charAt(i);
            }
        }
        System.out.println(S2);
    }
}