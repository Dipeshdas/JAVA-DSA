package DSA;

public class Array_QuickSort {
    public static void quicksort(int a[],int l,int h){
        if(l<h){
            int pivot=partition(a,l,h);
            quicksort(a,l,pivot-1);
            quicksort(a,pivot+1,h);
        }
    }
    public static int partition(int a[],int l,int h){
        int pivot=a[l];
        int i=l;
        int j=h;
        while(i<j){
            while(a[i]<=pivot){
                i++;
            }
            while(a[j]>pivot){
                j--;
            }
            if(i<j){
                swap(a,i,j);
            }
        }
        swap(a,j,l);
        return j;

    }
    public static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String[] args) {
        int a[]={2,1,5,4,6,3,70,20,10,15};
        quicksort(a,0,a.length-1);
        System.out.println("After sorting:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
}
