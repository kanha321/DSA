import java.util.Arrays;

public class GcdAndLcm {

    private static class Solution {
        public static int[] lcmAndGcd(int a, int b) {
            int first = Math.min(a, b);
            int second = Math.max(a, b);
            int remainder = 0;

            while(first != 0) {
                remainder = second % first;
                second = first;
                first = remainder;
            }
            return new int[]{a/second * b, second};
        }

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.lcmAndGcd(6, 9)));
    }
}
