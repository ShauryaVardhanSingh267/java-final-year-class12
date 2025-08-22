import java.util.*;
class alist_sum
{
    public static void main(String args[])
    {
        ArrayList <Integer> numbers = new ArrayList <Integer> ();
        for(int i=1;i<=10;i++)
        {
            numbers.add(i);
        }
        int sum=0;
        for(Integer num : numbers)
        {
            sum+=num;
        }
        System.out.println("The sum of all the elements is = "+sum);
    }
}