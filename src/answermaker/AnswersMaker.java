package answermaker;

import limit.Limit;
import converter.Convert;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import checker.InputsChecker;

public class AnswersMaker {
    
    int sumX, sum;
    ArrayList<Limit> limit;
    DefaultListModel dlm = new DefaultListModel();
    
    public AnswersMaker(int sum, int sumX, ArrayList<Limit> limit) {
        this.sum = sum;
        this.sumX = sumX;
        this.limit = limit;
    }
    
    public DefaultListModel getAnswers() {
        int a[] = new int[sumX];
        makeAnswer(0, sum, a);
        return dlm;
    }
    
    void makeAnswer(int v, int curSum, int[] a) {
        int ans[] = new int[sumX];
        if (curSum == 0) {
            System.arraycopy(a, 0, ans, 0, v);
            boolean isAnswer = true;
            InputsChecker check = new InputsChecker();
            for (int i = 0; i < sumX; ++i) {
                if (!check.validInLimit(ans[i], limit.get(i))) {
                    isAnswer = false;
                    break;
                }
            }
            if (isAnswer) {
                Convert conv = new Convert();
                String tmpAns = conv.ArraysToString(ans);
                dlm.addElement(tmpAns);
            }
            return;
        }
        if (v == sumX) {
            return;
        }
        for (int i = 0; i <= curSum; i++) {
            a[v] = i;
            makeAnswer(v + 1, curSum - i, a);
        }
    }
}
