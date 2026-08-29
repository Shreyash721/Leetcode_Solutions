class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> set = new HashSet<>(dictionary);
        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();

        for (String word : words) {
            String replacement = word;

            for (int i = 1; i <= word.length(); i++) {
                String prefix = word.substring(0, i);

                if (set.contains(prefix)) {
                    replacement = prefix;
                    break;
                }
            }

            if (ans.length() > 0) {
                ans.append(" ");
            }

            ans.append(replacement);
        }

        return ans.toString();
    }
}