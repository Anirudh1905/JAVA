import java.util.Scanner;
class FreqOfChar
{
    public static void main(String a[])
    {   int i,c=0;char j;
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER A STRING: ");
        String S1=obj.nextLine();
        S1=S1.toUpperCase();
        for(j='A';j<='Z';j++)
        {
            for(i=0;i<S1.length();i++)
            {
                if(S1.charAt(i)==j)
                c++;
            }
            if(c!=0)
            System.out.println("COUNT OF "+j+" IS "+c);
            c=0;
        }
    }
}