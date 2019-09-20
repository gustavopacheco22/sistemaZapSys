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
                vo.setMes(rs.getInt(3));
                vo.setAnio(rs.getInt(4));
                vo.setIdretcon(rs.getInt(5));
                vo.setSueldobase(rs.getDouble(6));
                vo.setMontosindicato(rs.getDouble(7));
                vo.setMontohsex(rs.getDouble(8));
                vo.setMontojubilacion(rs.getDouble(9));
                vo.setMontoobrasocial(rs.getDouble(10));
                vo.setMontodeaporteju(rs.getDouble(11));
                vo.setMontodeaporteobsoc(rs.getDouble(12));
                vo.setNetocobrar(rs.getDouble(13));
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
        String sql = "INSERT INTO `sueldo`( `DNI`, `mes`, `anio`, `idRetCon`, `sueldoBase`, `montoSindicato`, `montoHsEx`, `montoJubilacion`, `montoObraSocial`, `montoDeAporteJu`, `montoDeAporteObSoc`, `netoCobrar`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?) ;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getDni());
            ps.setInt(2, vo.getMes());
            ps.setInt(3, vo.getAnio());
            ps.setInt(4, vo.getIdretcon());
            ps.setDouble(5, vo.getSueldobase());
            ps.setDouble(6, vo.getMontosindicato());
            ps.setDouble(7, vo.getMontohsex());
            ps.setDouble(8, vo.getMontojubilacion());
            ps.setDouble(9, vo.getMontoobrasocial());
            ps.setDouble(10, vo.getMontodeaporteju());
            ps.setDouble(11, vo.getMontodeaporteobsoc());
            ps.setDouble(12, vo.getNetocobrar());
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
            ps.setInt(3, vo.getMes());
            ps.setInt(4, vo.getAnio());
            ps.setInt(5, vo.getIdretcon());
            ps.setDouble(6, vo.getSueldobase());
            ps.setDouble(7, vo.getMontosindicato());
            ps.setDouble(8, vo.getMontohsex());
            ps.setDouble(9, vo.getMontojubilacion());
            ps.setDouble(10, vo.getMontoobrasocial());
            ps.setDouble(11, vo.getMontodeaporteju());
            ps.setDouble(12, vo.getMontodeaporteobsoc());
            ps.setDouble(13, vo.getNetocobrar());
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
            ps.setInt(3, vo.getMes());
            ps.setInt(4, vo.getAnio());
            ps.setInt(5, vo.getIdretcon());
            ps.setDouble(6, vo.getSueldobase());
            ps.setDouble(7, vo.getMontosindicato());
            ps.setDouble(8, vo.getMontohsex());
            ps.setDouble(9, vo.getMontojubilacion());
            ps.setDouble(10, vo.getMontoobrasocial());
            ps.setDouble(11, vo.getMontodeaporteju());
            ps.setDouble(12, vo.getMontodeaporteobsoc());
            ps.setDouble(13, vo.getNetocobrar());
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
