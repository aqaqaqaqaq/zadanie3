/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package base;

import java.rmi.Naming;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import operation.TovarOperation;
import types.Tovar;

public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

   
static DefaultTableModel model = new DefaultTableModel();

static TovarOperation tovarOperation = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        dlgAdd = new javax.swing.JDialog();
        lblName = new javax.swing.JLabel();
        lblKol = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        cmbName = new javax.swing.JComboBox();
        spnKol = new javax.swing.JSpinner();
        btnAddTovar = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblPriceInfo = new javax.swing.JLabel();
        scrPrice = new javax.swing.JScrollBar();
        pnlConstruct = new javax.swing.JPanel();
        rdbNoParam = new javax.swing.JRadioButton();
        rdbYesParam = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        tlBar = new javax.swing.JToolBar();
        btnAdd = new javax.swing.JButton();
        spr1 = new javax.swing.JToolBar.Separator();
        btnDecide = new javax.swing.JButton();
        spr2 = new javax.swing.JToolBar.Separator();
        btnExit = new javax.swing.JButton();
        txtTotalSumma = new javax.swing.JTextField();
        lbl = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        dlgAdd.setTitle("Окно ввода");

        lblName.setText("Наименование");

        lblKol.setText("Количество");

        lblPrice.setText("Цена");

        cmbName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Тетрадь", "Ручка", "Карандаш" }));
        cmbName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNameActionPerformed(evt);
            }
        });

        spnKol.setModel(new javax.swing.SpinnerNumberModel(10, 1, 30, 2));

        btnAddTovar.setText("Добавить");
        btnAddTovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTovarActionPerformed(evt);
            }
        });

        btnCancel.setText("Отменить");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblPriceInfo.setText("50");

        scrPrice.setMinimum(5);
        scrPrice.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrPrice.setToolTipText("");
        scrPrice.setValue(50);
        scrPrice.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrPriceAdjustmentValueChanged(evt);
            }
        });

        pnlConstruct.setBorder(javax.swing.BorderFactory.createTitledBorder("Конструктор"));

        rdbNoParam.setText("Без параметров");

        rdbYesParam.setText("С параметрами");

        javax.swing.GroupLayout pnlConstructLayout = new javax.swing.GroupLayout(pnlConstruct);
        pnlConstruct.setLayout(pnlConstructLayout);
        pnlConstructLayout.setHorizontalGroup(
            pnlConstructLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConstructLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbNoParam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbYesParam)
                .addContainerGap())
        );
        pnlConstructLayout.setVerticalGroup(
            pnlConstructLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConstructLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnlConstructLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbNoParam)
                    .addComponent(rdbYesParam))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dlgAddLayout = new javax.swing.GroupLayout(dlgAdd.getContentPane());
        dlgAdd.getContentPane().setLayout(dlgAddLayout);
        dlgAddLayout.setHorizontalGroup(
            dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(dlgAddLayout.createSequentialGroup()
                                .addComponent(lblKol)
                                .addGap(49, 49, 49)
                                .addComponent(spnKol))
                            .addGroup(dlgAddLayout.createSequentialGroup()
                                .addComponent(lblName)
                                .addGap(36, 36, 36)
                                .addComponent(cmbName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addComponent(lblPrice)
                        .addGap(83, 83, 83)
                        .addComponent(scrPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(81, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgAddLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgAddLayout.createSequentialGroup()
                        .addComponent(btnAddTovar)
                        .addGap(90, 90, 90)
                        .addComponent(btnCancel)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgAddLayout.createSequentialGroup()
                        .addComponent(pnlConstruct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgAddLayout.createSequentialGroup()
                        .addComponent(lblPriceInfo)
                        .addGap(156, 156, 156))))
        );
        dlgAddLayout.setVerticalGroup(
            dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(cmbName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKol)
                    .addComponent(spnKol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPriceInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrice)
                    .addComponent(scrPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(pnlConstruct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnAddTovar))
                .addContainerGap())
        );

        pnlConstruct.getAccessibleContext().setAccessibleName("");
        pnlConstruct.getAccessibleContext().setAccessibleDescription("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Работа №1");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "№ п,п", "Название", "Цена", "Количество", "Сумма"
            }
        ));
        tbl.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tbl);

        tlBar.setRollover(true);

        btnAdd.setText("Добавить");
        btnAdd.setFocusable(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        tlBar.add(btnAdd);
        tlBar.add(spr1);

        btnDecide.setText("Вычислить");
        btnDecide.setFocusable(false);
        btnDecide.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDecide.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDecide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecideActionPerformed(evt);
            }
        });
        tlBar.add(btnDecide);
        tlBar.add(spr2);

        btnExit.setText("Выход");
        btnExit.setFocusable(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        tlBar.add(btnExit);

        txtTotalSumma.setEditable(false);
        txtTotalSumma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalSummaActionPerformed(evt);
            }
        });

        lbl.setText("Общая сумма товаров");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tlBar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalSumma, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 106, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tlBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalSumma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        dlgAdd.setSize(300, 320);
        dlgAdd.setVisible(true);

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDecideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecideActionPerformed
        try{

txtTotalSumma.setText(Integer.toString(tovarOperation.getSumOfTovar()));

}catch(Exception ex){

ex.printStackTrace();

JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером:" + ex.getMessage() + ".",

"Ошибка",

JOptionPane.ERROR_MESSAGE);

}
    }//GEN-LAST:event_btnDecideActionPerformed
                                      
    private void txtTotalSummaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalSummaActionPerformed
       setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        System.exit(0);
    }//GEN-LAST:event_txtTotalSummaActionPerformed
                                
    private void cmbNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNameActionPerformed

    private void btnAddTovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTovarActionPerformed
       dlgAdd.setVisible(false);
       Tovar el;

