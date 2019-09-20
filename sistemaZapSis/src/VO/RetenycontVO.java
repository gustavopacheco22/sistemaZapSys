package VO;

public class RetenycontVO {

/*Todo los atributos*/
    int idretcon;
    int porcapjub;
    int porcobsoc;
    int porsind;

    int fechavigencia;

public RetenycontVO(){}

/*Todo los codigos get*/
    public int getIdretcon(){
        return idretcon;
    }
    public int getPorcapjub(){
        return porcapjub;
    }
    public int getPorcobsoc(){
        return porcobsoc;
    }
    public int getPorsind(){
        return porsind;
    }

    public int getFechavigencia(){
        return fechavigencia;
    }


/*Todo los codigos set*/
    public void setIdretcon(int idretcon){
        this.idretcon = idretcon;
    }
    public void setPorcapjub(int porcapjub){
        this.porcapjub = porcapjub;
    }
    public void setPorcobsoc(int porcobsoc){
        this.porcobsoc = porcobsoc;
    }
    public void setPorsind(int porsind){
        this.porsind = porsind;
    }

    public void setFechavigencia(int fechavigencia){
        this.fechavigencia = fechavigencia;
    }

}
