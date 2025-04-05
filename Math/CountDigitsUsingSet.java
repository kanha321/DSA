import java.util.HashSet;
import java.util.Set;

public class CountDigitsUsingSet {

    private static class Solution {
        static int evenlyDivides(int n) {
            int [] count = {0};
            int temp = n;
            Set<Integer> set = new HashSet<>();
            while (temp != 0) {
                int digit = temp % 10;
                temp = temp / 10;
                set.add(digit);
            }

            set.forEach(it -> {
                if (n % it == 0) count[0]++;
            });

            return count[0];
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.evenlyDivides(20));
    }
}
