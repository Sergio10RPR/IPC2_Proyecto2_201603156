
package travel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Formatter;
import javax.swing.JFrame;
import javax.swing.*;



public class frame_paqueteF extends JFrame implements ActionListener {
Archivos a;
//Clientes Paquete Familiar
public JLabel codigo,nombres,apellidos,numeroTar,fechaN,numero,direccion,numeroDp,pila;
public JLabel codigoE,nombreE,paisE,ciudadE,direccionE,edadE,horarioE;
public JLabel tipoTfa,horarioT,capacidadT,numeroAsT,claseAsT,codigoT;
public JLabel codigo_4,nombres_4,apellidos_4,numeroTar_4,fechaN_4,numero_4,direccion_4;
public JLabel codigoDes,paisDes,ciudadDes,direccionDes,nombresDes;
public JLabel tittle,tittleDes,tittleEyE,tittleTran,tittleHote;

public static JTextField txtCodigoA,txtNombresA,txtApellidos,txtNumeroTar,txtFechaN,txtNumero,txtDireccion,txtNumeroDp,txtPila; //Clientes
public static JTextField txtCodigoE,txtNombreLuE,txtPaisE,txtCiudadE,txtDireccionE,txtEdadE,txtHorarioE; //Entretenimiento
public static JTextField txtTipoTrF,txtHorarioT,txtCapacidadPF,txtNumeroAF,txtClaseAsF,txtCodigoTF; //Transporte
public static JTextField txtCodigoHosF,txtDireccionHosF,txtNumerosCuaF,txtCantidadPerF,txtCostoHabF,txtClaseHabF,txtDireccion_4;
public static JTextField txtCodigoDes,txtPaisDes,txtCiudadDes,txtDireccionDes,txtNombreDes;
public static JTextField txtCodigo_6,txtNombres_6,txtApellidos_6,txtNumeroTar_6,txtFechaN_6,txtNumero_6,txtDireccion_6;
public JButton apilarC,crearC,reporteC,logout,apilarH,apilarDes,apilarTra,apilarEyE,desapilar;
public JTextArea mostrarC,mostrarRe;
public JComboBox combo1,combo2,combo3,combo4,combo5,combo6;
public static JTextField txtCombo1,txtCombo2,txtCombo3,txtCombo4,txtCombo5,txtCombo6;

String barra=File.separator;
String ubicacion=System.getProperty("user.dir")+barra+"Registros"+barra;
Pila_clientes pc;
Pila_destinos pDes;
Pila_Hoteles pHot;
Pila_transporte pTra;
Pila_Entretenimiento pEyE;
Datos_clientes dc;
FileWriter reporte = null;
PrintWriter rep = null;
public frame_paqueteF(){

setExtendedState(6);
setLayout(null);



Calendar Cal= Calendar.getInstance(); 
String fec= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR)+" "+
            Cal.get(Cal.HOUR_OF_DAY)+":"+Cal.get(Cal.MINUTE)+":"+Cal.get(Cal.SECOND); 

//Datos del cliente JLabel
tittle=new JLabel("PAQUETE_FAMILIAR");
tittle.setBounds(20,20,300,20);

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
numeroDp=new JLabel("Numero de personas");
numeroDp.setBounds(20,225,200,15);

txtCodigoA =new JTextField();
txtCodigoA.setBounds(200,50,150,20);
txtNombresA =new JTextField();
txtNombresA.setBounds(200,75,150,20);
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
txtNumeroDp=new JTextField();
txtNumeroDp.setBounds(200,225,150,20);

combo1=new JComboBox();
combo1.setBounds(400,50,150,20);
combo1.addItem("Estados Unidos");
combo1.addItem("Francia");
combo1.addItem("Mexico");
combo1.addItem("Brasil");

txtCombo1=new JTextField();
txtCombo1.setBounds(400,80,150,20);


combo2=new JComboBox();
combo2.setBounds(560,50,150,20);
combo2.addItem("Museo");
combo2.addItem("Zoologico");
combo2.addItem("Parque Tematico");
combo2.addItem("Parque de Diversiones");

txtCombo2=new JTextField();
txtCombo2.setBounds(560,80,150,20);

combo3=new JComboBox();
combo3.setBounds(720,50,150,20);
combo3.addItem("Nueva York");
combo3.addItem("Paris");
combo3.addItem("Guadalajara");
combo3.addItem("Rio de Janeiro");

txtCombo3=new JTextField();
txtCombo3.setBounds(720,80,150,20);

combo4=new JComboBox();
combo4.setBounds(880,50,150,20);
combo4.addItem("2");
combo4.addItem("3");
combo4.addItem("4");
combo4.addItem("5");
combo4.addItem("6");
combo4.addItem("1 semana");

txtCombo4=new JTextField();
txtCombo4.setBounds(880,80,150,20);

combo5=new JComboBox();
combo5.setBounds(1040,50,150,20);
combo5.addItem("Si");
combo5.addItem("No");

txtCombo5=new JTextField();
txtCombo5.setBounds(1040,80,150,20);

combo6=new JComboBox();
combo6.setBounds(1040,160,150,20);
combo6.addItem("Saldo Pendiente");
combo6.addItem("En espera");
combo6.addItem("Cancelado");
combo6.addItem("");

txtCombo6=new JTextField();
txtCombo6.setBounds(1040,190,150,20);





apilarC=new JButton("GUARDAR");
apilarC.setBounds(20,260,100,15);
crearC=new JButton("CREAR");
crearC.setBounds(1150,650,100,20);
reporteC=new JButton("REPORTE");
reporteC.setBounds(400,280,100,20);

//Hospedaje
tittleHote=new JLabel("HOTELES Y RESORTS");
tittleHote.setBounds(20,300,300,20);
codigo_4=new JLabel("Codigo de hospedaje :");
codigo_4.setBounds(20,325,150,15);
nombres_4=new JLabel("Direccion de hospedaje :");
nombres_4.setBounds(20, 350, 150, 15);
apellidos_4=new JLabel("Numero de cuartos :");
apellidos_4.setBounds(20,375,150,15);
numeroTar_4=new JLabel("Cantidad de personas :");
numeroTar_4.setBounds(20,400,150,15);
fechaN_4=new JLabel("Costo de habitacion :");
fechaN_4.setBounds(20,425,275,15);
numero_4=new JLabel("Clase de habitacion :");  //JCombox
numero_4.setBounds(20,450,150,15);
direccion_4=new JLabel("Hora de llegada :");
direccion_4.setBounds(20,475,200,15);
apilarH =new JButton("guardar");
apilarH.setBounds(20,475,100,15);
txtCodigoHosF=new JTextField();
txtCodigoHosF.setBounds(200,325,150,20);
txtDireccionHosF=new JTextField();
txtDireccionHosF.setBounds(200,350,150,20);
txtNumerosCuaF=new JTextField();
txtNumerosCuaF.setBounds(200,375,150,20);
txtCantidadPerF=new JTextField();
txtCantidadPerF.setBounds(200,400,150,20);
txtCostoHabF=new JTextField();
txtCostoHabF.setBounds(200,425,150,20);
txtClaseHabF=new JTextField();
txtClaseHabF.setBounds(200,450,150,20);
txtDireccion_4=new JTextField();
txtDireccion_4.setBounds(200,475,150,20);
apilarH=new JButton("Guardar");
apilarH.setBounds(20,500,100,15);

//ENTRETENIMIENTO
tittleEyE=new JLabel("ENTRETENIMIENTO");
tittleEyE.setBounds(400,425,300,20);
codigoE=new JLabel("Codigo del lugar :");
codigoE.setBounds(400,450,150,15);
nombreE=new JLabel("Nombre del lugar");
nombreE.setBounds(400,475,150,15);
paisE=new JLabel("Pais :");
paisE.setBounds(400,500,150,15);
ciudadE=new JLabel("Ciudad :");
ciudadE.setBounds(400,525,150,15);
direccionE=new JLabel("Direccion :");
direccionE.setBounds(400,550,150,15);
edadE=new JLabel("Edad permitida :");
edadE.setBounds(400,575,150,15);
horarioE=new JLabel("Horario del evento :");
horarioE.setBounds(400,600,150,15);
apilarEyE=new JButton("guardar");
apilarEyE.setBounds(400,625,100,15);

txtCodigoE=new JTextField();
txtCodigoE.setBounds(580,450,150,20);
txtNombreLuE=new JTextField();
txtNombreLuE.setBounds(580,475,150,20);
txtPaisE=new JTextField();
txtPaisE.setBounds(580,500,150,20);
txtCiudadE=new JTextField();
txtCiudadE.setBounds(580,525,150,20);
txtDireccionE=new JTextField();
txtDireccionE.setBounds(580,550,150,20);
txtEdadE=new JTextField();
txtEdadE.setBounds(580,575,150,20);
txtHorarioE=new JTextField();
txtHorarioE.setBounds(580,600,150,20);

//Transporte
tittleTran=new JLabel("TRANSPORTE");       
tittleTran.setBounds(770,425,300,20);
tipoTfa=new JLabel("Tipo de Transporte :");
tipoTfa.setBounds(770,450,150,15);
horarioT=new JLabel("Horario de salida/llegada :");
horarioT.setBounds(770,475,150,15);
capacidadT=new JLabel("Capacidad de pasajeros :");
capacidadT.setBounds(770,500,150,15);
numeroAsT=new JLabel("Numero de asiento :");
numeroAsT.setBounds(770,525,150,15);
claseAsT=new JLabel("Clase de asiento :");
claseAsT.setBounds(770,550,150,15);
codigoT=new JLabel("Codigo de transporte");
codigoT.setBounds(770,575,150,15);
apilarTra=new JButton("guardar");
apilarTra.setBounds(770,600,100,15);


txtTipoTrF=new JTextField();
txtTipoTrF.setBounds(950,450,150,20);
txtHorarioT=new JTextField();
txtHorarioT.setBounds(950,475,150,20);
txtCapacidadPF=new JTextField();
txtCapacidadPF.setBounds(950,500,150,20);
txtNumeroAF=new JTextField();
txtNumeroAF.setBounds(950,525,150,20);
txtClaseAsF=new JTextField();
txtClaseAsF.setBounds(950,550,150,20);
txtCodigoTF=new JTextField();
txtCodigoTF.setBounds(950,575,150,20);


//Destinos Turisticos
tittleDes=new JLabel("DESTINOS TURISTICOS");
tittleDes.setBounds(20,525,300,20);
codigoDes=new JLabel("Codigo de destino :");
codigoDes.setBounds(20,550,150,15);
paisDes=new JLabel("Pais de destino :");
paisDes.setBounds(20,575,150,15);
ciudadDes=new JLabel("Ciudad de destino :");
ciudadDes.setBounds(20,600,150,15);
direccionDes=new JLabel("Direccion de destino :");
direccionDes.setBounds(20,625,150,15);
nombresDes=new JLabel("Nombre de destino :");
nombresDes.setBounds(20,650,150,15);
apilarDes=new JButton("guardar");
apilarDes.setBounds(20,675,100,15);


txtCodigoDes=new JTextField();
txtCodigoDes.setBounds(200,550,150,20);
txtPaisDes=new JTextField();
txtPaisDes.setBounds(200,575,150,20);
txtCiudadDes=new JTextField();
txtCiudadDes.setBounds(200,600,150,20);
txtDireccionDes=new JTextField();
txtDireccionDes.setBounds(200,625,150,20);
txtNombreDes=new JTextField();
txtNombreDes.setBounds(200,650,150,20);


mostrarC=new JTextArea();
mostrarC.setBounds(400,105,600,150);
mostrarC.setLineWrap(true);
mostrarC.setWrapStyleWord(true);

mostrarRe=new JTextArea();
mostrarRe.setBounds(400,310,600,100);
mostrarRe.setLineWrap(true);
mostrarRe.setWrapStyleWord(true);

logout=new JButton("LOGOUT");
logout.setBounds(1000,650,100,20);
desapilar=new JButton("ELIMINAR");
desapilar.setBounds(1150,600,100,20);
        

        
add(codigo);
add(nombres);
add(apellidos);
add(numeroTar);
add(fechaN);
add(numero);
add(direccion);
add(numeroDp);

add(txtCodigoA);
add(txtNombresA);
add(txtApellidos);
add(txtNumeroTar);
add(txtFechaN);
add(txtNumero);
add(txtDireccion);
add(txtNumeroDp);

add(codigo_4);
add(nombres_4);
add(apellidos_4);
add(numeroTar_4);
add(fechaN_4);
add(numero_4);
add(direccion_4);

add(txtCodigoHosF);
add(txtDireccionHosF);
add(txtNumerosCuaF);
add(txtCantidadPerF);
add(txtCostoHabF);
add(txtClaseHabF);
add(txtDireccion_4);


//Entretenimiento

add(codigoE);
add(nombreE);
add(paisE);
add(ciudadE);
add(direccionE);
add(edadE);
add(horarioE);

add(txtCodigoE);
add(txtNombreLuE);
add(txtPaisE);
add(txtCiudadE);
add(txtDireccionE);
add(txtEdadE);
add(txtHorarioE);

//Transporte
add(tipoTfa);
add(horarioT);
add(capacidadT);
add(numeroAsT);
add(claseAsT);
add(codigoT);

add(txtTipoTrF);
add(txtHorarioT);
add(txtCapacidadPF);
add(txtNumeroAF);
add(txtClaseAsF);
add(txtCodigoTF);

//Destinos Turisticos
add(codigoDes);
add(paisDes);
add(ciudadDes);
add(direccionDes);
add(nombresDes);

add(txtCodigoDes);
add(txtPaisDes);
add(txtCiudadDes);
add(txtDireccionDes);
add(txtNombreDes);


//Combos

add(combo1);
add(combo2);
add(combo3);
add(combo4);
add(combo5);
add(combo6);

add(txtCombo1);
add(txtCombo2);
add(txtCombo3);
add(txtCombo4);
add(txtCombo5);
add(txtCombo6);

//Botones
add(apilarC);
add(apilarH);
add(apilarEyE);
add(apilarDes);
add(apilarTra);
add(crearC);
add(reporteC);
add(logout);
add(desapilar);

//Titulos
add(tittle);
add(tittleHote);
add(tittleDes);
add(tittleEyE);
add(tittleTran);
//Campos de Texto
add(mostrarC);
add(mostrarRe);


apilarC.addActionListener(this);
apilarH.addActionListener(this);
apilarDes.addActionListener(this);
apilarEyE.addActionListener(this);
apilarTra.addActionListener(this);


crearC.addActionListener(this);
reporteC.addActionListener(this);
logout.addActionListener(this);
desapilar.addActionListener(this);


setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
setVisible(true);
combo1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtPaisDes.setText(combo1.getSelectedItem().toString());
                                txtPaisE.setText(combo1.getSelectedItem().toString());
combo2.addActionListener(new ActionListener() {
                                    @Override
                        public void actionPerformed(ActionEvent e) {
                                txtCombo2.setText(combo2.getSelectedItem().toString());
                                
combo3.addActionListener(new ActionListener() {
                                    @Override
                         public void actionPerformed(ActionEvent e) {
                                txtCiudadDes.setText(combo3.getSelectedItem().toString());
                                txtCiudadE.setText(combo3.getSelectedItem().toString());
                                
combo4.addActionListener(new ActionListener() {
                                    @Override
                         public void actionPerformed(ActionEvent e) {
                                txtCombo4.setText(combo4.getSelectedItem().toString());
                                    }
                                });
                                    }
                                });
                                    }
                                });
                             
			}

                        
		});
}
@Override
public void actionPerformed(ActionEvent e){
 if(e.getSource()==crearC){
 //int a=Integer.parseInt(txtNumeroDp.getText());  //Creando los Clientes
 pc =new Pila_clientes(100);
 pDes=new Pila_destinos(100);
 pEyE=new Pila_Entretenimiento(100);
 pHot=new Pila_Hoteles(100);
 pTra=new Pila_transporte(100);
         
 
 }
else if(e.getSource()==apilarC){
String a=txtCodigoA.getText();
String b=txtNombresA.getText();
String c=txtApellidos.getText();            //Guardando los Clientes
String d=txtNumeroTar.getText();
String ee=txtFechaN.getText();
String f=txtNumero.getText();
String g=txtDireccion.getText();
Datos_clientes dc_2=new Datos_clientes(a,b,c,d,ee,f,g);
pc.Apilar(dc_2);
}
    else if(e.getSource()==reporteC){
     mostrarC.setLineWrap(true);
     String s=pc.Reporte();
     mostrarC.setText(s + "\n" + txtCombo1.getText());   
     
     
     crear();
     reporte_html();
     mostrarRe.setText("Lugares aptos para toda edad,llevar agua y ropa comoda"
             + "Si lleva niños pequeños cuidarlos");
    }
    else if(e.getSource()==logout){
        new Frame_principal();
        
    } 
    else if(e.getSource()==apilarH){
        String codigoH=txtCodigoHosF.getText();
        String direccionH=txtDireccionHosF.getText();
        String numeroCua=txtNumerosCuaF.getText();
        String cantidadPerC=txtCantidadPerF.getText();
        String costoHabF=txtCostoHabF.getText();
        String claseHabF=txtClaseHabF.getText();
        Datos_hoteles dh=new Datos_hoteles(codigoH, direccionH, numeroCua, cantidadPerC, costoHabF, claseHabF);
        pHot.Apilar(dh);
       
    }
    else if(e.getSource()==apilarDes){
        String codDes=txtCodigoDes.getText();
        String paisDes=txtPaisDes.getText();
        String ciudadDes=txtCiudadDes.getText();
        String direcDes=txtDireccionDes.getText();
        String nombreDes=txtNombreDes.getText();
        Datos_Destinos dDes=new Datos_Destinos(codDes, paisDes, ciudadDes, direcDes, nombreDes);
        pDes.Apilar(dDes);
        
    }
    else if(e.getSource()==apilarTra){
        String tipoTr=txtTipoTrF.getText();
        String horario=txtHorarioT.getText();
        String cpacidadPas=txtCapacidadPF.getText();
        String numeroAs=txtNumeroAF.getText();
        String claseAs=txtClaseAsF.getText();
        String codigoTr=txtCodigoTF.getText();
        Datos_transporte dt=new Datos_transporte(tipoTr,horario,cpacidadPas,numeroAs,claseAs,codigoTr);
        pTra.Apilar_T(dt);
   }
    else if(e.getSource()==apilarEyE){
        String codigoEyE=txtCodigoE.getText();
        String nombreLugEyE=txtNombreLuE.getText();
        String paisEyE=txtPaisE.getText();
        String ciudadEyE=txtCiudadE.getText();
        String dirreccionEyE=txtDireccionE.getText();
        String edadEyE=txtEdadE.getText();
        String horarioEyE=txtHorarioE.getText();
        Datos_lugaresEyE dEyE=new Datos_lugaresEyE(codigoEyE, nombreLugEyE, paisEyE, ciudadEyE, dirreccionEyE, edadEyE, horarioEyE);   
        pEyE.Apilar_T(dEyE);
    }
    else if(e.getSource()==desapilar){
       
       Object aux=pc.Desapilar();
       Datos_clientes dc_2=(Datos_clientes)aux;
       mostrarC.setText(dc_2.getCodigo()+" "+dc_2.getNombres()+" "+dc_2.getApellidos()+" "+dc_2.getNumeroTa()+" "+
          dc_2.getFechaN()+" "+dc_2.getNumero()+" "+dc_2.getDireccion());
       
    }
}
public void archivo(){
 
    
}

