/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.gui.aluno.form.edit;

import javax.swing.JButton;

/**
 *
 * @author italo
 */
public class EditAlunoBotoesPNL extends javax.swing.JPanel {

    /**
     * Creates new form EditAlunoBotoesPNL
     */
    public EditAlunoBotoesPNL() {
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

        removerAlunoBT = new javax.swing.JButton();
        fecharBT = new javax.swing.JButton();

        removerAlunoBT.setText("Remover aluno");

        fecharBT.setText("Fechar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(removerAlunoBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(fecharBT)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removerAlunoBT)
                    .addComponent(fecharBT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JButton getFecharBT() {
        return fecharBT;
    }

    public JButton getRemoverAlunoBT() {
        return removerAlunoBT;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fecharBT;
    private javax.swing.JButton removerAlunoBT;
    // End of variables declaration//GEN-END:variables
}