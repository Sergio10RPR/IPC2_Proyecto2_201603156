
package travel;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Archivo_html2 {
  FileWriter reporte = null;
  PrintWriter rep = null;
  String nombre="Sergio";
public void Archivo(){
    try
{
reporte = new FileWriter("registro.html");
rep = new PrintWriter(reporte);
for (int i = 0; i < 4; i++)
rep.println("<html>"+
"<center>"+
"<p>"+
"<br>"+
"</p>"+
"<table border= 4>"+
"<tr>"+
"<td><center><b>Nombres</b></center></td>"+
"<td><center><b>Apellidos</b></center></td>"+
"<td><center><b>NIT</b></center></td>"+
"<td><center><b>direccion</b></center></td>"+
"<td><center><b>telefono</b></center></td>"+
"</tr>"+
"<tr>"+
"<td><center><b>"+nombre+"</b></center></td>"+
"<td><center><b>"+nombre+"</b></center></td>"+
"<td><center><b>"+nombre+"</b></center></td>"+
"<td><center><b>"+nombre+"</b></center></td>"+
"<td><center><b>"+nombre+"</b></center></td>"+
"</tr>"+
"</center>"+
"</html>");


Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "registro.html"); 
} catch (Exception e1) {
e1.printStackTrace();
} finally {
try {
// Nuevamente aprovechamos el finally para 
// asegurarnos que se cierra el fichero.
if (null != reporte)
reporte.close();
} catch (Exception e2) {
e2.printStackTrace();

}
}

    
}  
    public static void main(String[] args) {
        Archivo_html2 arc=new Archivo_html2();
        arc.Archivo();
    }
  
}