import java.io.*;
class ImportIO
{
    public static void main(String ar[])throws IOException
    {
        String Ph_M;
        int Price;
        InputStreamReader ISR=new InputStreamReader(System.in);
        BufferedReader BR=new BufferedReader(ISR);
        System.out.println("What is the model of your phone?");
        Ph_M=BR.readLine();
        System.out.println("What is the price of your phone?");
        Price=Integer.parseInt(BR.readLine());
        System.out.println("Your "+Ph_M+" costs "+Price);
    }
}