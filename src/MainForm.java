
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    Image burger, pizza, nachos, taco, nugget, chicken, bucket;
    MainForm[] transactionData = new MainForm[10];
    Boolean videoFormOpened = true;
//    CartForm cf;
    
    // food position
    int burgerX = 25, pizzaX = 350, nachosX = 25, tacoX = 350, nuggetX = 25, chickenX = 350;
    int burgerY = 65, pizzaY = 65, nachosY = 200, tacoY = 200, nuggetY = 335,chickenY = 335;

    // food size & re size
    int width = 300, reSizeWidth = 220;
    int height = 110, reSizeHeight = 80;
    
    // food quantity
    int burgerQty, pizzaQty, nachosQty, tacoQty, nuggetQty, chickenQty;
    
    //bucket position
    int bposX = 700;
    int bposY = 305;
    
    //moving position
    int moveX = 0;
    int moveY = 0;
    
    // bucket size
    int bucketWidth = 130;
    int bucketHeight = 140;
    
    boolean burgerOrdered = false, pizzaOrdered =false, nachosOrdered = false,
            tacoOrdered = false, nuggetOrdered = false, chickenOrdered =false;
    
    String foodId;
    
    boolean burgerDragged = false, 
            pizzaDragged = false, 
            nachosDragged = false, 
            tacoDragged = false,
            nuggetDragged = false,
            chickenDragged = false;
    
    public MainForm() {
        initComponents();
        
        burger = new ImageIcon("Assets/food/hamburger.jpg").getImage();
        pizza = new ImageIcon("Assets/food/pizza-pepperoni.jpg").getImage();
        nachos = new ImageIcon("Assets/food/nachos-beef.jpg").getImage();
        taco = new ImageIcon("Assets/food/taco.jpg").getImage();
        nugget = new ImageIcon("Assets/food/nugget.jpeg").getImage();
        chicken = new ImageIcon("Assets/food/fried-chicken.jpg").getImage();
        bucket = new ImageIcon("Assets/food/bucket.png"). getImage();
    }
    
    public MainForm(CartForm[] cartData) {
        initComponents();
        
        burger = new ImageIcon("Assets/food/hamburger.jpg").getImage();
        pizza = new ImageIcon("Assets/food/pizza-pepperoni.jpg").getImage();
        nachos = new ImageIcon("Assets/food/nachos-beef.jpg").getImage();
        taco = new ImageIcon("Assets/food/taco.jpg").getImage();
        nugget = new ImageIcon("Assets/food/nugget.jpeg").getImage();
        chicken = new ImageIcon("Assets/food/fried-chicken.jpg").getImage();
        bucket = new ImageIcon("Assets/food/bucket.png"). getImage();
        
        this.burgerQty = cartData[0].burgerQty;
        this.pizzaQty = cartData[0].pizzaQty;
        this.nachosQty = cartData[0].nachosQty;
        this.tacoQty = cartData[0].tacoQty ;
        this.nuggetQty = cartData[0].nuggetQty;
        this.chickenQty = cartData[0].chickenQty;
        
        this.burgerOrdered = cartData[0].burgerOrdered;
        this.pizzaOrdered = cartData[0].pizzaOrdered;
        this.nachosOrdered = cartData[0].nachosOrdered;
        this.tacoOrdered = cartData[0].tacoOrdered;
        this.nuggetOrdered = cartData[0].nuggetOrdered;
        this.chickenOrdered = cartData[0].chickenOrdered;
        
//        System.out.println("chicken =" + chickenOrdered);
//        System.out.println("qty = " + chickenQty);
    }

