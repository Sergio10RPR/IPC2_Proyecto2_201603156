
package travel;


public class Pila_destinos {
    
    public static int tamanio;
public static int canElementos;
public static Object [] destinos; //Matriz de Objetos


public Pila_destinos(int tamanio){

this.tamanio = tamanio;
this.canElementos=0;
this.destinos=new Object[tamanio];

} 
public void Apilar(Object elemento){
destinos[canElementos]=elemento;

canElementos++;
    
}
public Object Desapilar(){
Object auxiliar;
auxiliar=destinos[canElementos-1];

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
   Datos_clientes dc;
   //Datos_transporte dt;
   
   
    for (int i = 0; i < canElementos; i++) {
        
    dc = (Datos_clientes)destinos[i];
        //dt=(Datos_transporte)clientes[i];
        
        //Variable que va almacenado los datos del cliente
        r+=dc.getCodigo()+ " nombre: "+dc.getNombres()+" "+dc.getApellidos()+" "+dc.getNumeroTa()+" "+
        dc.getFechaN()+" "+dc.getNumero()+" "+dc.getDireccion()+"\n";
        
        
}
return r;

}



    
}
