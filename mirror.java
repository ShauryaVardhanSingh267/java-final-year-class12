import java.util.*;
class mirror
{
    public static void main(String args[])
    {
        String motto= "May the force be with you";
        int firstspace= motto.indexOf(" ");
        int secondspace = motto.indexOf(" ",firstspace+1);
        String word = motto.substring(firstspace+1,secondspace);
        System.out.println(word);
    }
}