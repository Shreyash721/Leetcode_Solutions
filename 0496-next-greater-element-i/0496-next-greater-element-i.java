class Solution {
    public int[] nextGreaterElement(int[] n1, int[] n2) {
        int[] arr = new int[n1.length];

        for (int i = 0; i < n1.length; i++) {
            int m = n1[i];
            arr[i] = -1;
            for (int j = 0; j < n2.length; j++) {
                if (n2[j] == m) {
                    for (int k = j + 1; k < n2.length; k++) {
                        if (n2[k] > m) {
                            arr[i] = n2[k];
                            break;
                        }
                    }

                    break;
                }
            }
        }

        return arr;
    }
}