/*
package com.company;
public class Bit_Manipulation {
               FIND ONE NON-REPEATING ELEMENT IN THIS ARRAY-->

      static int find (int arr[],int arr_size){
          int res=arr[0];
          for (int i=1; i<arr_size;i++)
              res = res ^ arr[i];
          return res;
      }

    public static void main(String[] args) {
	// write your code here
        int arr[]={5,4,1,4,3,5,1};
        int n= arr.length;
        System.out.println("Element occurs only once :"+ find(arr,n) + "");
    }
}
         */

/*          FIND THE TWO NON-REPEATING ELEMENT IN THIS ARRAY-->
package com.company;
public class Bit_Manipulation {
    public static void findTwo(int arr[],int arr_size){
        int res=arr[0];
        for (int i=1; i<arr_size;i++) {
            res = res ^ arr[i];
        }
        res=(res & -res);

        int res1=0;
        int res2=0;
        for (int i=0;i< arr.length;i++){
            if ((arr[i] & res)>0){
                res1= (res1 ^ arr[i]);
            }
            else {
                res2= (res2 ^ arr[i]);
            }
        }
        System.out.println("The Two Non-Repeating Elements are: "+ res1 +" and "+res2);
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,4,3,5,1,2};
        int n= arr.length;
        findTwo(arr,n);
    }
}
 */
                    //FIND THE ONLY NON-REPEATING ELEMENT IN AN ARRAY WHERE EVERY OTHER ELEMENTS REPEAT THRICE(OR K times)-->
package DSA;
public class Bit_Manipulation {
    static int findNum(int arr[],int n, int k){
        byte sizeof_int =4;
        int INT_SIZE =8* sizeof_int;
        int count[]=new int[INT_SIZE];
        for (int i=0;i<INT_SIZE;i++)
            for (int j=0;j<n;j++)
                if ((arr[j] & 1<<i) != 0)
                    count[i]+=1;

        int res=0;
        for (int i=0;i<INT_SIZE;i++)
            res +=(count[i] %k) *(1<<i);
        res=res/(n%k);
        return res;
    }
    public static void main(String[] args) {
        int arr[]={2,2,1,5,1,1,2};
        int n= arr.length;
        int k=3;
        System.out.println("ONLY NON-REPEATING ELEMENT IS :"+findNum(arr,n,k));
    }
}