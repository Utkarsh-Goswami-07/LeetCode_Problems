class Solution {
    public char processStr(String s, long k) {

        // Step 1: Compute final length
        long len = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                len++;
            } else if (ch == '*') {
                if (len > 0)
                    len--;
            } else if (ch == '#') {
                len *= 2;
            }
            // '%' (reverse) does not change length
        }

        // Check if k is valid (0-based indexing)
        if (k < 0 || k >= len)
            return '.';

        // Step 2: Traverse backwards
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (Character.isLowerCase(ch)) {
                if (k == len - 1)
                    return ch;
                len--;
            }
            else if (ch == '*') {
                len++;
            }
            else if (ch == '#') {
                long oldLen = len / 2;
                k %= oldLen;
                len = oldLen;
            }
            else { // '%'
                k = len - 1 - k;
            }
        }

        return '.';
    }
}