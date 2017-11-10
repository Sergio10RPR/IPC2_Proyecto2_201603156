
package travel;


public class Datos_transporte {
private String tP,hS,cP,nA,cA,codigoT;

    public Datos_transporte(String tP, String hS, String cP, String nA, String cA,String codigoT) {
        this.tP = tP;
        this.hS = hS;
        this.cP = cP;
        this.nA = nA;
        this.cA = cA;
        this.codigoT=codigoT;
    }

    public void setCodigoT(String codigoT) {
        this.codigoT = codigoT;
    }

    public String getCodigoT() {
        return codigoT;
    }

    public String gettP() {
        return tP;
    }

    public String gethS() {
        return hS;
    }

    public String getcP() {
        return cP;
    }

    public String getnA() {
        return nA;
    }

    public String getcA() {
        return cA;
    }

    public void settP(String tP) {
        this.tP = tP;
    }

    public void sethS(String hS) {
        this.hS = hS;
    }

    public void setcP(String cP) {
        this.cP = cP;
    }

    public void setnA(String nA) {
        this.nA = nA;
    }

    public void setcA(String cA) {
        this.cA = cA;
        
    }
    
 
}

