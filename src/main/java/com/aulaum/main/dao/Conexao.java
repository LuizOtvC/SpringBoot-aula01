/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulaum.main.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class Conexao {
    
  
    private static final String url = "jdbc:mysql://localhost:3307/empresa";
    private static final String user = "root";
    private static final String senha = "";
    
    public static Connection conectar(){
       Connection conn = null;
       try{
           if(conn == null || conn.isClosed()){
                conn = DriverManager.getConnection(url, user, senha);
       }     
       }catch (SQLException e){
            e.printStackTrace();      
    }
    return conn;
}
}
