package VO;

import java.sql.Date;

public class HspersonalVO {

/*Todo los atributos*/
    int idmovimientofilial;
    Date mesyanio;
    int idfilial;
    int horastrabajadas;
    int horasextras;
    String comentarios;
    int dni;

public HspersonalVO(){}

/*Todo los codigos get*/
    public int getIdmovimientofilial(){
        return idmovimientofilial;
    }
    public Date getMes(){
        return mesyanio;
    }
    public int getIdfilial(){
        return idfilial;
    }
    public int getHorastrabajadas(){
        return horastrabajadas;
    }
    public int getHorasextras(){
        return horasextras;
    }
    public String getComentarios(){
        return comentarios;
    }
    public int getDni(){
        return dni;
    }


/*Todo los codigos set*/
    public void setIdmovimientofilial(int idmovimientofilial){
        this.idmovimientofilial = idmovimientofilial;
    }
    public void setMes(Date mesyanio){
        this.mesyanio = mesyanio;
    }
    public void setIdfilial(int idfilial){
        this.idfilial = idfilial;
    }
    public void setHorastrabajadas(int horastrabajadas){
        this.horastrabajadas = horastrabajadas;
    }
    public void setHorasextras(int horasextras){
        this.horasextras = horasextras;
    }
    public void setComentarios(String comentarios){
        this.comentarios = comentarios;
    }
    public void setDni(int dni){
        this.dni = dni;
    }

}
