import java.util.*;
class alist_srt
{
    static Scanner ob = new Scanner(System.in);
    ArrayList <Integer> al = new ArrayList <Integer>();
    void accept()
    {
        System.out.println("Enter the number of elements you want to enter");
        int n = ob.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter number "+(i+1));
            al.add(ob.nextInt());
        }
    }
    void insertion_Sort()
    {
        for(int j=1;j<al.size();j++)
        {
            int a = al.get(j);
            int i=j;
            while(i>0&&a<al.get(i-1))
            {
                al.set(i,al.get(i-1));
                i--;
            }
            al.set(i,a);
        }
    }
    void display()
    {
        System.out.println("The sorted list of elements is : ");
        for(Integer temp : al)
        {
            System.out.print(temp+"\t");
        }
    }
    public static void main(String args[])
    {
        alist_srt obj = new alist_srt();
        obj.accept();
        obj.insertion_Sort();
        obj.display();
    }
}