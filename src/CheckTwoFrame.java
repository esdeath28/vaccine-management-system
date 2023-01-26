/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class CheckTwoFrame extends javax.swing.JFrame {

    /**
     * Creates new form CheckTwoFrame
     */
    public CheckTwoFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showvacdata = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vaccinetext = new javax.swing.JTextArea();
        showHospital = new javax.swing.JButton();
        showInventory = new javax.swing.JButton();
        showDoctor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        showvacdata.setText("Show Vaccine Table");
        showvacdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showvacdataActionPerformed(evt);
            }
        });

        vaccinetext.setColumns(20);
        vaccinetext.setRows(5);
        jScrollPane1.setViewportView(vaccinetext);

        showHospital.setText("Show hospital data");
        showHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHospitalActionPerformed(evt);
            }
        });

        showInventory.setText("Show Inventory Data");
        showInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showInventoryActionPerformed(evt);
            }
        });

        showDoctor.setText("Show Doctor Data");
        showDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(showvacdata)
                        .addGap(18, 18, 18)
                        .addComponent(showHospital)
                        .addGap(18, 18, 18)
                        .addComponent(showInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(showDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(392, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showvacdata)
                    .addComponent(showHospital)
                    .addComponent(showInventory)
                    .addComponent(showDoctor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showvacdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showvacdataActionPerformed
        // TODO add your handling code here:
        
        String p= "Vaccine Id\tBatch Id\tManufacturer Id\t  Importer Id\tVaccine Type\t\tCost\tManufactureName\tImporter Name\t  Batch Quantity \n";
        CheckTwo cn = new CheckTwo();
        p = p+cn.vaccineDB();  
        vaccinetext.setText(p);
        
        
    }//GEN-LAST:event_showvacdataActionPerformed

    private void showHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showHospitalActionPerformed
        // TODO add your handling code here:
        String p= "Hospital Id\tHospital Name\t\tHospital Address\t\n";
        HospitalClass hc = new HospitalClass();
        p = p+hc.hospitalDB();  
        vaccinetext.setText(p);
    }//GEN-LAST:event_showHospitalActionPerformed

    private void showInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showInventoryActionPerformed
        // TODO add your handling code here:
         String p= "Hospital Id\tVaccine Id\n";
        InventoryClass ic = new InventoryClass();
        p = p+ic.inventoryDB();  
        vaccinetext.setText(p);
    }//GEN-LAST:event_showInventoryActionPerformed

    private void showDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDoctorActionPerformed
        // TODO add your handling code here:
        String p= "Doctor Id\tDoctor Name\tDesignation\t  Advising Hour\tDoctor Phn no\t Hospital Id \n";
        DoctorClass dc = new DoctorClass();
        p = p+dc.doctorDB();  
        vaccinetext.setText(p);
    }//GEN-LAST:event_showDoctorActionPerformed

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
            java.util.logging.Logger.getLogger(CheckTwoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckTwoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckTwoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckTwoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckTwoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showDoctor;
    private javax.swing.JButton showHospital;
    private javax.swing.JButton showInventory;
    private javax.swing.JButton showvacdata;
    private javax.swing.JTextArea vaccinetext;
    // End of variables declaration//GEN-END:variables
}