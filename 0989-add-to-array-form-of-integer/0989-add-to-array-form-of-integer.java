class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
     List<Integer> res = new ArrayList<>();
     int i =num.length-1;
        int carry=0;
        while(i>=0 || k > 0){
            int  dig1= i>=0 ? num[i] : 0;
            int dig2=k%10;
            int sum = dig1+dig2+carry;
            res.add(0,sum%10);
            carry=sum/10;
            i--;
            k/=10;
            
        }
        if(carry!=0){
            res.add(0,carry);
        }
    return res;
    }
}