import java.math.*;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger n=new BigInteger(a,2);
        BigInteger m=n.add(new BigInteger(b,2));
        return m.toString(2);
    }
}