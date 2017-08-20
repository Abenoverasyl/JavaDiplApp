
package equationWithMoreConditions;

import answermaker.AnswersMaker;
import checker.InputsChecker;
import converter.Convert;
import limit.Limit;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class equationWithMoreConditions extends javax.swing.JFrame {
    InputsChecker inputsChecker = new InputsChecker();
    Convert convert = new Convert();
    public equationWithMoreConditions() {
        initComponents();
        setResizable(false);
        setSize(820, 438);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        left = new javax.swing.JTextField();
        right = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Limits:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(28, 92, 60, 23);

        jTextField3.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(141, 18, 90, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantity of x:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(31, 18, 100, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("sum:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(253, 18, 50, 30);

        jTextField4.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(311, 20, 100, 30);

        jButton1.setText("submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(289, 348, 120, 33);

        jList1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(450, 90, 360, 290);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Result:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(450, 20, 70, 32);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(449, 57, 340, 23);

        Table.setFont(new java.awt.Font("Book Antiqua", 1, 10)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "index", "left", "right", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
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
        jScrollPane2.setBounds(28, 183, 383, 147);

        left.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        getContentPane().add(left);
        left.setBounds(100, 85, 77, 30);

        right.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightActionPerformed(evt);
            }
        });
        getContentPane().add(right);
        right.setBounds(190, 85, 76, 30);

        jButton2.setText("Add limit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(291, 142, 120, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inside", "outside" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(319, 85, 92, 30);

        jLabel6.setText("Integer number between (1 - 20)");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(151, 57, 241, 14);

        jLabel7.setText("Integer number between (1 - 20)");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 120, 241, 14);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(28, 348, 300, 33);

        jLabel9.setForeground(new java.awt.Color(51, 204, 0));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(28, 149, 292, 23);

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(691, 19, 98, 32);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/start/blue.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 420, 410);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/start/white.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(420, 0, 400, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String stringSumX = jTextField3.getText();
        String stringSum = jTextField4.getText();
        if (inputsChecker.checkData(1, stringSumX, stringSum)) {
            int sumX = convert.toInteger(stringSumX);
            int sum = convert.toInteger(stringSum);
            String equation = "";
            for (int i = 1; i < sumX; ++i) {
                equation = equation + "X" + i + " + ";
            }
            equation = equation + "X" + sumX + " = " + sum;
            jLabel5.setText(equation);
            ArrayList<Limit> limitList = new ArrayList<>();
            DefaultTableModel model = (DefaultTableModel) Table.getModel();
            jLabel8.setText("");
            for (int i = 0; i < model.getRowCount(); i++) {
                String l = ("" + model.getValueAt(i, 1)).replace(" ", "");
                String r = ("" + model.getValueAt(i, 2)).replace(" ", "");
                if (l.length() == 0 && r.length() == 0) {
                    limitList.add(new Limit(0, sumX, true));
                    limitList.add(new Limit(0, sumX, true));
                    continue;
                }
                boolean inLimit = true;
                if ((model.getValueAt(i, 3) + "").charAt(0) == 'x') {
                    inLimit = false;
                }
                limitList.add(new Limit(Integer.parseInt(l), Integer.parseInt(r), inLimit));
            }
            AnswersMaker answerMaker = new AnswersMaker(sum, sumX, limitList);
            DefaultListModel dlm = answerMaker.getAnswers();
            if (dlm.size() == 0) {
                dlm.addElement("Not answer!");
            }
            jList1.setModel(dlm);
        } else {
            jLabel8.setText("sum of X or sum non correct!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rightActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String lef = left.getText();
        String rig = right.getText();
        jLabel9.setText("");
        if (inputsChecker.checkData(0, lef, rig)) {
            String status = jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
            DefaultTableModel model = (DefaultTableModel) Table.getModel();
            if (model.getRowCount() < Integer.parseInt(jTextField3.getText().trim())) {
                String stat = "x <= " + lef + " || " + rig + " <= x"; 
                if (status.charAt(0) == 'I') {
                    stat = lef + " <= x <= " + rig; 
                }
                model.addRow(new Object[]{model.getRowCount() + 1, lef, rig, stat});
            }
        } else {
            jLabel9.setText("Limit(s) are non correct!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jLabel8.setText("");
        jLabel9.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        left.setText("");
        right.setText("");
        jLabel5.setText("");
        jList1.setModel(new DefaultListModel<>());
        Table.clearSelection();
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public void equationWithMoreCond() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(equationWithMoreConditions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(equationWithMoreConditions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(equationWithMoreConditions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(equationWithMoreConditions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new equationWithMoreConditions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField left;
    private javax.swing.JTextField right;
    // End of variables declaration//GEN-END:variables
}
