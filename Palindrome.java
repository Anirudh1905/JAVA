import java.util.Scanner;
class Palindrome
{
    public static void main(String a[])
    {   int i;
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER A STRING: ");
        String S1=obj.nextLine();
        String S2="";
        for(i=S1.length()-1;i>=0;i--)
        {
            S2=S2+S1.charAt(i);
        }
        if(S1.equalsIgnoreCase(S2)==true)
        System.out.println("PALINDROME");
        else
        System.out.println("NOT A PALINDROME");
    }
}