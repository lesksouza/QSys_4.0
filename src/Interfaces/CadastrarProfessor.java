/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import DAO.Conexao;
import DAO.ProfessorDAO;
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
        txtCodigoProfessor = new javax.swing.JLabel();
        CodigoProfessor = new javax.swing.JTextField();
        botaoProcurar = new javax.swing.JButton();
        Nome = new javax.swing.JTextField();
        txtNome = new javax.swing.JLabel();
        txtLogin = new javax.swing.JLabel();
        Login = new javax.swing.JTextField();
        Senha = new javax.swing.JPasswordField();
        txtSenha = new javax.swing.JLabel();
        txtContato = new javax.swing.JLabel();
        botaoLimpar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        txtSexo = new javax.swing.JLabel();
        txtDisciplina = new javax.swing.JLabel();
        Contato = new javax.swing.JTextField();
        txtEmail = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Disciplina1 = new javax.swing.JTextField();
        Disciplina2 = new javax.swing.JTextField();
        Sexo = new javax.swing.JTextField();
        Fundo = new javax.swing.JLabel();
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
        setTitle("Professor");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(460, 339));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        txtCodigoProfessor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCodigoProfessor.setText("Código do professor");
        jPanel2.add(txtCodigoProfessor);
        txtCodigoProfessor.setBounds(560, 30, 109, 15);
        jPanel2.add(CodigoProfessor);
        CodigoProfessor.setBounds(680, 20, 60, 30);

        botaoProcurar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoProcurar.setText("Procurar");
        jPanel2.add(botaoProcurar);
        botaoProcurar.setBounds(750, 20, 90, 30);
        jPanel2.add(Nome);
        Nome.setBounds(680, 60, 161, 30);

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNome.setText("Nome");
        jPanel2.add(txtNome);
        txtNome.setBounds(560, 70, 32, 15);

        txtLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtLogin.setText("Login");
        jPanel2.add(txtLogin);
        txtLogin.setBounds(560, 150, 29, 15);
        jPanel2.add(Login);
        Login.setBounds(680, 140, 161, 30);
        jPanel2.add(Senha);
        Senha.setBounds(680, 180, 161, 30);

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSenha.setText("Senha");
        jPanel2.add(txtSenha);
        txtSenha.setBounds(560, 190, 34, 15);

        txtContato.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtContato.setText("Contato");
        jPanel2.add(txtContato);
        txtContato.setBounds(560, 310, 50, 15);

        botaoLimpar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });
        jPanel2.add(botaoLimpar);
        botaoLimpar.setBounds(660, 390, 90, 30);

        botaoCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoCancelar);
        botaoCancelar.setBounds(760, 390, 90, 30);

        botaoCadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoCadastrar);
        botaoCadastrar.setBounds(560, 390, 90, 30);

        txtSexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSexo.setText("Sexo");
        jPanel2.add(txtSexo);
        txtSexo.setBounds(560, 110, 27, 15);

        txtDisciplina.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDisciplina.setText("Disciplina");
        jPanel2.add(txtDisciplina);
        txtDisciplina.setBounds(560, 230, 47, 20);
        jPanel2.add(Contato);
        Contato.setBounds(680, 300, 160, 30);

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmail.setText("Email");
        jPanel2.add(txtEmail);
        txtEmail.setBounds(560, 350, 27, 15);
        jPanel2.add(Email);
        Email.setBounds(680, 340, 160, 30);
        jPanel2.add(Disciplina1);
        Disciplina1.setBounds(680, 220, 160, 30);
        jPanel2.add(Disciplina2);
        Disciplina2.setBounds(680, 260, 160, 30);

        Sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexoActionPerformed(evt);
            }
        });
        jPanel2.add(Sexo);
        Sexo.setBounds(680, 100, 160, 30);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo.jpg"))); // NOI18N
        jPanel2.add(Fundo);
        Fundo.setBounds(0, 0, 860, 460);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
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
        JOptionPane.showMessageDialog(null, "Você já está nessa janela.");
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

    private void SexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SexoActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        String codigo = CodigoProfessor.getText();
        String nome = Nome.getText();
        String login = Login.getText();
        String senha = Senha.getText();
        String sexo = Sexo.getText();
        String disciplina1 = Disciplina1.getText();
        String disciplina2 = Disciplina2.getText();
        String contato = Contato.getText();
        String email = Email.getText();

        if(nome.equals("") || login.equals("") || senha.equals("")){
            JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio.", "QSys", JOptionPane.WARNING_MESSAGE);
        }else{
            Connection con = Conexao.AbrirConexao();
            ProfessorDAO sql = new ProfessorDAO(con);
            CadastrarProfessor p = new CadastrarProfessor();

            p.setNome(Nome);
            p.setLogin(Login);
            p.setSenha(Senha);
            p.setSexo(Sexo);
            p.setDisciplina1(Disciplina1);
            p.setDisciplina2(Disciplina2);
            p.setContato(Contato);
            p.setEmail(Email);

            //sql.Inserir_Professor(p);
            Conexao.FecharConexao(con);

            Nome.setText("");
            Login.setText("");
            Senha.setText("");
            Sexo.setText("");
            Disciplina1.setText("");
            Disciplina2.setText("");
            Contato.setText("");
            Email.setText("");

            JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso.","QSys", JOptionPane.INFORMATION_MESSAGE );
            dispose();
        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        CodigoProfessor.setText("");
        Nome.setText("");
        Login.setText("");
        Senha.setText("");
        Disciplina1.setText("");
        Disciplina2.setText("");
        Contato.setText("");
        Email.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Assunto;
    private javax.swing.JTextField CodigoProfessor;
    private javax.swing.JTextField Contato;
    private javax.swing.JMenu Disciplina;
    private javax.swing.JTextField Disciplina1;
    private javax.swing.JTextField Disciplina2;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel Fundo;
    private javax.swing.JTextField Login;
    private javax.swing.JTextField Nome;
    private javax.swing.JMenu Professor;
    private javax.swing.JMenu Prova;
    private javax.swing.JMenu Questão;
    private javax.swing.JMenu Sair;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JTextField Sexo;
    private javax.swing.JMenu Sobre;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoProcurar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtCodigoProfessor;
    private javax.swing.JLabel txtContato;
    private javax.swing.JLabel txtDisciplina;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtLogin;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtSenha;
    private javax.swing.JLabel txtSexo;
    // End of variables declaration//GEN-END:variables

    private void setNome(JTextField Nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setLogin(JTextField Login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setSenha(JPasswordField Senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setSexo(JTextField Sexo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDisciplina1(JTextField Disciplina1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDisciplina2(JTextField Disciplina2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setContato(JTextField Contato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setEmail(JTextField Email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setCodigo(JTextField CodigoProfessor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}