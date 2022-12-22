package DSA;

import java.util.Scanner;

public class Heap_InsertDelete {
    public static int Insert(int a[],int n,int e){
        n=n+1;
        a[n]=e;
        int i=n;
        while(i>1) {
            int parent = i / 2;
            if (a[i] > a[parent]) {
                swap(a, i, parent);
                i = parent;
            }
            else{
                break;
            }
        }
        return n;
    }
    public static int delete(int a[],int n){
        a[1]=a[n];
        n=n-1;
        int i=1;
        while(i<n){
            int l=2*i;
            int r=2*i+1;
            int left=a[2*i];
            int right=a[2*i+1];
            int larger;
            if(l>n && r>n){
                break;
            }
            if(left>right){
                 larger=2*i;
            }else{
                larger=2*i+1;
            }
            if(a[i]<a[larger]){
                swap(a,i,larger);
                i=larger;
            }
            else{
                break;
            }
        }
        return n;
    }
    public static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void show(int a[],int n){
        for(int i=1;i<=n;i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=100;
        int a[]=new int[max];
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        System.out.println("Enter the array element");
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }
        int k=Insert(a,n,10);
        show(a,k);
        System.out.println();
        int m=delete(a,k);
        show(a,m);


    }
}
