/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Matrix.Matrix;
import Matrix.MultiLinear;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MAHE
 */
public class userLoggedIn extends javax.swing.JFrame {

    /**
     * Creates new form userLoggedIn
     */
    public userLoggedIn() {
        initComponents();
    }
    String arr[] = {"SHAH_RUKH_KHAN", "AAMIR_KHAN", "SALMAN_KHAN", "AKSHAY_KUMAR", "KATRINA_KAIF", "KAJOL_DEVGAN", "KAREENA_KAPOOR", "PRIYANKA_CHOPRA", "YASH_RAJ_CHOPRA", "RAJ_KUMAR_HIRANI", "IMTIAZ_ALI", "SANJAY_LEELA_BHANSALI", "VISHAL_SHEKHAR", "PRITAM", "AR_REHMAN", "SHANKAR_EHSAN_LOY", "BELOW_50_MILLION", "50_TO_100_MILLION", "100_TO_150_MILLION", "ABOVE_150_MILLION", "ACTION", "ROMANCE", "COMEDY", "DRAMA", "CHRISTMAS", "DIWALI", "EID", "HOLI"
    };
    double avg[] = new double[28];
    Connection con = null;
    Statement st = null;
    ResultSet rs1 = null;
    ResultSet rs2 = null;
//        ResultSet rs3 = null;
//        ResultSet rs4 = null;
//        ResultSet rs5 = null;
//        ResultSet rs6 = null;
//        ResultSet rs7 = null;
//        ResultSet rs8 = null;
//        ResultSet rs9 = null;
//        ResultSet rs10 = null;
//        ResultSet rs11 = null;
//        ResultSet rs12 = null;
//        ResultSet rs13 = null;
//        ResultSet rs14 = null;
//        ResultSet rs15 = null;
//        ResultSet rs16 = null;
//        ResultSet rs17 = null;
//        ResultSet rs18 = null;
//        ResultSet rs19 = null;
//        ResultSet rs20 = null;
//        ResultSet rs21 = null;
//        ResultSet rs22 = null;
//        ResultSet rs23 = null;
//        ResultSet rs24 = null;
//        ResultSet rs25 = null;
//        ResultSet rs26 = null;
//        ResultSet rs27 = null;
//        ResultSet rs28 = null;
    ResultSet rs = null;

    double av1, av2, av3, av4, av5, av6, av7, av8, av9, av10, av11, av12, av13, av14, av15, av16, av17, av18, av19, av20, av21, av22, av23;
    double av24, av25, av26, av27, av28;
    String s, mn = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\MAHE\\Desktop\\abc (2).jpg")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel3.setText("ACTOR");

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel4.setText("ACTRESS");

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel5.setText("DIRECTOR");

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel6.setText("MUSIC DIRECTOR");

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel7.setText("BUDGET");

        jLabel8.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel8.setText("GENRE");

        jLabel9.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel9.setText("RELEASE TIME");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SHAH RUKH KHAN", "AAMIR KHAN", "SALMAN KHAN", "AKSHAY KUMAR" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KAJOL DEVGN", "KATRINA KAIF", "KAREENA KAAPOOR", "PRIYANKA CHOPRA" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YASH CHOPRA", "RAJ KUMAR HIRANI", "IMTIAZ ALI", "SANJAY LEELA BHANSALI" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VISHAL SHEKHAR", "AR REHMAN", "PRITAM", "SHANKAR EHSAN LOY" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BELOW 50 MILLION", "50 - 100 MILLION", "100 - 150 MILLION", "ABOVE 150 MILLION" }));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ROMANCE", "COMEDY", "ACTION", "DRAMA" }));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HOLI", "EID", "DIWALI", "CHRISTMAS" }));

        jLabel10.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("PREDICTOR");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/predictor.jpg"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/listMovies.jpg"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/movieReviews.jpg"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/logout2.jpg"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\MAHE\\Desktop\\predict.jpg")); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(235, 235, 235))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        searchMovie obj = new searchMovie();
        obj.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MousePressed

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        review obj = new review();
        obj.setVisible(true);
        this.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MousePressed

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        userlogin obj = new userlogin();
        obj.setVisible(true);
        this.setVisible(false);  // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MousePressed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/msp?autoReconnect=true&useSSL=false", "root", "suvimal");
            Statement stmt = con.createStatement();
            System.out.println("AVERAGE :-");
            for (int i = 0; i < 28; i++) {
                rs = stmt.executeQuery("select avg(RATING) as avg1 from predict where " + arr[i] + " = 1;");
                rs.next();
                avg[i] = rs.getDouble("avg1");
                System.out.println(avg[i]);
            }

