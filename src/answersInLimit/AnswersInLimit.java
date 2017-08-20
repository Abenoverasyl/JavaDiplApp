
package answersInLimit;

import answermaker.AnswersMaker;
import limit.Limit;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import checker.InputsChecker;
import converter.Convert;

public class AnswersInLimit extends javax.swing.JFrame {
    InputsChecker inputsChecker = new InputsChecker();
    Convert convert = new Convert();
    public AnswersInLimit() {
        initComponents();
        setSize(516, 680);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        left = new javax.swing.JTextField();
        right = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Limits:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(69, 84, 45, 31);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(186, 36, 90, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantity of x:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(69, 36, 95, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("sum:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 40, 40, 30);

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(340, 40, 103, 30);

        jButton1.setText("submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(353, 330, 100, 33);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setText("Result:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 370, 77, 33);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("______________________________________");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 400, 380, 29);

        Table.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "index", "left", "right"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Table);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(70, 160, 383, 145);

        left.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftActionPerformed(evt);
            }
        });
        getContentPane().add(left);
        left.setBounds(130, 90, 77, 30);

        right.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightActionPerformed(evt);
            }
        });
        getContentPane().add(right);
        right.setBounds(230, 90, 69, 30);

        jButton2.setText("Add limit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(319, 84, 130, 37);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(92, 128, 275, 16);

        jLabel7.setForeground(new java.awt.Color(0, 153, 255));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 330, 310, 28);

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(352, 602, 100, 30);

        jList2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jScrollPane3.setViewportView(jList2);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(69, 435, 383, 149);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/answersInLimit/XQ208A.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 510, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String stringSumX = jTextField3.getText();
        String stringSum = jTextField4.getText();
        jLabel7.setText("");
        if (inputsChecker.checkData(1, stringSumX, stringSum)) {
            int sumX = convert.toInteger(stringSumX);
            int sum = convert.toInteger(stringSum);
            String equation = "";
            for (int i = 1; i < sumX; ++i) {
                equation = equation + "X" + i + " + ";
            }
            equation = equation + "X" + sumX + " = " + sum;
            jLabel5.setText(equation);
            DefaultTableModel model = (DefaultTableModel) Table.getModel();
            ArrayList<Limit> limitList = new ArrayList<>();
            for (int i = 0; i < model.getRowCount(); i++) {
                String l = ("" + model.getValueAt(i, 1)).replace(" ", "");
                String r = ("" + model.getValueAt(i, 2)).replace(" ", "");
                if (l.length() == 0 && r.length() == 0) {
                    limitList.add(new Limit(0, sumX, true));
                    limitList.add(new Limit(0, sumX, true));
                    continue;
                }
                limitList.add(new Limit(Integer.parseInt(l), Integer.parseInt(r), true));
            }
            AnswersMaker answerMaker = new AnswersMaker(sum, sumX, limitList);
            DefaultListModel dlm = answerMaker.getAnswers();
            if (dlm.size() == 0) {
                dlm.addElement("Not answer!");
            }
            jList2.setModel(dlm);
        } else {
            jLabel7.setText("sum of X or sum non correct!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rightActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String lef = left.getText();
        String rig = right.getText();
        jLabel6.setText("");
        if (inputsChecker.checkData(0, lef, rig)) {
            DefaultTableModel model = (DefaultTableModel) Table.getModel();
            if (model.getRowCount() < Integer.parseInt(jTextField3.getText().trim())) {
                model.addRow(new Object[]{model.getRowCount() + 1 + "", lef, rig});
            }
        } else {
            jLabel6.setText("Limit(s) are non correct!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jLabel6.setText("");
        jLabel7.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        left.setText("");
        right.setText("");
        jLabel5.setText("");
        jList2.setModel(new DefaultListModel<>());
        Table.clearSelection();
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void leftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leftActionPerformed

    public static void getAnswersInsideLimit() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnswersInLimit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnswersInLimit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnswersInLimit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnswersInLimit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnswersInLimit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField left;
    private javax.swing.JTextField right;
    // End of variables declaration//GEN-END:variables
}
