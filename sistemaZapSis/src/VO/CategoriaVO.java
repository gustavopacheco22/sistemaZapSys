package VO;

public class CategoriaVO {

/*Todo los atributos*/
    int idcategoria;
    double montoacobrar;
    String descripcion;

public CategoriaVO(){}

/*Todo los codigos get*/
    public int getIdcategoria(){
        return idcategoria;
    }
    public double getMontoacobrar(){
        return montoacobrar;
    }
    public String getDescripcion(){
        return descripcion;
    }


/*Todo los codigos set*/
    public void setIdcategoria(int idcategoria){
        this.idcategoria = idcategoria;
    }
    public void setMontoacobrar(double montoacobrar){
        this.montoacobrar = montoacobrar;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

}
