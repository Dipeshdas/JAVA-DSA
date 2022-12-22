package DSA;

public class Array_InsertionSort {
    public static int[] AIS(int a[]){
        int n=a.length;
        for(int i=1;i<n;i++){
            int temp=a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        return a;

    }

    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        int k[]=AIS(a);
        System.out.println("After sorting:");
        for(int i=0;i<k.length;i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
}
