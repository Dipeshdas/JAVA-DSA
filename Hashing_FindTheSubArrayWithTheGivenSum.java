package DSA;

import java.util.HashMap;

public class Hashing_FindTheSubArrayWithTheGivenSum {
    public static void FSA(int a[],int sum){
        int curSum=0;
        int start=0;
        int end=-1;
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<a.length;i++){
            curSum+=a[i];
            if(curSum-sum ==0){
                start=0;
                end=i;
                break;
            }
            if(m.containsKey(curSum-sum)){
                start=m.get(curSum-sum)+1;
                end=i;
                break;
            }
            m.put(curSum,i);
        }
        if(end==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println(start+","+end);
        }
    }
    public static void main(String[] args) {
        int a[]={10,15,-5,15,-10,5};
        FSA(a,5);
    }
}
