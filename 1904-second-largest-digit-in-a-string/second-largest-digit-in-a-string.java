class Solution {
    public int secondHighest(String s) {
        int firstMax = -1;
        int secondMax = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                int digit = ch - '0';

                if (digit > firstMax) {
                    secondMax = firstMax;
                    firstMax = digit;
                } else if (digit < firstMax && digit > secondMax) {
                    secondMax = digit;
                }
            }
        }

        return secondMax;
    }
}


        
  
