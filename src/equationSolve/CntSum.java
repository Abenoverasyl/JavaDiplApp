
package equationSolve;

public class CntSum {
    double getSum(String s) {
        String sum = "";
        for (int i = s.length() - 1; i >= 0; --i) {
            if (s.charAt(i) == '=') break;
            sum = s.charAt(i) + sum;
        }
        return Double.parseDouble(sum);
    }
}
