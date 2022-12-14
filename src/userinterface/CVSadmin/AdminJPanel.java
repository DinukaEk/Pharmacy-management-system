package userinterface.CVSadmin;

import business.PharmacyDirectory;
import business.StoreDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  Mihir Mehta / Hechen Gao
 */
public class AdminJPanel extends javax.swing.JPanel {
  
    private JPanel userProcessContainer;
    private PharmacyDirectory pharmacyDirectory;
    private StoreDirectory storeDirectory;
    public AdminJPanel(JPanel userProcessContainer,  PharmacyDirectory pharmacyDirectory,StoreDirectory storeDirectory) {
        initComponents();
        this.pharmacyDirectory = pharmacyDirectory;
        this.userProcessContainer = userProcessContainer;
        this.storeDirectory = storeDirectory;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        managePharmacyJButton = new javax.swing.JButton();
        manageStoreJButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Administrative");

        managePharmacyJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        managePharmacyJButton.setText("Manage Pharmacy >>");
        managePharmacyJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePharmacyJButtonActionPerformed(evt);
            }
        });

        manageStoreJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageStoreJButton.setText("Manage Store >>");
        manageStoreJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStoreJButtonActionPerformed(evt);
            }
        });

        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(manageStoreJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(managePharmacyJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1)))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(managePharmacyJButton)
                .addGap(28, 28, 28)
                .addComponent(manageStoreJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void managePharmacyJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePharmacyJButtonActionPerformed
        ManageStore mp = new ManageStore(userProcessContainer,pharmacyDirectory);
        userProcessContainer.add("manage Pharmacy",mp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePharmacyJButtonActionPerformed

    private void manageStoreJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStoreJButtonActionPerformed
        // TODO add your handling code here:
        ManagePharmacy manageStore = new ManagePharmacy(userProcessContainer, storeDirectory);
        userProcessContainer.add("manage Store",manageStore);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageStoreJButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton managePharmacyJButton;
    private javax.swing.JButton manageStoreJButton;
    // End of variables declaration//GEN-END:variables
    
}
