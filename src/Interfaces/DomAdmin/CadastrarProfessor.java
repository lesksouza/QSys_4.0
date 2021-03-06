/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.DomAdmin;

import Interfaces.*;
import DAO.Conexao;
import DAO.ProfessorDAO;
import Interfaces.DomAtor.PrincipalAdmin;
import Interfaces.Escolha.EscolhaProfessor;
import Modelo.Professor;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author XPerience
 */
public class CadastrarProfessor extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public CadastrarProfessor() {
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
        campoNome = new javax.swing.JTextField();
        txtNome = new javax.swing.JLabel();
        txtLogin = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        txtSenha = new javax.swing.JLabel();
        txtContato = new javax.swing.JLabel();
        botaoLimpar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        txtSexo = new javax.swing.JLabel();
        txtDisciplina = new javax.swing.JLabel();
        campoContato = new javax.swing.JTextField();
        txtEmail = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        campoDisciplina1 = new javax.swing.JTextField();
        campoDisciplina2 = new javax.swing.JTextField();
        campoSexo = new javax.swing.JTextField();
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
        jPanel2.add(campoNome);
        campoNome.setBounds(160, 30, 161, 30);

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setText("Nome");
        jPanel2.add(txtNome);
        txtNome.setBounds(40, 40, 32, 15);

        txtLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(255, 255, 255));
        txtLogin.setText("Login");
        jPanel2.add(txtLogin);
        txtLogin.setBounds(40, 120, 29, 15);
        jPanel2.add(campoLogin);
        campoLogin.setBounds(160, 110, 161, 30);
        jPanel2.add(campoSenha);
        campoSenha.setBounds(160, 150, 161, 30);

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setText("Senha");
        jPanel2.add(txtSenha);
        txtSenha.setBounds(40, 160, 34, 15);

        txtContato.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtContato.setForeground(new java.awt.Color(255, 255, 255));
        txtContato.setText("Contato");
        jPanel2.add(txtContato);
        txtContato.setBounds(40, 280, 50, 15);

        botaoLimpar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });
        jPanel2.add(botaoLimpar);
        botaoLimpar.setBounds(140, 350, 80, 30);

        botaoCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoCancelar);
        botaoCancelar.setBounds(230, 350, 90, 30);

        botaoCadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoCadastrar);
        botaoCadastrar.setBounds(40, 350, 90, 30);

        txtSexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSexo.setForeground(new java.awt.Color(255, 255, 255));
        txtSexo.setText("Sexo");
        jPanel2.add(txtSexo);
        txtSexo.setBounds(40, 80, 27, 15);

        txtDisciplina.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDisciplina.setForeground(new java.awt.Color(255, 255, 255));
        txtDisciplina.setText("Disciplina");
        jPanel2.add(txtDisciplina);
        txtDisciplina.setBounds(40, 200, 47, 20);
        jPanel2.add(campoContato);
        campoContato.setBounds(160, 270, 160, 30);

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setText("Email");
        jPanel2.add(txtEmail);
        txtEmail.setBounds(40, 320, 27, 15);
        jPanel2.add(campoEmail);
        campoEmail.setBounds(160, 310, 160, 30);
        jPanel2.add(campoDisciplina1);
        campoDisciplina1.setBounds(160, 190, 160, 30);
        jPanel2.add(campoDisciplina2);
        campoDisciplina2.setBounds(160, 230, 160, 30);

        campoSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSexoActionPerformed(evt);
            }
        });
        jPanel2.add(campoSexo);
        campoSexo.setBounds(160, 70, 160, 30);

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

    private void campoSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSexoActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        String Nome = campoNome.getText();
        String Sexo = campoSexo.getText();
        String Login = campoLogin.getText();
        String Senha = campoSenha.getText();
        String Disciplina1 = campoDisciplina1.getText();
        String Disciplina2 = campoDisciplina2.getText();
        String Contato = campoContato.getText();
        String Email = campoEmail.getText();
        
        if(Nome.equals("") || Sexo.equals("") || Login.equals("") || Senha.equals("") || Disciplina1.equals("") || Disciplina2.equals("") || Contato.equals("") || Email.equals("")){
            JOptionPane.showMessageDialog(null, "Todos os dados obrigatórios devem ser preenchidos", "Administrador", JOptionPane.WARNING_MESSAGE);
        }else{
            Connection con = Conexao.AbrirConexao();
            ProfessorDAO sql = new ProfessorDAO(con);
            Professor p = new Professor();
            
            p.setNome(Nome);
            p.setSexo(Sexo);
            p.setLogin(Login);
            p.setSenha(Senha);
            p.setDisciplina1(Disciplina1);
            p.setDisciplina2(Disciplina2);
            p.setContato(Contato);
            p.setEmail(Email);
            
            sql.Inserir_Professor(p);
            Conexao.FecharConexao(con);
            
            campoNome.setText("");
            campoSexo.setText("");
            campoLogin.setText("");
            campoSenha.setText("");
            campoDisciplina1.setText("");
            campoDisciplina2.setText("");
            campoContato.setText("");
            campoEmail.setText("");
            
            JOptionPane.showMessageDialog(null, "Professor salvo com sucesso.","Administrador", JOptionPane.INFORMATION_MESSAGE );
            
            EscolhaProfessor escolhaprofessor = new EscolhaProfessor();
            escolhaprofessor.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        PrincipalAdmin principaladmin = new PrincipalAdmin();
        principaladmin.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        campoNome.setText("");
        campoLogin.setText("");
        campoSenha.setText("");
        campoDisciplina1.setText("");
        campoDisciplina2.setText("");
        campoContato.setText("");
        campoEmail.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
        dispose();
    }//GEN-LAST:event_SairMouseClicked

    private void SobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SobreMouseClicked
        JOptionPane.showMessageDialog(null, "Esta janela tem como função salvar professores em um banco de dados.\nPara realizar essa função, preencha todos os campos, que até então\nestão vazios, com seus respectivos dados.\n\nBOTÕES:\n1 - Cadastrar: salva o professor.\n2 - Limpar: limpa todos os campos.\n3 - Cancelar: fecha a janela e retorna para a tela principal.");
    }//GEN-LAST:event_SobreMouseClicked

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
            java.util.logging.Logger.getLogger(CadastrarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProfessor().setVisible(true);
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
    private javax.swing.JTextField campoContato;
    private javax.swing.JTextField campoDisciplina1;
    private javax.swing.JTextField campoDisciplina2;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoSexo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtContato;
    private javax.swing.JLabel txtDisciplina;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtLogin;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtSenha;
    private javax.swing.JLabel txtSexo;
    // End of variables declaration//GEN-END:variables
    
}
