
package travel;


public class Datos_hoteles {
public static  String codigoH,direccionH,numeroHabH,cantidadPerH,costoHabH,claseHabH; 
public Datos_hoteles(String codigoH, String direccionH, String numeroHabH, String cantidadPerH, String costoHabH, String claseHabH) {
        this.codigoH = codigoH;
        this.direccionH = direccionH;
        this.numeroHabH = numeroHabH;
        this.cantidadPerH = cantidadPerH;
        this.costoHabH = costoHabH;
        this.claseHabH = claseHabH;
    }


    public void setCodigoH(String codigoH) {
        this.codigoH = codigoH;
    }

    public void setDireccionH(String direccionH) {
        this.direccionH = direccionH;
    }

    public void setNumeroHabH(String numeroHabH) {
        this.numeroHabH = numeroHabH;
    }

    public void setCantidadPerH(String cantidadPerH) {
        this.cantidadPerH = cantidadPerH;
    }

    public void setCostoHabH(String costoHabH) {
        this.costoHabH = costoHabH;
    }

    public void setClaseHabH(String claseHabH) {
        this.claseHabH = claseHabH;
    }

    public String getCodigoH() {
        return codigoH;
    }

    public String getDireccionH() {
        return direccionH;
    }

    public String getNumeroHabH() {
        return numeroHabH;
    }

    public String getCantidadPerH() {
        return cantidadPerH;
    }

    public String getCostoHabH() {
        return costoHabH;
    }

    public String getClaseHabH() {
        return claseHabH;
    }

    
   
}