public void crear(){

String archivo=txtCodigoA.getText()+".txt";
File crea_Ubicacion=new File(ubicacion);
File crea_Archivo=new File(ubicacion+archivo);

if(txtCodigoA.getText().equals("")){
    JOptionPane.showMessageDialog(rootPane, "Campos vacios");
}

else{
    try {
        if(crea_Archivo.exists()){
    
    JOptionPane.showInputDialog("El registro ya existe");
    
}  else{
            
     crea_Ubicacion.mkdirs();
     Formatter crea =new Formatter(ubicacion+archivo);
     
     crea.format("%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s","Codigo : "+txtCodigoA.getText(),"Nombres ; "+txtNombresA.getText(),"Apellidos : "+txtApellidos.getText(),
             "NumeroDeTar : "+txtNumeroTar.getText(),"Fecha de Nacimiento : "+txtFechaN.getText(),"Numero de Telefono : "
     +txtNumero.getText(),"Direccion de habitacion :"+txtDireccion.getText(),"Pais :"+txtCombo1.getText(),"Tipo de Entretenimiento :"+txtCombo2.getText(),"Ciudad : "+txtCombo3.getText(),
     "Dias de viaje :"+txtCombo4.getText());
     
     
            crea.close();
            JOptionPane.showMessageDialog(rootPane, "Se ha creado el archivo");
        }
        
    }catch(Exception e){
        
        JOptionPane.showInputDialog("No se ha podido crear el archivo");
    
    }
    
    
    
}
}
//Metodo que genere el archivo html
public void reporte_html(){
         try
{
reporte = new FileWriter("clientes5.html");
rep = new PrintWriter(reporte);

for (int i = 0; i < pc.tamanio ; i++)
dc=(Datos_clientes)pc.clientes[i];


rep.println("<html>"+
"<center>"+
"<p>"+
"<br>"+
"</p>"+
"<table border= 6>"+
"<tr>"+
"<td><center><b>Codigo</b></center></td>"+
"<td><center><b>Nombre</b></center></td>"+
"<td><center><b>Apellido</b></center></td>"+
"<td><center><b>Numero de Viajes</b></center></td>"+
 "<td><center><b>Destino del Viaje</b></center></td>"+       
"<td><center><b>Costo del viaje</b></center></td>"+
"<td><center><b>Ultimo viaje</b></center></td>"+
"</tr>"+
"<tr>"+
"<td><center><b>"+""+"</b></center></td>"+
"<td><center><b>"+""+"</b></center></td>"+
"<td><center><b>"+""+"</b></center></td>"+
"<td><center><b>"+"1 Viaje"+"</b></center></td>"+
"<td><center><b>"+txtPaisDes.getText()+"</b></center></td>"+
"<td><center><b>"+"5000"+"</b></center></td>"+
"<td><center><b>"+"29 de abril"+"</b></center></td>"+        
"</tr>"+
"</center>"+
"</html>");



Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "clientes5.html"); 
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


public static void main(String[] args){
    new frame_paqueteF();
    
}
}
