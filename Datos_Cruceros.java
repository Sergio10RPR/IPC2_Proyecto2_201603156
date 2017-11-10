
package travel;


public class Datos_Cruceros {

private String codigoCr,fechaSa,capacidadToP,numeroHabCr,cantidadDias,claseHabcr;

 public Datos_Cruceros(String codigoCr, String fechaSa, String fechaLl, String capacidadToP, String numeroHabCr, String cantidadDias, String claseHabcr) {
        this.codigoCr = codigoCr;
        this.fechaSa = fechaSa;
       
        this.capacidadToP = capacidadToP;
        this.numeroHabCr = numeroHabCr;
        this.cantidadDias = cantidadDias;
        this.claseHabcr = claseHabcr;
    }
    

    public void setCodigoCr(String codigoCr) {
        this.codigoCr = codigoCr;
    }

    public void setFechaSa(String fechaSa) {
        this.fechaSa = fechaSa;
    }

   
    public void setCapacidadToP(String capacidadToP) {
        this.capacidadToP = capacidadToP;
    }

    public void setNumeroHabCr(String numeroHabCr) {
        this.numeroHabCr = numeroHabCr;
    }

    public void setCantidadDias(String cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public void setClaseHabcr(String claseHabcr) {
        this.claseHabcr = claseHabcr;
    }

    public String getCodigoCr() {
        return codigoCr;
    }

    public String getFechaSa() {
        return fechaSa;
    }

   

    public String getCapacidadToP() {
        return capacidadToP;
    }

    public String getNumeroHabCr() {
        return numeroHabCr;
    }

    public String getCantidadDias() {
        return cantidadDias;
    }

    public String getClaseHabcr() {
        return claseHabcr;
    }

   
}
