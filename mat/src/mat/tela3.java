/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mat;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class tela3 extends javax.swing.JFrame {

    /**
     * Creates new form tela3
     */
    public tela3() {
        initComponents();

        q5.setVisible(true);
        q5.setEditable(false);
        centralizarComponente();
    }

    public void centralizarComponente() {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        q1 = new javax.swing.JTextField();
        q2 = new javax.swing.JTextField();
        q4 = new javax.swing.JTextField();
        q3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        q5 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton3.setText("Calcular");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(690, 540, 110, 44);

        jLabel3.setFont(new java.awt.Font("Century Schoolbook L", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(49, 230, 125));
        jLabel3.setText("Probabilidade é:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 500, 281, 47);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook L", 1, 24)); // NOI18N
        jLabel1.setText("Digite a media de gols do time por jogo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 280, 510, 48);

        jLabel5.setFont(new java.awt.Font("Century Schoolbook L", 1, 24)); // NOI18N
        jLabel5.setText("Digite a media de gols do time por jogo");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 430, 632, 38);

        jLabel2.setFont(new java.awt.Font("Century Schoolbook L", 1, 24)); // NOI18N
        jLabel2.setText("Digite quantidade de gols que devem ocorrer");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 210, 587, 52);

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel4.setText("Time 01");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 250, 80, 42);

        jLabel6.setFont(new java.awt.Font("Century Schoolbook L", 1, 24)); // NOI18N
        jLabel6.setText("Digite quantidade de gols que devem ocorrer");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 360, 587, 52);

        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel7.setText("Time 02");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 400, 80, 42);

        q1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1ActionPerformed(evt);
            }
        });
        getContentPane().add(q1);
        q1.setBounds(700, 213, 90, 50);

        q2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        getContentPane().add(q2);
        q2.setBounds(700, 290, 90, 40);

        q4.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        q4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q4ActionPerformed(evt);
            }
        });
        getContentPane().add(q4);
        q4.setBounds(700, 430, 90, 40);

        q3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        getContentPane().add(q3);
        q3.setBounds(701, 360, 90, 40);

        jLabel9.setFont(new java.awt.Font("Noto Sans", 0, 48)); // NOI18N
        jLabel9.setText("{");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(100, 340, 20, 150);

        jLabel10.setFont(new java.awt.Font("Noto Sans", 0, 48)); // NOI18N
        jLabel10.setText("{");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(100, 190, 20, 150);

        jButton2.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jButton2.setText("Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(50, 680, 104, 40);

        q5.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        getContentPane().add(q5);
        q5.setBounds(120, 540, 326, 47);

        jButton6.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jButton6.setText("Sair");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(820, 670, 120, 50);

        jButton7.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jButton7.setText("Ajuda");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(710, 670, 90, 40);

        jLabel11.setFont(new java.awt.Font("Century Schoolbook L", 0, 36)); // NOI18N
        jLabel11.setText("Ocorre determinado placar.");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(300, 50, 661, 112);

        jButton8.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jButton8.setText("Voltar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(590, 670, 104, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/newpackage/ok.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(-10, -10, 1030, 790);

        setSize(new java.awt.Dimension(1028, 772));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
Scanner dado = new Scanner(System.in);

        double xxx = 0, xx = 0;

        double f = 0;
        //double y = 0;
        //int k = 0;
        double € = 2.718281828459045235360287;
        int k1 = 1, kk = 1;
        // System.out.println("digite quantidade de gols que devem ocorrer time " + i);
        //k = dado.nextInt();
        int k = Integer.parseInt(q1.getText());
        int k2 = Integer.parseInt(q3.getText());

        // System.out.println("digite a media de gols do time " + i);
        //y = dado.nextDouble();
        double y = Double.parseDouble(q2.getText());
        double y2 = Double.parseDouble(q4.getText());

        for (int x = k; x >= 1; x--) {
            k1 = k1 * x;

        }
        for (int x1 = k2; x1 >= 1; x1--) {
            kk = kk * x1;

        }
        xxx = ((Math.pow(€, -y)) * (Math.pow(y, k))) / k1;

        xx = ((Math.pow(€, -y2)) * (Math.pow(y2, k2))) / kk;

        
        q5.setVisible(true);
        q5.setText(String.valueOf(xx * xxx * 100 +" %"));

        //System.out.println("Probabilidade deste placar ocorrer é: " + df.format(xxx * xx * 100) + "%");        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q1ActionPerformed

    private void q4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MENU M = new MENU();
        this.setVisible(false);
        M.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ajuda04 T = new ajuda04();
        this.setVisible(false);
        T.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         MENU M = new MENU();
       this.setVisible(false);
       M.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    private javax.swing.JTextField q5;
    // End of variables declaration//GEN-END:variables
}
