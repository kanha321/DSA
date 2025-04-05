// this program might not cover all edge cases as it was locked in leetcode so it has not been checked
public class ArmstrongNo {
    private static class Solution {
        public boolean isArmStrong(int x) {
            int temp = x;
            int expo = 0;
            int sum = 0;

            while (temp != 0){
                temp = temp / 10;
                expo++;
            }
            temp = x;
            while (temp != 0) {
                sum = sum + (int) Math.pow(temp % 10, expo);
                temp = temp / 10;
            }
            System.out.println("sum: " + sum + ", x: " + x);
            return sum == x;
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.isArmStrong(1));
    }
}
