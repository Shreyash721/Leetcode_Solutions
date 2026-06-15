class Solution {
    public double myPow(double x, int n) {
        long N = n;

        if (N < 0) {
            N = Math.abs(N);
            x = 1 / x;
        }

        return powerByRecusion(x, N);
    }

    public double powerByRecusion(double p, long q) {
        if(q==0) return 1;

        double half=powerByRecusion(p,q/2);

        if(q%2==0) return half*half;

        return half*half*p;
    }
}
        /*double pro = 1;
        long N = n;

        if (N < 0) {
            N = -N;
            x = 1 / x;
        }

        while (N > 0) {
            if (N % 2 == 1) {
                pro = pro * x;
            }
            x = x * x;       
            N = N / 2;        
        }

        return pro;
    }
}*/
    

    