import java.util.Arrays;
class Anagram
{
    public static void main(String a[])
    {
        String S1="java";
        String S2="avaj";Boolean t;
        char C1[]=S1.toCharArray();
        char C2[]=S2.toCharArray();
        if(S1.length()==S2.length())
        {        
            Arrays.sort(C1);
            Arrays.sort(C2);
            t=Arrays.equals(C1,C2);
        }
        if(t=true)
        {
            System.out.println(" "+S1+" "+S2+" ARE ANAGRAMS");
        }
        else
        {
            System.out.println(" "+S1+" "+S2+" ARE NOT ANAGRAMS");
        }
    }
}