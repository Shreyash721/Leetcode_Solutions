
import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return result;
        }

        String[] phone = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(digits, 0, new StringBuilder(), result, phone);

        return result;
    }

    private void backtrack(String digits, int index,
                           StringBuilder current,
                           List<String> result,
                           String[] phone) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = phone[digits.charAt(index) - '0'];

        for (char c : letters.toCharArray()) {
            current.append(c);

            backtrack(digits, index + 1, current, result, phone);

            current.deleteCharAt(current.length() - 1);
        }
    }
}
