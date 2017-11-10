
package travel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class Paquetes extends JFrame implements ActionListener{
Paquetes paq;
public static String c="";
public static String t="";
public static String h="";
public static String des="";
public static String entr="";
public static frame_paqueteF pF;


public JComboBox  tipoPaquete,clasePaquete;
public JLabel     jblTransporte,jblHoteles,jblCruceros,jblDestinos,jblLugares,jblClientes;
public JLabel     jblTipoPaq,jblCategoria;
public JTextField txtTransporte,txtHoteles,txtCruceros,txtDestinos,txtLugares,txtClientes,txtTipoPaq,txtCategoria;
public JButton    comprar,mostrar,reservar,eliminar;
public JTextArea mostrarPaquete;
frame_paquetePers f;
Pila_clientes  pil;
Pila_transporte pilT;
Pila_Hoteles pilH;
Pila_Entretenimiento pEyE;
Pila_destinos pDes;
Pila_cruceros pilCr;


Datos_clientes not;
Datos_transporte not2;
Datos_hoteles not3;
Datos_lugaresEyE not4;
Datos_Destinos not5;
Datos_Cruceros not6;

public Paquetes(){
    setExtendedState(6);
setLayout(null);
tipoPaquete=new JComboBox();
tipoPaquete.setBounds(150,50,150,20);
tipoPaquete.addItem("Paquete Individual");
tipoPaquete.addItem("Paquete Familiar");
tipoPaquete.addItem("Paquete Negocios");
tipoPaquete.addItem("Paquete Express");
tipoPaquete.addItem("Paquete Personalizado");

clasePaquete=new JComboBox();
clasePaquete.setBounds(400,50,150,20);
clasePaquete.addItem("Economico");
clasePaquete.addItem("De lujo");

jblClientes=new JLabel("Codigo de Cliente :");
jblClientes.setBounds(150,100,200,15);
jblTransporte=new JLabel("Codigo de Transporte :");
jblTransporte.setBounds(150,130,200,15);
jblHoteles=new JLabel("Codigo Hoteles y Resorts :");
jblHoteles.setBounds(150,160,200,15);
jblCruceros=new JLabel("Codigo Cruceros :");
jblCruceros.setBounds(150,190,200,15);
jblDestinos=new JLabel("Codigo Destino Turistico :");
jblDestinos.setBounds(150,220,200,15);
jblLugares=new JLabel("Codigo Lugares de Entretenimiento");
jblLugares.setBounds(150,250,200,15);
jblTipoPaq=new JLabel("Tipo de Paquete");
jblTipoPaq.setBounds(150,280,200,15);
jblCategoria=new JLabel("Categoria");
jblCategoria.setBounds(150,310,200,15);

txtClientes=new JTextField();
txtClientes.setBounds(400,100,200,20);
txtTransporte=new JTextField();
txtTransporte.setBounds(400,130,200,20);
txtHoteles=new JTextField();
txtHoteles.setBounds(400,160,200,20);
txtCruceros=new JTextField();
txtCruceros.setBounds(400,190,200,20);
txtDestinos=new JTextField();
txtDestinos.setBounds(400,220,200,20);
txtLugares=new JTextField();
txtLugares.setBounds(400,250,200,20);
txtTipoPaq=new JTextField();
txtTipoPaq.setBounds(400,280,200,20);
txtCategoria=new JTextField();
txtCategoria.setBounds(400,310,200,20);

comprar=new JButton("Comprar");
comprar.setBounds(250,380,100,20);
mostrar=new JButton("Mostrar");
mostrar.setBounds(150,380,100,20);

reservar=new JButton("Reservar");
reservar.setBounds(350,380,100,20);
eliminar=new JButton();


mostrarPaquete =new JTextArea();
mostrarPaquete.setLineWrap(true);
mostrarPaquete.setWrapStyleWord(true);
mostrarPaquete.setBounds(620,40,700,800);
add(mostrarPaquete);

        
add(jblClientes);
add(jblTransporte);
add(jblHoteles);
add(jblCruceros);
add(jblDestinos);
add(jblLugares);
add(jblTipoPaq);
add(jblCategoria);

add(txtClientes);
add(txtTransporte);
add(txtHoteles);
add(txtCruceros);
add(txtDestinos);
add(txtLugares);
add(txtTipoPaq);
add(txtCategoria);

add(comprar);
add(mostrar);
add(reservar);


add(tipoPaquete);
add(clasePaquete);

comprar.addActionListener(this);
mostrar.addActionListener(this);
reservar.addActionListener(this);
setVisible(true);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

clasePaquete.addActionListener(new ActionListener() {
                                    @Override
                         public void actionPerformed(ActionEvent e) {
                            
                               txtCategoria.setText(clasePaquete.getSelectedItem().toString());
 tipoPaquete.addActionListener(new ActionListener() {
                                    @Override
                         public void actionPerformed(ActionEvent e) {
                            
                               txtTipoPaq.setText(tipoPaquete.getSelectedItem().toString());
                               
                               

                                    }
                                });                              
                               

                                    }
                                });
}
@Override
public void actionPerformed(ActionEvent e){
    
if(e.getSource()==comprar){
    
String auxiliar=txtClientes.getText();
String auxiliar2=txtTransporte.getText();
String auxiliar3=txtHoteles.getText();
String auxiliar4=txtLugares.getText();
String auxiliar5=txtDestinos.getText();
String auxiliar6=txtCruceros.getText();

Datos_clientes not;
Datos_transporte not2;
Datos_hoteles not3;
Datos_lugaresEyE not4;
Datos_Destinos not5;

for(int i=0;i<pil.tamanio;i++){
    not=(Datos_clientes)pil.clientes[i];
    if(not!=null){
      if(auxiliar.equals(not.getCodigo())){
          System.out.println(not.getNombres());
          System.out.println(not.getApellidos());
          System.out.println(not.getNumeroTa());
          System.out.println(not.getFechaN());          //DATOS DEL CLIENTE
          System.out.println(not.getNumero());
          System.out.println(not.getDireccion());
          c+=not.getCodigo()+" "+not.getNombres()+" "+not.getApellidos()+" "+not.getNumeroTa()+" "+not.getFechaN()+
             not.getNumero()+" "+not.getDireccion()+"\n";
        
        }
    }
}

for(int i=0;i<pil.tamanio;i++){
    not2=(Datos_transporte)pilT.transporte[i];
    if(not2!=null){
        if(auxiliar2.equals(not2.getCodigoT())){
        System.out.println(not2.getcA());
        System.out.println(not2.gethS());                  //DATOS DEL TRASNPORTE
        System.out.println(not2.gettP());
        System.out.println(not2.gethS());
        System.out.println(not2.getcP());
        t+=not2.gettP()+" "+not2.gethS()+" "+not2.getcP()+","+not2.getnA()+" "+not2.getcA()+
          " "+not2.getCodigoT()+"\n";
        }
    }
}
for(int i=0;i<pil.tamanio;i++){
not3 =(Datos_hoteles)pilH.hoteles[i];
if(not3!=null){
    if(auxiliar3.equals(not3.getCodigoH())){
        
        System.out.println("Datos Hoteles");
        System.out.println(not3.getCodigoH());
        System.out.println(not3.getDireccionH());                         //DATOS DE HOTELES Y RESORTS
        System.out.println(not3.getNumeroHabH());
        System.out.println(not3.getCantidadPerH());
        System.out.println(not3.getCostoHabH());
        System.out.println(not3.getClaseHabH());
        h+=not3.getCodigoH()+" "+not3.getDireccionH()+" "+not3.getNumeroHabH()+" "+not3.getCantidadPerH()+" "+
           not3.getCostoHabH()+" "+not3.getClaseHabH()+"\n";
    }
}
}
for(int i=0;i<pil.tamanio;i++){
not4=(Datos_lugaresEyE)pEyE.entretenimiento[i];
if(not4!=null){
   if(auxiliar4.equals(not4.getCodigoEyE())){
        System.out.println("Datos Lugares y Entrtenimiento");
        System.out.println(not4.getCodigoEyE());
        System.out.println(not4.getNombreEyE());
        System.out.println(not4.getPaisEyE());                           //DATOS DE ENTRETENIMIENTO
        System.out.println(not4.getCiudadEyE());
        System.out.println(not4.getDireccionEyE());
        System.out.println(not4.getEdadEyE());
        System.out.println(not4.getHorarioEyE());
        entr+=not4.getCodigoEyE()+" "+not4.getNombreEyE()+" "+not4.getPaisEyE()+" "+not4.getCiudadEyE()+
              " "+not4.getDireccionEyE()+not4.getEdadEyE()+" "+not4.getHorarioEyE()+"\n";
   } 
}
}

for(int i=0;i<pil.tamanio;i++){
not5=(Datos_Destinos)pDes.destinos[i]; 
if(not5!=null){
    if(auxiliar5.equals(not5.getCodigoDes())){
        
        System.out.println("Datos Destinos Turisticos");
        System.out.println(not5.getCodigoDes());
        System.out.println(not5.getPaisDes());
        System.out.println(not5.getCiudadDes());                           //DATOS DESTINOS TURISTICOS
        System.out.println(not5.getDireccionDes());
        System.out.println(not5.getNombreDes());
        des+=not5.getCodigoDes()+" "+not5.getPaisDes()+" "+not5.getCiudadDes()+" "+not5.getDireccionDes()+
                " "+not5.getNombreDes() +"\n";
    }
}
    
}
    for(int i=0;i<pilCr.tamanio;i++){
          not6=(Datos_Cruceros)pilCr.cruceros[i];
          if(not6!=null){
              if(auxiliar6.equals(not6.getCodigoCr())){
                  
                  mostrarPaquete.setText("Paquete Cruceros");
              }
          }
      }
}

else if(e.getSource()==mostrar){
 if(txtTipoPaq.getText().equals("Paquete Familiar")&&txtCategoria.getText().equals("Economico")){
 mostrarPaquete.setText("Paquete Familiar" + "Economico"+"\n" + c + "\n" + t + "\n" + des + "\n" + h + "\n" + entr +"\n"+
      pF.txtCombo5.getText() + "\n" );
 

}
 else if(txtTipoPaq.getText().equals("Paquete Familiar")&&txtCategoria.getText().equals("De lujo")){
 mostrarPaquete.setText("Paquete Familiar" +"De lujo"+"\n" + c + "\n" + t + "\n" + des + "\n" + h + "\n" + entr );
    
 }
 
 
else if(txtTipoPaq.getText().equals("Paquete Personalizado")&&txtCategoria.getText().equals("Economico")){
 mostrarPaquete.setText("Paquete Personalizado " + " Economico "+"\n" + c + "\n" + t + "\n" + des + "\n" + h + "\n" + entr );
 
}
else if(txtTipoPaq.getText().equals("Paquete Personalizado")&&txtCategoria.getText().equals("De lujo")){
 mostrarPaquete.setText("Paquete Personalizado" +"De lujo"+"\n" + c + "\n" + t + "\n" + des + "\n" + h + "\n" + entr );
}


else if(txtTipoPaq.getText().equals("Paquete Negocios")&&txtCategoria.getText().equals("Economico")){
 mostrarPaquete.setText("Paquete Negocios"+"Economico"+"\n" + c + "\n" + t + "\n" + des + "\n" + h + "\n" + entr ); 
 
}
else if(txtTipoPaq.getText().equals("Paquete Negocios")&&txtCategoria.getText().equals("De lujo")){
    mostrarPaquete.setText("Paquete Negocios" +"De lujo"+"\n" + c + "\n" + t + "\n" + des + "\n" + h + "\n" + entr );
}


else if(txtTipoPaq.getText().equals("Paquete Express")&&txtCategoria.getText().equals("Economico")){
 mostrarPaquete.setText("Paquete Express" +"Economico"+"\n" + c + "\n" + t + "\n" + des + "\n" + h + "\n" + entr );   
 
}
else if(txtTipoPaq.getText().equals("Paquete Express")&&txtCategoria.getText().equals("De lujo")){
 mostrarPaquete.setText("Paquete Express"+"De lujo" +"\n" + c + "\n" + t + "\n" + des + "\n" + h + "\n" + entr );  
}


else if(txtTipoPaq.getText().equals("Paquete Individual")&&txtCategoria.getText().equals("Economico")){
 mostrarPaquete.setText("Paquete Individual"+"Economico" +"\n" + c + "\n" + t + "\n" + des + "\n" + h + "\n" + entr );  
    
}
else if(txtTipoPaq.getText().equals("Paquete Individual")&&txtCategoria.getText().equals("De lujo")){
 mostrarPaquete.setText("Paquete Individual" +"De lujo"+"\n" + c + "\n" + t + "\n" + des + "\n" + h + "\n" + entr );
}
}
else if(e.getSource()==reservar){
    new Reservaciones();
}
}



public String mostrarArchivo(){ //Metodo que retorna los datos de destinos
    String r="";
   
    for(int i=0;i<pil.tamanio;i++){
not5=(Datos_Destinos)pDes.destinos[i]; 

        
        /*System.out.println("Datos Destinos Turisticos");
        System.out.println(not5.getCodigoDes());
        System.out.println(not5.getPaisDes());
        System.out.println(not5.getCiudadDes());                           //DATOS DESTINOS TURISTICOS
        System.out.println(not5.getDireccionDes());
        System.out.println(not5.getNombreDes());*/
        r+=not5.getCodigoDes()+ " nombre: "+not5.getPaisDes()+" "+not5.getCiudadDes()+" "+not5.getDireccionDes()+" "+
        not5.getNombreDes()+"\n"; 
    
    
    }
    
    
 return r;  
    
    }



public static void main(String[] args){
    new Paquetes();
    //new CompraPaquete();
    
}
}
