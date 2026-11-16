// LeetCode Problem 69
// Title: Sqrt(x)
// Difficulty: Easy

class Solution {
    public int mySqrt(int x) {
        long i = 0;
        while (i * i <= x) {
            i++;
        }
        return (int) (i - 1);
    }
}