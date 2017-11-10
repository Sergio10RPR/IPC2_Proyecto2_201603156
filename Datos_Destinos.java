
package travel;


public class Datos_Destinos {

private String codigoDes,paisDes,ciudadDes,direccionDes,nombreDes;
  public Datos_Destinos(String codigoDes, String paisDes, String ciudadDes, String direccionDes, String nombreDes) {
        this.codigoDes = codigoDes;
        this.paisDes = paisDes;
        this.ciudadDes = ciudadDes;
        this.direccionDes = direccionDes;
        this.nombreDes = nombreDes;
    }
    public void setCodigoDes(String codigoDes) {
        this.codigoDes = codigoDes;
    }

    public void setPaisDes(String paisDes) {
        this.paisDes = paisDes;
    }

    public void setCiudadDes(String ciudadDes) {
        this.ciudadDes = ciudadDes;
    }

    public void setDireccionDes(String direccionDes) {
        this.direccionDes = direccionDes;
    }

    public void setNombreDes(String nombreDes) {
        this.nombreDes = nombreDes;
    }

    public String getCodigoDes() {
        return codigoDes;
    }

    public String getPaisDes() {
        return paisDes;
    }

    public String getCiudadDes() {
        return ciudadDes;
    }

    public String getDireccionDes() {
        return direccionDes;
    }

    public String getNombreDes() {
        return nombreDes;
    }

  
    
}
