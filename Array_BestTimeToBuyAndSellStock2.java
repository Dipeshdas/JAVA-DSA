package DSA;

public class Array_BestTimeToBuyAndSellStock2 {
    public static int BTS2(int a[]){
        int profit=0;
        for(int i=1;i<a.length;i++){
            if(a[i]>a[i-1]){
                profit+=(a[i]-a[i-1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int a[]={5,2,6,1,4,7,3,6};
        System.out.println(BTS2(a));

    }
}
