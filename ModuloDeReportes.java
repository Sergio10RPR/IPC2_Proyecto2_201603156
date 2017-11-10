
package travel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


public class ModuloDeReportes extends JFrame implements ActionListener{

FileWriter reporte = null;
PrintWriter rep = null;
public JButton jbtBitacora,jbtClientes,jbtReservaciones,jbtNegocios,jbtCarga,jbtEstadistica;
public JPasswordField password;
Datos_clientes dc;
Pila_clientes pc;
Paquetes paq;
Reservaciones res;
public ModuloDeReportes(){
setBounds(200,40,500,650);   
setLayout(null);


jbtBitacora=new JButton("BITACORA");
jbtBitacora.setBounds(150,50,200,20);
jbtClientes=new JButton("REPORTE_CLIENTES");
jbtClientes.setBounds(150,100,200,20);
jbtReservaciones=new JButton("REPORTE_RESERVACIONES");
jbtReservaciones.setBounds(150,150,200,20);
jbtNegocios=new JButton("REPORTE_NEGOCIOS");
jbtNegocios.setBounds(150,200,200,20);
jbtCarga=new JButton("REPORTE_CARGA");
jbtCarga.setBounds(150,250,200,20);
jbtEstadistica=new JButton("ESTADISTICAS");
jbtEstadistica.setBounds(150,300,200,20);

password=new JPasswordField();
password.setBounds(150,400,200,20);

add(jbtBitacora);
add(jbtClientes);
add(jbtReservaciones);
add(jbtNegocios);
add(jbtCarga);
add(jbtEstadistica);
add(password);

jbtBitacora.addActionListener(this);
jbtClientes.addActionListener(this);
jbtReservaciones.addActionListener(this);
jbtNegocios.addActionListener(this);
jbtCarga.addActionListener(this);
jbtEstadistica.addActionListener(this);

setVisible(true);
setDefaultCloseOperation(JFrame. DISPOSE_ON_CLOSE);

} 

@Override
public void actionPerformed(ActionEvent e){
if(e.getSource()==jbtBitacora){
 
   try
{
reporte = new FileWriter("clientes.html");
rep = new PrintWriter(reporte);
for (int i = 0; i < 10 ; i++)
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
"<td><center><b>"+dc.getCodigo()+"</b></center></td>"+
"<td><center><b>"+dc.getNombres()+"</b></center></td>"+
"<td><center><b>"+dc.getApellidos()+"</b></center></td>"+
"<td><center><b>"+dc.getNumeroTa()+"</b></center></td>"+
"<td><center><b>"+dc.getFechaN()+"</b></center></td>"+
"</tr>"+
"</center>"+
"</html>");


Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "clientes.html"); 
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
//Reporte Clientes
else if(e.getSource()==jbtClientes){
    Datos_clientes not;
      try
{
reporte = new FileWriter("clientes.html");
rep = new PrintWriter(reporte);

String auxiliar="12345";

for (int i = 0; i < 5 ; i++)
//dc=(Datos_clientes)pc.clientes[i];
if(auxiliar.equals(password.getText())){


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
"<td><center><b>"+"Sergio"+"</b></center></td>"+
"<td><center><b>"+"Sergio"+"</b></center></td>"+
"<td><center><b>"+"sergio"+"</b></center></td>"+
"<td><center><b>"+"Sergio"+"</b></center></td>"+
"<td><center><b>"+"Sergio"+"</b></center></td>"+
"</tr>"+
"</center>"+
"</html>");



}
Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "clientes.html"); 

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
else if(e.getSource()==jbtReservaciones){
       try
{
reporte = new FileWriter("clientes.html");
rep = new PrintWriter(reporte);
for (int i = 0; i < 1 ; i++)
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
"<td><center><b>"+res.reservacionInfo+"</b></center></td>"+
"<td><center><b>"+"Sergio"+"</b></center></td>"+
"<td><center><b>"+"Sergio"+"</b></center></td>"+
"<td><center><b>"+"Sergio"+"</b></center></td>"+
"<td><center><b>"+"Sergio"+"</b></center></td>"+
"</tr>"+
"</center>"+
"</html>");


Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "clientes.html"); 
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
else if(e.getSource()==jbtNegocios){
        try
{
reporte = new FileWriter("clientes.html");
rep = new PrintWriter(reporte);
for (int i = 0; i < 1 ; i++)
rep.println("<html>"+
"<center>"+
"<p>"+
"<br>"+
"</p>"+
"<table border= 4>"+
"<tr>"+
"<td><center><b>Cliente</b></center></td>"+
"<td><center><b>Hoteles</b></center></td>"+
"<td><center><b>Transporte</b></center></td>"+
"<td><center><b>Entretenimiento</b></center></td>"+
"<td><center><b>Destinos</b></center></td>"+
"</tr>"+
"<tr>"+
"<td><center><b>"+paq.c+"</b></center></td>"+
"<td><center><b>"+paq.h+"</b></center></td>"+
"<td><center><b>"+paq.t+"</b></center></td>"+
"<td><center><b>"+paq.entr+"</b></center></td>"+
"<td><center><b>"+paq.des+"</b></center></td>"+
"</tr>"+
"</center>"+
"</html>");


Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "clientes.html"); 
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
else if(e.getSource()==jbtCarga){
    
           try
{
reporte = new FileWriter("clientes.html");
rep = new PrintWriter(reporte);
for (int i = 0; i < 1; i++)
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
"<td><center><b>"+dc.getCodigo()+"</b></center></td>"+
"<td><center><b>"+dc.getNombres()+"</b></center></td>"+
"<td><center><b>"+dc.getApellidos()+"</b></center></td>"+
"<td><center><b>"+dc.getNumeroTa()+"</b></center></td>"+
"<td><center><b>"+dc.getFechaN()+"</b></center></td>"+
"</tr>"+
"</center>"+
"</html>");


Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "clientes.html"); 
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
else if(e.getSource()==jbtEstadistica){
      
           try
{
reporte = new FileWriter("clientes.html");
rep = new PrintWriter(reporte);
for (int i = 0; i < 1 ; i++)
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
"<td><center><b>"+dc.getCodigo()+"</b></center></td>"+
"<td><center><b>"+dc.getNombres()+"</b></center></td>"+
"<td><center><b>"+dc.getApellidos()+"</b></center></td>"+
"<td><center><b>"+dc.getNumeroTa()+"</b></center></td>"+
"<td><center><b>"+dc.getFechaN()+"</b></center></td>"+
"</tr>"+
"</center>"+
"</html>");


Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "clientes.html"); 
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
}

public static void main(String[] args){
    new ModuloDeReportes();
}
}
