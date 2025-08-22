import java.util.*;
class select_srt
{
    static Scanner ob = new Scanner(System.in);
    int a[]=new int[10];
    void accept()
    {
        for(int i = 0;i<10;i++)
        {
            System.out.println("Enter number "+(i+1));
            a[i]=ob.nextInt();
        }
    }
    void selection_Sort()
    {
        for(int j=0;j<9;j++)
        {
            int index=j;
            for(int i=j+1;i<10;i++)
            {
                if(a[i]<a[index])
                {
                    index=i;
                }
            }
            int t=a[j];
            a[j]=a[index];
            a[index]=t;
        }
    }
    void display()
    {
        System.out.println("Elements sorted in asscending order : ");
        for(Integer temp : a)
        {
            System.out.print(temp+"\t");
        }
    }
    public static void main(String args[])
    {
        select_srt obj = new select_srt();
        obj.accept();
        obj.selection_Sort();
        obj.display();
    }
}