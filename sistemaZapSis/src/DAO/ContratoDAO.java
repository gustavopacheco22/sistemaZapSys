package DAO;

import Conexion.Conectar;
import VO.ContratoVO;
import java.sql.*;
import java.util.ArrayList;


/*Metodo listar*/
public class ContratoDAO{

    public ArrayList<ContratoVO> Listar_ContratoVO(){
        ArrayList<ContratoVO> list = new ArrayList<ContratoVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM tabla;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ContratoVO vo = new ContratoVO();
                vo.setIdcontrato(rs.getInt(1));
                vo.setFechafirma(rs.getInt(2));
                vo.setFechavencimiento(rs.getInt(3));
                vo.setEstado(rs.getInt(4));
                vo.setDni(rs.getInt(5));
                vo.setIdcategoria(rs.getInt(6));
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
    public void Agregar_ContratoVO(ContratoVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO tabla (campo1, campo2) VALUES(?,?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdcontrato());
            ps.setInt(2, vo.getFechafirma());
            ps.setInt(3, vo.getFechavencimiento());
            ps.setInt(4, vo.getEstado());
            ps.setInt(5, vo.getDni());
            ps.setInt(6, vo.getIdcategoria());
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
    public void Modificar_ContratoVO(ContratoVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE tabla SET campo2 = ? WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdcontrato());
            ps.setInt(2, vo.getFechafirma());
            ps.setInt(3, vo.getFechavencimiento());
            ps.setInt(4, vo.getEstado());
            ps.setInt(5, vo.getDni());
            ps.setInt(6, vo.getIdcategoria());
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
    public void Eliminar_ContratoVO(ContratoVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM tabla WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdcontrato());
            ps.setInt(2, vo.getFechafirma());
            ps.setInt(3, vo.getFechavencimiento());
            ps.setInt(4, vo.getEstado());
            ps.setInt(5, vo.getDni());
            ps.setInt(6, vo.getIdcategoria());
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
