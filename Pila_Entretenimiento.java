
package travel;


public class Pila_Entretenimiento {
private int tamanio;
private int canElementos;
public static Object [] entretenimiento; //Matriz de Objetos

public Pila_Entretenimiento(int tamanio){
this.tamanio = tamanio;
this.canElementos=0;
this.entretenimiento=new Object[tamanio];

} 
public void Apilar_T(Object elemento){
entretenimiento[canElementos]=elemento;

canElementos++;
    
}
public Object Desapilar_T(){
Object auxiliar;
auxiliar=entretenimiento[canElementos-1];

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
public String Reporte_T(){
   String t="";
   //String t="";
   Datos_transporte dt;
   //Datos_transporte dt;
   
   
    for (int i = 0; i < canElementos; i++) {
        
        dt = (Datos_transporte)entretenimiento[i];
        //dt=(Datos_transporte)clientes[i];
        t+=dt.gettP()+""+dt.gethS()+""+dt.getcP()+""+dt.getnA()+""+dt.getcA()+"\n";
        //Variable que va almacenado los datos del cliente
       
        
        
}
return t;

}
}



