package Tabla;

import DAO.FilialDAO;
import VO.FilialVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_FilialVO{

   FilialDAO dao = null;


    public void visualizar_FilialVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("idfilial");
        dt.addColumn("nombrefilial");
        dt.addColumn("ubicacionfilial");

        dao = new FilialDAO();
        FilialVO vo = new FilialVO();
        ArrayList<FilialVO> list = dao.Listar_FilialVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[3];
                vo = list.get(i);
                fila[0] = vo.getIdfilial();
                fila[1] = vo.getNombrefilial();
                fila[2] = vo.getUbicacionfilial();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


