package DSA;
import java.util.*;
import java.util.Queue;

public class QueueUsingLibraryFunction {
    public static void main(String[] args) {
        Queue<Integer> m=new ArrayDeque<>();
        //Queue<Integer>l=new LinkedList<>();
        m.offer(10);
        m.offer(20);
        System.out.println(m.size());
        while(!m.isEmpty()){
            System.out.println(m.peek());
            m.poll();
        }

    }
}
