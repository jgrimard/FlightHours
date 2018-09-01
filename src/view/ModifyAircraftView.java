/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author jgrimard
 */
public class ModifyAircraftView extends javax.swing.JDialog {

    /**
     * Creates new form AddAircraftView
     */
    public ModifyAircraftView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        java.awt.GridBagConstraints gridBagConstraints;

        outerPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        dataPanel = new javax.swing.JPanel();
        tailNumberLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        missionLabel = new javax.swing.JLabel();
        maxSpeedLabel = new javax.swing.JLabel();
        maxAltitudeLabel = new javax.swing.JLabel();
        maintThresholdLabel = new javax.swing.JLabel();
        tailNumberTextField = new javax.swing.JTextField();
        typeComboBox = new javax.swing.JComboBox<>();
        locationComboBox = new javax.swing.JComboBox<>();
        missionComboBox = new javax.swing.JComboBox<>();
        maxSpeedTestField = new javax.swing.JTextField();
        maxAltitudeTextField = new javax.swing.JTextField();
        maintThresholdTextField = new javax.swing.JTextField();
        buttonPanel = new javax.swing.JPanel();
        modifyAircraftButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modify Aircraft");
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        outerPanel.setLayout(new java.awt.GridBagLayout());

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setText("Modify Aircraft");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        outerPanel.add(titleLabel, gridBagConstraints);

        dataPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dataPanel.setToolTipText("");
        dataPanel.setLayout(new java.awt.GridBagLayout());

        tailNumberLabel.setText("Tail Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        dataPanel.add(tailNumberLabel, gridBagConstraints);

        typeLabel.setText("Type");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        dataPanel.add(typeLabel, gridBagConstraints);

        locationLabel.setText("Location");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        dataPanel.add(locationLabel, gridBagConstraints);

        missionLabel.setText("Mission");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        dataPanel.add(missionLabel, gridBagConstraints);

        maxSpeedLabel.setText("Max Speed");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        dataPanel.add(maxSpeedLabel, gridBagConstraints);

        maxAltitudeLabel.setText("Max Altitude");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        dataPanel.add(maxAltitudeLabel, gridBagConstraints);

        maintThresholdLabel.setText("Maintenance Hours Threshold");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        dataPanel.add(maintThresholdLabel, gridBagConstraints);

        tailNumberTextField.setColumns(10);
        tailNumberTextField.setText("A2K2J5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        dataPanel.add(tailNumberTextField, gridBagConstraints);

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FIXED WING", "ROTARY WING", "UAV" }));
        typeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        dataPanel.add(typeComboBox, gridBagConstraints);

        locationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mcallen Air and Marine Branch", "Laredo Air Branch", "San Antonio Air Unit", "Uvalde Air Branch", "Del Rio Air Unit", "San Angelo Air Unit", "El Paso Air Branch", "Alpine Air Unit", "Deming Air Unit", "Tucson Air Branch" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        dataPanel.add(locationComboBox, gridBagConstraints);

        missionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Top Secret", "Mission 2", "Mission 3", "Mission 4", "Mission 5", "Mission 6" }));
        missionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                missionComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        dataPanel.add(missionComboBox, gridBagConstraints);

        maxSpeedTestField.setColumns(10);
        maxSpeedTestField.setText("550");
        maxSpeedTestField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxSpeedTestFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        dataPanel.add(maxSpeedTestField, gridBagConstraints);

        maxAltitudeTextField.setColumns(10);
        maxAltitudeTextField.setText("35000");
        maxAltitudeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxAltitudeTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        dataPanel.add(maxAltitudeTextField, gridBagConstraints);

        maintThresholdTextField.setColumns(10);
        maintThresholdTextField.setText("3000");
        maintThresholdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintThresholdTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        dataPanel.add(maintThresholdTextField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 0);
        outerPanel.add(dataPanel, gridBagConstraints);

        buttonPanel.setLayout(new java.awt.GridBagLayout());

        modifyAircraftButton.setText("Modify Aircraft");
        modifyAircraftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyAircraftButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        buttonPanel.add(modifyAircraftButton, gridBagConstraints);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        buttonPanel.add(cancelButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        outerPanel.add(buttonPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(30, 30, 30, 30);
        getContentPane().add(outerPanel, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void modifyAircraftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyAircraftButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_modifyAircraftButtonActionPerformed

    private void typeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeComboBoxActionPerformed

    private void maxSpeedTestFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxSpeedTestFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxSpeedTestFieldActionPerformed

    private void maintThresholdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintThresholdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maintThresholdTextFieldActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void missionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_missionComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_missionComboBoxActionPerformed

    private void maxAltitudeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxAltitudeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxAltitudeTextFieldActionPerformed

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
                    System.out.println("Numbus was found and is set");//testing
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModifyAircraftView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyAircraftView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyAircraftView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyAircraftView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModifyAircraftView dialog = new ModifyAircraftView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JComboBox<String> locationComboBox;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JLabel maintThresholdLabel;
    private javax.swing.JTextField maintThresholdTextField;
    private javax.swing.JLabel maxAltitudeLabel;
    private javax.swing.JTextField maxAltitudeTextField;
    private javax.swing.JLabel maxSpeedLabel;
    private javax.swing.JTextField maxSpeedTestField;
    private javax.swing.JComboBox<String> missionComboBox;
    private javax.swing.JLabel missionLabel;
    private javax.swing.JButton modifyAircraftButton;
    private javax.swing.JPanel outerPanel;
    private javax.swing.JLabel tailNumberLabel;
    private javax.swing.JTextField tailNumberTextField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}