package DAO;

import Conexion.Conectar;
import VO.CategoriaVO;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;


/*Metodo listar*/
public class CategoriaDAO{

    public ArrayList<CategoriaVO> Listar_CategoriaVO(){
        ArrayList<CategoriaVO> list = new ArrayList<CategoriaVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM categoria;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                CategoriaVO vo = new CategoriaVO();
                //vo.setIdcategoria(rs.getInt(1));
                //vo.setMontoacobrar(rs.getInt(2));
                vo.setDescripcion(rs.getString(3));
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
    public void Agregar_CategoriaVO(CategoriaVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO tabla (campo1, campo2) VALUES(?,?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdcategoria());
            ps.setDouble(2, vo.getMontoacobrar());
            ps.setString(3, vo.getDescripcion());
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
    public void Modificar_CategoriaVO(CategoriaVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE tabla SET campo2 = ? WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdcategoria());
            ps.setDouble(2, vo.getMontoacobrar());
            ps.setString(3, vo.getDescripcion());
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
    public void Eliminar_CategoriaVO(CategoriaVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM tabla WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdcategoria());
            ps.setDouble(2, vo.getMontoacobrar());
            ps.setString(3, vo.getDescripcion());
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
    
    /*Metodo Listar Categoria en un ComboBOX*/
    public void Listar_Categoria_ComboBOX(JComboBox box){
        DefaultComboBoxModel value;
        Conectar conec = new Conectar();
        String sql = "SELECT descripcion FROM categoria;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            value = new DefaultComboBoxModel();
            box.setModel(value);
            while(rs.next()){
                value.addElement(rs.getString(1));
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
        
    }

    
    public CategoriaVO buscarCategoriaXid(int cat) {
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM `categoria` WHERE idcategoria = ?;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        CategoriaVO vo = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, cat);
            rs = ps.executeQuery();
            
//            int idcategoria;
//            int montoacobrar;
//            String descripcion;

            if (rs.first()) {
                vo = new CategoriaVO();
                vo.setIdcategoria(rs.getInt(1));
                vo.setMontoacobrar(rs.getDouble(2));
                vo.setDescripcion(rs.getString(3));
                
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
        return vo;
    }

}
