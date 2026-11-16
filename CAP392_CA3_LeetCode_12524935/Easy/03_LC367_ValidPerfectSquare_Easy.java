// LeetCode Problem 367
// Title: Valid Perfect Square
// Difficulty: Easy

class Solution {
    public boolean isPerfectSquare(int num) {
        long i = 1;
        while (i * i <= num) {
            if (i * i == num) {
                return true;
            }
            i++;
        }
        return false;
    }
}