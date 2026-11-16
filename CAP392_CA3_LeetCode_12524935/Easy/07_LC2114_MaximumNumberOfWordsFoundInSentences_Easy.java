// LeetCode Problem 2114
// Title: Maximum Number of Words Found in Sentences
// Difficulty: Easy

class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (int i = 0; i < sentences.length; i++) {
            int words = 1;
            String s = sentences[i];
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ' ') {
                    words++;
                }
            }
            if (words > maxWords) {
                maxWords = words;
            }
        }
        return maxWords;
    }
}