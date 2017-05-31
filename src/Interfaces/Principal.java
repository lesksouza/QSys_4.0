/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author XPerience
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Subtitulo = new javax.swing.JLabel();
        letrinhasMiudas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        Professor = new javax.swing.JMenu();
        Assunto = new javax.swing.JMenu();
        Disciplina = new javax.swing.JMenu();
        Questão = new javax.swing.JMenu();
        Prova = new javax.swing.JMenu();
        Sobre = new javax.swing.JMenu();
        Sair = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(460, 339));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        Titulo.setFont(new java.awt.Font("Stencil FourReversed", 0, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("QSys");
        jPanel2.add(Titulo);
        Titulo.setBounds(30, 20, 120, 60);

        Subtitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Subtitulo.setForeground(new java.awt.Color(255, 255, 255));
        Subtitulo.setText("bem-vindo ao banco de questões e geração de provas");
        jPanel2.add(Subtitulo);
        Subtitulo.setBounds(30, 80, 380, 17);

        letrinhasMiudas.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        letrinhasMiudas.setForeground(new java.awt.Color(255, 255, 255));
        letrinhasMiudas.setText("Desenvolvido nas aulas de Cláudio Matias.");
        jPanel2.add(letrinhasMiudas);
        letrinhasMiudas.setBounds(30, 100, 190, 14);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Blue.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 860, 460);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 860, 460);

        Professor.setText("Professor");
        Professor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfessorMouseClicked(evt);
            }
        });
        jMenuBar2.add(Professor);

        Assunto.setText("Assunto");
        Assunto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AssuntoMouseClicked(evt);
            }
        });
        jMenuBar2.add(Assunto);

        Disciplina.setText("Disciplina");
        Disciplina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisciplinaMouseClicked(evt);
            }
        });
        jMenuBar2.add(Disciplina);

        Questão.setText("Questão");
        Questão.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuestãoMouseClicked(evt);
            }
        });
        jMenuBar2.add(Questão);

        Prova.setText("Prova");
        Prova.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProvaMouseClicked(evt);
            }
        });
        jMenuBar2.add(Prova);

        Sobre.setText("Sobre");
        Sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SobreMouseClicked(evt);
            }
        });
        jMenuBar2.add(Sobre);

        Sair.setText("Sair");
        Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairMouseClicked(evt);
            }
        });
        jMenuBar2.add(Sair);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AssuntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AssuntoMouseClicked
        Assunto assunto = new Assunto();
        assunto.setVisible(true);
        dispose();
    }//GEN-LAST:event_AssuntoMouseClicked

    private void SobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SobreMouseClicked
        Sobre sobre = new Sobre();
        sobre.setVisible(true);
        dispose();
    }//GEN-LAST:event_SobreMouseClicked

    private void ProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfessorMouseClicked
        Professor professor = new Professor();
        professor.setVisible(true);
        dispose();
    }//GEN-LAST:event_ProfessorMouseClicked

    private void DisciplinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisciplinaMouseClicked
        Disciplina disciplina = new Disciplina();
        disciplina.setVisible(true);
        dispose();
    }//GEN-LAST:event_DisciplinaMouseClicked

    private void QuestãoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuestãoMouseClicked
        Questão questão = new Questão();
        questão.setVisible(true);
        dispose();
    }//GEN-LAST:event_QuestãoMouseClicked

    private void ProvaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProvaMouseClicked
        Prova prova = new Prova();
        prova.setVisible(true);
        dispose();
    }//GEN-LAST:event_ProvaMouseClicked

    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
        dispose();
    }//GEN-LAST:event_SairMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Assunto;
    private javax.swing.JMenu Disciplina;
    private javax.swing.JMenu Professor;
    private javax.swing.JMenu Prova;
    private javax.swing.JMenu Questão;
    private javax.swing.JMenu Sair;
    private javax.swing.JMenu Sobre;
    private javax.swing.JLabel Subtitulo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel letrinhasMiudas;
    // End of variables declaration//GEN-END:variables
}
