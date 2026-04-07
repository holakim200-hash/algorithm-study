class Solution {
    public int[] solution(int n, int m) {
        int gcd = getGCD(n,m);
        int lcm = (m*n)/gcd;
        
        return new int[]{gcd, lcm};
    }
    
    private int getGCD(int n, int m) {
        
        while (n != 0) {
            int temp = n;
            n = m%n;
            m = temp;
        }
        return m;
    }
}
