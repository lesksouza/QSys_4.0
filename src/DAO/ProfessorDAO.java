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
import javax.swing.JOptionPane;

/**
 *
 * @author XPerience
 */
public class ProfessorDAO {
    
    public ProfessorDAO(Connection con){
        super(con);
    }
    
    public String Inserir_Professor(Professor f){
        String sql = "INSERT INTO professor VALUES (0,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, f.getNome());
            ps.setString(2, f.getSexo());
            ps.setString(3, f.getLogin());
            ps.setString(4, f.getSenha());
            ps.setString(5, f.getDisciplina1());
            ps.setString(6, f.getDisciplina2());
            ps.setString(7, f.getContato());
            ps.setString(8, f.getEmail());
            ps.setInt(9, f.getLicenciatura());
            ps.setInt(10, f.getBacharelado());
            ps.setInt(11, f.getEspecializacao());
            ps.setInt(12, f.getMestrado());
            ps.setInt(13, f.getDoutorado());
            ps.setInt(14, f.getPosdoutorado());
            ps.setString(15, f.getCurriculo());
            ps.setInt(16, f.getDiretordeturma());
            
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
        String sql = "SELECT codigo,nome,sexo,login,senha,disciplina1,disciplina2,contato,email,licenciatura,bacharelado,especializacao,mestrado,doutorado,posdoutorado,curriculo,diretordeturma FROM professor";
        List<Professor> lista = new ArrayList<Professor>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Professor f = new Professor();
                    f.setCodigo(rs.getInt(1));
                    f.setNome(rs.getString(2));
                    f.setSexo(rs.getString(3));
                    f.setLogin(rs.getString(4));
                    f.setSenha(rs.getString(5));
                    f.setDisciplina1(rs.getString(6));
                    f.setDisciplina2(rs.getString(7));
                    f.setContato(rs.getString(8));
                    f.setEmail(rs.getString(9));
                    f.setLicenciatura(rs.getInt(10));
                    f.setBacharelado(rs.getInt(11));
                    f.setEspecializacao(rs.getInt(12));
                    f.setMestrado(rs.getInt(13));
                    f.setDoutorado(rs.getInt(14));
                    f.setPosdoutorado(rs.getInt(15));
                    f.setCurriculo(rs.getString(16));
                    f.setDiretordeturma(rs.getInt(17));
                    
                    lista.add(f);
                }
            return lista;
            }else{
                return null;
            }
        } catch (Exception e) {
            return null;
        }
        
    }
    
    public List<Professor> Pesquisar_Nome_Professor(String nome){
        String sql = "SELECT codigo,nome,sexo,login,senha,disciplina1,disciplina2,contato,email,licenciatura,bacharelado,especializacao,mestrado,doutorado,posdoutorado,curriculo,diretordeturma FROM professor WHERE nome LIKE '" + nome + "%'";
        List<Professor> lista = new ArrayList<Professor>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Professor f = new Professor();
                    f.setCodigo(rs.getInt(1));
                    f.setNome(rs.getString(2));
                    f.setSexo(rs.getString(3));
                    f.setLogin(rs.getString(4));
                    f.setSenha(rs.getString(5));
                    f.setDisciplina1(rs.getString(6));
                    f.setDisciplina2(rs.getString(7));
                    f.setContato(rs.getString(8));
                    f.setEmail(rs.getString(9));
                    f.setLicenciatura(rs.getInt(10));
                    f.setBacharelado(rs.getInt(11));
                    f.setEspecializacao(rs.getInt(12));
                    f.setMestrado(rs.getInt(13));
                    f.setDoutorado(rs.getInt(14));
                    f.setPosdoutorado(rs.getInt(15));
                    f.setCurriculo(rs.getString(16));
                    f.setDiretordeturma(rs.getInt(17));
                    
                    lista.add(f);
                }
            return lista;
            }else{
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Professor> Pesquisar_Codigo_Professor(int codigo){
        String sql = "SELECT codigo,nome,sexo,login,senha,disciplina1,disciplina2,contato,email,licenciatura,bacharelado,especializacao,mestrado,doutorado,posdoutorado,curriculo,diretordeturma FROM professor WHERE codigo = '" + codigo + "'" ;
        List<Professor> lista = new ArrayList<Professor>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Professor f = new Professor();
                    f.setCodigo(rs.getInt(1));
                    f.setNome(rs.getString(2));
                    f.setSexo(rs.getString(3));
                    f.setLogin(rs.getString(4));
                    f.setSenha(rs.getString(5));
                    f.setDisciplina1(rs.getString(6));
                    f.setDisciplina2(rs.getString(7));
                    f.setContato(rs.getString(8));
                    f.setEmail(rs.getString(9));
                    f.setLicenciatura(rs.getInt(10));
                    f.setBacharelado(rs.getInt(11));
                    f.setEspecializacao(rs.getInt(12));
                    f.setMestrado(rs.getInt(13));
                    f.setDoutorado(rs.getInt(14));
                    f.setPosdoutorado(rs.getInt(15));
                    f.setCurriculo(rs.getString(16));
                    f.setDiretordeturma(rs.getInt(17));
                    
                    lista.add(f);
                }
            return lista;
            }else{
                return null;
            }
        } catch (Exception e){
            return null;
        }
    }
    

    
    public Professor Consulta_Professor(int codigo){
        
         Professor f = new Professor();
         
        try {
            
            String sql = "SELECT * FROM professor WHERE codigo =  " + codigo + "";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
           
            
            if(rs != null){
                while(rs.next()){
                                      
                    f.setCodigo(rs.getInt(1));
                    f.setNome(rs.getString(2));
                    f.setSexo(rs.getString(3));
                    f.setLogin(rs.getString(4));
                    f.setSenha(rs.getString(5));
                    f.setDisciplina1(rs.getString(6));
                    f.setDisciplina2(rs.getString(7));
                    f.setContato(rs.getString(8));
                    f.setEmail(rs.getString(9));
                    f.setLicenciatura(rs.getInt(10));
                    f.setBacharelado(rs.getInt(11));
                    f.setEspecializacao(rs.getInt(12));
                    f.setMestrado(rs.getInt(13));
                    f.setDoutorado(rs.getInt(14));
                    f.setPosdoutorado(rs.getInt(15));
                    f.setCurriculo(rs.getString(16));
                    f.setDiretordeturma(rs.getInt(17));
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        if(f.getCodigo() == codigo){
            JOptionPane.showMessageDialog(null, "Funcionário encontrado com sucesso!");
        }else{
        JOptionPane.showMessageDialog(null, "Funcionário Não encontrado com sucesso!");    
        }
        return f;
    }
    
    
    
    
    public void Alterar_Professor(Professor f){
        String sql = "UPDATE professor SET nome = ?, login = ?, senha = ?"
                + "WHERE codigo = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, f.getNome());
            ps.setString(2, f.getLogin());
            ps.setString(3, f.getSenha());
            ps.setString(4, "" + f.getCodigo());
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null,"Professor atualizado com sucesso.");
            }else{
                JOptionPane.showMessageDialog(null,"Erro ao atualizar o funcionário.");
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
                    Professor f = new Professor();
                    f.setNome(rs.getString(1));
                    lista.add(f);
                }
                return lista;
            }else{
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    
    public String Excluir_Professor(Professor f){
        String sql = "DELETE FROM professor WHERE codigo = ?";
    
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, f.getCodigo());
            
            if(ps.executeUpdate() > 0){
                return "Professor excluído com sucesso.";
            }else{
                return "Erro ao excluir.";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    
    }

    public boolean Logar(String login, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Inserir_Professor(Interfaces.Professor f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
