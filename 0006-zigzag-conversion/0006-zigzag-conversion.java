class Solution {
    public String convert(String s, int numRows) {
     if(numRows==1) return s;
        StringBuilder[] sb=new StringBuilder[numRows];
        for(int i =0;i<numRows;i++){
            sb[i]=new StringBuilder();
        }
        
        int i =0;
        while(i<s.length()){
            for(int j=0;j<numRows && i<s.length();j++){
                sb[j].append(s.charAt(i++));
            }
            for(int j = numRows-2;j>0 && i < s.length();j--){
                sb[j].append(s.charAt(i++));

            }
        }
        StringBuilder comp = new StringBuilder();
        for(int j =0;j<numRows;j++) comp.append(sb[j]);
        
        return comp.toString();
    }
}