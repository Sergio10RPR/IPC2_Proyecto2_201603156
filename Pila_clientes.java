
package travel;

//Esta clase es la que almacena los datos por medio de Pilas
public class Pila_clientes {
public static int tamanio;
public static int canElementos;
public static Object [] clientes; //Matriz de Objetos


public Pila_clientes(int tamanio){

this.tamanio = tamanio;
this.canElementos=0;
this.clientes=new Object[tamanio];

} 
public void Apilar(Object elemento){
clientes[canElementos]=elemento;

canElementos++;
    
}
public Object Desapilar(){
Object auxiliar;
auxiliar=clientes[canElementos-1];

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
        
    dc = (Datos_clientes)clientes[i];
        //dt=(Datos_transporte)clientes[i];
        
        //Variable que va almacenado los datos del cliente
        r+=dc.getCodigo()+ " nombre: "+dc.getNombres()+" "+dc.getApellidos()+" "+dc.getNumeroTa()+" "+
        dc.getFechaN()+" "+dc.getNumero()+" "+dc.getDireccion()+"\n";
        
        
}
return r;

}



 
    public static void main(String[] args) {
     
        
    }
    
}
