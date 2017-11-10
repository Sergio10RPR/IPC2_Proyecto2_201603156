
package travel;


public class Pila_cruceros {
public static int tamanio;
public static int canElementos;
public static Object [] cruceros; //Matriz de Objetos


public Pila_cruceros(int tamanio){

this.tamanio = tamanio;
this.canElementos=0;
this.cruceros=new Object[tamanio];

} 
public void Apilar(Object elemento){
cruceros[canElementos]=elemento;

canElementos++;
    
}
public Object Desapilar(){
Object auxiliar;
auxiliar=cruceros[canElementos-1];

canElementos--;
return auxiliar;
}
public boolean Vacia(){
if(canElementos==0){
    return true;
    
} 
else
    return false;
}
public boolean Llena(){
    if(canElementos==tamanio){
     return true;
    }
    else 
        return false;
}
public String Reporte(){
   String r="";
   //String t="";
   Datos_Cruceros dc;
   //Datos_transporte dt;
   
   
    for (int i = 0; i < canElementos; i++) {
        
    dc = (Datos_Cruceros)cruceros[i];
        //dt=(Datos_transporte)clientes[i];
        
        //Variable que va almacenado los datos del cliente
        r+=dc.getCodigoCr()+ "  "+dc.getFechaSa()+" "+dc.getCapacidadToP()+" "+dc.getNumeroHabCr()+" "+
        dc.getCantidadDias()+" "+dc.getClaseHabcr()+"\n";
        
        
}
return r;

}



    
}
