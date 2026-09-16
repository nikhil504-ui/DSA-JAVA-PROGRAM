class Solution {
    public int commonFactors(int a, int b) {
      int gcd = gcd(a, b);
        int count = 0;
        
        for (int i = 1; i * i <= gcd; i++) {
            if (gcd % i == 0) {
                count++;
                if (i * i != gcd) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    private int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;  
            y = x % y;
            x = temp;
        }
        return x;
    }
}