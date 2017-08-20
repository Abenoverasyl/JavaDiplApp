
package dinamicSum;

public class SumAnswersByDinamic {
    
    int cnt(int s, int n) {
        int c[][] = new int[n + s + 10][n + s + 10];
        c[0][0] = 1;
        for (int i = 1; i <= n+s-1; i++) {
            c[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                c[i][j] = c[i-1][j] + c[i-1][j-1];
            }
        }
        return c[n+s-1][n];
    }
    public static long cntFormula(long n, long k) {
        return factorial(n + k - 1) / (factorial(k) * factorial(n - 1));
    }
    public static long factorial(long n) {
        long fact = 1; // this  will be the result
        for (long i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
