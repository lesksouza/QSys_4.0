/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;

public class ExecuteSQL {
    
    private Connection con;
    
    public ExecuteSQL (Connection con){
        setCon(con);
    }

    private void setCon(Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Connection getCon(){
        return con;
    }
    
    
}
