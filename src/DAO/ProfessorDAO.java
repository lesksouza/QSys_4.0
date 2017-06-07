/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;
import Modelo.Professores;

/**
 *
 * @author XPerience
 */
public class ProfessorDAO {
    
    public ProfessorDAO(Connection con){
        super(con);
    }
    
    public boolean Logar(String login, String senha){
        boolean finalResult = false;
        
        try{
            String consulta = "select login, senha from professor "
            + "where login = '" + login + "' and senha = '" + senha "'";
            PreparedStatement ps = getCon().
        }
    }
}
