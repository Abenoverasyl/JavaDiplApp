
package equationSolve;

import javax.swing.DefaultListModel;

public class Equation {
    DefaultListModel dlm = new DefaultListModel();
    public DefaultListModel getAns(String s) {
         
        EquestionToArray eqToArr = new EquestionToArray();
        CntSum cnter = new CntSum();
        
        double a[] = eqToArr.convert(s);
        double sum = cnter.getSum(s);
        int to = (int)sum*10;
        if (to < 0) to *= -1;
        switch(a.length) {
            case 1: 
                dlm.addElement((int)to/(int)a[0]);
            break;
            case 2:
                for (int i = 0; i <= to; ++i) {
                    for (int j = 0; j <= to; ++j) {
                        if (Math.abs(sum - (a[0]*i + a[1]*j)) < 0.01) {
                            dlm.addElement("( " + i + ", " + j + " )");
                        }
                    }
                }
            break;
            case 3:
                for (int i = 0; i <= to; ++i) {
                    for (int j = 0; j <= to; ++j) {
                        for (int k = 0; k <= to; ++k) {
                            if (Math.abs(sum - (a[0]*i + a[1]*j + a[2]*k)) < 0.01) {
                                dlm.addElement("( " + i + ", " + j + ", " + k + " )");
                            }
                        }
                    }
                }
            break;
            case 4:
                for (int i = 0; i <= to; ++i) {
                    for (int j = 0; j <= to; ++j) {
                        for (int k = 0; k <= to; ++k) {
                            for (int l = 0; l < to; ++l) {
                                if (Math.abs(sum - (a[0]*i + a[1]*j + a[2]*k + a[3]*l)) < 0.01) {
                                    dlm.addElement("( " + i + ", " + j + ", " + k + ", " + l + " )");
                                }
                            }
                        }
                    }
                }
            break;
            case 5:
                for (int i = 0; i <= to; ++i) {
                    for (int j = 0; j <= to; ++j) {
                        for (int k = 0; k <= to; ++k) {
                            for (int l = 0; l < to; ++l) {
                                for (int m = 0; m < to; ++m) {
                                    if (Math.abs(sum - (a[0]*i + a[1]*j + a[2]*k + a[3]*l + a[4]*m)) < 0.01) {
                                        dlm.addElement("( " + i + ", " + j + ", " + k + ", " + l + " )");
                                    }
                                }
                            }
                        }
                    }
                }
            break;
            case 6:
                for (int i = 0; i <= to; ++i) {
                    for (int j = 0; j <= to; ++j) {
                        for (int k = 0; k <= to; ++k) {
                            for (int l = 0; l < to; ++l) {
                                for (int m = 0; m < to; ++m) {
                                    for (int n = 0; n < to; ++n) {
                                        if (Math.abs(sum - (a[0]*i + a[1]*j + a[2]*k + a[3]*l + a[4]*m + a[5]*n)) < 0.01) {
                                            dlm.addElement("( " + i + ", " + j + ", " + k + ", " + l + ", " + n + " )");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            break;
        }
        return dlm;
    }
}
