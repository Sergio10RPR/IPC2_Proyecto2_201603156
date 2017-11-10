
package travel;
import java.io.*;
import javax.swing.*;
import java.io.*;

public class Archivo_html {

public void Archivo_html(){
    
    try{ 
FileWriter archivo = new FileWriter("reporte.html"); 

PrintWriter escritura = new PrintWriter(archivo);


//escribimos un archivo de texto con la estructura de html

escritura.println("<html>");
escritura.println(" <body>");
escritura.println(" <h1><center>Listado de Clientes almacenados</center></h1>");
escritura.println("<br><br>");
for(int i=0; i<10; i++)
escritura.println("Nombre: "+(i+1)+"<br>");
escritura.println(" </body>");
escritura.println("</html>");

//nos aseguramos de cerrar el archivo
archivo.close();
} catch(Exception e){
e.printStackTrace();
}
}

public static void main(String args[]){
new Archivo_html();
}
}


