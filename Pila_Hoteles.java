
package travel;


public class Pila_Hoteles {
public static int tamanio;
public static int canElementos;
public static Object [] hoteles;    

public Pila_Hoteles(int tamanio){
    this.tamanio = tamanio;
this.canElementos=0;
this.hoteles=new Object[tamanio];

} 
public void Apilar(Object elemento){
hoteles[canElementos]=elemento;

canElementos++;
    
}
public Object Desapilar(){
Object auxiliar;
auxiliar=hoteles[canElementos-1];

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
  Datos_hoteles dh;
   
   
    for (int i = 0; i < canElementos; i++) {
        
    dh = (Datos_hoteles)hoteles[i];
        
    r+=dh.getCodigoH()+" "+dh.getDireccionH()+" "+dh.getNumeroHabH()+" "+dh.getCantidadPerH()+" "+dh.getCostoHabH()+
       "" +dh.getCostoHabH();
        
        
}
return r;

}
}

