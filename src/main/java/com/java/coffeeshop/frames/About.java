package com.java.coffeeshop.frames;

/**
 *
 * @author vinic
 */
public class About extends javax.swing.JInternalFrame {

        /**
         * Creates new form TelaSobre
         */
        public About() {
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();

                setClosable(true);
                setResizable(true);
                setVisible(true);

                setFrameIcon(new javax.swing.ImageIcon("images/coffeeshop.png")); // NOI18N
                setMaximumSize(new java.awt.Dimension(1280, 664));
                setMinimumSize(new java.awt.Dimension(1280, 664));
                setName(""); // NOI18N
                setPreferredSize(new java.awt.Dimension(1280, 664));

                jLabel1.setFont(new java.awt.Font("MingLiU-ExtB", 1, 50)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 51, 255));
                jLabel1.setText("CoffeeShop");

                jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
                jLabel2.setText("Este sistema foi desenvolvido por Carlos Felipe Vale Souza ");

                jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
                jLabel3.setText("em parceria com Vinicius Bispo de Jesus, com o intuito de");

                jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
                jLabel4.setText("agilizar o processo dos funcionários no controle de estoque, ");

                jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
                jLabel5.setText("cadastro de clientes e nas vendas.");

                jLabel6.setText("Versão atual: 1.0.0");

                jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
                jLabel7.setText("Projeto da disciplina de programação orientada a objetos");

                jLabel8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
                jLabel8.setText("ministrada por Kalil Araujo Bispo ");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup().addGap(453, 453, 453)
                                                                .addComponent(jLabel1))
                                                .addGroup(layout.createSequentialGroup().addGap(391, 391, 391)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(jLabel8)
                                                                                .addComponent(jLabel7,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                372,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup().addGap(485, 485, 485)
                                                                .addComponent(jLabel6)))
                                                .addContainerGap(421, Short.MAX_VALUE)));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGap(29, 29, 29).addComponent(jLabel1)
                                                .addGap(106, 106, 106).addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5).addGap(66, 66, 66).addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                197, Short.MAX_VALUE)
                                                .addComponent(jLabel6).addGap(19, 19, 19)));

                pack();
        }// </editor-fold>

        // Variables declaration - do not modify
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
}