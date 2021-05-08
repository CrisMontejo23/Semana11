
/**
 * Autores:
 * Forero Espinosa Eduar Ivan
 * Giraldo Collazos Juan Pablo
 * Montejo Martinez Cristhian Fernando
 */

package Vista;
import Modelo.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {

    
    ArrayList<Modelo> lista = new ArrayList<Modelo>();
    
    public Registro(java.awt.Frame parent, boolean modal) {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextApellidos = new javax.swing.JTextField();
        jTextCorreo = new javax.swing.JTextField();
        jTextDI = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jBRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTRegistro = new javax.swing.JTable();
        jBEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextEliminar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jBImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNombre.setText("Nombres:");

        jLabelApellido.setText("Apellidos:");

        jLabelCorreo.setText("Correo:");

        jLabel4.setText("ID:");

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });

        jTextApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextApellidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelApellido)
                    .addComponent(jLabelCorreo)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(jTextApellidos, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextNombre)
                    .addComponent(jTextDI))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellido))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCorreo)
                    .addComponent(jTextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jBRegistrar.setText("Registrar");
        jBRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jBRegistrar)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jBRegistrar)
                .addGap(30, 30, 30))
        );

        jTRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Correo", "ID"
            }
        ));
        jScrollPane1.setViewportView(jTRegistro);

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese la posicion a eliminar");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Registro de estudiantes");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(99, 99, 99))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jBImprimir.setText("Imprimir");
        jBImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jTextEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBImprimir)
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBEliminar)
                            .addComponent(jTextEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jBImprimir)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextApellidosActionPerformed

    private void jBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarActionPerformed
        // TODO add your handling code here:
        Modelo modelo = new Modelo(jTextNombre.getText(),jTextApellidos.getText(),jTextCorreo.getText(),jTextDI.getText());
        
        lista.add(modelo);
        
        mostrar();
        imprimir();
    }//GEN-LAST:event_jBRegistrarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        // TODO add your handling code here:
        eliminar();
        imprimir();
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimirActionPerformed
        // TODO add your handling code here:
        
        limpiar();
        imprimir();
        JOptionPane.showMessageDialog(null, "Su documento se encuentra listo para ser impreso");
        leer();        
    }//GEN-LAST:event_jBImprimirActionPerformed

    public void mostrar(){
        
        String matriz[][] = new String[lista.size()][4];
        
        
        for (int i = 0; i < lista.size(); i++) {
            
            matriz[i][0]=lista.get(i).getNombre();
            matriz[i][1]=lista.get(i).getApellido();
            matriz[i][2]=lista.get(i).getCorreo();
            matriz[i][3]=lista.get(i).getDi();
        }
        
       
        
        jTRegistro.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Nombre", "Apellido", "Correo", "ID"
            }
        ));
        
        jTextNombre.setText("");
        jTextApellidos.setText("");
        jTextCorreo.setText("");
        jTextDI.setText("");
        jTextEliminar.setText("");                
        
    }
    
    public void eliminar(){
        
        int opcion = Integer.parseInt(jTextEliminar.getText()) - 1;
        
        lista.remove(opcion);
        
        mostrar();
    
    }
    
    public void imprimir(){
        
        String matriz1[][] = new String[lista.size()][4];
        
        try{
        File f = new File("D:/Imprimir.txt");
        FileWriter Archivo = new FileWriter(f);
        PrintWriter pr = new PrintWriter(Archivo);
        
        for (int i = 0; i < lista.size(); i++) {
            
            pr.println("Usuario numero "+(i+1));
            pr.println("");
            pr.println("Nombre: "+(matriz1[i][0]=lista.get(i).getNombre()));
            pr.println("Apellido: "+(matriz1[i][1]=lista.get(i).getApellido()));
            pr.println("Correo: "+(matriz1[i][2]=lista.get(i).getCorreo()));
            pr.println("ID: "+(matriz1[i][3]=lista.get(i).getDi()));
            pr.println("-------------------------------------------");
        }
        
        pr.close();
           
    } catch (Exception e){
        e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se encontró archivo");
    }
        
    }
    
    public void leer(){
        
        File archivo = null;
        FileReader fr = null;
        try {
            archivo = new File ("D:/Imprimir.txt");
            String linea;
            fr = new FileReader (archivo);
            BufferedReader br = new BufferedReader(fr);
            while((linea=br.readLine())!=null)
            System.out.println(linea);
        }
        catch(IOException e){
            System.out.println(e);
        }finally{
            try{
                if( fr != null){
                    fr.close();
                }
            }catch (IOException e){
                System.out.println(e);
            }
        }
        
    }
    
    public void limpiar(){
        for (int i = 0; i < 25; i++) {
            System.out.println("");
        }
    }
    
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registro dialog = new Registro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBImprimir;
    private javax.swing.JButton jBRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTRegistro;
    private javax.swing.JTextField jTextApellidos;
    private javax.swing.JTextField jTextCorreo;
    private javax.swing.JTextField jTextDI;
    private javax.swing.JTextField jTextEliminar;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables
}
