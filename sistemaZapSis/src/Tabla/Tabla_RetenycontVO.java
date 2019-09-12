package Tabla;

import DAO.RetenycontDAO;
import VO.RetenycontVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_RetenycontVO{

   RetenycontDAO dao = null;


    public void visualizar_RetenycontVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("idretcon");
        dt.addColumn("porcapjub");
        dt.addColumn("porcobsoc");
        dt.addColumn("porsind");
        dt.addColumn("porapjubpat");
        dt.addColumn("porobsocpat");
        dt.addColumn("fechavigencia");

        dao = new RetenycontDAO();
        RetenycontVO vo = new RetenycontVO();
        ArrayList<RetenycontVO> list = dao.Listar_RetenycontVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[7];
                vo = list.get(i);
                fila[0] = vo.getIdretcon();
                fila[1] = vo.getPorcapjub();
                fila[2] = vo.getPorcobsoc();
                fila[3] = vo.getPorsind();
                fila[4] = vo.getPorapjubpat();
                fila[5] = vo.getPorobsocpat();
                fila[6] = vo.getFechavigencia();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


