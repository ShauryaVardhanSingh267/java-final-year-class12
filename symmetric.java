import java.util.*;
class symmetric
{
    static Scanner ob = new Scanner(System.in);
    int M;
    int A[][];
    symmetric(int MM)
    {
        M=MM;
        A=new int[M][M];
    }
    void accept()
    {
        System.out.println("Enter the elements in the matrix");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
               A[i][j]=ob.nextInt(); 
            }
        }
    }
    void check()
    {
        int f=0;
        int pd=0,sd=0;
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(A[i][j]!=A[j][i])
                {
                    f=1;
                }
                if(i==j)
                pd=pd+A[i][j];
                if(i+j==(M-1))
                sd=sd+A[i][j];
            }
        }
        if(f==1)
        System.out.println("Not a Symmetric Matrix");
        else 
        System.out.println("Symmetric Matrix");
        System.out.println("Sum of terms of primary diagonal = "+pd);
        System.out.println("Sum of terms of secondary diagonal = "+sd);
    }
    void display()
    {
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
               System.out.print(A[i][j]); 
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        System.out.println("Enter a value for M");
        int MM=ob.nextInt();
        if(MM>=50||MM<=0)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        symmetric obj = new symmetric(MM);
        obj.accept();
        obj.display();
        obj.check();
    }
}