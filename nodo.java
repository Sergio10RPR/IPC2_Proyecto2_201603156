
package travel;

///Travel

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

public class nodo extends JFrame{
public static ModuloDeCarga md;
public static String[] arrayNumeros ;
public static int [] x;
public static int [] y;

//static String[] x;
 static String cadena;
 static  int numero;
 static  String num;
 static int i;
 public   nodo siguiente;
 public  nodo anterior;
 public   String  dato;
  

 public nodo(String  dato){
 
 
 this.dato = dato;
  }

  public void Imprimir(){
    System.out.println(dato);
  }
  public static class pila{
      public  nodo primero;

public pila(String dato){
    primero = new nodo(dato);
}
    public void Apilar(String  dato){
    nodo nuevo = new nodo(dato);
    nuevo.siguiente = primero;
    primero = nuevo;
  }

  public   String Desapilar(){
   String dato = primero.dato;
   primero = primero.siguiente;
   return dato;
  }

  public   void Imprimir(){
  while(primero!=null){
  
  System.out.print(" " + Desapilar() );
 
  
    }
  }
  }
  public static class cola{
      public nodo primero;
      public nodo ultimo;
       public cola(String dato){
      primero = new nodo(dato);
      ultimo = primero;
  }

  public void Encolar(String  dato){
    nodo nuevo = new nodo(dato);
    ultimo.siguiente = nuevo;
    ultimo = nuevo;
    
  }

  public String Desencolar(){
    String dato = primero.dato;
    primero = primero.siguiente;
    return dato;
  }

  public void Imprimir(){
    while(primero!=null){
      System.out.print(" " +  Desencolar() );
    }
  }    
 
  }
  public static void main(String[] args)throws IOException{
      
       String arc=JOptionPane.showInputDialog("Ingrese Direccion");
       muestraArchivo(arc);
      
      
  }
  public static  void muestraArchivo(String archivo) throws FileNotFoundException, IOException {
    
        pila pil = new pila(num);
        cola col=new cola(num);
       
      
      FileReader f = new FileReader(archivo);
      BufferedReader b = new BufferedReader(f);
     
     
      while((cadena = b.readLine())!=null) {
      
      arrayNumeros = cadena.split(",");
      int longitud=arrayNumeros.length;
            
      for ( i = 0; i < arrayNumeros.length; i++) {
        
        pil.Apilar(arrayNumeros[i]);
        col.Encolar(arrayNumeros[i]);
        
     
         
        
        
}
         System.out.println("  ");
         pil.Imprimir();
         System.out.println("");
         
      }
      b.close();

}
  
    
  
}

