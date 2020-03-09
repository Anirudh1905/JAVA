class Rotation
{   
    public static void main(String S1,String S2)
    {
        String S3=S1.concat(S1);
        if(S3.contains(S2))
        {
            System.out.println("ROTATIONAL STRING");
        }
        else
        System.out.println("NOT ROTATIONAL STRING");
    }
}
