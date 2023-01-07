public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length();


        final byte[] countTemplate = new byte[]{
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
                -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
        };


        final byte[] strBytes = s.getBytes();
        int endPos = 0, startPos = 0, max = 1;

        countTemplate[strBytes[0]-32]=1;
        int size=1;

        for(endPos = 1; endPos<s.length(); endPos++){
            while(countTemplate[strBytes[endPos]-32]==1){
                countTemplate[strBytes[startPos]-32]=-1;
                size--;
                startPos++;
            }

            countTemplate[strBytes[endPos]-32]=1;
            size++;
            max = Math.max(max, size);
        }

        return max;
    }
}