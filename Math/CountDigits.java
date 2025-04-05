public class CountDigits {

    private static class Solution {
        static int evenlyDivides(int n) {
            int temp = n;
            int count = 0;

            while (temp != 0){
                if (temp % 10 != 0 && n % (temp % 10) == 0) count++;
                temp = temp / 10;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.evenlyDivides(20));
    }
}
