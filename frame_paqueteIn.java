
package travel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Formatter;
import javax.swing.*;

public class frame_paqueteIn extends JFrame implements ActionListener{
public JLabel tituloPi;
public JLabel codigo,nombres,apellidos,numeroTar,fechaN,numero,direccion,numeroDp;//Clientes
public JLabel codigo_4,nombres_4,apellidos_4,numeroTar_4,fechaN_4,numero_4;//Transporte
public JLabel codigoDes,paisDes,ciudadDes,direccionDes,nombreDes;//Destinos
public JLabel codigoE,nombreLugarE,paisE,ciudadE,direccionE,edadE,horarioE;//Entretenimiento
public JLabel codigoH,direccionH,numeroCuartos,cantidadPC,costoH,claseH; //Hoteles
//public JLabel 

public static JTextField txtCodigoB,txtNombres,txtApellidos,txtNumeroTar,txtFechaN,txtNumero,txtDireccion,txtNumeroDp;
public JTextField txtTipoTrIn,txtHorarioTrInd,txtCapacidadTrUn,txtNumeroAsIn,txtClaseAsIn,txtCodigoTrIn;
public JTextField txtCodigoDes,txtPaisDes,txtCiudadDes,txtDireccionDes,txtNombreDes;
public JTextField txtCodigoE,txtNombreLugarE,txtPaisE,txtCiudadE,txtDireccionE,txtEdadE,txtHorarioE;//Entretenimiento
public JTextField txtCodigoH,txtDireccionH,txtNumeroCuartos,txtCantidadPC,txtCostoH,txtClaseH;//Hoteles



public JComboBox  combo1,combo2,combo3,combo4;
public JTextArea  mostrarDaIn,mostrarRecIn;
public JTextField txtCombo1,txtCombo2,txtCombo3,txtCombo4;
public JButton    crearC,reporteC,logoutI,eliminar;
public JButton    apilarC,apilarH,apilarDes,apilarEyE,apilarTra;
Pila_clientes tra;
Pila_Hoteles ph;
Pila_Entretenimiento pEyE;
Pila_destinos pDes;
Pila_transporte pTra;

String barra=File.separator;
String ubicacion=System.getProperty("user.dir")+barra+"Registros"+barra;

public frame_paqueteIn(){
setLayout(null);
setExtendedState(6);

tituloPi=new JLabel("PAQUETE INDIVIDUAL");
tituloPi.setBounds(20,5,300,50);
tituloPi.setForeground(Color.red);
    
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
apilarC=new JButton("Guardar");
apilarC.setBounds(20,245,100,15);


crearC=new JButton("INICIAR");
crearC.setBounds(1000,600,100,20);
eliminar=new JButton("ELIMINAR");
eliminar.setBounds(1100,600,100,20);
reporteC=new JButton("REPORTE");
reporteC.setBounds(400,260,100,20);

txtCodigoB =new JTextField();
txtCodigoB.setBounds(200,50,150,20);
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
txtNumeroDp=new JTextField();
txtNumeroDp.setBounds(200,225,150,20);


codigo_4=new JLabel("Tipo de Transporte :");
codigo_4.setBounds(20,325,150,15);
nombres_4=new JLabel("Horario salida/llegada :");
nombres_4.setBounds(20, 350, 150, 15);
apellidos_4=new JLabel("Capacidad de pasajeros :");
apellidos_4.setBounds(20,375,150,15);
numeroTar_4=new JLabel("Numero de asiento :");
numeroTar_4.setBounds(20,400,150,15);
fechaN_4=new JLabel("Clase de asiento :");
fechaN_4.setBounds(20,425,275,15);
numero_4=new JLabel("Codigo de transporte :");
numero_4.setBounds(20,450,150,15);
apilarTra=new JButton("Guardar");
apilarTra.setBounds(20,470,100,15);


txtTipoTrIn=new JTextField();
txtTipoTrIn.setBounds(200,325,150,20);
txtHorarioTrInd=new JTextField();
txtHorarioTrInd.setBounds(200,350,150,20);
txtCapacidadTrUn=new JTextField();
txtCapacidadTrUn.setBounds(200,375,150,20);
txtNumeroAsIn=new JTextField();
txtNumeroAsIn.setBounds(200,400,150,20);
txtClaseAsIn=new JTextField();
txtClaseAsIn.setBounds(200,425,150,20);
txtCodigoTrIn=new JTextField();
txtCodigoTrIn.setBounds(200,450,150,20);

codigoDes=new JLabel("Codigo destino");
codigoDes.setBounds(20,525,150,15);
paisDes=new JLabel("Pais de destino");
paisDes.setBounds(20,550,150,15);
ciudadDes=new JLabel("Ciudad de destino");
ciudadDes.setBounds(20,575,150,15);
direccionDes=new JLabel("Direccion de destino");
direccionDes.setBounds(20,600,150,15);
nombreDes=new JLabel("Nombre de destino");
nombreDes.setBounds(20,625,150,15);
apilarDes=new JButton("Guardar");
apilarDes.setBounds(20,645,100,15);

txtCodigoDes=new JTextField();
txtCodigoDes.setBounds(200,525,150,20);
txtPaisDes=new JTextField();
txtPaisDes.setBounds(200,550,150,20);
txtCiudadDes=new JTextField();
txtCiudadDes.setBounds(200,575,150,20);
txtDireccionDes=new JTextField();
txtDireccionDes.setBounds(200,600,150,20);
txtNombreDes=new JTextField();
txtNombreDes.setBounds(200,625,150,20);

codigoE=new JLabel("Codigo del lugar :");
codigoE.setBounds(400,325,150,15);
nombreLugarE=new JLabel("Nombre del lugar :");
nombreLugarE.setBounds(400,350,150,15);
paisE=new JLabel("Pais :");
paisE.setBounds(400,375,150,15);
ciudadE=new JLabel("Ciudad :");
ciudadE.setBounds(400,400,150,15);
direccionE=new JLabel("Direccion :");
direccionE.setBounds(400,425,150,15);
edadE=new JLabel("Edad :");
edadE.setBounds(400,450,150,15);
horarioE=new JLabel("Horario de salida/llegada :");
horarioE.setBounds(400,475,150,15);
apilarEyE=new JButton("Guardar");
apilarEyE.setBounds(400,495,100,15);

txtCodigoE=new JTextField();
txtCodigoE.setBounds(580,325,150,20);
txtNombreLugarE=new JTextField();
txtNombreLugarE.setBounds(580,350,150,20);
txtPaisE=new JTextField();
txtPaisE.setBounds(580,375,150,20);
txtCiudadE=new JTextField();
txtCiudadE.setBounds(580,400,150,20);
txtDireccionE=new JTextField();
txtDireccionE.setBounds(580,425,150,20);
txtEdadE=new JTextField();
txtEdadE.setBounds(580,450,150,20);
txtHorarioE=new JTextField();
txtHorarioE.setBounds(580,475,150,20);

//Hoteles Y resorts
codigoH=new JLabel("Codigo de hospedaje :");
codigoH.setBounds(760,325,150,15);
direccionH=new JLabel("Direccion :");
direccionH.setBounds(760,350,150,15);
numeroCuartos=new JLabel("Numero de cuartos :");
numeroCuartos.setBounds(760,375,150,15);
cantidadPC=new JLabel("Cantidad de personas :");
cantidadPC.setBounds(760,400,150,15);
costoH=new JLabel("Costo de habitacion :");
costoH.setBounds(760,425,150,15);
claseH=new JLabel("Clase de habitacion :");
claseH.setBounds(760,450,150,15);
apilarH=new JButton("Guardar");
apilarH.setBounds(760,490,100,15);
        
        
        
txtCodigoH=new JTextField();
txtCodigoH.setBounds(940,325,150,20);
txtDireccionH=new JTextField();
txtDireccionH.setBounds(940,350,150,20);
txtNumeroCuartos=new JTextField();
txtNumeroCuartos.setBounds(940,375,150,20);
txtCantidadPC=new JTextField();
txtCantidadPC.setBounds(940,400,150,20);
txtCostoH=new JTextField();
txtCostoH.setBounds(940,425,150,20);
txtClaseH=new JTextField();
txtClaseH.setBounds(940,450,150,20);
        


combo1=new JComboBox();
combo1.setBounds(400,50,150,20);
combo1.addItem("Las Vegas");
combo1.addItem("Monte Everest");
combo1.addItem("Londres");
combo1.addItem("Nueva York");

txtCombo1=new JTextField();
txtCombo1.setBounds(400,80,150,20);

combo2=new JComboBox();
combo2.setBounds(560,50,150,20);
combo2.addItem("Barco");
combo2.addItem("Avion");
combo2.addItem("");
combo2.addItem("");

txtCombo2=new JTextField();
txtCombo2.setBounds(560,80,150,20);

combo3=new JComboBox();
combo3.setBounds(720,50,150,20);
combo3.addItem("4 Dias");
combo3.addItem("5 Dias");
combo3.addItem("6 Dias");
combo3.addItem("1semana");
combo3.addItem("2 semanas");

txtCombo3=new JTextField();
txtCombo3.setBounds(720,80,150,20);


combo4=new JComboBox();
combo4.setBounds(880,50,150,20);
combo4.addItem("Concierto");
combo4.addItem("Evento deportivo");
combo4.addItem("Museo");
combo4.addItem("Casino");
combo4.addItem("Teatro");

txtCombo4 = new JTextField();
txtCombo4.setBounds(880,80,150,20);

mostrarDaIn=new JTextArea();
mostrarDaIn.setBounds(400,125,600,100);
mostrarDaIn.setLineWrap(true);
mostrarDaIn.setWrapStyleWord(true);

mostrarRecIn=new JTextArea();
mostrarRecIn.setBounds(400,550,600,100);
mostrarRecIn.setLineWrap(true);
mostrarRecIn.setWrapStyleWord(true);

logoutI=new JButton("Logout");
logoutI.setBounds(20,675,100,20);
        
add(tituloPi);
add(codigo);
add(nombres);
add(apellidos);
add(numeroTar);
add(fechaN);
add(numero);
add(direccion);
add(numeroDp);

add(txtCodigoB);
add(txtNombres);
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


add(txtTipoTrIn);
add(txtHorarioTrInd);
add(txtCapacidadTrUn);
add(txtNumeroAsIn);
add(txtClaseAsIn);
add(txtCodigoTrIn);

//Destinos Turistico
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

//Entretenimiento
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

//Hoteles
add(codigoH);
add(direccionH);
add(numeroCuartos);
add(cantidadPC);
add(costoH);
add(claseH);

add(txtCodigoH);
add(txtDireccionH);
add(txtNumeroCuartos);
add(txtCantidadPC);
add(txtCostoH);
add(txtClaseH);


add(combo1);
add(combo2);
add(combo3);
add(combo4);

add(txtCombo1);
add(txtCombo2);
add(txtCombo3);
add(txtCombo4);

add(mostrarDaIn);
add(mostrarRecIn);
//Botones
add(apilarC);
add(apilarDes);
add(apilarH);
add(apilarEyE);
add(apilarTra);





//add(guardarD);
add(crearC);
add(reporteC);
add(logoutI);
add(eliminar);

apilarC.addActionListener(this);
apilarDes.addActionListener(this);
apilarEyE.addActionListener(this);
apilarTra.addActionListener(this);
apilarH.addActionListener(this);

crearC.addActionListener(this);
reporteC.addActionListener(this);
logoutI.addActionListener(this);
eliminar.addActionListener(this);



setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
combo1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtCombo1.setText(combo1.getSelectedItem().toString());
combo2.addActionListener(new ActionListener() {
                                    @Override
                        public void actionPerformed(ActionEvent e) {
                                txtCombo2.setText(combo2.getSelectedItem().toString());
                                
combo3.addActionListener(new ActionListener() {
                                    @Override
                         public void actionPerformed(ActionEvent e) {
                                txtCombo3.setText(combo3.getSelectedItem().toString());
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
 tra =new Pila_clientes(50);  
 ph=new Pila_Hoteles(50);
 pEyE=new Pila_Entretenimiento(50);
 pDes=new Pila_destinos(50);
 pTra=new Pila_transporte(50);
}
else if(e.getSource()==apilarC){
String a=txtCodigoB.getText();
String b=txtNombres.getText();
String c=txtApellidos.getText();
String d=txtNumeroTar.getText();
String ee=txtFechaN.getText();
String f=txtNumero.getText();
String g=txtDireccion.getText();
Datos_clientes dc_2=new Datos_clientes(a,b,c,d,ee,f,g);
tra.Apilar(dc_2);  
    
}
else if(e.getSource()==apilarH){
String cH=txtCodigoH.getText();
String dH=txtDireccionH.getText();
String nCH=txtNumeroCuartos.getText();
String cPCH=txtCantidadPC.getText();
String costoH=txtCostoH.getText();
String claseH=txtClaseH.getText();
Datos_hoteles dh_2=new Datos_hoteles(cH,dH,nCH,cPCH,costoH,claseH);
ph.Apilar(dh_2);
}
else if(e.getSource()==apilarEyE){
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
else if(e.getSource()==apilarDes){
String codDes=txtCodigoDes.getText();
String paisDes=txtPaisDes.getText();
String ciudadDes=txtCiudadDes.getText();
String direccionDes=txtDireccionDes.getText();
String nombreDes=txtNombreDes.getText();
Datos_Destinos daDes=new Datos_Destinos(codDes, paisDes, ciudadDes, direccionDes, nombreDes);
pDes.Apilar(daDes);
}
else if(e.getSource()==apilarTra){
    //txtTipoTrIn,txtHorarioTrInd,txtCapacidadTrUn,txtNumeroAsIn,txtClaseAsIn,txtCodigoTrIn
String tP_1=txtTipoTrIn.getText();
String hS_1=txtHorarioTrInd.getText();
String cP_1=txtCapacidadTrUn.getText();
String nA_1=txtNumeroAsIn.getText();
String cA_1=txtClaseAsIn.getText();
String codigoT=txtCodigoTrIn.getText();

Datos_transporte dt_2=new Datos_transporte(tP_1,hS_1,cP_1,nA_1,cA_1,codigoT);
pTra.Apilar_T(dt_2);
}
else if(e.getSource()==eliminar){
    Object aux=tra.Desapilar();
Datos_clientes dc_2=(Datos_clientes)aux;
mostrarDaIn.setText(dc_2.getCodigo()+" "+dc_2.getNombres()+" "+dc_2.getApellidos()+" "+dc_2.getNumeroTa()+" "+
          dc_2.getFechaN()+" "+dc_2.getNumero()+" "+dc_2.getDireccion());
    
}
else if(e.getSource()==reporteC){
mostrarDaIn.setLineWrap(true);
String s=tra.Reporte();

mostrarDaIn.setText(s); 
     
         
         //crear();
}
else if(e.getSource()==logoutI){
   new Frame_principal();
}
}    
public void crear(){
String archivo=txtCodigoB.getText()+".txt";
File crea_Ubicacion=new File(ubicacion);
File crea_Archivo=new File(ubicacion+archivo);

if(txtCodigoB.getText().equals("")){
    JOptionPane.showMessageDialog(rootPane, "Campos vacios");
}

else{
    try {
        if(crea_Archivo.exists()){
    
    JOptionPane.showMessageDialog(rootPane, "El registro ya existe");
    
}  else{
            
     crea_Ubicacion.mkdirs();
     Formatter crea =new Formatter(ubicacion+archivo);
     
     crea.format("%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s","Codigo : "+txtCodigoB.getText(),"Nombres ; "+txtNombres.getText(),"Apellidos : "+txtApellidos.getText(),
             "NumeroDeTar : "+txtNumeroTar.getText(),"Fecha de Nacimiento : "+txtFechaN.getText(),"Numero de Telefono : "
     +txtNumero.getText(),"Direccion de habitacion :"+txtDireccion.getText(),"Pais :"+txtCombo1.getText(),"Tipo de Entretenimiento :"+txtCombo2.getText(),"Ciudad : "+txtCombo3.getText(),
     "Dias de viaje :"+txtCombo4.getText());
     
     
            crea.close();
            JOptionPane.showMessageDialog(rootPane, "Se ha creado el archivo");
        }
        
    }catch(Exception o){
        
        JOptionPane.showInputDialog("No se ha podido crear el archivo");
    
    }

}
}
public static void main(String[] args){
    new frame_paqueteIn();
    
}
}
