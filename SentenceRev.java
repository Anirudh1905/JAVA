import java.util.Scanner;
class SentenceRev
{
    public static void main(String a[])
    {   int i;
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER A STRING: ");
        String S1=obj.nextLine();
        String S2="";
        S1=" "+S1;
        for(i=S1.length()-1;i>=0;i--)
        {
            S2=S1.charAt(i)+S2;
            if(S1.charAt(i)==' ')
            { 
                System.out.print(S2);
                S2="";
            }
        }
    }
}