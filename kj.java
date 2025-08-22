
import java.util.*;
class kj
{
    static Scanner ob = new Scanner(System.in);
    int m=3;
    String arr[][];
    int array[];
    static String inp;
    kj()
    {
        arr=new String[m][2];
        array=new int[m];
        inp="";
    }
    void accept()
    {
arr[0][0] = "what is the capital of USA";
arr[0][1] = "Washington DC";
arr[1][0] = "what is my name";
arr[1][1] = "Vaibhav";
arr[2][0] = "how are you";
arr[2][1] = "I am great";
    }
    ArrayList<String> keywords(String word)
    {
        ArrayList<String> key = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(word);
        int n=st.countTokens();
        for(int i=1;i<=n;i++)
        {
            String a = st.nextToken();
            if(a.length()>3)
            key.add(a);
        }
        return key;
    }
    void matches()
    {
        int count=0;
        for(int i=0;i<m;i++)
        {
            count=0;
            String wrd=arr[i][0];
            ArrayList <String> x=keywords(wrd);
            ArrayList <String> y=keywords(inp);
            for(int k=0;k<x.size();k++)
            {
                String word1=x.get(k);
                for(int l=0;l<y.size();l++)
                {
                   String word2=y.get(l);
                   if(word1.equalsIgnoreCase(word2))
                   {
                       count++;
                   }
                }
            }
            array[i]=count;
        }
        int max=0;
        for(int j=1;j<m;j++)
        {
            if(array[j]>array[max])
            max=j;
        }
        int smax=0;
        for(int j=1;j<m;j++)
        {
            if(array[j]>array[smax]&&array[j]<array[max])
            smax=j;
        }
        if(!inp.equalsIgnoreCase("STOP"))
        {
           if((array[max]-array[smax])<=1)
           System.out.println("Chat Bot : The question is a bit unclear but here is the answer \n\t\t"+arr[max][1]+"\n\t\t hope this is what you were looking for");
           else if(array[max]>1)
           System.out.println("Chat Bot : "+arr[max][1]);
           else
           System.out.println("Chat Bot : Sorry I don\'t know the answer to this question \n\t\t try rephrasing your question ");
        }
    }
    public static void main(String args[])
    {
        kj obj = new kj();
        System.out.println("Chat Bot : Tell me whatever your querry is and i will try to answer it\nRemember to enter STOP whenever you want to end the conversation");
        do
        {
            System.out.print("You : ");
            inp =ob.nextLine();
            System.out.println();
            obj.accept();
            obj.matches(); 
        }
        while(!inp.equalsIgnoreCase("STOP"));
        System.out.println("Chat Bot : Thank You , I hope that i was able to help ");
    }
}
