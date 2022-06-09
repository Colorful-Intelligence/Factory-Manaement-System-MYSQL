
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
public class JInternalFrame_customer extends javax.swing.JInternalFrame implements JInternalFrames{
    
    DefaultTableModel model;
    CustomerOperations cst_operations = new CustomerOperations();

    /**
     * Creates new form JInternalFrame_customer
     */
    public JInternalFrame_customer() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        model =(DefaultTableModel) Table_customer.getModel();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TF_cst_id = new javax.swing.JTextField();
        TF_cst_name = new javax.swing.JTextField();
        TF_cst_surname = new javax.swing.JTextField();
        CB_cst_nationality = new javax.swing.JComboBox<>();
        TF_cst_birthdate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_cst_address = new javax.swing.JTextArea();
        TF_cst_search = new javax.swing.JTextField();
        Button_add = new javax.swing.JButton();
        Button_delete = new javax.swing.JButton();
        Button_update = new javax.swing.JButton();
        Button_clear = new javax.swing.JButton();
        label_message = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table_customer = new javax.swing.JTable();
        TF_cst_phone = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(16, 78, 139));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Surname");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nationality");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Birth Date");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address");

        TF_cst_id.setEditable(false);

        CB_cst_nationality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT A NATIONALTY", "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "The Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo, Democratic Republic of the", "Congo, Republic of the", "Costa Rica", "Côte d’Ivoire", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor (Timor-Leste)", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "The Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, North", "Korea, South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia, Federated States of", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar (Burma)", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Macedonia", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "Spain", "Sri Lanka", "Sudan", "Sudan, South", "Suriname", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe", " " }));

        TF_cst_birthdate.setText("DD.MM.YYYY");
        TF_cst_birthdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TF_cst_birthdateMouseClicked(evt);
            }
        });

        TA_cst_address.setColumns(20);
        TA_cst_address.setRows(5);
        jScrollPane1.setViewportView(TA_cst_address);

        TF_cst_search.setText("                                                                                                                                         SEARCH AREA");
        TF_cst_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TF_cst_searchMouseClicked(evt);
            }
        });
        TF_cst_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_cst_searchKeyReleased(evt);
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

        Button_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/updated.png"))); // NOI18N
        Button_update.setText("UPDATE");
        Button_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_updateActionPerformed(evt);
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

        Table_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Customer Surname", "Birth Date", "Nationality", "Address", "Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_customerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Table_customer);
        if (Table_customer.getColumnModel().getColumnCount() > 0) {
            Table_customer.getColumnModel().getColumn(0).setResizable(false);
            Table_customer.getColumnModel().getColumn(1).setResizable(false);
            Table_customer.getColumnModel().getColumn(2).setResizable(false);
            Table_customer.getColumnModel().getColumn(3).setResizable(false);
            Table_customer.getColumnModel().getColumn(4).setResizable(false);
            Table_customer.getColumnModel().getColumn(5).setResizable(false);
            Table_customer.getColumnModel().getColumn(6).setResizable(false);
        }

        TF_cst_phone.setText("XXX-XXX-XXXX");
        TF_cst_phone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TF_cst_phoneMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 226, Short.MAX_VALUE)
                        .addComponent(label_message, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TF_cst_id)
                                    .addComponent(TF_cst_name)
                                    .addComponent(TF_cst_surname)
                                    .addComponent(CB_cst_nationality, 0, 168, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                .addComponent(TF_cst_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(TF_cst_phone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button_add, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_update, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(157, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(135, 212, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(TF_cst_search, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE))
                .addGap(153, 153, 153))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(TF_cst_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(TF_cst_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Button_add, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(TF_cst_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(TF_cst_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CB_cst_nationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(TF_cst_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Button_update, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(label_message, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addComponent(TF_cst_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
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
        
        String name = TF_cst_name.getText();
        String surname = TF_cst_surname.getText();
        String birth_date = TF_cst_birthdate.getText();
        String nationality = String.valueOf(CB_cst_nationality.getSelectedItem());
        String address = TA_cst_address.getText();
        String phone = TF_cst_phone.getText();
        
        
        cst_operations.addCustomer(name, surname, birth_date,nationality,address,phone);
        showAll();
        
        
    }//GEN-LAST:event_Button_addActionPerformed

    private void Button_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_deleteActionPerformed
        int selectedrow = Table_customer.getSelectedRow();
         if (selectedrow == -1) {
           if (model.getRowCount() == 0 ) {
               label_message.setText("TABLE IS EMPTY");
           }
           else {
               label_message.setText("PLEASE CHOOSE A CUSTOMER");
           }
      
       }
       else {
           int id = (int)model.getValueAt(selectedrow,0);
           
           cst_operations.delete(id);
           
           showAll();
           
           label_message.setText("CUSTOMER IS DELETED SUCCESSFULLLY");
           clearAreas();
           
           
           
       }
    }//GEN-LAST:event_Button_deleteActionPerformed

    private void Button_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_updateActionPerformed
       
        String name = TF_cst_name.getText();
        String surname = TF_cst_surname.getText();
        String birth_date = TF_cst_birthdate.getText();
        String nationality = String.valueOf(CB_cst_nationality.getSelectedItem());
        String address = TA_cst_address.getText();
        String phone = TF_cst_phone.getText();
        
        
        int selectedrow = Table_customer.getSelectedRow();
        
        if (selectedrow == -1) {
            
            if (model.getRowCount() == 0) {
                label_message.setText("TABLE IS EMPYT");
            }
            else {
                label_message.setText("PLEASE CHOOSE A CUSTOMER");
            }
        }
        else {
            
            
            
            
            int id = (int)model.getValueAt(selectedrow,0);
            
            
            
            cst_operations.updateCustomer(id, name, surname, birth_date, nationality, address, phone);
            
            showAll();
            
            label_message.setText("CUSTOMER IS UPDATE SUCCESSFULLLY");
        }
        
        
    }//GEN-LAST:event_Button_updateActionPerformed

    private void Button_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_clearActionPerformed
      clearAreas();
    }//GEN-LAST:event_Button_clearActionPerformed

    private void TF_cst_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_cst_searchKeyReleased
        
        
        String search = TF_cst_search.getText();
        dynamicSearch(search);
        
        
        
    }//GEN-LAST:event_TF_cst_searchKeyReleased

    private void Table_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_customerMouseClicked
        
        int selectedrow = Table_customer.getSelectedRow();
        TF_cst_id.setText(model.getValueAt(selectedrow, 0).toString());
        TF_cst_name.setText(model.getValueAt(selectedrow, 1).toString());
        TF_cst_surname.setText(model.getValueAt(selectedrow, 2).toString());
        TF_cst_birthdate.setText(model.getValueAt(selectedrow, 3).toString());
        CB_cst_nationality.setSelectedItem(model.getValueAt(selectedrow, 4));
        TA_cst_address.setText(model.getValueAt(selectedrow, 5).toString());
        TF_cst_phone.setText(model.getValueAt(selectedrow, 6).toString());
        
    }//GEN-LAST:event_Table_customerMouseClicked

    private void TF_cst_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF_cst_searchMouseClicked
        TF_cst_search.setText("");
    }//GEN-LAST:event_TF_cst_searchMouseClicked

    private void TF_cst_birthdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF_cst_birthdateMouseClicked
        TF_cst_birthdate.setText("");
    }//GEN-LAST:event_TF_cst_birthdateMouseClicked

    private void TF_cst_phoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF_cst_phoneMouseClicked
      TF_cst_phone.setText("");
    }//GEN-LAST:event_TF_cst_phoneMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_add;
    private javax.swing.JButton Button_clear;
    private javax.swing.JButton Button_delete;
    private javax.swing.JButton Button_update;
    private javax.swing.JComboBox<String> CB_cst_nationality;
    private javax.swing.JTextArea TA_cst_address;
    private javax.swing.JTextField TF_cst_birthdate;
    private javax.swing.JTextField TF_cst_id;
    private javax.swing.JTextField TF_cst_name;
    private javax.swing.JTextField TF_cst_phone;
    private javax.swing.JTextField TF_cst_search;
    private javax.swing.JTextField TF_cst_surname;
    private javax.swing.JTable Table_customer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label_message;
    // End of variables declaration//GEN-END:variables

    @Override
    public void showAll() {
       model.setRowCount(0);
        
       ArrayList<Customer> cst = new ArrayList<Customer>();
       
       cst = cst_operations.ShowCustomers();
       
       if(cst != null){
           
           for(Customer element : cst){
               
               Object[] x = {element.getId(),element.getName(),element.getSurname(),element.getBirth_date(),element.getNationality(),element.getAddress(),element.getPhone()};
               model.addRow(x);
               
           
           }
       
       
       }
        
    }

    @Override
    public void clearAreas() {
        TF_cst_id.setText("");
        TF_cst_name.setText("");
        TF_cst_surname.setText("");
        TF_cst_birthdate.setText("DD.MM.YYYY");
        CB_cst_nationality.setSelectedIndex(0);
        TA_cst_address.setText("");
        TF_cst_phone.setText("XXX-XXX-XXXX");
        label_message.setText("");
        
        
    }

    @Override
    public void dynamicSearch(String search) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        
        
        Table_customer.setRowSorter(tr);
        
        
        tr.setRowFilter(RowFilter.regexFilter(search));
    }
}