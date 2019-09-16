package Conexion;

import java.sql.*;

public class Conectar{

    static String bd = "sistzip";
    static String login = "root";
    static String password = "";
    static String url = "jdbc:mysql://localhost/"+bd;
    Connection connection = null;

    public Conectar(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url,login,password);
        if (connection!=null){
            System.out.println("Conexion a base de datos "+bd+" OK\n");
        }
        }catch(SQLException ex){
            System.out.println("Eror sql" + ex.getMessage());
        }catch(Exception ex){
            System.out.println("Error " + ex.getMessage());
        }
    }

    public Connection getConnection(){
        return connection;
    }

    public void desconectar(){
        connection = null;
    }


}
