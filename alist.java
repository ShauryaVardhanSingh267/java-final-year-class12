import java.util.*;
class alist
{ 
    double number;
    alist(double n)
    {
        number=n;
    }
    double getnumber()
    {
        return number;
    }
    public static void main(String args[])
    {
        alist ob1 = new alist(20.0);
        alist ob2 = new alist(30.0);
        alist ob3 = new alist(40.0);
        alist ob4 = new alist(50.0);
        ArrayList<alist> num = new ArrayList<alist>();
        num.add(ob1);
        num.add(ob2);
        num.add(ob3);
        for(alist temp : num)
        {
            System.out.print(temp.getnumber()+"\t");
        }
        System.out.println(num.size());
        System.out.println(num.get(1).getnumber());
        System.out.println(num.set(2,ob4).getnumber());
        System.out.println(num.set(0,new alist(35.0)).getnumber());
        for(alist temporary : num)
        {
            System.out.print(temporary.getnumber()+"\t");
        }
    }
}