package Tabla;

import DAO.ContratoDAO;
import VO.ContratoVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Tabla_ContratoVO{

   ContratoDAO dao = null;


    public void visualizar_ContratoVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("idcontrato");
        dt.addColumn("fechafirma");
        dt.addColumn("fechavencimiento");
        dt.addColumn("estado");
        dt.addColumn("dni");
        dt.addColumn("idcategoria");

        dao = new ContratoDAO();
        ContratoVO vo = new ContratoVO();
        ArrayList<ContratoVO> list = dao.Listar_ContratoVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[6];
                vo = list.get(i);
                fila[0] = vo.getIdcontrato();
                fila[1] = vo.getFechafirma();
                fila[2] = vo.getFechavencimiento();
                fila[3] = vo.getEstado();
                fila[4] = vo.getDni();
                fila[5] = vo.getIdcategoria();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
    
    public int mostrarContratoXDni(JTable tabla, int dni){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("idcontrato");
        dt.addColumn("fechafirma");
        dt.addColumn("fechavencimiento");
        dt.addColumn("estado");
        dt.addColumn("dni");
        dt.addColumn("idcategoria");

        dao = new ContratoDAO();
        //ContratoVO vo = new ContratoVO();
        ContratoVO vo = dao.BuscarContratoXDni(dni);
        
        if(vo == null){
            JOptionPane.showMessageDialog(tabla, "El contrato no esta Activo");
            
        }

        
                Object fila[] = new Object[6];
                
                fila[0] = vo.getIdcontrato();
                fila[1] = vo.getFechafirma();
                fila[2] = vo.getFechavencimiento();
                fila[3] = vo.getEstado();
                fila[4] = vo.getDni();
                fila[5] = vo.getIdcategoria();
                dt.addRow(fila);
            
            tabla.setModel(dt);
            
            return vo.getIdcategoria();
        }
    
    
}


