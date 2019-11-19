/*
Copyright (C) 2015  Nikos Siatras

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 SourceRabbit GCode Sender is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package sourcerabbit.gcode.sender.UI.Machine;

import java.awt.Component;
import javax.swing.JSpinner;
import sourcerabbit.gcode.sender.Core.CNCController.Position.Position2D;
import sourcerabbit.gcode.sender.Core.Settings.SemiAutoToolChangeSettings;
import sourcerabbit.gcode.sender.UI.UITools.UITools;
import sourcerabbit.gcode.sender.UI.frmControl;

/**
 *
 * @author Nikos Siatras
 */
public class frmToolChangeSettings extends javax.swing.JDialog
{

    private final frmControl fMyMain;

    /**
     * Creates new form NewJDialog
     */
    public frmToolChangeSettings(frmControl parent, boolean modal)
    {
        super(parent, modal);
        initComponents();

        fMyMain = parent;

        // Set form in middle of frmControl
        Position2D pos = UITools.getPositionForDialogToOpenInMiddleOfParentForm(parent, this);
        this.setLocation((int) pos.getX(), (int) pos.getY());

        // Fix jSpinnerTouchProbeDiameter to work with system decimal point
        jSpinnerToolSetterHeight.setEditor(new JSpinner.NumberEditor(jSpinnerToolSetterHeight, "##.##"));
        UITools.FixSpinnerToWorkWithSystemDecimalPoint(jSpinnerToolSetterHeight);

        // Enable Settings if getEnableSemiAutoToolChange == true
        jCheckBoxEnableSemiAutoToolChange.setSelected(SemiAutoToolChangeSettings.getEnableSemiAutoToolChange());
        for (Component component : jPanel1.getComponents())
        {
            component.setEnabled(SemiAutoToolChangeSettings.getEnableSemiAutoToolChange());
        }

        jTextFieldToolSetterX.setText(String.valueOf(SemiAutoToolChangeSettings.getToolSetterX()));
        jTextFieldToolSetterY.setText(String.valueOf(SemiAutoToolChangeSettings.getToolSetterY()));
        jSpinnerToolSetterHeight.setValue(SemiAutoToolChangeSettings.getToolSetterHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel12 = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldToolSetterX = new javax.swing.JTextField();
        jTextFieldToolSetterY = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSpinnerToolSetterHeight = new javax.swing.JSpinner();
        jCheckBoxEnableSemiAutoToolChange = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tool Change Settings");
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 75, 127));
        jLabel12.setText("Tool Change Settings");

        jButtonSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSave.setText("Save Settings");
        jButtonSave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSaveActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 75, 127));
        jLabel19.setText("Tool Setter X:");

        jTextFieldToolSetterX.setText("0");

        jTextFieldToolSetterY.setText("0");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 75, 127));
        jLabel20.setText("Tool Setter Y:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel14.setText("Tool Setter Location according to Machine's X and Y position");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 75, 127));
        jLabel21.setText("Tool Setter Height:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 75, 127));
        jLabel22.setText("mm");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel15.setText("The distance between tool setter's top surface and machine's table");

        jSpinnerToolSetterHeight.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSpinnerToolSetterHeight.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 500.0d, 0.10000000149011612d));
        jSpinnerToolSetterHeight.setValue(19.2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel14)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSpinnerToolSetterHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)
                            .addComponent(jLabel22))
                        .addComponent(jLabel15)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addGap(32, 32, 32)
                            .addComponent(jTextFieldToolSetterY, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(31, 31, 31)
                        .addComponent(jTextFieldToolSetterX, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextFieldToolSetterX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextFieldToolSetterY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jSpinnerToolSetterHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jCheckBoxEnableSemiAutoToolChange.setText("Enable Semi Auto Tool Change");
        jCheckBoxEnableSemiAutoToolChange.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBoxEnableSemiAutoToolChangeActionPerformed(evt);
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
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxEnableSemiAutoToolChange))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxEnableSemiAutoToolChange)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSaveActionPerformed
    {//GEN-HEADEREND:event_jButtonSaveActionPerformed

        int toolSetterX = 0, toolSetterY = 0;
        try
        {
            toolSetterX = Integer.parseInt(jTextFieldToolSetterX.getText());
        }
        catch (Exception ex)
        {
            toolSetterX = 0;
        }

        try
        {
            toolSetterY = Integer.parseInt(jTextFieldToolSetterY.getText());
        }
        catch (Exception ex)
        {
            toolSetterY = 0;
        }

        double toolSetterHeight = (double) jSpinnerToolSetterHeight.getValue();

        SemiAutoToolChangeSettings.setEnableSemiAutoToolChange(jCheckBoxEnableSemiAutoToolChange.isSelected());
        SemiAutoToolChangeSettings.setToolSetterX(toolSetterX);
        SemiAutoToolChangeSettings.setToolSetterY(toolSetterY);
        SemiAutoToolChangeSettings.setToolSetterHeight(toolSetterHeight);
        this.dispose();
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jCheckBoxEnableSemiAutoToolChangeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBoxEnableSemiAutoToolChangeActionPerformed
    {//GEN-HEADEREND:event_jCheckBoxEnableSemiAutoToolChangeActionPerformed
        // Enable Settings if getEnableSemiAutoToolChange == true
        for (Component component : jPanel1.getComponents())
        {
            component.setEnabled(jCheckBoxEnableSemiAutoToolChange.isSelected());
        }
    }//GEN-LAST:event_jCheckBoxEnableSemiAutoToolChangeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSave;
    private javax.swing.JCheckBox jCheckBoxEnableSemiAutoToolChange;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerToolSetterHeight;
    private javax.swing.JTextField jTextFieldToolSetterX;
    private javax.swing.JTextField jTextFieldToolSetterY;
    // End of variables declaration//GEN-END:variables
}
