import java.util.*;
class sort 
{
    int n; 
    int a[];
    String nu;
    sort(int nn) { n=nn; a=new int[n]; nu=""; }
    void accept() { Scanner ob = new Scanner(System.in); for(int i=0;i<n;i++) { System.out.println("Enter number "+(i+1)); a[i]=ob.nextInt(); nu=nu+a[i]; } System.out.println(nu); } int max(int m) { int maxi=0; for(int i=0;i<n;i++) { if(a[i]>maxi && a[i]<m) maxi = a[i]; } return maxi; } int index(int num) { int b=0; String na = String.valueOf(num); for(int i=0;i<nu.length();i++) { if(nu.charAt(i)==na.charAt(0)) b=i; } return b; } void change() { int mid=n/2; int t=a[mid]; a[mid]=max(1000); a[index(a[mid])]=t; int maximum = a[mid]; for(int i=1;i<=(n/2);i++) { if((mid+i)<n) { t=a[mid+i]; a[mid+i]=max(maximum); a[index(a[mid+i])]=t; maximum=a[mid+i]; } if((mid-i)>-1) { t=a[mid-i]; a[mid-i]=max(maximum); a[index(a[mid-i])]=t; maximum=a[mid-i]; } } } void display() { for(int i=0;i<n;i++) { System.out.print(a[i]); } } public static void main(String args[]) { Scanner ob = new Scanner(System.in); System.out.println("Enter the length of the array"); int nn=ob.nextInt(); sort obj = new sort(nn); obj.accept(); obj.change(); obj.display(); } }