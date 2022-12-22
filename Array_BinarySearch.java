package DSA;

public class Array_BinarySearch {
    /*
    public static int BinarySearch(int a[],int key){
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==key){
                return mid;
            }
            else if(key<a[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
     */
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
        int a[]={-1,-2,3,4,5,6};
        System.out.println(BinarySearch(a,0,a.length-1,-1));
    }
}
