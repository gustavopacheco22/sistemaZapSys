package VO;

public class SueldoVO {

/*Todo los atributos*/
    int idsueldo;
    int dni;
    int mes;
    int anio;
    int idretcon;
    double sueldobase;
    double montosindicato;
    double montohsex;
    double montojubilacion;
    double montoobrasocial;
    double montodeaporteju;
    double montodeaporteobsoc;
    double netocobrar;

public SueldoVO(){}

/*Todo los codigos get*/
    public int getIdsueldo(){
        return idsueldo;
    }
    public int getDni(){
        return dni;
    }
    public int getMes(){
        return mes;
    }
    public int getAnio(){
        return anio;
    }
    public int getIdretcon(){
        return idretcon;
    }
    public double getSueldobase(){
        return sueldobase;
    }
    public double getMontosindicato(){
        return montosindicato;
    }
    public double getMontohsex(){
        return montohsex;
    }
    public double getMontojubilacion(){
        return montojubilacion;
    }
    public double getMontoobrasocial(){
        return montoobrasocial;
    }
    public double getMontodeaporteju(){
        return montodeaporteju;
    }
    public double getMontodeaporteobsoc(){
        return montodeaporteobsoc;
    }
    public double getNetocobrar(){
        return netocobrar;
    }


/*Todo los codigos set*/
    public void setIdsueldo(int idsueldo){
        this.idsueldo = idsueldo;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    public void setIdretcon(int idretcon){
        this.idretcon = idretcon;
    }
    public void setSueldobase(double sueldobase){
        this.sueldobase = sueldobase;
    }
    public void setMontosindicato(double montosindicato){
        this.montosindicato = montosindicato;
    }
    public void setMontohsex(double montohsex){
        this.montohsex = montohsex;
    }
    public void setMontojubilacion(double montojubilacion){
        this.montojubilacion = montojubilacion;
    }
    public void setMontoobrasocial(double montoobrasocial){
        this.montoobrasocial = montoobrasocial;
    }
    public void setMontodeaporteju(double montodeaporteju){
        this.montodeaporteju = montodeaporteju;
    }
    public void setMontodeaporteobsoc(double montodeaporteobsoc){
        this.montodeaporteobsoc = montodeaporteobsoc;
    }
    public void setNetocobrar(double netocobrar){
        this.netocobrar = netocobrar;
    }

}
