/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author felip
 */
public class MainFrame extends javax.swing.JFrame implements FrameManagement {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    String s;
    String[][] r = new String[50][4];

    public void readData() {

        File file = new File(
                "/home/felipe/DEV/Java-Scripts/coffeeshop/src/main/java/com/java/coffeeshop/estoque_db.txt");
        String path = file.getPath();

        try {

            BufferedReader reader = new BufferedReader(new FileReader(path));

            int i = 0;

            do {

                s = reader.readLine();

                if (s != null) {

                    String[] w = s.split(";");

                    for (int j = 0; j < w.length; j++) {

                        r[i][j] = w[j];

                    }

                }

                i++;

            } while (s != null);

            reader.close();

        } catch (Exception e) {

            s = "Erro de Leitura";

        }

    }

    public void writeDate(String input) {

        String path = "estoque_db.txt";

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            writer.append("");
            writer.append(input + "\n");

            writer.close();

        } catch (Exception e) {

            System.out.println("Erro ao escrever em Estoque Database");

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();
        costumers = new javax.swing.JMenu();
        addCustumer = new javax.swing.JMenuItem();
        searchCostumer = new javax.swing.JMenuItem();
        products = new javax.swing.JMenu();
        listProducts = new javax.swing.JMenuItem();
        registerProducts = new javax.swing.JMenuItem();
        stock = new javax.swing.JMenu();
        about = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CoffeeShop");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setLocation(new java.awt.Point(640, 200));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(desktopPaneLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 1280, Short.MAX_VALUE));
        desktopPaneLayout.setVerticalGroup(desktopPaneLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 660, Short.MAX_VALUE));

        file.setIcon(
                new javax.swing.ImageIcon("D:\\Usuários\\Público\\Documents\\DEV\\Java\\coffeeshop\\images\\page.png")); // NOI18N
        file.setText("Arquivo");

        exit.setIcon(
                new javax.swing.ImageIcon("D:\\Usuários\\Público\\Documents\\DEV\\Java\\coffeeshop\\images\\exit.png")); // NOI18N
        exit.setText("Sair");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        file.add(exit);

        menuBar.add(file);

        costumers.setIcon(new javax.swing.ImageIcon(
                "D:\\Usuários\\Público\\Documents\\DEV\\Java\\coffeeshop\\images\\customer.png")); // NOI18N
        costumers.setText("Clientes");
        costumers.setMaximumSize(new java.awt.Dimension(123, 68));

        addCustumer.setIcon(new javax.swing.ImageIcon(
                "D:\\Usuários\\Público\\Documents\\DEV\\Java\\coffeeshop\\images\\adduser.png")); // NOI18N
        addCustumer.setText("Cadastrar");
        addCustumer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustumerActionPerformed(evt);
            }
        });
        costumers.add(addCustumer);

        searchCostumer.setIcon(new javax.swing.ImageIcon(
                "D:\\Usuários\\Público\\Documents\\DEV\\Java\\coffeeshop\\images\\findcustumer.png")); // NOI18N
        searchCostumer.setText("Consultar");
        costumers.add(searchCostumer);

        menuBar.add(costumers);

        products.setIcon(new javax.swing.ImageIcon(
                "D:\\Usuários\\Público\\Documents\\DEV\\Java\\coffeeshop\\images\\products.png")); // NOI18N
        products.setText("Produtos");
        products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsActionPerformed(evt);
            }
        });

        listProducts.setIcon(new javax.swing.ImageIcon(
                "D:\\Usuários\\Público\\Documents\\DEV\\Java\\coffeeshop\\images\\listproducts.png")); // NOI18N
        listProducts.setText("Listar");
        listProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listProductsActionPerformed(evt);
            }
        });
        products.add(listProducts);

        registerProducts.setIcon(new javax.swing.ImageIcon(
                "D:\\Usuários\\Público\\Documents\\DEV\\Java\\coffeeshop\\images\\newproduct.png")); // NOI18N
        registerProducts.setText("Cadastrar");
        registerProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerProductsActionPerformed(evt);
            }
        });
        products.add(registerProducts);

        menuBar.add(products);

        stock.setIcon(new javax.swing.ImageIcon(
                "D:\\Usuários\\Público\\Documents\\DEV\\Java\\coffeeshop\\images\\stock.png")); // NOI18N
        stock.setText("Estoque");
        menuBar.add(stock);

        about.setIcon(new javax.swing.ImageIcon(
                "D:\\Usuários\\Público\\Documents\\DEV\\Java\\coffeeshop\\images\\about.png")); // NOI18N
        about.setText("Sobre");
        menuBar.add(about);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(desktopPane));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(desktopPane));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Sair");
        if (JOptionPane.showConfirmDialog(frame, "Deseja realmente sair?", "Sair",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }

    }// GEN-LAST:event_exitActionPerformed

    private void registerProductsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_registerProductsActionPerformed
        // TODO add your handling code here:

        RegisterProducts register = new RegisterProducts();
        desktopPane.add(register);
        register.setVisible(true);

    }// GEN-LAST:event_registerProductsActionPerformed

    private void listProductsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_listProductsActionPerformed
        // TODO add your handling code here:
        ListProducts list = new ListProducts();
        desktopPane.add(list);
        list.setVisible(true);

    }// GEN-LAST:event_listProductsActionPerformed

    private void productsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_productsActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_productsActionPerformed

    private void addCustumerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addCustumerActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_addCustumerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu about;
    private javax.swing.JMenuItem addCustumer;
    private javax.swing.JMenu costumers;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu file;
    private javax.swing.JMenuItem listProducts;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu products;
    private javax.swing.JMenuItem registerProducts;
    private javax.swing.JMenuItem searchCostumer;
    private javax.swing.JMenu stock;
    // End of variables declaration//GEN-END:variables
}
