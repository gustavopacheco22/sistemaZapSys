package VO;

public class SueldoVO {

/*Todo los atributos*/
    int idsueldo;
    int dni;
    String mes;
    String anio;
    int idretcon;
    int sueldobase;
    int montosindicato;
    int montohsex;
    int montojubilacion;
    int montoobrasocial;
    int montodeaporteju;
    int montodeaporteobsoc;
    int netocobrar;

public SueldoVO(){}

/*Todo los codigos get*/
    public int getIdsueldo(){
        return idsueldo;
    }
    public int getDni(){
        return dni;
    }
    public String getMes(){
        return mes;
    }
    public String getAnio(){
        return anio;
    }
    public int getIdretcon(){
        return idretcon;
    }
    public int getSueldobase(){
        return sueldobase;
    }
    public int getMontosindicato(){
        return montosindicato;
    }
    public int getMontohsex(){
        return montohsex;
    }
    public int getMontojubilacion(){
        return montojubilacion;
    }
    public int getMontoobrasocial(){
        return montoobrasocial;
    }
    public int getMontodeaporteju(){
        return montodeaporteju;
    }
    public int getMontodeaporteobsoc(){
        return montodeaporteobsoc;
    }
    public int getNetocobrar(){
        return netocobrar;
    }


/*Todo los codigos set*/
    public void setIdsueldo(int idsueldo){
        this.idsueldo = idsueldo;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    public void setMes(String mes){
        this.mes = mes;
    }
    public void setAnio(String anio){
        this.anio = anio;
    }
    public void setIdretcon(int idretcon){
        this.idretcon = idretcon;
    }
    public void setSueldobase(int sueldobase){
        this.sueldobase = sueldobase;
    }
    public void setMontosindicato(int montosindicato){
        this.montosindicato = montosindicato;
    }
    public void setMontohsex(int montohsex){
        this.montohsex = montohsex;
    }
    public void setMontojubilacion(int montojubilacion){
        this.montojubilacion = montojubilacion;
    }
    public void setMontoobrasocial(int montoobrasocial){
        this.montoobrasocial = montoobrasocial;
    }
    public void setMontodeaporteju(int montodeaporteju){
        this.montodeaporteju = montodeaporteju;
    }
    public void setMontodeaporteobsoc(int montodeaporteobsoc){
        this.montodeaporteobsoc = montodeaporteobsoc;
    }
    public void setNetocobrar(int netocobrar){
        this.netocobrar = netocobrar;
    }

}
