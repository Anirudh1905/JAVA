import java.util.Scanner;
class Rev
{
    public static void main(String a[])
    {   int i;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a String");
        String S1=new String();
        S1=obj.nextLine();
        String S2="";
        for(i=0;i<S1.length();i++)
        {
            S2=S1.charAt(i)+S2;
        }
        System.out.println("REVERSE STRING IS "+S2);
    }
}
