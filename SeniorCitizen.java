class SeniorCitizen
{
    public static boolean calc(int x)
    {
        if(x>=60)
        {
            System.out.println("YOU ARE A SENIOR CITIZEN");
            return true;
        }
        else
        {
            System.out.println("YOU ARE NOT A SENIOR CITIZEN");
            return false;
        }
    }
}