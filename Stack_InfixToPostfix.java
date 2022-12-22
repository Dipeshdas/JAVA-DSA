package DSA;
import java.util.*;
public class Stack_InfixToPostfix {
    public static int precedence(char c){
        if(c=='^'){
            return 3;
        }
        else if (c=='*' || c=='/') {
            return 2;
        }
        else if(c=='+'||c=='-'){
            return 1;
        }
        else{
            return -1;
        }
    }
    public static String InfixtoPostfix(String s){
        String res="";
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                res+=c;
            }
            else if (c == '(') {
                st.push(c);
            }
            else if(c==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    res+=st.peek();
                    st.pop();
                }
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                while(!st.isEmpty() && precedence(st.peek())>precedence(c)){
                    res+=st.peek();
                    st.pop();
                }
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            res+=st.peek();
            st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        String s="a+(b-c)*d";
        String k=InfixtoPostfix(s);
        System.out.println(k);
    }
}
