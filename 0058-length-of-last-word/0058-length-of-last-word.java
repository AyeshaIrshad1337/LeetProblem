class Solution {
    public int lengthOfLastWord(String s) {
     String test = s.trim();
        char[] ch = test.toCharArray();
        int cnt=0;
        for (int i = ch.length-1;i>=0;i--){
            cnt++;
            if(ch[i]==' '){
                return cnt-1;
            }
        }
        return cnt;
    }
}