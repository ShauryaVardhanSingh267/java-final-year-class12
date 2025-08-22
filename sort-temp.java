import java.util.*; 

// Class to perform sorting and manipulation of an array
class sort { 
    int n; // length of the array
    int a[]; // array to store integers
    String nu; // string to store concatenated array elements

    // Constructor to initialize the array length
    sort(int nn) { 
        n=nn; 
        a=new int[n]; 
        nu=""; 
    }

    // Method to accept array elements from user input
    void accept() { 
        Scanner ob = new Scanner(System.in);
        for(int i=0;i<n;i++) { 
            System.out.println("Enter number "+(i+1));
            a[i]=ob.nextInt(); 
            nu=nu+a[i]; // concatenate array elements into a string
        }
        System.out.println(nu); // print the concatenated string
    }

    // Method to find the maximum element in the array less than a given number
    int max(int m) { 
        int maxi=0; 
        for(int i=0;i<n;i++) { 
            if(a[i]>maxi && a[i]<m) 
                maxi = a[i]; 
        }
        return maxi; 
    }

    // Method to find the index of a number in the concatenated string
    int index(int num) { 
        int b=0; 
        String na = String.valueOf(num); 
        for(int i=0;i<nu.length();i++) { 
            if(nu.charAt(i)==na.charAt(0)) 
                b=i; 
        }
        return b; 
    }

    // Method to manipulate the array by replacing elements with maximum values
    void change() { 
        int mid=n/2; 
        int t=a[mid]; 
        a[mid]=max(1000); // replace middle element with maximum value less than 1000
        a[index(a[mid])]=t; // swap elements

        int maximum = a[mid]; 
        for(int i=1;i<=(n/2);i++) { 
            if((mid+i)<n) { 
                t=a[mid+i]; 
                a[mid+i]=max(maximum); // replace element with maximum value less than current maximum
                a[index(a[mid+i])]=t; 
                maximum=a[mid+i]; 
            }
            if((mid-i)>-1) { 
                t=a[mid-i]; 
                a[mid-i]=max(maximum); // replace element with maximum value less than current maximum
                a[index(a[mid-i])]=t; 
                maximum=a[mid-i]; 
            }
        }
    }

    // Method to display the modified array
    void display() { 
        for(int i=0;i<n;i++) { 
            System.out.print(a[i]); 
        }
    }

    public static void main(String args[]) { 
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int nn=ob.nextInt(); 
        sort obj = new sort(nn); 
        obj.accept(); 
        obj.change(); 
        obj.display(); 
    }
}