package VO;

public class InformeVO {

/*Todo los atributos*/
    int nroinforme;
    String dia;
    String mes;
    String anio;
    String descripcion;
    String comentario;
    int dni;

public InformeVO(){}

/*Todo los codigos get*/
    public int getNroinforme(){
        return nroinforme;
    }
    public String getDia(){
        return dia;
    }
    public String getMes(){
        return mes;
    }
    public String getAnio(){
        return anio;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public String getComentario(){
        return comentario;
    }
    public int getDni(){
        return dni;
    }


/*Todo los codigos set*/
    public void setNroinforme(int nroinforme){
        this.nroinforme = nroinforme;
    }
    public void setDia(String dia){
        this.dia = dia;
    }
    public void setMes(String mes){
        this.mes = mes;
    }
    public void setAnio(String anio){
        this.anio = anio;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setComentario(String comentario){
        this.comentario = comentario;
    }
    public void setDni(int dni){
        this.dni = dni;
    }

}
