/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adbms;

/**
 *
 * @author user
 */
public class showall extends javax.swing.JFrame {

    /**
     * Creates new form showall
     */
    public showall() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("blood_bank?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        bloodQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Blood b");
        bloodList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : bloodQuery.getResultList();
        bloodRequestQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM BloodRequest b");
        bloodRequestList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : bloodRequestQuery.getResultList();
        donorQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM Donor d");
        donorList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : donorQuery.getResultList();
        employeeQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT e FROM Employee e");
        employeeList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : employeeQuery.getResultList();
        hospitalQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT h FROM Hospital h");
        hospitalList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : hospitalQuery.getResultList();
        bloodRequestQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM BloodRequest b");
        bloodRequestList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : bloodRequestQuery1.getResultList();
        donorQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM Donor d");
        donorList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : donorQuery1.getResultList();
        branchQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Branch b");
        branchList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : branchQuery.getResultList();
        hospitalQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT h FROM Hospital h");
        hospitalList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : hospitalQuery1.getResultList();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, bloodList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${donorId}"));
        columnBinding.setColumnName("Donor Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${branchId}"));
        columnBinding.setColumnName("Branch Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${BDate}"));
        columnBinding.setColumnName("BDate");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${BPrice}"));
        columnBinding.setColumnName("BPrice");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${BGrp}"));
        columnBinding.setColumnName("BGrp");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${packetId}"));
        columnBinding.setColumnName("Packet Id");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane1.setViewportView(jTable1);

        jTabbedPane1.addTab("blood", jScrollPane1);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, employeeList, jTable5);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${EId}"));
        columnBinding.setColumnName("EId");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${EName}"));
        columnBinding.setColumnName("EName");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${EEmail}"));
        columnBinding.setColumnName("EEmail");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${EDesig}"));
        columnBinding.setColumnName("EDesig");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${EMobileNo}"));
        columnBinding.setColumnName("EMobile No");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${EAddress}"));
        columnBinding.setColumnName("EAddress");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${branchId}"));
        columnBinding.setColumnName("Branch Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ESalary}"));
        columnBinding.setColumnName("ESalary");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane5.setViewportView(jTable5);

        jTabbedPane1.addTab("employee", jScrollPane5);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, hospitalList, jTable6);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${HId}"));
        columnBinding.setColumnName("HId");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${HName}"));
        columnBinding.setColumnName("HName");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${HContactNo}"));
        columnBinding.setColumnName("HContact No");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${HLocation}"));
        columnBinding.setColumnName("HLocation");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${HEmail}"));
        columnBinding.setColumnName("HEmail");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane6.setViewportView(jTable6);

        jTabbedPane1.addTab("hospital", jScrollPane6);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, bloodRequestList1, jTable2);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${branchId}"));
        columnBinding.setColumnName("Branch Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${HId}"));
        columnBinding.setColumnName("HId");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantitiy}"));
        columnBinding.setColumnName("Quantitiy");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${PGrp}"));
        columnBinding.setColumnName("PGrp");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${PName}"));
        columnBinding.setColumnName("PName");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane2.setViewportView(jTable2);

        jTabbedPane1.addTab("blood request", jScrollPane2);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, donorList1, jTable7);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${branchId}"));
        columnBinding.setColumnName("Branch Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${packetId}"));
        columnBinding.setColumnName("Packet Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${name}"));
        columnBinding.setColumnName("Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${mobileNo}"));
        columnBinding.setColumnName("Mobile No");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${age}"));
        columnBinding.setColumnName("Age");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bloodGrp}"));
        columnBinding.setColumnName("Blood Grp");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${address}"));
        columnBinding.setColumnName("Address");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${donorId}"));
        columnBinding.setColumnName("Donor Id");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane7.setViewportView(jTable7);

        jTabbedPane1.addTab("donor", jScrollPane7);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, branchList, jTable4);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${branchId}"));
        columnBinding.setColumnName("Branch Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${BHead}"));
        columnBinding.setColumnName("BHead");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${BPhone}"));
        columnBinding.setColumnName("BPhone");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${BEmail}"));
        columnBinding.setColumnName("BEmail");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${BLocation}"));
        columnBinding.setColumnName("BLocation");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${license}"));
        columnBinding.setColumnName("License");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane4.setViewportView(jTable4);

        jTabbedPane1.addTab("branch", jScrollPane4);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("MAIN MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        startpage sp = new startpage();
        sp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(showall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showall().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<adbms.Blood> bloodList;
    private javax.persistence.Query bloodQuery;
    private java.util.List<adbms.BloodRequest> bloodRequestList;
    private java.util.List<adbms.BloodRequest> bloodRequestList1;
    private javax.persistence.Query bloodRequestQuery;
    private javax.persistence.Query bloodRequestQuery1;
    private java.util.List<adbms.Branch> branchList;
    private javax.persistence.Query branchQuery;
    private java.util.List<adbms.Donor> donorList;
    private java.util.List<adbms.Donor> donorList1;
    private javax.persistence.Query donorQuery;
    private javax.persistence.Query donorQuery1;
    private java.util.List<adbms.Employee> employeeList;
    private javax.persistence.Query employeeQuery;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<adbms.Hospital> hospitalList;
    private java.util.List<adbms.Hospital> hospitalList1;
    private javax.persistence.Query hospitalQuery;
    private javax.persistence.Query hospitalQuery1;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