//    MainForm(CartForm cf) {
//        initComponents();
//        //this.cf = cf; 
//    }
//    
    @Override
     public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        
        Graphics2D g2d = (Graphics2D) g;
        Graphics2D str = (Graphics2D) g; 
        String instruction = "Throw the food into";
        
        g2d.drawImage(burger, burgerX, burgerY, width, height, null); 
        g2d.drawImage(pizza, pizzaX, pizzaY, width, height, null);
        g2d.drawImage(nachos, nachosX , nachosY, width, height, null);
        g2d.drawImage(taco, tacoX, tacoY, width, height, null);
        g2d.drawImage(nugget, nuggetX , nuggetY, width, height, null);
        g2d.drawImage(chicken, chickenX , chickenY, width, height, null);
        g2d.drawImage(bucket, bposX , bposY, bucketWidth, bucketHeight, null);
        str.setColor(Color.WHITE);
        str.setFont(new Font("Helvetica", Font.BOLD, 16));
        str.drawString(instruction, 694, 265);
        str.drawString("the bucket to order!", 694, 280);
        
        // create object
        transactionData[0] = new MainForm();
                
        if(burgerDragged){ // jika di drag ada gambar baru 
            g2d.drawImage(burger, moveX, moveY, reSizeWidth, reSizeHeight, null);
        }
        else if(nachosDragged){ // jika di drag ada gambar baru 
            g2d.drawImage(nachos, moveX, moveY, reSizeWidth, reSizeHeight, null);
        }
        else if(pizzaDragged){ // jika di drag ada gambar baru 
            g2d.drawImage(pizza, moveX, moveY, reSizeWidth, reSizeHeight, null);
        }
        else if(tacoDragged){ // jika di drag ada gambar baru 
            g2d.drawImage(taco, moveX, moveY, reSizeWidth, reSizeHeight, null);
        }
        else if(nuggetDragged){ // jika di drag ada gambar baru 
            g2d.drawImage(nugget, moveX, moveY, reSizeWidth, reSizeHeight, null);
        }
        else if(chickenDragged){ // jika di drag ada gambar baru 
            g2d.drawImage(chicken, moveX, moveY, reSizeWidth, reSizeHeight, null);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuBar = new javax.swing.JMenu();
        LogoutItem = new javax.swing.JMenuItem();
        ExitItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cartItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(153, 0, 0));
        MainPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MainPanelMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MainPanelMouseMoved(evt);
            }
        });
        MainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MainPanelMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MainPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MainPanelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 879, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        getContentPane().add(MainPanel, java.awt.BorderLayout.CENTER);

        menuBar.setText("Profile");
        menuBar.setFocusTraversalPolicyProvider(true);

        LogoutItem.setText("Logout");
        LogoutItem.setToolTipText("");
        LogoutItem.setContentAreaFilled(false);
        LogoutItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutItemActionPerformed(evt);
            }
        });
        menuBar.add(LogoutItem);

        ExitItem.setText("Exit");
        ExitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitItemActionPerformed(evt);
            }
        });
        menuBar.add(ExitItem);

        jMenuBar1.add(menuBar);

        jMenu2.setText("Transaction");

        cartItem.setText("Cart");
        cartItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartItemActionPerformed(evt);
            }
        });
        jMenu2.add(cartItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cartItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartItemActionPerformed
        
        // set data to transactionData's variable for passing
        transactionData[0].burgerQty = burgerQty ;
        transactionData[0].nachosQty = nachosQty; 
        transactionData[0].pizzaQty = pizzaQty;
        transactionData[0].tacoQty = tacoQty;
        transactionData[0].nuggetQty = nuggetQty;
        transactionData[0].chickenQty = chickenQty;
        
        transactionData[0].burgerOrdered = burgerOrdered;
        transactionData[0].nachosOrdered = nachosOrdered;
        transactionData[0].pizzaOrdered = pizzaOrdered;
        transactionData[0].tacoOrdered = tacoOrdered;
        transactionData[0].nuggetOrdered = nuggetOrdered;
        transactionData[0].chickenOrdered = chickenOrdered;

        
        new CartForm(transactionData).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cartItemActionPerformed

    private void LogoutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutItemActionPerformed
        LoginForm lf = new LoginForm();
        lf.show();
        this.dispose();
    }//GEN-LAST:event_LogoutItemActionPerformed

    private void MainPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPanelMouseEntered
        
    }//GEN-LAST:event_MainPanelMouseEntered

    private void MainPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPanelMouseDragged
        if(burgerDragged){
            moveX = evt.getX() - reSizeWidth/2; 
            moveY = evt.getY() + 15;
            repaint();
        }
        else if(nachosDragged){
            moveX = evt.getX() - reSizeWidth/2; 
            moveY = evt.getY() + 15;
            repaint();
        }
        else if(pizzaDragged){
            moveX = evt.getX() - reSizeWidth/2; 
            moveY = evt.getY() + 15;
            repaint();
        }
        else if(tacoDragged){
            moveX = evt.getX() - reSizeWidth/2;
            moveY = evt.getY() + 15;
            repaint();
        }
        else if(nuggetDragged){
            moveX = evt.getX() - reSizeWidth/2;
            moveY = evt.getY() + 15;
            repaint();
        }
        else if(chickenDragged){
            moveX = evt.getX() - reSizeWidth/2;
            moveY = evt.getY() + 15;
            repaint();
        }
    }//GEN-LAST:event_MainPanelMouseDragged

    private void MainPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPanelMouseMoved

        
    }//GEN-LAST:event_MainPanelMouseMoved

    private void MainPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPanelMouseReleased
        
        if(burgerDragged ){
            moveX = burgerX;
            moveY = burgerY;
            burgerDragged = false;
            repaint();
            if(evt.getX()>=bposX && evt.getX()<=bposX+bucketWidth && evt.getY() >= 250 && evt.getY() <= 390){
                JOptionPane.showMessageDialog(null, "FD001 successfuly added!");
                burgerOrdered = true;
                burgerQty+=1;
            }
        }
        else if(nachosDragged){
            moveX = nachosX;
            moveY = nachosY;
            nachosDragged = false;
            repaint();
            if(evt.getX()>=bposX && evt.getX()<=bposX+bucketWidth && evt.getY() >= 250 && evt.getY() <= 390){
                JOptionPane.showMessageDialog(null, "FD002 successfuly added!");
                nachosOrdered = true;
                nachosQty+=1; 
            }
        }
         else if(pizzaDragged){
            moveX = pizzaX;
            moveY = pizzaY;
            pizzaDragged = false;
            repaint();
            if(evt.getX()>=bposX && evt.getX()<=bposX+bucketWidth && evt.getY() >= 250 && evt.getY() <= 390){
                JOptionPane.showMessageDialog(null, "FD004 successfuly added!");
                pizzaOrdered = true;
                pizzaQty+=1;
            }
        }
        else if(tacoDragged){
            moveX = tacoX;
            moveY = tacoY;
            tacoDragged = false;
            repaint();
            if(evt.getX()>=bposX && evt.getX()<=bposX+bucketWidth && evt.getY() >= 250 && evt.getY() <= 390){
                JOptionPane.showMessageDialog(null, "FD005 successfuly added!");
                tacoOrdered = true;
                tacoQty+=1;
            }
        }
        else if(nuggetDragged){
            moveX = nuggetX;
            moveY = nuggetY;
            nuggetDragged = false;
            repaint();
            if(evt.getX()>=bposX && evt.getX()<=bposX+bucketWidth && evt.getY() >= 250 && evt.getY() <= 390){
                JOptionPane.showMessageDialog(null, "FD003 successfuly added!");
                nuggetOrdered = true;
                nuggetQty+=1;
            }
        }
        else if(chickenDragged){
            moveX = chickenX;
            moveY = chickenY;
            chickenDragged = false;
            repaint();
            if(evt.getX()>=bposX && evt.getX()<=bposX+bucketWidth && evt.getY() >= 250 && evt.getY() <= 390){
                JOptionPane.showMessageDialog(null, "FD006 successfuly added!");
                chickenOrdered = true;
                chickenQty+=1;
            }
        }
    }//GEN-LAST:event_MainPanelMouseReleased

    private void ExitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitItemActionPerformed
        
