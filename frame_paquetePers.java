
package travel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class frame_paquetePers extends JFrame implements  ActionListener{
public JLabel codigo,nombres,apellidos,numeroTar,fechaN,numero,direccion,pila;//Clientes
public static JTextField txtCodigo,txtNombres,txtApellidos,txtNumeroTar,txtFechaN,txtNumero,txtDireccion,txtPila;//Clientes
public JButton apilar,desapilar,logout,llena,reporte,jbtPila,limpiar;
public JTextArea txaArea,txaAreaT;
public JLabel hotel,transporte,entretenimiento,clientes,destinosTur; //Titulos
public JLabel codigoH,direccionH,numeroCuartos,cantidadPC,costoH,claseH; //Hoteles
public JLabel trasnporteT,codigoT,horariosT,capacidadP,numeroAsiento,claseAsiento;//Transporte
public JLabel codigoDes,paisDes,ciudadDes,direccionDes,nombreDes;//Destinos
public JLabel codigoE,nombreLugarE,paisE,ciudadE,direccionE,edadE,horarioE;//Entretenimiento
public JButton apilar_T,apilar_cli,apilar_En,apilar_Hot,apilar_Des; //Botones de Apilar
public JTextField txtCodigoH,txtDireccionH,txtNumeroCuartos,txtCantidadPC,txtCostoH,txtClaseH;//Hoteles
public JTextField txtTransporteT,txtCodigoT,txtHorariosT,txtCapacidadP,txtNumeroA,txtClaseA;//Transporte
public JTextField txtCodigoE,txtNombreLugarE,txtPaisE,txtCiudadE,txtDireccionE,txtEdadE,txtHorarioE;//Entretenimiento
public JTextField txtCodigoDes,txtPaisDes,txtCiudadDes,txtDireccionDes,txtNombreDes;
public JLabel codigoDt,paisDt,ciuadadDt;

public JLabel datos_clientes,datos_trans;
Pila_clientes tra;
Pila_transporte pt;
Pila_Hoteles ph;
Pila_Entretenimiento pEyE;
Pila_destinos pDes;



public frame_paquetePers(){
setExtendedState(6);
//setLayout(null);
//setBounds(100,200,800,500);
clientes=new JLabel("DATOS DEL CLIENTE");
clientes.setBounds(20,10,300,15);
clientes.setForeground(Color.yellow);
codigo=new JLabel("Codigo :");
codigo.setBounds(20,50,150,15);
nombres=new JLabel("Nombres :");
nombres.setBounds(20, 75, 150, 15);
apellidos=new JLabel("Apellidos :");
apellidos.setBounds(20,100,150,15);
numeroTar=new JLabel("Numero de tarjeta :");
numeroTar.setBounds(20,125,150,15);
fechaN=new JLabel("Fecha de nacimiento :");
fechaN.setBounds(20,150,150,15);
numero=new JLabel("Numero de telefono :");
numero.setBounds(20,175,150,15);
direccion=new JLabel("Direccion de habitacion :");
direccion.setBounds(20,200,200,15);
apilar_cli=new JButton("GUARDAR_C");
apilar_cli.setBounds(20,225,100,15);
hotel=new JLabel("HOTELES Y RESORTS");
hotel.setBounds(20,255,300,20);
hotel.setForeground(Color.red);
//pila=new JLabel("PILA");
//pila.setBounds(900,675,200,15);

//Hoteles y Resorts
//codigoH,direccionH,numeroCuartos,cantidadPC,costoH,claseH;

codigoH=new JLabel("Codigo de Hospedaje :");
codigoH.setBounds(20,280,150,15);
direccionH=new JLabel("direccion :");
direccionH.setBounds(20,305,150,15);
numeroCuartos=new JLabel("Numero de cuartos :");
numeroCuartos.setBounds(20,330,150,15);
cantidadPC=new JLabel("Cantidad de personas :");
cantidadPC.setBounds(20,355,150,15);
costoH=new JLabel("Costo de Habitacion :");
costoH.setBounds(20,380,150,15);
claseH=new JLabel("Clase de Habitacion :");
claseH.setBounds(20,405,150,15);
apilar_Hot=new JButton("GUARDAR_H");
apilar_Hot.setBounds(20,430,100,15);

txtCodigoH=new JTextField();
txtCodigoH.setBounds(200,280,150,20);
txtDireccionH=new JTextField();
txtDireccionH.setBounds(200,305,150,20);
txtNumeroCuartos=new JTextField();
txtNumeroCuartos.setBounds(200,330,150,20);
txtCantidadPC=new JTextField();
txtCantidadPC.setBounds(200,355,150,20);
txtCostoH=new JTextField();
txtCostoH.setBounds(200,380,150,20);
txtClaseH=new JTextField();
txtClaseH.setBounds(200,405,150,20);


txtCodigo =new JTextField();
txtCodigo.setBounds(200,50,150,20);
txtNombres =new JTextField();
txtNombres.setBounds(200,75,150,20);
txtApellidos=new JTextField();
txtApellidos.setBounds(200,100,150,20);
txtNumeroTar=new JTextField();
txtNumeroTar.setBounds(200,125,150,20);
txtFechaN=new JTextField();
txtFechaN.setBounds(200,150,150,20);
txtNumero=new JTextField();
txtNumero.setBounds(200,175,150,20);
txtDireccion=new JTextField();
txtDireccion.setBounds(200,200,150,20);
datos_clientes=new JLabel("DATOS DEL CLIENTE");
datos_clientes.setBounds(875,60,175,10);
datos_clientes.setForeground(Color.yellow);
txaArea=new JTextArea();
txaArea.setBounds(875, 80,500,100);
datos_trans=new JLabel("DATOS DE TRANSPORTE");
datos_trans.setBounds(875,205,175,10);
datos_trans.setForeground(Color.red);
txaAreaT=new JTextArea();
txaAreaT.setBounds(875,225,500,100);
txtPila=new JTextField();
txtPila.setBounds(1050,675,150,20);
//Transporte
transporte=new JLabel("TRANSPORTE");
transporte.setBounds(400,10,300,20);
transporte.setForeground(Color.red);
trasnporteT=new JLabel("Tipo de transporte :");
trasnporteT.setBounds(400,50,150,15);
horariosT=new JLabel("Horario salida/llegada :");
horariosT.setBounds(400,75,150,15);
capacidadP=new JLabel("Capacidad de Pasajeros :");
capacidadP.setBounds(400,100,150,15);
numeroAsiento=new JLabel("Numero de asiento :");
numeroAsiento.setBounds(400,125,150,15);
claseAsiento=new JLabel("Clase de Asiento :");
claseAsiento.setBounds(400,150,150,15);
codigoT=new JLabel("Codigo de Transporte");
codigoT.setBounds(400,175,150,15);
apilar_T=new JButton("GUARDAR_T");
apilar_T.setBounds(400,200,100,15);
//Transporte
txtTransporteT=new JTextField();
txtTransporteT.setBounds(580,50,150,20);
txtHorariosT=new JTextField();
txtHorariosT.setBounds(580,75,150,20);
txtCapacidadP=new JTextField();
txtCapacidadP.setBounds(580,100,150,20);
txtNumeroA=new JTextField();
txtNumeroA.setBounds(580,125,150,20);
txtClaseA=new JTextField();
txtClaseA.setBounds(580,150,150,20);
txtCodigoT=new JTextField();
txtCodigoT.setBounds(580,175,150,20);

//codigoE,nombreLugarE,paisE,ciudadE,direccionE,edadE,horarioE
entretenimiento=new JLabel("ENTRETENIMIENTO");
entretenimiento.setBounds(400,255,300,20);
entretenimiento.setForeground(Color.yellow);

codigoE=new JLabel("Codigo del lugar :");
codigoE.setBounds(400,280,150,15);
nombreLugarE=new JLabel("Nombre del lugar :");
nombreLugarE.setBounds(400,305,150,15);
paisE=new JLabel("Pais :");
paisE.setBounds(400,330,150,15);
ciudadE=new JLabel("Ciudad :");
ciudadE.setBounds(400,355,150,15);
direccionE=new JLabel("Direccion :");
direccionE.setBounds(400,380,150,15);
edadE=new JLabel("Edad Permitida :");
edadE.setBounds(400,405,150,15);
horarioE=new JLabel("Horario del evento :");
horarioE.setBounds(400,425,150,15);
apilar_En=new JButton("GUARDAR_E");
apilar_En.setBounds(400,450,100,15);



txtCodigoE=new JTextField();
txtCodigoE.setBounds(580,280,150,20);
txtNombreLugarE=new JTextField();
txtNombreLugarE.setBounds(580,305,150,20);
txtPaisE=new JTextField();
txtPaisE.setBounds(580,330,150,20);
txtCiudadE=new JTextField();
txtCiudadE.setBounds(580,355,150,20);
txtDireccionE=new JTextField();
txtDireccionE.setBounds(580,380,150,20);
txtEdadE=new JTextField();
txtEdadE.setBounds(580,405,150,20);
txtHorarioE=new JTextField();
txtHorarioE.setBounds(580,430,150,20);

//Destinos Turisticos
destinosTur=new JLabel("DESTINOS TURISTICOS");
destinosTur.setForeground(Color.red);
destinosTur.setBounds(400,500,300,20);
codigoDes=new JLabel("Codigo destino :");
codigoDes.setBounds(400,525,150,15);
paisDes=new JLabel("Pais de destino :");
paisDes.setBounds(400,550,150,15);
ciudadDes=new JLabel("Ciudad de destino :");
ciudadDes.setBounds(400,575,150,15);
direccionDes=new JLabel("Direccion de destino :");
direccionDes.setBounds(400,600,150,15);
nombreDes=new JLabel("Nombre de destino :");
nombreDes.setBounds(400,625,150,15);

txtCodigoDes=new JTextField();
txtCodigoDes.setBounds(580,525,150,20);
txtPaisDes=new JTextField();
txtPaisDes.setBounds(580,550,150,20);
txtCiudadDes=new JTextField();
txtCiudadDes.setBounds(580,575,150,20);
txtDireccionDes=new JTextField();
txtDireccionDes.setBounds(580,600,150,20);
txtNombreDes=new JTextField();
txtNombreDes.setBounds(580,625,150,20);
apilar_Des=new JButton("Guardar");
apilar_Des.setBounds(400,650,100,15);
        



apilar=new JButton("APILAR");
apilar.setBounds(900,600,100,20);
desapilar=new JButton("ELIMINAR");
desapilar.setBounds(1000,600,100,20);
logout=new JButton("Logout");
logout.setBounds(20,600,100,20);
llena=new JButton("LLENA");
llena.setBounds(200,600,100,20);
reporte=new JButton("REPORTE");
reporte.setBounds(1000,650,100,20);
jbtPila=new JButton("INICIAR");
jbtPila.setBounds(1200,650,100,20);
limpiar=new JButton("LIMPIAR");
limpiar.setBounds(900,650,100,20);

//Datos del Cliente
add(clientes);
add(codigo);
add(nombres);
add(apellidos);
add(numeroTar);
add(fechaN);
add(numero);
add(direccion);
add(hotel);
//add(pila);
//Hoteles
add(txtCodigoH);
add(txtDireccionH);
add(txtNumeroCuartos);
add(txtCantidadPC);
add(txtCostoH);
add(txtClaseH);

add(codigoH);
add(direccionH);
add(numeroCuartos);
add(cantidadPC);
add(costoH);
add(claseH);

add(txtCodigo);
add(txtNombres);
add(txtApellidos);
add(txtNumeroTar);
add(txtFechaN);
add(txtNumero);
add(txtDireccion);
add(txaArea);
add(txaAreaT);

//Transporte
add(transporte);
add(trasnporteT);
add(codigoT);
add(horariosT);
add(capacidadP);
add(numeroAsiento);
add(claseAsiento);
add(codigoT);


add(txtTransporteT);
add(txtCodigoT);
add(txtHorariosT);
add(txtCapacidadP);
add(txtNumeroA);
add(txtClaseA);

//Entretenimiento
add(entretenimiento);
add(codigoE);
add(nombreLugarE);
add(paisE);
add(ciudadE);
add(direccionE);
add(edadE);
add(horarioE);

add(txtCodigoE);
add(txtNombreLugarE);
add(txtPaisE);
add(txtCiudadE);
add(txtDireccionE);
add(txtEdadE);
add(txtHorarioE);

//Destinos Turisiticos
add(destinosTur);
add(codigoDes);
add(paisDes);
add(ciudadDes);
add(direccionDes);
add(nombreDes);

add(txtCodigoDes);
add(txtPaisDes);
add(txtCiudadDes);
add(txtDireccionDes);
add(txtNombreDes);

//Botones
add(apilar_cli);
add(apilar_En);
add(apilar_Hot);
add(apilar_T);
add(apilar_Des);
//add(apilar);
add(desapilar);
add(logout);
//add(llena);
add(reporte);
add(jbtPila);
add(limpiar);

add(datos_clientes);
add(datos_trans);

apilar.addActionListener(this);
desapilar.addActionListener(this);
logout.addActionListener(this);
llena.addActionListener(this);
reporte.addActionListener(this);
jbtPila.addActionListener(this);
limpiar.addActionListener(this);
apilar_cli.addActionListener(this);
apilar_T.addActionListener(this);
apilar_Hot.addActionListener(this);
apilar_En.addActionListener(this);
apilar_Des.addActionListener(this);

lamina_c figura=new lamina_c();
add(figura);  
figura.setVisible(true);

setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
setVisible(true);
}
public class lamina_c extends JPanel{
@Override
public void paintComponent(Graphics c){
super.paintComponent(c);
File miImagen=new File("C:\\Users\\Sergio_RPR\\Documents\\NetBeansProjects\\Travel\\src\\travel\\Imagen\\clientes.jpg");
 
 
 try{
     imagen_c=ImageIO.read(miImagen);
     
 }
 catch(IOException e){
     System.out.println("Imagen no encontrada");
 }
 c.drawImage(imagen_c, 20, 450, null);
 
}
 private Image imagen_c;   
    
}
@Override
public void actionPerformed(ActionEvent e){
if(e.getSource()==jbtPila){
//int t=Integer.parseInt(txtPila.getText());
tra =new Pila_clientes(10);
pt=new Pila_transporte(10);
ph=new Pila_Hoteles(10);
pEyE=new Pila_Entretenimiento(10);
pDes=new Pila_destinos(10);
} 
else if(e.getSource()==apilar_cli){


String a=txtCodigo.getText();
String b=txtNombres.getText();
String c=txtApellidos.getText();
String d=txtNumeroTar.getText();
String ee=txtFechaN.getText();
String f=txtNumero.getText();
String g=txtDireccion.getText();
Datos_clientes dc_2=new Datos_clientes(a,b,c,d,ee,f,g);
tra.Apilar(dc_2);
//Transporte
}
else if(e.getSource()==apilar_T){
    
String tP_1=txtTransporteT.getText();
String hS_1=txtHorariosT.getText();
String cP_1=txtCapacidadP.getText();
String nA_1=txtNumeroA.getText();
String cA_1=txtClaseA.getText();
String codigoT=txtCodigoT.getText();

Datos_transporte dt_2=new Datos_transporte(tP_1,hS_1,cP_1,nA_1,cA_1,codigoT);
pt.Apilar_T(dt_2);
}
else if(e.getSource()==apilar_Hot){
String cH=txtCodigoH.getText();
String dH=txtDireccionH.getText();
String nCH=txtNumeroCuartos.getText();
String cPCH=txtCantidadPC.getText();
String costoH=txtCostoH.getText();
String claseH=txtClaseH.getText();
Datos_hoteles dh_2=new Datos_hoteles(cH,dH,nCH,cPCH,costoH,claseH);
ph.Apilar(dh_2);
}
else if(e.getSource()==apilar_En){
String coEyE=txtCodigoE.getText();
String nomLuEyE=txtNombreLugarE.getText();
String paisEyE=txtPaisE.getText();
String ciudadEyE=txtCiudadE.getText();
String direccionEyE=txtDireccionE.getText();
String edadEyE=txtEdadE.getText();
String horarioEyE=txtHorarioE.getText();
Datos_lugaresEyE dEyE=new Datos_lugaresEyE(coEyE, nomLuEyE, paisEyE, ciudadEyE, direccionEyE, edadEyE, horarioEyE);
pEyE.Apilar_T(dEyE);

}
else if(e.getSource()==apilar_Des){
String codDes=txtCodigoDes.getText();
String paisDes=txtPaisDes.getText();
String ciudadDes=txtCiudadDes.getText();
String direccionDes=txtDireccionDes.getText();
String nombreDes=txtNombreDes.getText();
Datos_Destinos daDes=new Datos_Destinos(codDes, paisDes, ciudadDes, direccionDes, nombreDes);
pDes.Apilar(daDes);
    
}


else if(e.getSource()==desapilar){
Object aux=tra.Desapilar();
Datos_clientes dc_2=(Datos_clientes)aux;
txaArea.setText(dc_2.getCodigo()+" "+dc_2.getNombres()+" "+dc_2.getApellidos()+" "+dc_2.getNumeroTa()+" "+
          dc_2.getFechaN()+" "+dc_2.getNumero()+" "+dc_2.getDireccion());
}
else if(e.getSource()==logout){
new Frame_principal();
/*boolean r=tra.Vacia();
if(r==true){
txaArea.setText("La pila esta vacia");
}
else{
txaArea.setText("La pila no esta vacia");
}*/
}
else if(e.getSource()==llena){

boolean r=tra.Llena();
if(r==true){
txaArea.setText("La pila se encuentra llena");
}
else{
txaArea.setText("La pila no esta llena todavia ");
}
}
else if(e.getSource()==reporte){
String s=tra.Reporte();

txaArea.setText(s);
String t=pt.Reporte_T();

txaAreaT.setText(t);




}
else if(e.getSource()==limpiar){
 limpiar();
}
}
public void limpiar(){
 txtCodigo.setText("");
 txtNombres.setText("");
 txtApellidos.setText("");
 txtNumeroTar.setText("");
 txtFechaN.setText("");
 txtNumero.setText("");
 txtDireccion.setText("");   
}
public static void main(String[] args){
new frame_paquetePers();
    }

}
