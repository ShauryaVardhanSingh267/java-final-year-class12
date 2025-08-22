import java.util.*;
class alist_lnr
{
    static Scanner ob = new Scanner(System.in);
    ArrayList<Integer> accept()
    {
        ArrayList <Integer> numbers = new ArrayList <Integer>();
        for(int i=1;i<=10;i++)
        {
            System.out.println("Enter number "+i);
            int a=ob.nextInt();
            numbers.add(a);
        }
        return numbers;
    }
    int search(int num,ArrayList<Integer> number)
    {
        int i;
        for(i=0;i<number.size();i++)
        {
            if(number.get(i)==num)
            break;
        }
        return i;
    }
    public static void main(String args[])
    {
        alist_lnr obj = new alist_lnr();
        ArrayList <Integer> numbers = obj.accept();
        System.out.println("Enter the number to be found");
        int num=ob.nextInt();
        if(obj.search(num,numbers)!=10)
        System.out.println("Number found at index "+obj.search(num,numbers));
        else 
        System.out.println("Number not found in the Array List");
    }
}