package DAO;

import Conexion.Conectar;
import VO.EmpeladoVO;
import java.sql.*;
import java.util.ArrayList;


/*Metodo listar*/
public class EmpeladoDAO {

    final String INSERT = "INSERT INTO empleado (DNI, nombre, apellido, telefono, domicilio, correoElectronico, estado, nombreSindicato) VALUES (?,?,?,?,?,?,?,?)";
    final String UPDATE = "UPDATE empleado SET DNI = ?,nombre = ?,apellido = ?,telefono = ?,domicilio = ?,correoElectronico = ?,estadoEm = ?,nombreSindicato = ? WHERE DNI = ?";
    final String DELETE = "DELETE FROM empleado WHERE DNI = ?";
    final String GETALL = "SELECT * FROM empleado";
    final String GETONE = "SELECT estado FROM empleado WHERE DNI = ?";
    final String UPDATEEM = "UPDATE empleado SET estado = ? WHERE DNI = ?";

    public ArrayList<EmpeladoVO> Listar_EmpeladoVO() {
        ArrayList<EmpeladoVO> list = new ArrayList<EmpeladoVO>();
        Conectar conec = new Conectar();
        //String sql = "SELECT * FROM tabla;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(GETALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                EmpeladoVO vo = new EmpeladoVO();
                vo.setDni(rs.getInt(1));
                vo.setNombre(rs.getString(2));
                vo.setApellido(rs.getString(3));
                vo.setTelefono(rs.getInt(4));
                vo.setDomicilio(rs.getString(5));
                vo.setCorreoelectronico(rs.getString(6));
                vo.setEstado(rs.getInt(7));
                vo.setNombresindicato(rs.getString(8));
                list.add(vo);
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
        return list;
    }

    public EmpeladoVO Buscar_EmpeladoVO(int dni) {
        Conectar conec = new Conectar();
        // String sql = "SELECT * FROM empleado where DNI=?;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        EmpeladoVO vo = null;
        try {
            ps = conec.getConnection().prepareStatement(GETONE);
            ps.setInt(1, dni);
            rs = ps.executeQuery();

            if (rs.first()) {
                vo = new EmpeladoVO();
                vo.setDni(rs.getInt(1));
                vo.setNombre(rs.getString(2));
                vo.setApellido(rs.getString(3));
                vo.setTelefono(rs.getInt(4));
                vo.setDomicilio(rs.getString(5));
                vo.setCorreoelectronico(rs.getString(6));
                vo.setEstado(rs.getInt(7));
                vo.setNombresindicato(rs.getString(8));

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

    /*Metodo agregar*/
    public void Agregar_EmpeladoVO(EmpeladoVO vo) {
        Conectar conec = new Conectar();
        String sql = "INSERT INTO empleado (DNI, nombre, apellido, telefono, domicilio, correoElectronico, estado, nombreSindicato) VALUES(?,?,?,?,?,?,?,?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(INSERT);
            ps.setInt(1, vo.getDni());
            ps.setString(2, vo.getNombre());
            ps.setString(3, vo.getApellido());
            ps.setInt(4, vo.getTelefono());
            ps.setString(5, vo.getDomicilio());
            ps.setString(6, vo.getCorreoelectronico());
            ps.setInt(7, vo.getEstado());
            ps.setString(8, vo.getNombresindicato());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }


    /*Metodo Modificar*/
    public void Modificar_EmpeladoVO(EmpeladoVO vo) {
        Conectar conec = new Conectar();
        String sql = "UPDATE tabla SET campo2 = ? WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(UPDATE);
            ps.setInt(1, vo.getDni());
            ps.setString(2, vo.getNombre());
            ps.setString(3, vo.getApellido());
            ps.setInt(4, vo.getTelefono());
            ps.setString(5, vo.getDomicilio());
            ps.setString(6, vo.getCorreoelectronico());
            ps.setInt(7, vo.getEstado());
            ps.setString(8, vo.getNombresindicato());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    //borrar empleado logicamente
    public void borrar_EmpeladoVO(EmpeladoVO vo) {
        Conectar conec = new Conectar();
        //String sql = "UPDATE tabla SET campo2 = ? WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(UPDATEEM);
            //ps.setInt(1, vo.getDni());
            //ps.setString(2, vo.getNombre());
            //ps.setString(3, vo.getApellido());
            //ps.setInt(4, vo.getTelefono());
            //ps.setString(5, vo.getDomicilio());
            //ps.setString(6, vo.getCorreoelectronico());
            ps.setInt(1, vo.getEstado());
            ps.setInt(2, vo.getDni());
            //ps.setString(8, vo.getNombresindicato());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    /*Metodo Eliminar*/
    public void Eliminar_EmpeladoVO(EmpeladoVO vo) {
        Conectar conec = new Conectar();
        String sql = "DELETE FROM tabla WHERE campo1 = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(DELETE);
            ps.setInt(1, vo.getDni());
            ps.setString(2, vo.getNombre());
            ps.setString(3, vo.getApellido());
            ps.setInt(4, vo.getTelefono());
            ps.setString(5, vo.getDomicilio());
            ps.setString(6, vo.getCorreoelectronico());
            ps.setInt(7, vo.getEstado());
            ps.setString(8, vo.getNombresindicato());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

}
