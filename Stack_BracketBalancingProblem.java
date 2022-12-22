package DSA;
import java.util.*;
public class Stack_BracketBalancingProblem {
    public static boolean BBP(String str){
        Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char cur=str.charAt(i);
            if(isOpening(cur)){
                s.push(cur);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                else if(!isMatching(s.peek(),cur)){
                    return false;
                }
                else{
                    s.pop();
                }
            }
        }
        return s.isEmpty();
    }
    public static boolean isOpening(char c){
        return c=='(' || c=='{' ||c=='[';
    }
    public static boolean isMatching(char a, char b){
        return (a=='(' && b==')')||
                (a=='{' && b=='}')||
                (a=='[' && b==']');
    }


    public static void main(String[] args) {
        String str="{}(";
        System.out.println(BBP(str));
    }
}
