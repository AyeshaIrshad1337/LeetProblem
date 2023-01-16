class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0){
            return 0;
        }        
        int idx=0;
        int sign =1;
        
        if(s.charAt(idx)=='+' || s.charAt(idx)=='-'){
            if(s.charAt(idx)=='-'){
                sign=-1;
            }
            idx++;
        }
        int num =0;
        while(idx<s.length()){
            if(s.charAt(idx)<'0' || s.charAt(idx)>'9') break;
            if(num>Integer.MAX_VALUE/10 || (num==Integer.MAX_VALUE/10 && s.charAt(idx)-'0'> Integer.MAX_VALUE%10)){
                return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num=num*10+s.charAt(idx)-'0';
            idx++;
        }
        return num*sign;
    }
}