
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehme
 */
public class JInternalFrame_order extends javax.swing.JInternalFrame implements JInternalFrames{
    
    
    DefaultTableModel model;
    OrderOperations ord_Operations = new OrderOperations();

    /**
     * Creates new form JInternalFrame_order
     */
    public JInternalFrame_order() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        model = (DefaultTableModel) Table_orders.getModel();
        showAll();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TF_orderID = new javax.swing.JTextField();
        TF_customerID = new javax.swing.JTextField();
        TF_transportID = new javax.swing.JTextField();
        TF_product_name = new javax.swing.JTextField();
        TF_amount_paid = new javax.swing.JTextField();
        TF_salesperson_ID = new javax.swing.JTextField();
        TF_productID = new javax.swing.JTextField();
        TF_orderDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_orders = new javax.swing.JTable();
        TF_search = new javax.swing.JTextField();
        Button_add = new javax.swing.JButton();
        Button_delete = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        Button_clear = new javax.swing.JButton();
        label_message = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(16, 78, 139));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Order ID");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer ID");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Transport Vehicle ID");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Product Name");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Amount Paid");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sales Person ID");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Product ID");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Order Date");

        TF_orderID.setEditable(false);

        TF_orderDate.setText("DD.MM.YYYY");
        TF_orderDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TF_orderDateMouseClicked(evt);
            }
        });

        Table_orders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Customer ID", "Product Name", "Amount Paid", "Sales Person ID", "Product ID", "Order Date", "Transport Vehicle ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table_orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_ordersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_orders);
        if (Table_orders.getColumnModel().getColumnCount() > 0) {
            Table_orders.getColumnModel().getColumn(0).setResizable(false);
            Table_orders.getColumnModel().getColumn(1).setResizable(false);
            Table_orders.getColumnModel().getColumn(2).setResizable(false);
            Table_orders.getColumnModel().getColumn(3).setResizable(false);
            Table_orders.getColumnModel().getColumn(4).setResizable(false);
            Table_orders.getColumnModel().getColumn(5).setResizable(false);
            Table_orders.getColumnModel().getColumn(6).setResizable(false);
            Table_orders.getColumnModel().getColumn(7).setResizable(false);
        }

        TF_search.setText("                                                                                                                                                    TEXT AREA");
        TF_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TF_searchMouseClicked(evt);
            }
        });
        TF_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_searchKeyReleased(evt);
            }
        });

        Button_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        Button_add.setText("ADD");
        Button_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_addActionPerformed(evt);
            }
        });

        Button_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        Button_delete.setText("DELETE");
        Button_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_deleteActionPerformed(evt);
            }
        });

        UPDATE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/updated.png"))); // NOI18N
        UPDATE.setText("UPDATE");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });

        Button_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clear.png"))); // NOI18N
        Button_clear.setText("CLEAR");
        Button_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_clearActionPerformed(evt);
            }
        });

        label_message.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TF_orderID, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                            .addComponent(TF_customerID)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TF_product_name, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                            .addComponent(TF_amount_paid))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(514, 514, 514)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(UPDATE, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                            .addComponent(Button_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Button_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Button_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TF_productID, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TF_salesperson_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TF_orderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TF_transportID, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
                                    .addComponent(TF_search)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(label_message, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TF_orderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TF_salesperson_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TF_customerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(TF_productID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TF_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(TF_orderDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Button_add, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF_transportID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UPDATE, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TF_amount_paid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(label_message, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(TF_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_addActionPerformed
       
        int cst_id = Integer.parseInt(TF_customerID.getText());
        String product_name = TF_product_name.getText();
        float amount_paid = Float.parseFloat(TF_amount_paid.getText());
        int sp_id = Integer.parseInt(TF_salesperson_ID.getText());
        int prd_id = Integer.parseInt(TF_productID.getText());
        String order_date = TF_orderDate.getText();
        int transport_id = Integer.parseInt(TF_transportID.getText());
        
        ord_Operations.addOrder(cst_id, product_name, amount_paid, sp_id, prd_id, order_date, transport_id);
        showAll();
        
    }//GEN-LAST:event_Button_addActionPerformed

    private void Button_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_deleteActionPerformed
        
        int selectedrow = Table_orders.getSelectedRow();
         if (selectedrow == -1) {
           if (model.getRowCount() == 0 ) {
               label_message.setText("TABLE IS EMPTY");
           }
           else {
               label_message.setText("PLEASE CHOOSE A ORDER");
           }
      
       }
       else {
           int id = (int)model.getValueAt(selectedrow,0);
           
           ord_Operations.delete(id);
           
           showAll();
           
           label_message.setText("ORDER IS DELETED SUCCESSFULLLY");
           clearAreas();
           
           
           
       }
        
           
           
           
       
        
        
    }//GEN-LAST:event_Button_deleteActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        
        int cst_id = Integer.parseInt(TF_customerID.getText());
        String product_name = TF_product_name.getText();
        float amount_paid = Float.parseFloat(TF_amount_paid.getText());
        int sp_id = Integer.parseInt(TF_salesperson_ID.getText());
        int prd_id = Integer.parseInt(TF_productID.getText());
        String order_date = TF_orderDate.getText();
        int transport_id = Integer.parseInt(TF_transportID.getText());
        
        int selectedrow = Table_orders.getSelectedRow();
        
        if (selectedrow == -1) {
            
            if (model.getRowCount() == 0) {
                label_message.setText("TABLE IS EMPYT");
            }
            else {
                label_message.setText("PLEASE CHOOSE A ORDER");
            }
        }
        else {
            
            
            
            
            int id = (int)model.getValueAt(selectedrow,0);
            
            
            
            ord_Operations.updateOrder(prd_id, cst_id, product_name, amount_paid, sp_id, prd_id, order_date, transport_id);
            
            showAll();
            
            label_message.setText("ORDER IS UPDATE SUCCESSFULLLY");
        }
        
        
    }//GEN-LAST:event_UPDATEActionPerformed

    private void Button_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_clearActionPerformed
        clearAreas();
    }//GEN-LAST:event_Button_clearActionPerformed

    private void TF_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_searchKeyReleased
        String search = TF_search.getText();
        dynamicSearch(search);
    }//GEN-LAST:event_TF_searchKeyReleased

    private void Table_ordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_ordersMouseClicked
        int selectedrow = Table_orders.getSelectedRow();
        TF_orderID.setText(model.getValueAt(selectedrow, 0).toString());
        TF_customerID.setText(model.getValueAt(selectedrow, 1).toString());
        TF_product_name.setText(model.getValueAt(selectedrow, 2).toString());
        TF_amount_paid.setText(model.getValueAt(selectedrow, 3).toString());
        TF_salesperson_ID.setText(model.getValueAt(selectedrow, 4).toString());
        TF_productID.setText(model.getValueAt(selectedrow, 5).toString());
        TF_orderDate.setText(model.getValueAt(selectedrow, 6).toString());
        TF_transportID.setText(model.getValueAt(selectedrow, 7).toString());
        
        
        
    }//GEN-LAST:event_Table_ordersMouseClicked

    private void TF_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF_searchMouseClicked
        TF_search.setText("");
    }//GEN-LAST:event_TF_searchMouseClicked

    private void TF_orderDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF_orderDateMouseClicked
        TF_orderDate.setText("");
    }//GEN-LAST:event_TF_orderDateMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_add;
    private javax.swing.JButton Button_clear;
    private javax.swing.JButton Button_delete;
    private javax.swing.JTextField TF_amount_paid;
    private javax.swing.JTextField TF_customerID;
    private javax.swing.JTextField TF_orderDate;
    private javax.swing.JTextField TF_orderID;
    private javax.swing.JTextField TF_productID;
    private javax.swing.JTextField TF_product_name;
    private javax.swing.JTextField TF_salesperson_ID;
    private javax.swing.JTextField TF_search;
    private javax.swing.JTextField TF_transportID;
    private javax.swing.JTable Table_orders;
    private javax.swing.JButton UPDATE;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_message;
    // End of variables declaration//GEN-END:variables

    @Override
    public void showAll() {
        
       model.setRowCount(0);
        
       ArrayList<Order> ord = new ArrayList<Order>();
       
       ord = ord_Operations.ShowOrders();
       
       if(ord != null){
           
           for(Order element : ord){
               
               Object[] x = {element.getOrd_id(),element.getCst_id(),element.getProduct_name(),element.getAmount_paid(),element.getSales_person_id(),element.getProduct_id(),element.getOrd_date(),element.getTransport_vehicle_id()};
               model.addRow(x);
           
           
           
           }
       
       
       }
        
        
        
    }

    @Override
    public void clearAreas() {
        
        TF_orderID.setText("");
        TF_customerID.setText("");
        TF_product_name.setText("");
        TF_amount_paid.setText("");
        TF_salesperson_ID.setText("");
        TF_productID.setText("");
        TF_orderDate.setText("DD.MM.YYYY");
        TF_transportID.setText("");
        
        
    }

    @Override
    public void dynamicSearch(String search) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        
        
        Table_orders.setRowSorter(tr);
        
        
        tr.setRowFilter(RowFilter.regexFilter(search));
    }
}
