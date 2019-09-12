package DAO;

import Conexion.Conectar;
import VO.SueldoVO;
import java.sql.*;
import java.util.ArrayList;


/*Metodo listar*/
public class SueldoDAO{

    public ArrayList<SueldoVO> Listar_SueldoVO(){
        ArrayList<SueldoVO> list = new ArrayList<SueldoVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM tabla;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                SueldoVO vo = new SueldoVO();
                vo.setIdsueldo(rs.getInt(1));
                vo.setDni(rs.getInt(2));
                vo.setMes(rs.getString(3));
                vo.setAnio(rs.getString(4));
                vo.setIdretcon(rs.getInt(5));
                vo.setSueldobase(rs.getInt(6));
                vo.setMontosindicato(rs.getInt(7));
                vo.setMontohsex(rs.getInt(8));
                vo.setMontojubilacion(rs.getInt(9));
                vo.setMontoobrasocial(rs.getInt(10));
                vo.setMontodeaporteju(rs.getInt(11));
                vo.setMontodeaporteobsoc(rs.getInt(12));
                vo.setNetocobrar(rs.getInt(13));
                list.add(vo);
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                rs.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
        return list;
    }


/*Metodo agregar*/
    public void Agregar_SueldoVO(SueldoVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO tabla (campo1, campo2) VALUES(?,?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdsueldo());
            ps.setInt(2, vo.getDni());
            ps.setString(3, vo.getMes());
            ps.setString(4, vo.getAnio());
            ps.setInt(5, vo.getIdretcon());
            ps.setInt(6, vo.getSueldobase());
            ps.setInt(7, vo.getMontosindicato());
            ps.setInt(8, vo.getMontohsex());
            ps.setInt(9, vo.getMontojubilacion());
            ps.setInt(10, vo.getMontoobrasocial());
            ps.setInt(11, vo.getMontodeaporteju());
            ps.setInt(12, vo.getMontodeaporteobsoc());
            ps.setInt(13, vo.getNetocobrar());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


/*Metodo Modificar*/
    public void Modificar_SueldoVO(SueldoVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE tabla SET campo2 = ? WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdsueldo());
            ps.setInt(2, vo.getDni());
            ps.setString(3, vo.getMes());
            ps.setString(4, vo.getAnio());
            ps.setInt(5, vo.getIdretcon());
            ps.setInt(6, vo.getSueldobase());
            ps.setInt(7, vo.getMontosindicato());
            ps.setInt(8, vo.getMontohsex());
            ps.setInt(9, vo.getMontojubilacion());
            ps.setInt(10, vo.getMontoobrasocial());
            ps.setInt(11, vo.getMontodeaporteju());
            ps.setInt(12, vo.getMontodeaporteobsoc());
            ps.setInt(13, vo.getNetocobrar());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


/*Metodo Eliminar*/
    public void Eliminar_SueldoVO(SueldoVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM tabla WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdsueldo());
            ps.setInt(2, vo.getDni());
            ps.setString(3, vo.getMes());
            ps.setString(4, vo.getAnio());
            ps.setInt(5, vo.getIdretcon());
            ps.setInt(6, vo.getSueldobase());
            ps.setInt(7, vo.getMontosindicato());
            ps.setInt(8, vo.getMontohsex());
            ps.setInt(9, vo.getMontojubilacion());
            ps.setInt(10, vo.getMontoobrasocial());
            ps.setInt(11, vo.getMontodeaporteju());
            ps.setInt(12, vo.getMontodeaporteobsoc());
            ps.setInt(13, vo.getNetocobrar());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


}
