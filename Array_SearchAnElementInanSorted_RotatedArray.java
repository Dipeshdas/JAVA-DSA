package DSA;

public class Array_SearchAnElementInanSorted_RotatedArray {
    public static int b_search(int a[],int key){
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(key==a[mid])
                return mid;
            if(a[low]<a[mid]){
                if(key>=a[low] && key<a[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else {
                if (key > a[mid] && key <= a[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={50,60,90,100,20,30,40};
        System.out.println(b_search(a,20));

    }
}
