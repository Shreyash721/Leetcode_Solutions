class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int j = i;
            int len = 0;

            while (j < words.length && len + words[j].length() + (j - i) <= maxWidth) {
                len += words[j].length();
                j++;
            }

            int n = j - i;
            int spaces = maxWidth - len;
            StringBuilder s = new StringBuilder();

            if (j == words.length || n == 1) {
                for (int k = i; k < j; k++) {
                    s.append(words[k]);
                    if (k != j - 1) s.append(" ");
                }
                while (s.length() < maxWidth) s.append(" ");
            } else {
                int gap = spaces / (n - 1);
                int extra = spaces % (n - 1);

                for (int k = i; k < j; k++) {
                    s.append(words[k]);

                    if (k != j - 1) {
                        int cnt = gap;
                        if (extra > 0) {
                            cnt++;
                            extra--;
                        }

                        while (cnt-- > 0) s.append(" ");
                    }
                }
            }

            ans.add(s.toString());
            i = j;
        }

        return ans;
    }
}
