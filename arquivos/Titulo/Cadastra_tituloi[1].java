/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UsandoInterface1;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author 16113009
 */
public class Cadastra_tituloi extends javax.swing.JFrame {

    /**
     * Creates new form Cadastra_tituloi
     */
    public Cadastra_tituloi() {
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

        bt_incluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nomedvd1 = new javax.swing.JTextField();
        pesquisabanco = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_incluir.setBackground(new java.awt.Color(0, 0, 0));
        bt_incluir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        bt_incluir.setForeground(new java.awt.Color(255, 102, 51));
        bt_incluir.setText("#INCLUIR");
        bt_incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_incluirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("<TITULO PARA CADASTRO:>");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("</TITULO PARA CADASTRO>");

        txt_nomedvd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomedvd1ActionPerformed(evt);
            }
        });

        pesquisabanco.setBackground(new java.awt.Color(0, 0, 0));
        pesquisabanco.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        pesquisabanco.setForeground(new java.awt.Color(255, 102, 51));
        pesquisabanco.setText("#PESQUISA");
        pesquisabanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisabancoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(txt_nomedvd1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt_incluir)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(pesquisabanco)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(77, 77, 77)
                .addComponent(txt_nomedvd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_incluir)
                    .addComponent(pesquisabanco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_incluirActionPerformed
        // TODO add your handling code here:
 try
{    
String nome_dvd  =  txt_nomedvd.getText();

 JOptionPane.showMessageDialog(null," Titulo:" + txt_nomedvd1.getText()+"\n    ");   
}
        
      catch (Exception E)
{
           System.out.println("Minha mensagem "+E.getMessage());
           System.out.println("Minha mensagem "+E.getCause());
           System.out.println("Minha mensagem "+E.getStackTrace());
           System.out.println("Minha mensagem "+E.getClass());
}
   
        
    }//GEN-LAST:event_bt_incluirActionPerformed

    private void txt_nomedvd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomedvd1ActionPerformed
       setTitle(null);
    }//GEN-LAST:event_txt_nomedvd1ActionPerformed

    private void pesquisabancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisabancoActionPerformed
 try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    Connection conexao = null;
        try {
            conexao = DriverManager.getConnection("jdbc:mysql://intracker.com.br/fdb", "fdb", "fdb" );
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    try 
    {
         Statement stmt = conexao.createStatement();
    try 
    {
       // ResultSet consulta = stmt.executeQuery( "SELECT * FROM lindice_titulo" );
        String sql  = "insert into lindice_titulo(nome) values('"+txt_nomedvd1.getText()+"')";
        System.out.println(sql);
        
        stmt.execute(sql);
        
        


//           while (consulta.next()) 
//            {
//               txt_nomedvd1.setText(consulta.getString("titulo"));
//               System.out.println(consulta.getString("titulo"));
//                   
//            
//            }


      
        
    }       catch (SQLException ex) { 
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } finally 
        {
            try 
            { 
                stmt.close(); 
            } 
            catch (Throwable ignore) 
            { 

            }
        }
    } 
        catch (SQLException ex) { 
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }        finally 
        {

            try 
            { 
                conexao.close(); 
            } 
            catch (Throwable ignore) 
            { 

            }
        }
   }                                             

        
       
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisabancoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastra_tituloi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_incluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton pesquisabanco;
    private javax.swing.JTextField txt_nomedvd1;
    // End of variables declaration//GEN-END:variables
}
