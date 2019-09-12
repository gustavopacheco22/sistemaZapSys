package Tabla;

import DAO.HspersonalDAO;
import VO.HspersonalVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_HspersonalVO{

   HspersonalDAO dao = null;


    public void visualizar_HspersonalVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("idmovimientofilial");
        dt.addColumn("mes");
        dt.addColumn("idfilial");
        dt.addColumn("horastrabajadas");
        dt.addColumn("horasextras");
        dt.addColumn("comentarios");
        dt.addColumn("dni");

        dao = new HspersonalDAO();
        HspersonalVO vo = new HspersonalVO();
        ArrayList<HspersonalVO> list = dao.Listar_HspersonalVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[7];
                vo = list.get(i);
                fila[0] = vo.getIdmovimientofilial();
                fila[1] = vo.getMes();
                fila[2] = vo.getIdfilial();
                fila[3] = vo.getHorastrabajadas();
                fila[4] = vo.getHorasextras();
                fila[5] = vo.getComentarios();
                fila[6] = vo.getDni();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


