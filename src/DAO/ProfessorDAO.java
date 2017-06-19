/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;
import Modelo.Professor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JMenu;
import javax.swing.JOptionPane;


/**
 *
 * @author XPerience
 */
public class ProfessorDAO extends ExecuteSQL {
    
    public ProfessorDAO(Connection con){
        super(con);
    }
    
    public boolean Logar(String Login, String Senha){
       
        boolean finalResult = false;
        try {
            String consulta = "select login, senha from professor WHERE login = '" + Login + "' and senha = '" + Senha + "'";
            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null){
                while (rs.next()){
                    Professor p = new Professor();
                    p.setLogin(rs.getString(1));
                    p.setSenha(rs.getString(2));
                    finalResult = true;
                }
            }
        } catch (SQLException ex){
            ex.getMessage();
        }
        return finalResult;
    }
    
    public String Inserir_Professor(Professor p){
        String sql = "INSERT INTO professor VALUES (0,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, p.getNome());
            ps.setString(2, p.getSexo());
            ps.setString(3, p.getLogin());
            ps.setString(4, p.getSenha());
            ps.setString(5, p.getDisciplina1());
            ps.setString(6, p.getDisciplina2());
            ps.setString(7, p.getContato());
            ps.setString(8, p.getEmail());
            
            if(ps.executeUpdate() > 0){
                return "Professor cadastrado com sucesso.";
            }else{
                return "Erro ao cadastrar professor.";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public List<Professor> Listar_Professor(){
        String sql = "SELECT codigo,nome,sexo,login,snha,disciplina1,disciplina2,contato,email FROM professor";
        List<Professor> lista = new ArrayList<Professor>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Professor p = new Professor();
                    p.setCodigo(rs.getInt(1));
                    p.setNome(rs.getString(2));
                    p.setSexo(rs.getString(3));
                    p.setLogin(rs.getString(4));
                    p.setSenha(rs.getString(5));
                    p.setDisciplina1(rs.getString(6));
                    p.setDisciplina2(rs.getString(7));
                    p.setContato(rs.getString(8));
                    p.setEmail(rs.getString(9));
                    
                    lista.add(p);
                }
            return lista;
            }else{
                return null;
            }
        } catch (Exception e) {
            return null;
        }
        
    }
    
    public List<Professor> Pesquisar_Nome_Professor(String Nome){
        String sql = "SELECT codigo,nome,sexo,login,senha,disciplina1,disciplina2,contato,email FROM professor WHERE nome LIKE '" + Nome + "%'";
        List<Professor> lista = new ArrayList<Professor>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Professor p = new Professor();
                    p.setCodigo(rs.getInt(1));
                    p.setNome(rs.getString(2));
                    p.setSexo(rs.getString(3));
                    p.setLogin(rs.getString(4));
                    p.setSenha(rs.getString(5));
                    p.setDisciplina1(rs.getString(6));
                    p.setDisciplina2(rs.getString(7));
                    p.setContato(rs.getString(8));
                    p.setEmail(rs.getString(9));
                    
                    lista.add(p);
                }
            return lista;
            }else{
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Professor> Pesquisar_Codigo_Professor(int Codigo){
        String sql = "SELECT codigo,nome,sexo,login,senha,disciplina1,disciplina2,contato,email FROM professor WHERE codigo = '" + Codigo + "'" ;
        List<Professor> lista = new ArrayList<Professor>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Professor p = new Professor();
                    p.setCodigo(rs.getInt(1));
                    p.setNome(rs.getString(2));
                    p.setSexo(rs.getString(3));
                    p.setLogin(rs.getString(4));
                    p.setSenha(rs.getString(5));
                    p.setDisciplina1(rs.getString(6));
                    p.setDisciplina2(rs.getString(7));
                    p.setContato(rs.getString(8));
                    p.setEmail(rs.getString(9));
                    
                    lista.add(p);
                }
            return lista;
            }else{
                return null;
            }
        } catch (Exception e){
            return null;
        }
    }
    

    
    public Professor Consulta_Professor(int Codigo){
        
         Professor p = new Professor();
         
        try {
            
            String sql = "SELECT * FROM professor WHERE codigo =  " + Codigo + "";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
           
            
            if(rs != null){
                while(rs.next()){
                                      
                    p.setCodigo(rs.getInt(1));
                    p.setNome(rs.getString(2));
                    p.setSexo(rs.getString(3));
                    p.setLogin(rs.getString(4));
                    p.setSenha(rs.getString(5));
                    p.setDisciplina1(rs.getString(6));
                    p.setDisciplina2(rs.getString(7));
                    p.setContato(rs.getString(8));
                    p.setEmail(rs.getString(9));
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        if(p.getCodigo() == Codigo){
            JOptionPane.showMessageDialog(null, "Professor encontrado com sucesso.");
        }else{
        JOptionPane.showMessageDialog(null, "Professor não foi encontrado.");    
        }
        return p;
    }
    
    
    
    
    public void Alterar_Professor(Professor p){
        String sql = "UPDATE professor SET codigo = ?, nome = ?, login = ?, senha = ?, disciplina1 = ?, disciplina2 = ?, contato = ?, email = ? WHERE codigo = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, p.getCodigo());
            ps.setString(2, p.getNome());
            ps.setString(3, p.getSexo());
            ps.setString(4, p.getLogin());
            ps.setString(5, p.getSenha());
            ps.setString(6, p.getDisciplina1());
            ps.setString(7, p.getDisciplina2());
            ps.setString(8, p.getContato());
            ps.setString(9, p.getEmail());
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null,"Professor atualizado com sucesso.");
            }else{
                JOptionPane.showMessageDialog(null,"Erro ao atualizar o profesosr.");
            }
        } catch (Exception e) {
           e.getMessage();
        }
    }
    
    public List<Professor> ListaComboProfessor(){
        String sql = "SELECT nome FROM professor ORDER BY nome";
        List<Professor> lista = new ArrayList<Professor>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Professor p = new Professor();
                    p.setNome(rs.getString(1));
                    lista.add(p);
                }
                return lista;
            }else{
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    
    public String Excluir_Professor(Professor p){
        String sql = "DELETE FROM professor WHERE codigo = ?";
    
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, p.getCodigo());
            
            if(ps.executeUpdate() > 0){
                return "Professor excluído com sucesso.";
            }else{
                return "Erro ao excluir.";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    
    }
    
    public void Alterar_Professor(JMenu Professor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
