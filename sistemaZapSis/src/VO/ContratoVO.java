package VO;

import java.sql.Date;

public class ContratoVO {

/*Todo los atributos*/
    int idcontrato;
    Date fechafirma;
    Date fechavencimiento;
    int estado;
    int dni;
    int idcategoria;

public ContratoVO(){}

/*Todo los codigos get*/
    public int getIdcontrato(){
        return idcontrato;
    }
    public Date getFechafirma(){
        return fechafirma;
    }
    public Date getFechavencimiento(){
        return fechavencimiento;
    }
    public int getEstado(){
        return estado;
    }
    public int getDni(){
        return dni;
    }
    public int getIdcategoria(){
        return idcategoria;
    }


/*Todo los codigos set*/
    public void setIdcontrato(int idcontrato){
        this.idcontrato = idcontrato;
    }
    public void setFechafirma(Date fechafirma){
        this.fechafirma = fechafirma;
    }
    public void setFechavencimiento(Date fechavencimiento){
        this.fechavencimiento = fechavencimiento;
    }
    public void setEstado(int estado){
        this.estado = estado;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    public void setIdcategoria(int idcategoria){
        this.idcategoria = idcategoria;
    }

}