if (rdbYesParam.isSelected()) {

el = new Tovar(cmbName.getSelectedItem().toString(), (int) spnKol.getValue(), scrPrice.getValue());

} else {

el = new Tovar();

el.setName(cmbName.getSelectedItem().toString());

el.setKol((int) spnKol.getValue());

el.setPrice(scrPrice.getValue());

}

try{

doVivod(tovarOperation.addNewTovar(el));

}catch (Exception ex) {

ex.printStackTrace();

JOptionPane.showMessageDialog(this, "Не удалось добавить. Попытайтесь повторить попытку :" + ex.getMessage() + ".",

"Ошибка",

JOptionPane.ERROR_MESSAGE);

}
    }                                           

    private void doVivod(List<Tovar> lstTovar){
        doClearTable();
        int i = 1;
        for(Tovar tovar: lstTovar){
            Object[] rowData = new Object[5];
            rowData[0] = i++;
            rowData[1] = tovar.getName();
            rowData[2] = tovar.getPrice();
            rowData[3] = tovar.getKol();
            rowData[4] = tovar.getPrice() * tovar.getKol();
            model.addRow(rowData);
        }
    }
    private void doClearTable(){
        while (model.getRowCount()>0){
            model.removeRow(0);
        }   
    }//GEN-LAST:event_btnAddTovarActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
           dlgAdd.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void scrPriceAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scrPriceAdjustmentValueChanged
        lblPriceInfo.setText(Integer.toString((int) scrPrice.getValue()));
    }//GEN-LAST:event_scrPriceAdjustmentValueChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       try {

tovarOperation = (TovarOperation)Naming.lookup("//localhost:1199/rmiTest02");

model = (DefaultTableModel)tbl.getModel();

doVivod(tovarOperation.getListOfTovar());

} catch (Exception ex) {

ex.printStackTrace();

JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером:" + ex.getMessage() + ".",

"Ошибка",

JOptionPane.ERROR_MESSAGE);

}

    }//GEN-LAST:event_formWindowOpened

    private void tblAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAncestorAdded
    


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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddTovar;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDecide;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox cmbName;
    private javax.swing.JDialog dlgAdd;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblKol;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblPriceInfo;
    private javax.swing.JPanel pnlConstruct;
    private javax.swing.JRadioButton rdbNoParam;
    private javax.swing.JRadioButton rdbYesParam;
    private javax.swing.JScrollBar scrPrice;
    private javax.swing.JSpinner spnKol;
    private javax.swing.JToolBar.Separator spr1;
    private javax.swing.JToolBar.Separator spr2;
    private javax.swing.JTable tbl;
    private javax.swing.JToolBar tlBar;
    private javax.swing.JTextField txtTotalSumma;
    // End of variables declaration//GEN-END:variables
}
