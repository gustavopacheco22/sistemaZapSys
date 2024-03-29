package modeloLogin;

import modeloLogin.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class SqlUsuarios extends conexion {
    
    /**
     * 
     * @param usr
     * @return Inserta un nuevo campo con los datos del nuevo usuario, en la tabla 'usuario' de la base de datos
     */

    public boolean registrar(Usuarios usr) {
        PreparedStatement ps = null;
        Connection con = getconexion();
        String sql = "INSERT INTO `usuario`(`usuario`, `password`, `nombre`, `email`, `idTipo`) VALUES (?, ?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getPassword());
            ps.setString(3, usr.getNombre());
            ps.setString(4, usr.getEmail());
            ps.setInt(5, usr.getIdTipo());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

 /**
  * @param  usar
  * @return Toma el usuario y contraseña ingresado, y si dirige a otra ventana.
  * Si los datos son erroneos, muestra un mensaje

  */
   
    public int login(Usuarios usr) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getconexion();

        String sql = "SELECT id, usuario, password, nombre, idTipo FROM usuario WHERE usuario = ? LIMIT 1";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {
                if (usr.getPassword().equals(rs.getString(3))) {
                    usr.setId(rs.getInt(1));
                    usr.setNombre(rs.getString(4));
                    usr.setIdTipo(rs.getInt(5));
                    return rs.getInt(1);
                } else {
                    return 0;
                }
            }

            return 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 0;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
    
    
    /**
     * 
     * @param usuario
     * @return Recibimos un usuario como parametro, y busca si existe en la base de datos.
     */

    public Long existeUsuario(String usuario) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getconexion();

        String sql = "SELECT * FROM `usuario` WHERE `usuario` LIKE ? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                //Long id = rs.getLong(1);
                //return rs.getInt(id);
                return rs.getLong(1);
            }

            return 0L;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 0L;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    /**
     * 
     * @param correo
     * @return Revisa si el correo ingresado, tiene formato de correo.
     */
    public boolean esEmail(String correo) {

        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);

        return mather.find();

    }
    
     /*Metodo Listar Categoria en un ComboBOX*/
    
    /**
     * 
     * @param box 
     * 
     */
    public void Listar_Usuarios_ComboBOX(JComboBox box){
        DefaultComboBoxModel value;
        conexion conec = new conexion();
        String sql = "SELECT nombre FROM tipousuario;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getconexion().prepareStatement(sql);
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

}