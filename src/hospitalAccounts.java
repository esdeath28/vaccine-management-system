
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class hospitalAccounts extends javax.swing.JFrame {

    //mouse drag
        int mouseX;
        int mouseY;
        // screen pos
        int wid = (Toolkit.getDefaultToolkit().getScreenSize().width)/2-533;
        int hit = (Toolkit.getDefaultToolkit().getScreenSize().height)/2-400;

        int X;
        int Y;
        
        String hosID = "";
        
    public hospitalAccounts(int x, int y, String hospitalID) {
        initComponents();
        
        //icon image
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
        
        // position
        this.setLocation(wid,hit);
        
        keyword.setBackground(new java.awt.Color(255,255,255,0));
        
        System.out.println(hospitalID);
        hosID = hospitalID ;
        
        
        
         try {
                                          
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection connection = DriverManager
.getConnection(
"jdbc:sqlserver://localhost:1433;databaseName=SD3104;selectMethod=cursor", "sa", "123456");
System.out.println("DATABASE NAME IS:"
+ connection.getMetaData().getDatabaseProductName());
Statement statement = connection.createStatement();
ResultSet resultSet = statement
.executeQuery(" select * from accounts where hospital_id='"+hosID+"'");



while (resultSet.next()) {
    String tid= resultSet.getString("transaction_id");
    
    String cid=     resultSet.getString("customer_id");
    
    String vid=    resultSet.getString("vaccine_id");
    
    String sale=    resultSet.getString("sale");
    
    String vat=   resultSet.getString("vat");
    
    String dinfo=   resultSet.getString("dose_info");
      
    
    String availableVac[]={tid,cid,vid,sale,vat,dinfo};
    
    DefaultTableModel availableVacTable =  (DefaultTableModel)availablevacs.getModel();
    availableVacTable.addRow(availableVac);
       
       
}

} catch (Exception e) {
e.printStackTrace();
}
        
        
        
        
        
        
        
        
    }
    
    public hospitalAccounts() {
        initComponents();
        
        //icon image
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
        
        // position
        this.setLocation(wid,hit);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profile = new javax.swing.JLabel();
        vaccine_ = new javax.swing.JLabel();
        inventory_ = new javax.swing.JLabel();
        customer_ = new javax.swing.JLabel();
        doctor_ = new javax.swing.JLabel();
        accounts_ = new javax.swing.JLabel();
        requests_ = new javax.swing.JLabel();
        logout_ = new javax.swing.JLabel();
        report_ = new javax.swing.JLabel();
        getApp_ = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        availablevacs = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        keyword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        drag_ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 28, 37, 37));

        vaccine_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vaccine.png"))); // NOI18N
        vaccine_.setText("jLabel2");
        vaccine_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vaccine_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                vaccine_MouseMoved(evt);
            }
        });
        vaccine_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vaccine_MouseClicked(evt);
            }
        });
        getContentPane().add(vaccine_, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 83, 195, 60));

        inventory_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventory.png"))); // NOI18N
        inventory_.setText("jLabel2");
        inventory_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inventory_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                inventory_MouseMoved(evt);
            }
        });
        inventory_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventory_MouseClicked(evt);
            }
        });
        getContentPane().add(inventory_, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 143, 195, 60));

        customer_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer.png"))); // NOI18N
        customer_.setText("jLabel2");
        customer_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customer_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                customer_MouseMoved(evt);
            }
        });
        customer_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customer_MouseClicked(evt);
            }
        });
        getContentPane().add(customer_, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 203, 195, 60));

        doctor_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor.png"))); // NOI18N
        doctor_.setText("jLabel2");
        doctor_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doctor_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                doctor_MouseMoved(evt);
            }
        });
        doctor_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctor_MouseClicked(evt);
            }
        });
        getContentPane().add(doctor_, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 263, 195, 60));

        accounts_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accountsHover.png"))); // NOI18N
        accounts_.setText("jLabel2");
        accounts_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accounts_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                accounts_MouseMoved(evt);
            }
        });
        accounts_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accounts_MouseClicked(evt);
            }
        });
        getContentPane().add(accounts_, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 323, 195, 60));

        requests_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/requests.png"))); // NOI18N
        requests_.setText("jLabel2");
        requests_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        requests_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                requests_MouseMoved(evt);
            }
        });
        requests_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requests_MouseClicked(evt);
            }
        });
        getContentPane().add(requests_, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 383, 195, 60));

        logout_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        logout_.setText("jLabel2");
        logout_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                logout_MouseMoved(evt);
            }
        });
        logout_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_MouseClicked(evt);
            }
        });
        getContentPane().add(logout_, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 609, 195, 60));

        report_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/report.png"))); // NOI18N
        report_.setText("jLabel2");
        report_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        report_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                report_MouseMoved(evt);
            }
        });
        report_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                report_MouseClicked(evt);
            }
        });
        getContentPane().add(report_, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 669, 195, 60));

        getApp_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app.png"))); // NOI18N
        getApp_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getApp_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                getApp_MouseMoved(evt);
            }
        });
        getApp_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getApp_MouseClicked(evt);
            }
        });
        getContentPane().add(getApp_, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 729, 195, 60));

        availablevacs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "transaction_id", "customer_id", "vaccine_id", "sale", "vat", "dose_info"
            }
        ));
        jScrollPane1.setViewportView(availablevacs);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 700, 390));

        jLabel1.setText("Search By");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 80, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "all", "transaction_id", "customer_id", "vaccine_id", "sale", "vat", "dose_info" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 130, 30));

        jLabel2.setText("Enter Keywords");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 100, 30));

        keyword.setBorder(null);
        getContentPane().add(keyword, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 180, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchpanel.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 210, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchbutton.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 180, 102, 30));

        drag_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main panel.png"))); // NOI18N
        drag_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                drag_MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                drag_MouseMoved(evt);
            }
        });
        drag_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                drag_MousePressed(evt);
            }
        });
        getContentPane().add(drag_, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1066, 799));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accounts_MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accounts_MouseMoved
        // TODO add your handling code here:
        ImageIcon vc = new ImageIcon(getClass().getResource("vaccine.png"));
        vaccine_.setIcon(vc);
        ImageIcon in = new ImageIcon(getClass().getResource("inventory.png"));
        inventory_.setIcon(in);
        ImageIcon cu = new ImageIcon(getClass().getResource("customer.png"));
        customer_.setIcon(cu);
        ImageIcon doc = new ImageIcon(getClass().getResource("doctor.png"));
        doctor_.setIcon(doc);
        ImageIcon acc = new ImageIcon(getClass().getResource("accountsHover.png"));
        accounts_.setIcon(acc);
        ImageIcon req = new ImageIcon(getClass().getResource("requests.png"));
        requests_.setIcon(req);
    }//GEN-LAST:event_accounts_MouseMoved

    private void accounts_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accounts_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_accounts_MouseClicked

    private void logout_MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_MouseMoved
        // TODO add your handling code here:
        ImageIcon logout = new ImageIcon(getClass().getResource("logoutHOver.png"));
        logout_.setIcon(logout);
        ImageIcon askQ = new ImageIcon(getClass().getResource("report.png"));
        report_.setIcon(askQ);
        ImageIcon gapp = new ImageIcon(getClass().getResource("app.png"));
        getApp_.setIcon(gapp);
    }//GEN-LAST:event_logout_MouseMoved

    private void logout_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_MouseClicked
        // TODO add your handling code here:
        this.dispose();
        accessibility ac = new accessibility();
        ac.setVisible(true);
    }//GEN-LAST:event_logout_MouseClicked

    private void report_MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_report_MouseMoved
        // TODO add your handling code here:
        ImageIcon logout = new ImageIcon(getClass().getResource("logout.png"));
        logout_.setIcon(logout);
        ImageIcon askQ = new ImageIcon(getClass().getResource("reportHover.png"));
        report_.setIcon(askQ);
        ImageIcon gapp = new ImageIcon(getClass().getResource("app.png"));
        getApp_.setIcon(gapp);
    }//GEN-LAST:event_report_MouseMoved

    private void report_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_report_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_report_MouseClicked

    private void getApp_MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getApp_MouseMoved
        // TODO add your handling code here:
        ImageIcon logout = new ImageIcon(getClass().getResource("logout.png"));
        logout_.setIcon(logout);
        ImageIcon askQ = new ImageIcon(getClass().getResource("report.png"));
        report_.setIcon(askQ);
        ImageIcon gapp = new ImageIcon(getClass().getResource("appHover.png"));
        getApp_.setIcon(gapp);
    }//GEN-LAST:event_getApp_MouseMoved

    private void getApp_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getApp_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_getApp_MouseClicked

    private void drag_MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drag_MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-mouseX, y-mouseY);
    }//GEN-LAST:event_drag_MouseDragged

    private void drag_MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drag_MouseMoved
        // TODO add your handling code here:
        ImageIcon vc = new ImageIcon(getClass().getResource("vaccine.png"));
        vaccine_.setIcon(vc);
        ImageIcon in = new ImageIcon(getClass().getResource("inventory.png"));
        inventory_.setIcon(in);
        ImageIcon cu = new ImageIcon(getClass().getResource("customer.png"));
        customer_.setIcon(cu);
        ImageIcon doc = new ImageIcon(getClass().getResource("doctor.png"));
        doctor_.setIcon(doc);
        ImageIcon acc = new ImageIcon(getClass().getResource("accountsHover.png"));
        accounts_.setIcon(acc);
        ImageIcon req = new ImageIcon(getClass().getResource("requests.png"));
        requests_.setIcon(req);

        ImageIcon logout = new ImageIcon(getClass().getResource("logout.png"));
        logout_.setIcon(logout);
        ImageIcon askQ = new ImageIcon(getClass().getResource("report.png"));
        report_.setIcon(askQ);
        ImageIcon gapp = new ImageIcon(getClass().getResource("app.png"));
        getApp_.setIcon(gapp);
    }//GEN-LAST:event_drag_MouseMoved

    private void drag_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drag_MousePressed
        // TODO add your handling code here:
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_drag_MousePressed

    private void vaccine_MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vaccine_MouseMoved
        // TODO add your handling code here:
        ImageIcon vc = new ImageIcon(getClass().getResource("vaccineHover.png"));
        vaccine_.setIcon(vc);
        ImageIcon in = new ImageIcon(getClass().getResource("inventory.png"));
        inventory_.setIcon(in);
        ImageIcon cu = new ImageIcon(getClass().getResource("customer.png"));
        customer_.setIcon(cu);
        ImageIcon doc = new ImageIcon(getClass().getResource("doctor.png"));
        doctor_.setIcon(doc);
        ImageIcon acc = new ImageIcon(getClass().getResource("accountsHover.png"));
        accounts_.setIcon(acc);
        ImageIcon req = new ImageIcon(getClass().getResource("requests.png"));
        requests_.setIcon(req);
    }//GEN-LAST:event_vaccine_MouseMoved

    private void vaccine_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vaccine_MouseClicked
        // TODO add your handling code here:
        int nx = (int) getLocation().getX();
        int ny = (int) getLocation().getY();

        hospitalPage hp = new hospitalPage(nx,ny,hosID);
        hp.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_vaccine_MouseClicked

    private void requests_MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requests_MouseMoved
        // TODO add your handling code here:
        ImageIcon vc = new ImageIcon(getClass().getResource("vaccine.png"));
        vaccine_.setIcon(vc);
        ImageIcon in = new ImageIcon(getClass().getResource("inventory.png"));
        inventory_.setIcon(in);
        ImageIcon cu = new ImageIcon(getClass().getResource("customer.png"));
        customer_.setIcon(cu);
        ImageIcon doc = new ImageIcon(getClass().getResource("doctor.png"));
        doctor_.setIcon(doc);
        ImageIcon acc = new ImageIcon(getClass().getResource("accountsHover.png"));
        accounts_.setIcon(acc);
        ImageIcon req = new ImageIcon(getClass().getResource("requestsHover.png"));
        requests_.setIcon(req);
    }//GEN-LAST:event_requests_MouseMoved

    private void requests_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requests_MouseClicked
        // TODO add your handling code here:
        int nx = (int) getLocation().getX();
        int ny = (int) getLocation().getY();

        hospitalCustomerRequest req = new hospitalCustomerRequest(nx,ny,hosID);
        req.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_requests_MouseClicked

    private void inventory_MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventory_MouseMoved
        // TODO add your handling code here:
        ImageIcon vc = new ImageIcon(getClass().getResource("vaccine.png"));
        vaccine_.setIcon(vc);
        ImageIcon in = new ImageIcon(getClass().getResource("inventoryHover.png"));
        inventory_.setIcon(in);
        ImageIcon cu = new ImageIcon(getClass().getResource("customer.png"));
        customer_.setIcon(cu);
        ImageIcon doc = new ImageIcon(getClass().getResource("doctor.png"));
        doctor_.setIcon(doc);
        ImageIcon acc = new ImageIcon(getClass().getResource("accountsHover.png"));
        accounts_.setIcon(acc);
        ImageIcon req = new ImageIcon(getClass().getResource("requests.png"));
        requests_.setIcon(req);
    }//GEN-LAST:event_inventory_MouseMoved

    private void inventory_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventory_MouseClicked
        // TODO add your handling code here:
        int nx = (int) getLocation().getX();
        int ny = (int) getLocation().getY();

        hospitalInventory hi = new hospitalInventory(nx,ny,hosID);
        hi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_inventory_MouseClicked

    private void customer_MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customer_MouseMoved
        // TODO add your handling code here:
        ImageIcon vc = new ImageIcon(getClass().getResource("vaccine.png"));
        vaccine_.setIcon(vc);
        ImageIcon in = new ImageIcon(getClass().getResource("inventory.png"));
        inventory_.setIcon(in);
        ImageIcon cu = new ImageIcon(getClass().getResource("customerHover.png"));
        customer_.setIcon(cu);
        ImageIcon doc = new ImageIcon(getClass().getResource("doctor.png"));
        doctor_.setIcon(doc);
        ImageIcon acc = new ImageIcon(getClass().getResource("accountsHover.png"));
        accounts_.setIcon(acc);
        ImageIcon req = new ImageIcon(getClass().getResource("requests.png"));
        requests_.setIcon(req);
    }//GEN-LAST:event_customer_MouseMoved

    private void customer_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customer_MouseClicked
        // TODO add your handling code here:
        int nx = (int) getLocation().getX();
        int ny = (int) getLocation().getY();

        hospitalCustomer hc = new hospitalCustomer(nx,ny,hosID);
        hc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_customer_MouseClicked

    private void doctor_MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctor_MouseMoved
        // TODO add your handling code here:
        ImageIcon vc = new ImageIcon(getClass().getResource("vaccine.png"));
        vaccine_.setIcon(vc);
        ImageIcon in = new ImageIcon(getClass().getResource("inventory.png"));
        inventory_.setIcon(in);
        ImageIcon cu = new ImageIcon(getClass().getResource("customer.png"));
        customer_.setIcon(cu);
        ImageIcon doc = new ImageIcon(getClass().getResource("doctorHover.png"));
        doctor_.setIcon(doc);
        ImageIcon acc = new ImageIcon(getClass().getResource("accountsHover.png"));
        accounts_.setIcon(acc);
        ImageIcon req = new ImageIcon(getClass().getResource("requests.png"));
        requests_.setIcon(req);
    }//GEN-LAST:event_doctor_MouseMoved

    private void doctor_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctor_MouseClicked
        // TODO add your handling code here:
        int nx = (int) getLocation().getX();
        int ny = (int) getLocation().getY();

        hospitalDoctor hi = new hospitalDoctor(nx,ny,hosID);
        hi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_doctor_MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        
        
        DefaultTableModel avl =  (DefaultTableModel)availablevacs.getModel();
        avl.setRowCount(0);

        String value= jComboBox1.getSelectedItem().toString();
        String content= keyword.getText().toString();

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=SD3104;selectMethod=cursor", "sa", "123456");
            System.out.println("DATABASE NAME IS:"
                + connection.getMetaData().getDatabaseProductName());
            Statement statement = connection.createStatement();

            String query=" select * from accounts where hospital_id='"+hosID+"'";
            if(value.equals("all")){

                query=query+"";

            }

            else{

                query=query+" and "+value+" like '%"+content+"%'";

            }

            ResultSet resultSet = statement
            .executeQuery(query);
            while (resultSet.next()) {
                String tid= resultSet.getString("transaction_id");

                String cid=     resultSet.getString("customer_id");

                String vid=    resultSet.getString("vaccine_id");

                String sale=    resultSet.getString("sale");

                String vat=   resultSet.getString("vat");

                String dinfo=   resultSet.getString("dose_info");

                String availableVac[]={tid,cid,vid,sale,vat,dinfo};

                DefaultTableModel availableVacTable =  (DefaultTableModel)availablevacs.getModel();
                availableVacTable.addRow(availableVac);

            }
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(hospitalAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hospitalAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hospitalAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hospitalAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hospitalAccounts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accounts_;
    private javax.swing.JTable availablevacs;
    private javax.swing.JLabel customer_;
    private javax.swing.JLabel doctor_;
    private javax.swing.JLabel drag_;
    private javax.swing.JLabel getApp_;
    private javax.swing.JLabel inventory_;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField keyword;
    private javax.swing.JLabel logout_;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel report_;
    private javax.swing.JLabel requests_;
    private javax.swing.JLabel vaccine_;
    // End of variables declaration//GEN-END:variables
}
