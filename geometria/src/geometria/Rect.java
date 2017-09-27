/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;
import java.awt.*;
/**
 *
 * @author athena megumi
 */
public class Rect extends javax.swing.JFrame {

    /**
     * Creates new form geom
     */
    public Rect() {
        initComponents();
    }
    private rectangulo r1,r2,union,interseccion;
    public void obtenUnion(rectangulo a, rectangulo b,rectangulo u,rectangulo inter){
        r1=a;
        r2=b;
        union=u;
        interseccion=inter;
    }
    public void paint(Graphics forma){
        this.setResizable(false);
        int orx,ory;
        punto a1,b1,a2,b2,ui,uf,ii,it;
        a1=r1.inicio();
        b1=r1.termino();
        
        a2=r2.inicio();
        b2=r2.termino();
        
        ui=union.inicio();
        uf=union.termino();
        
        ii=interseccion.inicio();
        it=interseccion.termino();
        
        super.paint(forma);
        AlphaComposite dibujo=AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.7f);
        Graphics2D r1=(Graphics2D)forma;
        Graphics2D r2=(Graphics2D)forma;
        Graphics2D lin=(Graphics2D)forma;
        Graphics2D uni=(Graphics2D)forma;
        Graphics2D inter=(Graphics2D)forma;
        orx=this.getWidth()/2;
        ory=this.getHeight()/2;
        
        lin.setColor(Color.BLACK);
        lin.drawLine(0,ory,2*orx,ory);
        lin.drawLine(orx, 0, orx, 2*ory);
        
        uni.setColor(Color.RED);
        uni.setComposite(dibujo);
        uni.fillRect(orx + ui.obtenx()*20, ory-( uf.obteny()*20), (uf.obtenx()-ui.obtenx())*20,(uf.obteny()-ui.obteny())*20);
        
        r1.setColor(Color.CYAN);
        r1.setComposite(dibujo);
        r1.fillRect(orx + a1.obtenx()*20, ory-( b1.obteny()*20), (b1.obtenx()-a1.obtenx())*20,(b1.obteny()-a1.obteny())*20);
        
        r2.setColor(Color.yellow);
        r2.setComposite(dibujo);
        r2.fillRect(orx + a2.obtenx()*20, ory-(b2.obteny())*20, (b2.obtenx()-a2.obtenx())*20,(b2.obteny()-a2.obteny())*20);
        
        inter.setColor(Color.MAGENTA);
        inter.setComposite(dibujo);
        inter.fillRect(orx+ii.obtenx()*20, ory-(it.obteny()*20), (it.obtenx()-ii.obtenx())*20, (it.obteny()-ii.obteny())*20);
        
        
        
        //repaint();
    }
  
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 150));

        jButton1.setText("cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(450, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(366, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
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
            java.util.logging.Logger.getLogger(Rect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}