
package travel;

public class Datos_clientes {
public String codigo,nombres,apellidos,numeroTa,fechaN,numero,direccion;
public  Datos_clientes(String codigo, String nombres, String apellidos, String numeroTa, String fechaN, String numero, String direccion) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroTa = numeroTa;
        this.fechaN = fechaN;
        this.numero = numero;
        this.direccion = direccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNumeroTa() {
        return numeroTa;
    }

    public String getFechaN() {
        return fechaN;
    }

    public String getNumero() {
        return numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNumeroTa(String numeroTa) {
        this.numeroTa = numeroTa;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
 
    }
