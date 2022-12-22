package DSA;

import java.util.*;
import java.util.Queue;

class pair{
    int hd;
    BNode node;
    public pair(int hd,BNode node){
        this.node=node;
        this.hd=hd;
    }

}
public class BinaryTree_TopView_BottomView {
    static ArrayList<Integer> topView(BNode root) {
        Queue<pair> q = new ArrayDeque<>();
        Map<Integer, Integer> m = new TreeMap<>();
        q.add(new pair(0,root));
        while(!q.isEmpty()){
            pair cur=q.poll();
            m.put(cur.hd,cur.node.data);//for the bottom view only
//            if(!m.containsKey(cur.hd)){
//                m.put(cur.hd,cur.node.data);
//            }
            if(cur.node.left!=null){
                q.add(new pair(cur.hd-1,cur.node.left));
            }
            if(cur.node.right!=null){
                q.add(new pair(cur.hd+1,cur.node.right));
            }
        }
        ArrayList<Integer>ar=new ArrayList<>();
        for (Map.Entry<Integer,Integer> e:m.entrySet()) {
            ar.add(e.getValue());
        }
        return ar;
    }
    static BNode create(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data:");
        int data=sc.nextInt();
        if(data==-1)
            return null;
        BNode root=new BNode(data);
        System.out.println("Enter left for:"+data);
        root.left=create();
        System.out.println("Enter right for:"+data);
        root.right=create();
        return root;
    }


    public static void main(String[] args) {
        BNode k=create();
        ArrayList<Integer> a =topView(k);
        for (int e:a) {
            System.out.print(e+" ");
        }

    }
}
