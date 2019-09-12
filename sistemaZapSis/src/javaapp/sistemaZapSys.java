/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import Conexion.Conectar;
import java.sql.Connection;
/**
 *
 * @author Gustavo
 */
public class sistemaZapSys {
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conectar con = new Conectar();
        Connection reg = con.getConnection();
        
    }
    
}
