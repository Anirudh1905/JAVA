import java.util.Scanner;
class Alphabet
{
public static void main(String args[])
{   char n;
    System.out.println("Enter alphabet: ");
    Scanner obj=new Scanner(System.in);
    n=obj.next().charAt(0);
    switch(n)
    {
        case 'a':System.out.println("APPLE");break;
        case 'b':System.out.println("BALL");break;
        case 'c':System.out.println("CAT");break;
        case 'd':System.out.println("DOLL");break;
        default :System.out.println("Invalid Input");break;
    }
}
}