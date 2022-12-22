package DSA;

public class Array_BubbleSort {
    public static int[] ABS(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            boolean swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(a[j+1]<a[j]) {
                    swapped=true;
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
            if(!swapped){
                break;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a[]={1,5,2,7,3};
        int k[]=ABS(a);
        System.out.println("After sorting:");
        for(int i=0;i<k.length;i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
}