//        if(videoFormOpened){
//            this.cf.setVisible(true);
//            //this.cf.dispose();
//            this.cf = null;
//            videoFormOpened = false;
//        }
//        else
            System.exit(0);
    }//GEN-LAST:event_ExitItemActionPerformed

    private void MainPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPanelMousePressed
        if(evt.getX()>=burgerX && evt.getX()<=burgerX+width && evt.getY() >= 25 && evt.getY() <= height){  // 50 <= x <= 170 && 50 <= y <= 150 (pas cursor kena image apa yang mau dilakukan)
            foodId = "FD001";
            burgerDragged = true;
            nachosDragged = false;
            pizzaDragged = false;
            tacoDragged = false;
            nuggetDragged = false;
            chickenDragged = false;
        }
        else if(evt.getX()>=nachosX && evt.getX()<=nachosX+width && evt.getY() >= 145 && evt.getY() <= 255){  // 50 <= x <= 170 && 50 <= y <= 150 (pas cursor kena image apa yang mau dilakukan)
            foodId = "FD002";
            nachosDragged = true;
            burgerDragged = false;
            pizzaDragged = false;
            tacoDragged = false;
            nuggetDragged = false;
            chickenDragged = false;
        }
        else if(evt.getX()>=nuggetX && evt.getX()<=nuggetX+width && evt.getY() >= 280 && evt.getY() <= 390){  // 50 <= x <= 170 && 50 <= y <= 150 (pas cursor kena image apa yang mau dilakukan)
            foodId = "FD003";
            nuggetDragged = true;
            tacoDragged = false;
            nachosDragged = false;
            burgerDragged = false;
            pizzaDragged = false;
            chickenDragged = false;
        }
        else if(evt.getX()>=pizzaX && evt.getX()<=pizzaX+width && evt.getY() >= 25 && evt.getY() <= height){  // 50 <= x <= 170 && 50 <= y <= 150 (pas cursor kena image apa yang mau dilakukan)
            foodId = "FD004";
            pizzaDragged = true;
            nachosDragged = false;
            burgerDragged = false;
            tacoDragged = false;
            nuggetDragged = false;
            chickenDragged = false;
        }
        else if(evt.getX()>=tacoX && evt.getX()<=tacoX+width && evt.getY() >= 145 && evt.getY() <= 255){  // 50 <= x <= 170 && 50 <= y <= 150 (pas cursor kena image apa yang mau dilakukan)
            foodId = "FD005";
            tacoDragged = true;
            nachosDragged = false;
            burgerDragged = false;
            pizzaDragged = false;
            nuggetDragged = false;
            chickenDragged = false;
        }
        else if(evt.getX()>=chickenX && evt.getX()<=chickenX+width && evt.getY() >= 280 && evt.getY() <= 390){  // 50 <= x <= 170 && 50 <= y <= 150 (pas cursor kena image apa yang mau dilakukan)
            foodId = "FD006";
            chickenDragged = true;
            nuggetDragged = false;
            tacoDragged = false;
            nachosDragged = false;
            burgerDragged = false;
            pizzaDragged = false;

        }

        
    }//GEN-LAST:event_MainPanelMousePressed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ExitItem;
    private javax.swing.JMenuItem LogoutItem;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JMenuItem cartItem;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuBar;
    // End of variables declaration//GEN-END:variables
}
