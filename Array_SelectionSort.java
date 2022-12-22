package DSA;

public class Array_SelectionSort {
    public static int[] ASS(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            if(min!=i){
                swap(a,min,i);
            }
        }
        return a;
    }
    public static void swap(int a[],int min,int i){
        int temp=a[min];
        a[min]=a[i];
        a[i]=temp;
    }

    public static void main(String[] args) {
        int a[]={1,5,2,7,3};
        int k[]=ASS(a);
        System.out.println("After sorting:");
        for(int i=0;i<k.length;i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
}
