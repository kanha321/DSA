public class ReverseNumber {

    private static class Solution {
        public int reverse(int x) {
            int temp = x;
            long reverse = 0;
            while (temp != 0) {
                reverse = reverse * 10 + (temp % 10);
                temp = temp / 10;
            }
            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) return 0;
            else return (int) reverse;
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.reverse(Integer.MIN_VALUE));
    }
}
