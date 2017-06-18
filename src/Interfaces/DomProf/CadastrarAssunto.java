/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.DomProf;

import Interfaces.*;
import DAO.Conexao;
import DAO.ProfessorDAO;
import Interfaces.DomAtor.PrincipalAdmin;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author XPerience
 */
public class CadastrarAssunto extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public CadastrarAssunto() {
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
        botaoCadastrar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        caixaGrauEducação = new javax.swing.JComboBox();
        txtGrauEducação = new javax.swing.JLabel();
        txtÁrea = new javax.swing.JLabel();
        caixaÁrea = new javax.swing.JComboBox();
        campoDisciplina = new javax.swing.JTextField();
        txtDisciplina = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        Fundo = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        Sobre = new javax.swing.JMenu();
        Sair = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Professor [Domínio do Administrador]");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(460, 339));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        botaoCadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoCadastrar.setText("Cadastrar");
        jPanel2.add(botaoCadastrar);
        botaoCadastrar.setBounds(40, 190, 90, 30);

        botaoLimpar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });
        jPanel2.add(botaoLimpar);
        botaoLimpar.setBounds(140, 190, 80, 30);

        botaoCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoCancelar);
        botaoCancelar.setBounds(230, 190, 90, 30);

        caixaGrauEducação.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        caixaGrauEducação.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ensino Fundamental", "Ensino Médio", "Ensino Superior" }));
        jPanel2.add(caixaGrauEducação);
        caixaGrauEducação.setBounds(160, 150, 160, 30);

        txtGrauEducação.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtGrauEducação.setForeground(new java.awt.Color(255, 255, 255));
        txtGrauEducação.setText("Grau de Educação");
        jPanel2.add(txtGrauEducação);
        txtGrauEducação.setBounds(40, 160, 110, 15);

        txtÁrea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtÁrea.setForeground(new java.awt.Color(255, 255, 255));
        txtÁrea.setText("Área");
        jPanel2.add(txtÁrea);
        txtÁrea.setBounds(40, 120, 25, 20);

        caixaÁrea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        caixaÁrea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ciências da Natureza", "Ciências Humanas", "Curso de Agronegócio", "Curso de Eletrotécnica", "Curso de Enfermagem", "Curso de Informática", "Linguagens e Códigos", "Matemática" }));
        jPanel2.add(caixaÁrea);
        caixaÁrea.setBounds(160, 110, 161, 30);
        jPanel2.add(campoDisciplina);
        campoDisciplina.setBounds(160, 70, 160, 30);

        txtDisciplina.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDisciplina.setForeground(new java.awt.Color(255, 255, 255));
        txtDisciplina.setText("Disciplina");
        jPanel2.add(txtDisciplina);
        txtDisciplina.setBounds(40, 80, 50, 15);

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setText("Nome");
        jPanel2.add(txtNome);
        txtNome.setBounds(40, 40, 32, 15);
        jPanel2.add(campoNome);
        campoNome.setBounds(160, 30, 161, 30);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Snow.jpg"))); // NOI18N
        jPanel2.add(Fundo);
        Fundo.setBounds(-80, 0, 1110, 460);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 860, 460);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
        dispose();
    }//GEN-LAST:event_SairMouseClicked

    private void SobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SobreMouseClicked
        JOptionPane.showMessageDialog(null, "Esta janela tem como função salvar professores em um banco de dados.\nPara realizar essa função, preencha todos os campos, que até então\nestão vazios, com seus respectivos dados.\n\nBOTÕES:\n1 - Cadastrar: salva o professor.\n2 - Limpar: limpa todos os campos.\n3 - Cancelar: fecha a janela e retorna para a tela principal.");
    }//GEN-LAST:event_SobreMouseClicked

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        campoNome.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarAssunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarAssunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarAssunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarAssunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new CadastrarAssunto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JMenu Sair;
    private javax.swing.JMenu Sobre;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JComboBox caixaGrauEducação;
    private javax.swing.JComboBox caixaÁrea;
    private javax.swing.JTextField campoDisciplina;
    private javax.swing.JTextField campoNome;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtDisciplina;
    private javax.swing.JLabel txtGrauEducação;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtÁrea;
    // End of variables declaration//GEN-END:variables
    
}