package Tabla;

import DAO.InformeDAO;
import VO.InformeVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_InformeVO{

   InformeDAO dao = null;


    public void visualizar_InformeVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("nroinforme");
        dt.addColumn("dia");
        dt.addColumn("mes");
        dt.addColumn("anio");
        dt.addColumn("descripcion");
        dt.addColumn("comentario");
        dt.addColumn("dni");

        dao = new InformeDAO();
        InformeVO vo = new InformeVO();
        ArrayList<InformeVO> list = dao.Listar_InformeVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[7];
                vo = list.get(i);
                fila[0] = vo.getNroinforme();
                fila[1] = vo.getDia();
                fila[2] = vo.getMes();
                fila[3] = vo.getAnio();
                fila[4] = vo.getDescripcion();
                fila[5] = vo.getComentario();
                fila[6] = vo.getDni();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


