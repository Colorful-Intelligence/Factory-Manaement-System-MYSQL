
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
public class JInternalFrame_jobApplication extends javax.swing.JInternalFrame implements JInternalFrames{
    
    DefaultTableModel model;
    JobApplicationOperations ja_operations = new JobApplicationOperations();

    /**
     * Creates new form JInternalFrame_jobApplication
     */
    public JInternalFrame_jobApplication() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        model = (DefaultTableModel) Table_job_application.getModel();
        
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
        TF_id = new javax.swing.JTextField();
        TF_name = new javax.swing.JTextField();
        TF_surname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_address = new javax.swing.JTextArea();
        TF_phone = new javax.swing.JTextField();
        TF_email = new javax.swing.JTextField();
        TF_app_deptID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_job_application = new javax.swing.JTable();
        TF_search = new javax.swing.JTextField();
        Button_add = new javax.swing.JButton();
        Button_delete = new javax.swing.JButton();
        Button_update = new javax.swing.JButton();
        Button_clear = new javax.swing.JButton();
        label_message = new javax.swing.JLabel();
        CB_worktype = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(16, 78, 139));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAME");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SURNAME");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ADDRESS");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PHONE");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E-MAIL");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Job Application Dept ID");

        TF_id.setEditable(false);

        TA_address.setColumns(20);
        TA_address.setRows(5);
        jScrollPane1.setViewportView(TA_address);

        TF_phone.setText("XXX-XXX-XXXX");
        TF_phone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TF_phoneMouseClicked(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WORK TYPE");

        Table_job_application.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "SURNAME", "ADDRESS", "PHONE", "E-MAIL", "Dept. ID", "WORK TYPE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table_job_application.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_job_applicationMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table_job_application);
        if (Table_job_application.getColumnModel().getColumnCount() > 0) {
            Table_job_application.getColumnModel().getColumn(0).setResizable(false);
            Table_job_application.getColumnModel().getColumn(1).setResizable(false);
            Table_job_application.getColumnModel().getColumn(2).setResizable(false);
            Table_job_application.getColumnModel().getColumn(3).setResizable(false);
            Table_job_application.getColumnModel().getColumn(4).setResizable(false);
            Table_job_application.getColumnModel().getColumn(5).setResizable(false);
            Table_job_application.getColumnModel().getColumn(6).setResizable(false);
            Table_job_application.getColumnModel().getColumn(7).setResizable(false);
        }

        TF_search.setText("                                                                                                                                               SEARCH AREA");
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

        CB_worktype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT A WORK TYPE", "PART TIME", "FULL TIME" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TF_id)
                                    .addComponent(TF_name)
                                    .addComponent(TF_surname)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(136, 136, 136)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel1))
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TF_phone)
                                            .addComponent(TF_email)
                                            .addComponent(TF_app_deptID)
                                            .addComponent(CB_worktype, 0, 229, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(98, 98, 98)
                                        .addComponent(label_message, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel5))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Button_update, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(Button_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
                            .addComponent(TF_search))))
                .addGap(54, 83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(TF_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(TF_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(TF_app_deptID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TF_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(CB_worktype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addComponent(label_message, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_add, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button_update, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(Button_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(TF_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
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
        
        String name = TF_name.getText();
        String surname = TF_surname.getText();
        String address = TA_address.getText();
        String phone = TF_phone.getText();
        String email = TF_email.getText();
        int dpt_id = Integer.parseInt(TF_app_deptID.getText());
        String worktype = String.valueOf(CB_worktype.getSelectedItem());
        
        ja_operations.addJobApplication(name, surname, address, phone, email, dpt_id, worktype);
        
        showAll();
        
        
    }//GEN-LAST:event_Button_addActionPerformed

    private void Button_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_deleteActionPerformed
       
         int selectedrow = Table_job_application.getSelectedRow();
         if (selectedrow == -1) {
           if (model.getRowCount() == 0 ) {
               label_message.setText("TABLE IS EMPTY");
           }
           else {
               label_message.setText("PLEASE CHOOSE A JOB APPLICATION");
           }
      
       }
       else {
           int id = (int)model.getValueAt(selectedrow,0);
           
           ja_operations.delete(id);
           
           showAll();
           
           label_message.setText("JOB APPLICATION IS DELETED SUCCESSFULLLY");
           clearAreas();
           
           
           
       }
        
    }//GEN-LAST:event_Button_deleteActionPerformed

    private void Button_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_updateActionPerformed
        
        String name = TF_name.getText();
        String surname = TF_surname.getText();
        String address = TA_address.getText();
        String phone = TF_phone.getText();
        String email = TF_email.getText();
        int dpt_id = Integer.parseInt(TF_app_deptID.getText());
        String worktype = String.valueOf(CB_worktype.getSelectedItem().toString());
        
        int selectedrow = Table_job_application.getSelectedRow();
        
        if (selectedrow == -1) {
            
            if (model.getRowCount() == 0) {
                label_message.setText("TABLE IS EMPYT");
            }
            else {
                label_message.setText("PLEASE CHOOSE A JOB APPLICATION");
            }
        }
        else {
            
            
            
            
            int id = (int)model.getValueAt(selectedrow,0);
            
            
            
            ja_operations.updateJobApplication(id, name, surname, address, phone, email, dpt_id, worktype);
            
            showAll();
            
            label_message.setText("JOB APPLICATION IS UPDATE SUCCESSFULLLY");
        }
        
        
        
        
    }//GEN-LAST:event_Button_updateActionPerformed

    private void TF_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_searchKeyReleased
       
        String search = TF_search.getText();
        dynamicSearch(search);
    }//GEN-LAST:event_TF_searchKeyReleased

    private void Table_job_applicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_job_applicationMouseClicked
        
        int selectedrow = Table_job_application.getSelectedRow();
        TF_id.setText(model.getValueAt(selectedrow, 0).toString());
        TF_name.setText(model.getValueAt(selectedrow, 1).toString());
        TF_surname.setText(model.getValueAt(selectedrow, 2).toString());
        TA_address.setText(model.getValueAt(selectedrow, 3).toString());
        TF_phone.setText(model.getValueAt(selectedrow,4).toString());
        TF_email.setText(model.getValueAt(selectedrow, 5).toString());
        TF_app_deptID.setText(model.getValueAt(selectedrow, 6).toString());
        CB_worktype.setSelectedItem(model.getValueAt(selectedrow, 7));
        
        
    }//GEN-LAST:event_Table_job_applicationMouseClicked

    private void Button_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_clearActionPerformed
        clearAreas();
    }//GEN-LAST:event_Button_clearActionPerformed

    private void TF_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF_searchMouseClicked
        TF_search.setText("");
    }//GEN-LAST:event_TF_searchMouseClicked

    private void TF_phoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TF_phoneMouseClicked
       TF_phone.setText("");
    }//GEN-LAST:event_TF_phoneMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_add;
    private javax.swing.JButton Button_clear;
    private javax.swing.JButton Button_delete;
    private javax.swing.JButton Button_update;
    private javax.swing.JComboBox<String> CB_worktype;
    private javax.swing.JTextArea TA_address;
    private javax.swing.JTextField TF_app_deptID;
    private javax.swing.JTextField TF_email;
    private javax.swing.JTextField TF_id;
    private javax.swing.JTextField TF_name;
    private javax.swing.JTextField TF_phone;
    private javax.swing.JTextField TF_search;
    private javax.swing.JTextField TF_surname;
    private javax.swing.JTable Table_job_application;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_message;
    // End of variables declaration//GEN-END:variables

    @Override
    public void showAll() {
        model.setRowCount(0);
        ArrayList<JobApplication> ja = new ArrayList<JobApplication>();
        
        ja = ja_operations.showJobApplications();
        
        
        if(ja != null){
            
            for(JobApplication element : ja){
                
                Object[] x = {element.getApplication_id(),element.getName(),element.getSurname(),element.getAddress(),element.getPhone(),element.getEmail(),element.getDpt_id(),element.getWork_type()};
                model.addRow(x);
            
            
            }
        
        
        
        
        }
        
    }

    @Override
    public void clearAreas() {
        TF_id.setText("");
        TF_name.setText("");
        TF_surname.setText("");
        TA_address.setText("");
        TF_phone.setText("XXX-XXX-XXXX");
        TF_email.setText("");
        TF_app_deptID.setText("");
        CB_worktype.setSelectedIndex(0);
    }

    @Override
    public void dynamicSearch(String search) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        
        
        Table_job_application.setRowSorter(tr);
        
        
        tr.setRowFilter(RowFilter.regexFilter(search));
        
    }
}
