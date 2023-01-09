class Solution {
    int resultStart, resultLength;
    public String longestPalindrome(String s) {
        if(s==null) return "";
        int len=s.length();
        if(len<2) return s;
        for (int i =0;i<len-1;i++){
            expand(s,i,i);
            expand(s,i,i+1);
        }
        return s.substring(resultStart,resultStart+resultLength);
    }
    private void expand(String s,int start,int end){
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        if(resultLength<end-start-1){
            resultStart=start+1;
            resultLength=end-start-1;
        }
    }
}