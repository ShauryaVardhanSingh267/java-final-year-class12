import java.util.*;
class alist_twt
{
    void accept(ArrayList<String>words)
    {
        Scanner ob = new Scanner(System.in);
        String str="";
        System.out.println("Enter a sentence but press enter after each word and enter STOP when the sentence is over");
        do
        {
            str=ob.nextLine();
            if(!(str.equals("STOP")))
            words.add(str);
        }
        while(!(str.equals("STOP")));
    }
    ArrayList<String> removeStopWords(ArrayList<String> words)
    {
        ArrayList <String> LongWords = new ArrayList <String>();
        for(String w : words)
        {
            if(w.length()>3)
            LongWords.add(w);
        }
        return LongWords;
    }
    public static void main(String args[])
    {
        alist_twt obj = new alist_twt();
        ArrayList <String> words = new ArrayList<String>();
        obj.accept(words);
        ArrayList <String> stpwrd = obj.removeStopWords(words);
        System.out.print(stpwrd);
    }
}