//            Connection con = null;
//            Statement st = null;
//            ResultSet rs = null;
//            String s;
//connect your app to mysql database
            //boolean autoReconnect;
            //boolean useSSL = false;
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/msp?useSSL=false","root","suvimal");
            // jdbc:mysql://localhost:3306/Peoples?autoReconnect=true&useSSL=false;
            //       st = con.createStatement();
            //       s = "select SA,SB,SC,SD from login.demo";
            rs = stmt.executeQuery("select SHAH_RUKH_KHAN, AAMIR_KHAN, SALMAN_KHAN, AKSHAY_KUMAR, KATRINA_KAIF, "
                    + "KAJOL_DEVGAN, KAREENA_KAPOOR, PRIYANKA_CHOPRA, YASH_RAJ_CHOPRA, RAJ_KUMAR_HIRANI, IMTIAZ_ALI,"
                    + " SANJAY_LEELA_BHANSALI, VISHAL_SHEKHAR, PRITAM, AR_REHMAN, SHANKAR_EHSAN_LOY, "
                    + "BELOW_50_MILLION, 50_TO_100_MILLION, 100_TO_150_MILLION, ABOVE_150_MILLION, ACTION, "
                    + "ROMANCE, COMEDY, DRAMA, CHRISTMAS, DIWALI, EID, HOLI from predict");
            ResultSetMetaData rsmt = rs.getMetaData();
            Statement stmt1 = con.createStatement();
            rs1 = stmt1.executeQuery("SELECT COUNT(*) AS total FROM predict");
            int count = 0;
            while (rs1.next()) {
                count = rs1.getInt("total");
            }
            //System.out.println(count);
            Statement stmt2 = con.createStatement();
            rs2 = stmt2.executeQuery("SELECT rating FROM predict");

            String a = "";
            int nCol = rs.getMetaData().getColumnCount();
            double ar[][] = new double[count][nCol];
            System.out.println(nCol);
            List<int[]> table = new ArrayList<>();
            while (rs.next()) {
                int[] row = new int[nCol];
                for (int iCol = 1; iCol <= nCol; iCol++) {
                    a = rs.getObject(iCol).toString();
                    row[iCol - 1] = Integer.parseInt(a);
                }
                table.add(row);
            }

            int nColy = rs2.getMetaData().getColumnCount();
            double ary[][] = new double[count][nColy];
            List<double[]> tabley = new ArrayList<>();
            while (rs2.next()) {
                double[] rowy = new double[nColy];
                for (int iCol = 1; iCol <= nColy; iCol++) {
                    a = rs2.getObject(iCol).toString();
                    rowy[iCol - 1] = Double.parseDouble(a);
                }
                tabley.add(rowy);
            }
            int i = 0;
            int j = 0;
//// print result
            for (int[] row : table) {
                for (int si : row) {
                    ar[i][j] = si;
                    j++;
                    
                }
                //System.out.println(j);
                j = 0;
                i++;

            }
           //System.out.println(j);

            i = 0;
            j = 0;
// print result
            for (double[] row : tabley) {
                for (double si : row) {
                    ary[i][j] = si;
                    j++;
                }
                j = 0;
                i++;

            }
            System.out.println("MATRIX FROM DB:-");

            for(i=0;i<count;i++)
            {
                for(j=0;j<nCol;j++)
                {
                    System.out.print(ar[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("RATING:-");
            for(i=0;i<count;i++)
            {
                for(j=0;j<nColy;j++)
                {
                    System.out.print(ary[i][j]+" ");
                }
                System.out.println();
            }
          //  rs = stmt.executeQuery("select count(*) as cnt from predict;");
           // rs.next();
           // int cnt = rs.getInt("cnt");
           System.out.println();
            for (i = 0; i < 28; i++) {
                for (j = 0; j < count; j++) {
                    if (ar[j][i] == 1.0) {
                        ar[j][i] = avg[i];
                        //System.out.println(ar[j][i]);
                    }
                }
            }
       for (i = 0; i < 28; i++) {
                for (j = 0; j < count; j++) {
                    System.out.print(ar[j][i]+"    ");
                }
                System.out.println();
            }
    
            Matrix m = new Matrix(ar);
//Matrix m2 = new Matrix(ary);
//MultiLinear ml = new MultiLinear(m,m2);
//Matrix result = ml.calculate();

            update obj = new update();
            obj.setVisible(true);
            this.setVisible(false);

        } catch (SQLException ex) {
            Logger.getLogger(userlogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(userlogin.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jLabel15MousePressed

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
            java.util.logging.Logger.getLogger(userLoggedIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userLoggedIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userLoggedIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userLoggedIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userLoggedIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
