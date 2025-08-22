import java.util.*;
class pangram
{
    static Scanner ob=new Scanner(System.in);
    String S;
    pangram()
    {
        S="";
    }
    void accept()
    {
        System.out.println("Enter a String to check if it is a pangram or not");
        String S=ob.nextLine();
        if(S.charAt(S.length()-1)=='?'||S.charAt(S.length()-1)=='!')
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
    }
    void check()
    {
        String max=" ";
        String min=S;
        String s=S.toUpperCase();
        int f=0;
        for(int i=65;i<=90;i++)
        {
            char ch=(char)i;
            if(s.indexOf(ch)==-1)
            f=1;
        }
        if(f==1)
        System.out.println("Not a Pangram");
        else
        System.out.println("Pangram");
        StringTokenizer st = new StringTokenizer(S);
        int n=st.countTokens();
        for(int i=1;i<=n;i++)
        {
            String a=st.nextToken();
            if(a.length()>max.length())
            max=a;
            if(a.length()<min.length())
            min=a;
        }
        System.out.println("Largest word = "+max);
        System.out.println("Smallest word = "+min);
    }
    public static void main(String args[])
    {
        pangram obj = new pangram();
        obj.accept();
        obj.check();
    }
}