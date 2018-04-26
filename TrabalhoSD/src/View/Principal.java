package View;

import Beans.ForkBeans;
import Controller.Exec_Fork;
import Controller.Wait;
import Controller.Kill;
import java.lang.management.ManagementFactory;
import javax.swing.JOptionPane;

public final class Principal extends javax.swing.JFrame {

    Exec_Fork fork;
    Kill pkill;
    Wait wait;

    ForkBeans beans;
    String Aux = "";

    public Principal() {
        initComponents();
        LOG.setText(getID());
        fork = new Exec_Fork();
        wait = new Wait();
        pkill = new Kill();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    public String getID() {
        String ID = ManagementFactory.getRuntimeMXBean().getName().split("@")[0];
        return "Oi ! Eu sou o Processo Pai\nMinha ID é: " + ID +"\n";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        ExecFork = new javax.swing.JLabel();
        Wait = new javax.swing.JLabel();
        Kill = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LOG = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabalho Sistemas Distribuídos");

        Desktop.setBackground(new java.awt.Color(255, 255, 255));

        ExecFork.setBackground(new java.awt.Color(204, 51, 0));
        ExecFork.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        ExecFork.setForeground(new java.awt.Color(255, 255, 255));
        ExecFork.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExecFork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/process.png"))); // NOI18N
        ExecFork.setText("Exec ( ) + Fork ( )");
        ExecFork.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ExecFork.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ExecFork.setOpaque(true);
        ExecFork.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ExecFork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExecForkMouseClicked(evt);
            }
        });

        Wait.setBackground(new java.awt.Color(0, 153, 0));
        Wait.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        Wait.setForeground(new java.awt.Color(255, 255, 255));
        Wait.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Wait.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/wait.png"))); // NOI18N
        Wait.setText("Wait ( )");
        Wait.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Wait.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Wait.setOpaque(true);
        Wait.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Wait.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WaitMouseClicked(evt);
            }
        });

        Kill.setBackground(new java.awt.Color(255, 153, 0));
        Kill.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        Kill.setForeground(new java.awt.Color(255, 255, 255));
        Kill.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/kill.png"))); // NOI18N
        Kill.setText("Kill ( )");
        Kill.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Kill.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Kill.setOpaque(true);
        Kill.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Kill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KillMouseClicked(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(0, 51, 153));
        Exit.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/exit.png"))); // NOI18N
        Exit.setText("Exit ( )");
        Exit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Exit.setOpaque(true);
        Exit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        LOG.setColumns(20);
        LOG.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        LOG.setRows(5);
        jScrollPane1.setViewportView(LOG);

        Desktop.setLayer(ExecFork, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(Wait, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(Kill, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(Exit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopLayout.createSequentialGroup()
                        .addComponent(ExecFork, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Wait, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DesktopLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(Kill, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(217, Short.MAX_VALUE))
            .addGroup(DesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopLayout.createSequentialGroup()
                        .addComponent(ExecFork, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DesktopLayout.createSequentialGroup()
                        .addComponent(Wait, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Kill, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );

        setBounds(0, 0, 816, 639);
    }// </editor-fold>//GEN-END:initComponents

    private void KillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KillMouseClicked
        if (evt.getClickCount() == 1) {
            String arg = JOptionPane.showInputDialog(this, "Informe o Nome / PID do Processo:");
            if (arg != null) {
                pkill.Kill(arg);
            }
        }
    }//GEN-LAST:event_KillMouseClicked

    private void ExecForkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExecForkMouseClicked
        if (evt.getClickCount() == 1) {
            fork.PrimitivaExecFork();
        }
    }//GEN-LAST:event_ExecForkMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        if (evt.getClickCount() == 1) {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitMouseClicked

    private void WaitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WaitMouseClicked
        if (evt.getClickCount() == 1) {
            wait.ForkWait();
        }
    }//GEN-LAST:event_WaitMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JLabel ExecFork;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel Kill;
    public static javax.swing.JTextArea LOG;
    private javax.swing.JLabel Wait;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
