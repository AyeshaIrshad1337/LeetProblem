class Solution {
    public int reverse(int x) {
        try{
            String s = Integer.toString(x);
            if(x<0) s=s.substring(1);
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            int result=Integer.parseInt(sb.toString());
            if(x<0) result=-result;
            return result;
        }catch(NumberFormatException e){
            return 0;
        }
    }
}