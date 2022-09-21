/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Java_SQL;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author AORUS
 */
public class Java_SQL extends javax.swing.JFrame {

    /**
     * Creates new form Java_SQL
     */
    public Java_SQL() {
        initComponents();
        this.setLocationRelativeTo(null);
        Tabs.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LayeredPane = new javax.swing.JLayeredPane();
        LoginScreen = new javax.swing.JPanel();
        LoginButton = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();
        UserField = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        LoginLabel = new javax.swing.JLabel();
        LoginTitle = new javax.swing.JLabel();
        Tabs = new javax.swing.JTabbedPane();
        PaqueteScreen = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PaqueteTable = new javax.swing.JTable();
        ClienteScreen = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ClienteTable = new javax.swing.JTable();
        TransporteScreen = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TransporteTable = new javax.swing.JTable();
        AlmacenScreen = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        AlmacenTable = new javax.swing.JTable();
        BitacoraScreen = new javax.swing.JPanel();
        BitacoraTabs = new javax.swing.JTabbedPane();
        InsercionesTab = new javax.swing.JPanel();
        JScrollingPane1 = new javax.swing.JScrollPane();
        InsercionesTable = new javax.swing.JTable();
        ActualizacionesTab = new javax.swing.JPanel();
        JScrollingPane2 = new javax.swing.JScrollPane();
        ActualizacionesTable = new javax.swing.JTable();
        EliminacionesTab = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        EliminacionesTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Base de datos");
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        LoginButton.setText("Iniciar sesión");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        PasswordField.setText("Password");

        UserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserFieldActionPerformed(evt);
            }
        });

        PasswordLabel.setText("Contraseña: ");

        LoginLabel.setText("Usuario: ");

        LoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginTitle.setText("Base de datos");

        javax.swing.GroupLayout LoginScreenLayout = new javax.swing.GroupLayout(LoginScreen);
        LoginScreen.setLayout(LoginScreenLayout);
        LoginScreenLayout.setHorizontalGroup(
            LoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginScreenLayout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addGroup(LoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PasswordLabel)
                    .addComponent(LoginLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginButton)
                    .addGroup(LoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(UserField)
                        .addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                .addContainerGap(332, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginScreenLayout.setVerticalGroup(
            LoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginScreenLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(LoginTitle)
                .addGap(85, 85, 85)
                .addGroup(LoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginLabel)
                    .addComponent(UserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(LoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(LoginButton)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        PaqueteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id paquete", "Id producto", "Tipo", "Ruta", "Peso", "Descripcion", "Declaracion Aduanera", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(PaqueteTable);

        javax.swing.GroupLayout PaqueteScreenLayout = new javax.swing.GroupLayout(PaqueteScreen);
        PaqueteScreen.setLayout(PaqueteScreenLayout);
        PaqueteScreenLayout.setHorizontalGroup(
            PaqueteScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );
        PaqueteScreenLayout.setVerticalGroup(
            PaqueteScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaqueteScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addContainerGap())
        );

        Tabs.addTab("Paquetes", PaqueteScreen);

        ClienteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id cliente", "Id paquete", "Nombre", "Direccion", "Telefono", "Pago Mensual", "No. Cuenta", "No. Tarjeta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ClienteTable);

        javax.swing.GroupLayout ClienteScreenLayout = new javax.swing.GroupLayout(ClienteScreen);
        ClienteScreen.setLayout(ClienteScreenLayout);
        ClienteScreenLayout.setHorizontalGroup(
            ClienteScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addContainerGap())
        );
        ClienteScreenLayout.setVerticalGroup(
            ClienteScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addContainerGap())
        );

        Tabs.addTab("Clientes", ClienteScreen);

        TransporteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Transporte", "Id Paquete", "Cantidad Paquetes", "Ruta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TransporteTable);

        javax.swing.GroupLayout TransporteScreenLayout = new javax.swing.GroupLayout(TransporteScreen);
        TransporteScreen.setLayout(TransporteScreenLayout);
        TransporteScreenLayout.setHorizontalGroup(
            TransporteScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransporteScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addContainerGap())
        );
        TransporteScreenLayout.setVerticalGroup(
            TransporteScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransporteScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addContainerGap())
        );

        Tabs.addTab("Transporte", TransporteScreen);

        AlmacenTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Almacen", "Id Paquete", "Cantidad Paquetes", "Ubicacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(AlmacenTable);

        javax.swing.GroupLayout AlmacenScreenLayout = new javax.swing.GroupLayout(AlmacenScreen);
        AlmacenScreen.setLayout(AlmacenScreenLayout);
        AlmacenScreenLayout.setHorizontalGroup(
            AlmacenScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlmacenScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addContainerGap())
        );
        AlmacenScreenLayout.setVerticalGroup(
            AlmacenScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlmacenScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addContainerGap())
        );

        Tabs.addTab("Almacen", AlmacenScreen);

        InsercionesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Campo", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JScrollingPane1.setViewportView(InsercionesTable);

        javax.swing.GroupLayout InsercionesTabLayout = new javax.swing.GroupLayout(InsercionesTab);
        InsercionesTab.setLayout(InsercionesTabLayout);
        InsercionesTabLayout.setHorizontalGroup(
            InsercionesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JScrollingPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        InsercionesTabLayout.setVerticalGroup(
            InsercionesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JScrollingPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );

        BitacoraTabs.addTab("Inserciones", InsercionesTab);

        ActualizacionesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Campo", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JScrollingPane2.setViewportView(ActualizacionesTable);

        javax.swing.GroupLayout ActualizacionesTabLayout = new javax.swing.GroupLayout(ActualizacionesTab);
        ActualizacionesTab.setLayout(ActualizacionesTabLayout);
        ActualizacionesTabLayout.setHorizontalGroup(
            ActualizacionesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JScrollingPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        ActualizacionesTabLayout.setVerticalGroup(
            ActualizacionesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JScrollingPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );

        BitacoraTabs.addTab("Actualizaciones", ActualizacionesTab);

        EliminacionesTable.setModel(InsercionesTable.getModel());
        jScrollPane4.setViewportView(EliminacionesTable);
        if (EliminacionesTable.getColumnModel().getColumnCount() > 0) {
            EliminacionesTable.getColumnModel().getColumn(0).setHeaderValue("Id");
            EliminacionesTable.getColumnModel().getColumn(1).setHeaderValue("Campo");
            EliminacionesTable.getColumnModel().getColumn(2).setHeaderValue("Fecha");
        }

        javax.swing.GroupLayout EliminacionesTabLayout = new javax.swing.GroupLayout(EliminacionesTab);
        EliminacionesTab.setLayout(EliminacionesTabLayout);
        EliminacionesTabLayout.setHorizontalGroup(
            EliminacionesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        EliminacionesTabLayout.setVerticalGroup(
            EliminacionesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminacionesTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE))
        );

        BitacoraTabs.addTab("Eliminaciones", EliminacionesTab);

        javax.swing.GroupLayout BitacoraScreenLayout = new javax.swing.GroupLayout(BitacoraScreen);
        BitacoraScreen.setLayout(BitacoraScreenLayout);
        BitacoraScreenLayout.setHorizontalGroup(
            BitacoraScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BitacoraScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BitacoraTabs)
                .addContainerGap())
        );
        BitacoraScreenLayout.setVerticalGroup(
            BitacoraScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BitacoraScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BitacoraTabs)
                .addContainerGap())
        );

        Tabs.addTab("Bitacora", BitacoraScreen);

        LayeredPane.setLayer(LoginScreen, javax.swing.JLayeredPane.PALETTE_LAYER);
        LayeredPane.setLayer(Tabs, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LayeredPaneLayout = new javax.swing.GroupLayout(LayeredPane);
        LayeredPane.setLayout(LayeredPaneLayout);
        LayeredPaneLayout.setHorizontalGroup(
            LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
            .addGroup(LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Tabs))
            .addGroup(LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LayeredPaneLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LoginScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        LayeredPaneLayout.setVerticalGroup(
            LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Tabs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
            .addGroup(LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LayeredPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(LoginScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LayeredPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
      String username = "test";
      String password = "1234";
    
      if (UserField.getText().equals(username) && password.equals(new String(PasswordField.getPassword()))) 
      {
       LoginScreen.setVisible(false);
       Tabs.setVisible(true);
      }
             
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void UserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Java_SQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java_SQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java_SQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_SQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java_SQL().setVisible(true);
            }
           

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActualizacionesTab;
    private javax.swing.JTable ActualizacionesTable;
    private javax.swing.JPanel AlmacenScreen;
    private javax.swing.JTable AlmacenTable;
    private javax.swing.JPanel BitacoraScreen;
    private javax.swing.JTabbedPane BitacoraTabs;
    private javax.swing.JPanel ClienteScreen;
    private javax.swing.JTable ClienteTable;
    private javax.swing.JPanel EliminacionesTab;
    private javax.swing.JTable EliminacionesTable;
    private javax.swing.JPanel InsercionesTab;
    private javax.swing.JTable InsercionesTable;
    private javax.swing.JScrollPane JScrollingPane1;
    private javax.swing.JScrollPane JScrollingPane2;
    private javax.swing.JLayeredPane LayeredPane;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPanel LoginScreen;
    private javax.swing.JLabel LoginTitle;
    private javax.swing.JPanel PaqueteScreen;
    private javax.swing.JTable PaqueteTable;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JPanel TransporteScreen;
    private javax.swing.JTable TransporteTable;
    private javax.swing.JTextField UserField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
