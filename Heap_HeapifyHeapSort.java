package DSA;

public class Heap_HeapifyHeapSort {
    public static void heapSort(int a[],int n){
        buildHeap(a,n);
        for(int i=n-1;i>=0;i--){
            swap(a,0,i);
            heapify(a,i,0);
        }
    }
    public static void heapify(int a[],int n,int i){
        int larger=i;
        int l=2*i;
        int r=2*i+1;
        if(l<n && a[l]>a[larger]){
            larger=l;
        }
        if(r<n && a[r]>a[larger]){
            larger=r;
        }
        if(larger!=i) {
            swap(a, i, larger);
            heapify(a, n, larger);
        }
    }
    public static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void buildHeap(int a[],int n){
        for(int i=n/2;i>=0;i--){
            heapify(a,n,i);
        }
    }
    public static void show(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }

    }
    public static void main(String[] args) {
        int a[]={10,20,50,60,40,30};
        int n=a.length;
        buildHeap(a,n);
        show(a,n);
        heapSort(a,n);
        System.out.println("After sort:");
        show(a,n);
    }
}
