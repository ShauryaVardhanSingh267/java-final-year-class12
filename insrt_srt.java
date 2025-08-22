import java.util.*;
class insrt_srt
{
    static Scanner ob = new Scanner(System.in);
    int a[]=new int[10];
    void accept()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter number "+(i+1));
            a[i]=ob.nextInt();
        }
    }
    void insertion_Sort()
    {
        for(int j=1;j<10;j++)
        {
            int temp=a[j];
            int i=j;
            while(i>0&&temp<a[i-1])
            {
                a[i]=a[i-1];
                i--;
            }
            a[i]=temp;
        }
    }
    void display()
    {
        System.out.println("The sorted elements are : ");
        for(int t : a)
        {
            System.out.print(t+"\t");
        }
        System.out.println(Math.pow(2,3));
    }
    public static void main(String args[])
    {
        insrt_srt obj = new insrt_srt();
        obj.accept();
        obj.insertion_Sort();
        obj.display();
    }
}