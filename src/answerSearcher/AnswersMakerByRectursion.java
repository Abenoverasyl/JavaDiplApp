
package answerSearcher;

import javax.swing.DefaultListModel;
import converter.Convert;

public class AnswersMakerByRectursion {
    
    DefaultListModel dlm = new DefaultListModel();
    public DefaultListModel getAnswersByDefaultListModel(int v, int sum, int sumX) {
        int a[] = new int[sumX + 10];
        long startTime = System.currentTimeMillis();
        rec(0, sum, a, sumX);
        long endTime = System.currentTimeMillis();
        dlm.addElement("time: " + ((endTime - startTime)*1.0/(2.0*100)) + " ms");
        return dlm;
    }
    
    void rec(int v, int curSum, int[] a, int n) {
        int ansArray[] = new int[n];
        if (curSum == 0) {
            for (int i = 0; i < v; i++) {
                ansArray[i] = a[i];
            }
            Convert conv = new Convert();
            String tmpAns = conv.ArraysToString(ansArray);
            dlm.addElement(tmpAns);
            return;
        }
        if (v == n) {
            return;
        }
        for (int i = 0; i <= curSum; i++) {
            a[v] = i;
            rec(v + 1, curSum - i, a, n);
        }
    }
}
