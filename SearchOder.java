package floraworld;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.sql.DriverManager;
public class SearchOder extends javax.swing.JFrame {
    Connection con;
    Statement st;
    ResultSet rs,rs1;
    String qry,qry1;
    public SearchOder() {
        initComponents();
         try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
             con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Sharansh","12345");
             st= con.createStatement();
            // jComboBox1.addItem("====SELECT====");
             qry="select ONDate from Product ";
             rs=st.executeQuery(qry);
            while(rs.next())
            {
                jComboBox1.addItem(rs.getDate(1).toLocalDate().toString());
               
            }
    } 
       catch (Exception ex)
       {
       System.out.println("Problem"+ex.getMessage());
       }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Order Search");

        jLabel2.setText("Select a  Date ");

        jLabel3.setText("Product Name ");

        jLabel4.setText("Product  qty ");

        jLabel5.setText("Price ");

        jLabel6.setText("Custamer Name");

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Product Name " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Qty" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "price " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        jList5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Name" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList5);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(87, 87, 87)
                                        .addComponent(jLabel4)
                                        .addGap(97, 97, 97)
                                        .addComponent(jLabel5)))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(239, 239, 239)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
     try{
            String pd = String.valueOf(evt.getItem());
             System.out.println(pd);
            Class.forName("oracle.jdbc.driver.OracleDriver");
             con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Sharansh","12345");
             st= con.createStatement();
             qry="select prodnm ,qty,price from Product where to_char(OnDate,'YYYY-mm-dd') like '"+pd+"'";
             
           //  System.out.println(qry);
            
             rs=st.executeQuery(qry);
             DefaultListModel dm=new DefaultListModel();
             jList2.setModel(dm);
             javax.swing.DefaultListModel dm1=new javax.swing.DefaultListModel();
             jList3.setModel(dm1);
             javax.swing.DefaultListModel dm2=new javax.swing.DefaultListModel();
             jList4.setModel(dm2);
           //System.out.println(rs);
             if(rs.next())
            {
               dm.addElement(rs.getString(1));
                 dm1.addElement(rs.getString(2));
                   dm2.addElement(rs.getString(3));
                //jList3.addElement(rs.getString(3));
                //jList4.addElement(rs.getString(4));
                //jList5.addElement(rs.getString(5));
            }   
             qry1="select custnm from Orders";
             rs1=st.executeQuery(qry1);
             DefaultListModel dm3=new DefaultListModel();
             jList5.setModel(dm3);
             if (rs1.next())
             {
                 dm3.addElement(rs1.getString(1));
             }
            {
                System.out.println("saved");
            }
    } 
       catch (Exception ex)
       {
       System.out.println("Problem"+ex.getMessage());
       }
    }//GEN-LAST:event_jComboBox1ItemStateChanged
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchOder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
