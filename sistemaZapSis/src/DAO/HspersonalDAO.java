package DAO;

import Conexion.Conectar;
import VO.HspersonalVO;
import java.sql.*;
import java.util.ArrayList;


/*Metodo listar*/
public class HspersonalDAO{

    public ArrayList<HspersonalVO> Listar_HspersonalVO(){
        ArrayList<HspersonalVO> list = new ArrayList<HspersonalVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM `hspersonal`;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                HspersonalVO vo = new HspersonalVO();
                vo.setIdmovimientofilial(rs.getInt(1));
                vo.setMes(rs.getDate(2));
                vo.setIdfilial(rs.getInt(3));
                vo.setHorastrabajadas(rs.getInt(4));
                vo.setHorasextras(rs.getInt(5));
                vo.setComentarios(rs.getString(6));
                vo.setDni(rs.getInt(7));
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
    public int  Agregar_HspersonalVO(HspersonalVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO `hspersonal`(`mes y anio`, `idFilial`, `horasTrabajadas`, `horasExtras`, `comentarios`, `DNI`) VALUES (?,?,?,?,?,?);";
        PreparedStatement ps = null;
        int resul = 0;
        try{
            ps = conec.getConnection().prepareStatement(sql);
 
            ps.setDate(1, vo.getMes());
            ps.setInt(2, vo.getIdfilial());
            ps.setInt(3, vo.getHorastrabajadas());
            ps.setInt(4, vo.getHorasextras());
            ps.setString(5, vo.getComentarios());
            ps.setInt(6, vo.getDni());
            resul = ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
                //return resul;
            }catch(Exception ex){}
        }
        return resul;

    }


/*Metodo Modificar*/
    public void Modificar_HspersonalVO(HspersonalVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE tabla SET campo2 = ? WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdmovimientofilial());
            ps.setDate(2, vo.getMes());
            ps.setInt(3, vo.getIdfilial());
            ps.setInt(4, vo.getHorastrabajadas());
            ps.setInt(5, vo.getHorasextras());
            ps.setString(6, vo.getComentarios());
            ps.setInt(7, vo.getDni());
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
    public void Eliminar_HspersonalVO(HspersonalVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM tabla WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdmovimientofilial());
            ps.setDate(2, vo.getMes());
            ps.setInt(3, vo.getIdfilial());
            ps.setInt(4, vo.getHorastrabajadas());
            ps.setInt(5, vo.getHorasextras());
            ps.setString(6, vo.getComentarios());
            ps.setInt(7, vo.getDni());
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
