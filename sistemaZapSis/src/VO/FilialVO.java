package VO;

public class FilialVO {

/*Todo los atributos*/
    int idfilial;
    String nombrefilial;
    String ubicacionfilial;

public FilialVO(){}

/*Todo los codigos get*/
    public int getIdfilial(){
        return idfilial;
    }
    public String getNombrefilial(){
        return nombrefilial;
    }
    public String getUbicacionfilial(){
        return ubicacionfilial;
    }


/*Todo los codigos set*/
    public void setIdfilial(int idfilial){
        this.idfilial = idfilial;
    }
    public void setNombrefilial(String nombrefilial){
        this.nombrefilial = nombrefilial;
    }
    public void setUbicacionfilial(String ubicacionfilial){
        this.ubicacionfilial = ubicacionfilial;
    }

}
