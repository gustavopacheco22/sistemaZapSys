package Tabla;

import DAO.SueldoDAO;
import VO.SueldoVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_SueldoVO{

   SueldoDAO dao = null;


    public void visualizar_SueldoVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("idsueldo");
        dt.addColumn("dni");
        dt.addColumn("mes");
        dt.addColumn("anio");
        dt.addColumn("idretcon");
        dt.addColumn("sueldobase");
        dt.addColumn("montosindicato");
        dt.addColumn("montohsex");
        dt.addColumn("montojubilacion");
        dt.addColumn("montoobrasocial");
        dt.addColumn("montodeaporteju");
        dt.addColumn("montodeaporteobsoc");
        dt.addColumn("netocobrar");

        dao = new SueldoDAO();
        SueldoVO vo = new SueldoVO();
        ArrayList<SueldoVO> list = dao.Listar_SueldoVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[13];
                vo = list.get(i);
                fila[0] = vo.getIdsueldo();
                fila[1] = vo.getDni();
                fila[2] = vo.getMes();
                fila[3] = vo.getAnio();
                fila[4] = vo.getIdretcon();
                fila[5] = vo.getSueldobase();
                fila[6] = vo.getMontosindicato();
                fila[7] = vo.getMontohsex();
                fila[8] = vo.getMontojubilacion();
                fila[9] = vo.getMontoobrasocial();
                fila[10] = vo.getMontodeaporteju();
                fila[11] = vo.getMontodeaporteobsoc();
                fila[12] = vo.getNetocobrar();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


