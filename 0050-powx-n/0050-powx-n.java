class Solution {
    public double myPow(double x, int n) {
        double result = 1.0;
        long exponent = n;

        if (exponent < 0) {
            exponent = -exponent;
        }

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result *= x;
                exponent -= 1;
            }
            x *= x;
            exponent /= 2;
        }

        if (n < 0) {
            result = 1.0 / result;
        }

        return result;
    }
}
