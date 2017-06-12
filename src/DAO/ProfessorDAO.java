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
            String consulta = "select Login, Senha from professores WHERE Login = '" + Login + "' and Senha = '" + Senha + "'";
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
        String sql = "INSERT INTO professores VALUES (0,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
            ps.setInt(9, p.getLicenciatura());
            ps.setInt(10, p.getBacharelado());
            ps.setInt(11, p.getEspecializacao());
            ps.setInt(12, p.getMestrado());
            ps.setInt(13, p.getDoutorado());
            ps.setInt(14, p.getPosdoutorado());
            ps.setString(15, p.getCurriculo());
            ps.setInt(16, p.getDiretordeturma());
            
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
        String sql = "SELECT Codigo,Nome,Sexo,Login,Senha,Disciplina1,Disciplina2,Contato,Email,Licenciatura,Bacharelado,Especializacao,Mestrado,Doutorado,Posdoutorado,Curriculo,Diretordeturma FROM professores";
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
                    p.setLicenciatura(rs.getInt(10));
                    p.setBacharelado(rs.getInt(11));
                    p.setEspecializacao(rs.getInt(12));
                    p.setMestrado(rs.getInt(13));
                    p.setDoutorado(rs.getInt(14));
                    p.setPosdoutorado(rs.getInt(15));
                    p.setCurriculo(rs.getString(16));
                    p.setDiretordeturma(rs.getInt(17));
                    
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
        String sql = "SELECT Codigo,Nome,Sexo,Login,Senha,Disciplina1,Disciplina2,Contato,Email,Licenciatura,Bacharelado,Especializacao,Mestrado,Doutorado,Posdoutorado,Curriculo,Diretordeturma FROM professores WHERE nome LIKE '" + Nome + "%'";
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
                    p.setLicenciatura(rs.getInt(10));
                    p.setBacharelado(rs.getInt(11));
                    p.setEspecializacao(rs.getInt(12));
                    p.setMestrado(rs.getInt(13));
                    p.setDoutorado(rs.getInt(14));
                    p.setPosdoutorado(rs.getInt(15));
                    p.setCurriculo(rs.getString(16));
                    p.setDiretordeturma(rs.getInt(17));
                    
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
        String sql = "SELECT Codigo,Nome,Sexo,Login,Senha,Disciplina1,Disciplina2,Contato,Email,Licenciatura,Bacharelado,Especializacao,Mestrado,Doutorado,Posdoutorado,Curriculo,Diretordeturma FROM professores WHERE Codigo = '" + Codigo + "'" ;
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
                    p.setLicenciatura(rs.getInt(10));
                    p.setBacharelado(rs.getInt(11));
                    p.setEspecializacao(rs.getInt(12));
                    p.setMestrado(rs.getInt(13));
                    p.setDoutorado(rs.getInt(14));
                    p.setPosdoutorado(rs.getInt(15));
                    p.setCurriculo(rs.getString(16));
                    p.setDiretordeturma(rs.getInt(17));
                    
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
            
            String sql = "SELECT * FROM professores WHERE Codigo =  " + Codigo + "";
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
                    p.setLicenciatura(rs.getInt(10));
                    p.setBacharelado(rs.getInt(11));
                    p.setEspecializacao(rs.getInt(12));
                    p.setMestrado(rs.getInt(13));
                    p.setDoutorado(rs.getInt(14));
                    p.setPosdoutorado(rs.getInt(15));
                    p.setCurriculo(rs.getString(16));
                    p.setDiretordeturma(rs.getInt(17));
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
        String sql = "UPDATE professores SET Codigo = ?, Nome = ?, Login = ?, Senha = ?, Disciplina1 = ?, Disciplina2 = ?, Contato = ?, Email = ?, Licenciatura = ?, Bacharelado = ?, Especializacao = ?, Mestrado = ?, Doutorado = ?, Posdoutorado = ?, Curriculo = ?, Diretordeturma = ? WHERE Codigo = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, p.getNome());
            ps.setString(2, p.getLogin());
            ps.setString(3, p.getSenha());
            ps.setString(4, "" + p.getCodigo());
            
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
        String sql = "SELECT Nome FROM professores ORDER BY Nome";
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
        String sql = "DELETE FROM professores WHERE codigo = ?";
    
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

    

    public void Inserir_Professor(Interfaces.Professor p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Alterar_Professor(JMenu Professor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
