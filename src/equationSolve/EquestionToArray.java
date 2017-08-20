
package equationSolve;

import java.util.ArrayList;

public class EquestionToArray {
    double[] convert(String s) {
        s = s.trim();
        ArrayList<Double> list = new ArrayList<Double>();
        if (s.charAt(0) == 'x') {
            list.add(1.0);
        }
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != 'x') {
                continue;
            }
            String strNum = "";
            for (int j = i - 1; j >= 0; --j) {
                if (s.charAt(j) == '+') {
                    if (strNum.length() == 0) {
                        strNum = "1.0";
                    }
                    list.add(Double.parseDouble(strNum));
                    strNum = "";
                    break;
                } else if (s.charAt(j) == '-') {
                    if (strNum.length() == 0) {
                        strNum = "1.0";
                    }
                    list.add(-Double.parseDouble(strNum));
                    strNum = "";
                    break;
                }
                strNum = s.charAt(j) + strNum;
            }
            if (strNum.length() > 0) {
                list.add(Double.parseDouble(strNum));
            }
        }
        double a[] = new double[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            a[i] = list.get(i);
        }
        return a;
    } 
}
