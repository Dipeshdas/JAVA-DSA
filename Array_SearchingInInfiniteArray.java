package DSA;

public class Array_SearchingInInfiniteArray {
    public static int SIFA(int a[],int key){
        int low=0;
        int high=1;
        while(a[high]<key){
            low=high;
            high=2*high;
        }
        return BinarySearch(a,low,high,key);
    }
    public static int BinarySearch(int a[],int l,int h,int key){
        if(l>h){
            return -1;
        }
        int mid=(l+h)/2;
        if(a[mid]==key){
            return mid;
        }
        if(key>a[mid]){
            return BinarySearch(a,mid+1,h,key);
        }
        else{
            return BinarySearch(a,l,mid-1,key);
        }
    }
    public static void main(String[] args) {
        int a[]={1,3,6,50,300,400,500,550,790};
        System.out.println(SIFA(a,500));
    }
}
