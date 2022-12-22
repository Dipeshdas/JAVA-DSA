package DSA;

public class Array_MergeSort {
    public static int [] mergeSort(int a[],int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(a,l,mid);
            mergeSort(a,mid+1,r);
            merge(a,l,mid,r);
        }
        return a;
    }
    public static void merge(int a[],int l,int mid,int r){
        int b[]=new int[a.length];
        int i=l;
        int j=mid+1;
        int k=l;
        while(i<=mid && j<=r){
            if(a[i]<a[j]){
                b[k]=a[i];
                i++;
            }
            else{
                b[k]=a[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=r){
                b[k]=a[j];
                k++;j++;
            }
        }
        else{
            while(i<=mid){
                b[k]=a[i];
                k++;i++;
            }
        }
        for(k=l;k<=r;k++){
            a[k]=b[k];
        }
    }

    public static void main(String[] args) {
        int a[]={4,6,2,5,7,9,1,3};
        int k[]=mergeSort(a,0,a.length-1);
        System.out.println("After sorting:");
        for(int i=0;i<k.length;i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
}
