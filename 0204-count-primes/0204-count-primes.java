/*class Solution {
    public int countPrimes(int n) {
        if (n<10) return 0;
        int c = 1, d = 0;
        for (int i = 2; i < n; i++) {
            c = 1;
            for (int j = 2;j*j<=i;j++) {
                if (i%j==0) {
                    c++;
                    break;
                }
            }
            if (c == 1) d++;
        }

        return d;
    }
}*/
class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;

        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }

        return count;
    }
}