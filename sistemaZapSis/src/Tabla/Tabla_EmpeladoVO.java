package Tabla;

import DAO.EmpeladoDAO;
import VO.EmpeladoVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_EmpeladoVO{

   EmpeladoDAO dao = null;


    public void visualizar_EmpeladoVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("dni");
        dt.addColumn("nombre");
        dt.addColumn("apellido");
        dt.addColumn("telefono");
        dt.addColumn("domicilio");
        dt.addColumn("correoelectronico");
        dt.addColumn("estado");
        dt.addColumn("nombresindicato");

        dao = new EmpeladoDAO();
        EmpeladoVO vo = new EmpeladoVO();
        ArrayList<EmpeladoVO> list = dao.Listar_EmpeladoVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[8];
                vo = list.get(i);
                fila[0] = vo.getDni();
                fila[1] = vo.getNombre();
                fila[2] = vo.getApellido();
                fila[3] = vo.getTelefono();
                fila[4] = vo.getDomicilio();
                fila[5] = vo.getCorreoelectronico();
                fila[6] = vo.getEstado();
                fila[7] = vo.getNombresindicato();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
    
      public void mostrarEmpleado(JTable tabla, int DNi){
        DefaultTableModel dt = new DefaultTableModel();
        
        dt.addColumn("nombre");
        dt.addColumn("apellido");
        dt.addColumn("nombresindicato");

        dao = new EmpeladoDAO();
        EmpeladoVO vo = new EmpeladoVO();
        //EmpeladoVO list = dao.Buscar_EmpeladoVO(DNi);
        vo = dao.Buscar_EmpeladoVO(DNi);
          System.out.println(vo.toString());
        
        
        Object fila[] = new Object[3];
               
                
                fila[0] = vo.getNombre();
                fila[1] = vo.getApellido();
                fila[2] = vo.getNombresindicato();
                dt.addRow(fila);
            
            tabla.setModel(dt);

//        if(list.size() > 0){
//            for(int i=0; i<list.size(); i++){
//                Object fila[] = new Object[8];
//                vo = list.get(i);
//                fila[0] = vo.getDni();
//                fila[1] = vo.getNombre();
//                fila[2] = vo.getApellido();
//                fila[3] = vo.getTelefono();
//                fila[4] = vo.getDomicilio();
//                fila[5] = vo.getCorreoelectronico();
//                fila[6] = vo.getEstado();
//                fila[7] = vo.getNombresindicato();
//                dt.addRow(fila);
//            }
//            tabla.setModel(dt);
//        }
    }
      
        public void mostrarEmpleadoXEstado(JTable tabla, int DNi){
        DefaultTableModel dt = new DefaultTableModel();
        
        
        dt.addColumn("nombre");
        dt.addColumn("apellido");
        dt.addColumn("filial");

        dao = new EmpeladoDAO();
        EmpeladoVO vo = new EmpeladoVO();
        //EmpeladoVO list = dao.Buscar_EmpeladoVO(DNi);
        vo = dao.Buscar_Empleado_Activo(DNi);
        System.out.println(vo.toString());
       
        
        Object fila[] = new Object[3];

                fila[0] = vo.getNombre();
                fila[1] = vo.getApellido();
                fila[2] = vo.getNombresindicato();
                dt.addRow(fila);
            
            tabla.setModel(dt);
    //return vo;
        }
}


