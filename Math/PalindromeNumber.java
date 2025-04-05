public class PalindromeNumber {

    static class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0) return false;
            
            int temp = x;
            long reverse = 0;
            while (temp != 0) {
                reverse = reverse * 10 + (temp % 10);
                temp = temp / 10;
            }
            if (x == reverse) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isPalindrome(1231));
    }
}
