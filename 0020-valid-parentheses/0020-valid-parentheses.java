import java.util.*;
import java.io.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<Character>();
        for(int i =0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='{' || a=='['||a=='('){
                st.push(a);
            }else{
                if(st.empty()){return false;} 
                char b=st.peek();
                st.pop();
                
                if((  a==')'&&b=='(' )|| (a=='}'&&b=='{' )||( a==']'&&b=='[' ) ){
                    
                }else{
                    return false;
                }
            }
        }
        if(st.empty()==true)
            return true;
        else
            return false;
        
    }
}