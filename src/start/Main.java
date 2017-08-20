package start;



import windows.Instruction;
import equationSolve.Equation;
import answerSearcher.AnswersMakerByRectursion;
import javax.swing.DefaultListModel;
import converter.Convert;
import checker.InputsChecker;
import answersInLimit.AnswersInLimit;
import equationWithMoreConditions.equationWithMoreConditions;
import javax.swing.JMenuItem;
import windows.Help;

public class Main extends javax.swing.JFrame {
    DefaultListModel dlm = new DefaultListModel();
    Convert convert = new Convert();
    InputsChecker inputsChecker = new InputsChecker();
    int sum;
    int sumX;
    JMenuItem item = new JMenuItem();
    long startTime;
    long endTime;
    
    public Main() {
        initComponents();
        normalSize();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabelError1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListAllAns2 = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListAllAns1 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSumX = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        jLabelQuantityOfAnswers = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelQuantityOfAnswers1 = new javax.swing.JLabel();
        jListAllAns = new javax.swing.JList<>();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelError1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelError1.setForeground(new java.awt.Color(255, 204, 204));
        jLabelError1.setText("_____________________________________________________________________________________________________________________");
        getContentPane().add(jLabelError1);
        jLabelError1.setBounds(0, 320, 940, 15);

        jScrollPane1.setViewportView(jListAllAns2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(330, 370, 580, 260);

        jLabel8.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 253, 97));
        jLabel8.setText("Write your equation here:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 70, 230, 30);

        jTextField1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(270, 80, 650, 30);

        jListAllAns1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jListAllAns1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jScrollPane2.setViewportView(jListAllAns1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 170, 890, 130);

        jButton2.setText("Solve");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(840, 120, 82, 30);

        jLabel2.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Number of X:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 390, 130, 20);

        jTextFieldSumX.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jTextFieldSumX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSumXActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSumX);
        jTextFieldSumX.setBounds(180, 380, 130, 33);

        jLabel3.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sum:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 430, 110, 20);

        jTextFieldSum.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jTextFieldSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSumActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSum);
        jTextFieldSum.setBounds(180, 420, 130, 33);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Integer number between (1 - 50)");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 350, 180, 22);

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit);
        Submit.setBounds(190, 460, 110, 30);

        jLabelQuantityOfAnswers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelQuantityOfAnswers.setForeground(new java.awt.Color(255, 102, 102));
        jLabelQuantityOfAnswers.setText("______");
        getContentPane().add(jLabelQuantityOfAnswers);
        jLabelQuantityOfAnswers.setBounds(200, 510, 130, 32);

        jLabel5.setFont(new java.awt.Font("Vani", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 153));
        jLabel5.setText("Quantity of answers:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 510, 170, 34);

        jButton5.setText("Read instruction");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(760, 40, 160, 30);

        jLabel7.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Exaple of input: 2.3x1 + 4x2 + 6x3 + 2x4 = 23");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(270, 40, 400, 30);

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("x1+x2+x3+x4+x5x+6x+x7+x8=20");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 340, 560, 21);

        jButton1.setText("Solve");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 580, 110, 30);

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(800, 640, 97, 30);

        jButton4.setText("About");
        getContentPane().add(jButton4);
        jButton4.setBounds(0, 0, 240, 30);

        jButton6.setText("View");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(240, 0, 230, 30);

        jButton7.setText("Intructions");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(710, 0, 230, 30);

        jButton8.setText("Help");
        getContentPane().add(jButton8);
        jButton8.setBounds(470, 0, 240, 30);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Answers by limit:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 590, 140, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/start/blue.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(270, 0, 670, 680);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/start/blue.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 330, 680);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/start/white.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(330, 30, 610, 600);

        jLabel13.setText("jLabel10");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 600, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(300, 60, 290, 60);

        jLabelQuantityOfAnswers1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelQuantityOfAnswers1.setForeground(new java.awt.Color(204, 0, 51));
        jLabelQuantityOfAnswers1.setText("______");
        getContentPane().add(jLabelQuantityOfAnswers1);
        jLabelQuantityOfAnswers1.setBounds(560, 250, 70, 32);

        jListAllAns.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jListAllAns.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        getContentPane().add(jListAllAns);
        jListAllAns.setBounds(0, 0, 0, 0);

        jTextField2.setText("jTextField2");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(380, 130, 59, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSumXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSumXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSumXActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        
        jLabelError1.setText("_____________________________________________________________________________________________________________________");
        
        String stringSumX = jTextFieldSumX.getText();
        String stringSum = jTextFieldSum.getText();

        AnswersMakerByRectursion rec = new AnswersMakerByRectursion();

        clear();

        if (inputsChecker.checkData(1, stringSumX, stringSum)) {
            sumX = convert.toInteger(stringSumX);
            sum = convert.toInteger(stringSum);
            dlm = rec.getAnswersByDefaultListModel(0, sum, sumX);
            jLabelQuantityOfAnswers.setText("_" + (dlm.size() - 1) + "_");
            jListAllAns2.setModel(dlm);
            String s = "";
            for (int i = 1; i < sumX; ++i) {
                s = s + "X" + i + " + ";
            }
            s = s + "X" + sumX + " = " + sum;
            jLabel1.setText(s);
            
        } else {
        jLabelError1.setText("_______________________________________________Input(s) are non correct!_____________________________________________");
            jLabel1.setText("_______________________________________________________");
        }   
        
    }//GEN-LAST:event_SubmitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Equation equation = new Equation();
        String eq = jTextField1.getText();
        DefaultListModel def = equation.getAns(eq);
        jListAllAns1.setModel(def);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Instruction.newScreenInstructions();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        equationWithMoreConditions equations = new equationWithMoreConditions();
        equations.equationWithMoreCond();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextFieldSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSumActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelError1;
    private javax.swing.JLabel jLabelQuantityOfAnswers;
    private javax.swing.JLabel jLabelQuantityOfAnswers1;
    private javax.swing.JList<String> jListAllAns;
    private javax.swing.JList<String> jListAllAns1;
    private javax.swing.JList<String> jListAllAns2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldSum;
    private javax.swing.JTextField jTextFieldSumX;
    // End of variables declaration//GEN-END:variables
     void clear () {
        dlm.clear();
        jListAllAns2.setModel(dlm);
        jLabelQuantityOfAnswers.setText("______");
    }

    void normalSize() {
        setSize(936, 700);
    }
}
