
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
public class Frame_principal extends JFrame implements ActionListener{
public JButton paqueteIndividual,paqueteFamiliar,paqueteNegocios,paqueteExpress,paquetePersonalizado,reservar;
public JButton clientesRe,Reservaciones,modCarga,modReportes,paquetes;
public JLabel codigo,tituloT;
public JTextField txtCodigoRe;
frame_paquetePers pass;
String almacenar,almacenar2,almacenar3,almacenar4;


frame_paqueteF passF ;
frame_paqueteIn passIn;
Datos_clientes dc;
static String a;
String aux="";
Pila_clientes pil;
frame_paquetePers fraC;
public Frame_principal(){


setTitle("TRAVEL");
setExtendedState(6);
//setLayout(null);

tituloT=new JLabel("TRAVEL S.A");
tituloT.setBounds(30,10,400,100);
tituloT.setForeground(Color.red);

codigo=new JLabel("CODIGO :");
codigo.setBounds(30,180,100,15);

txtCodigoRe=new JTextField();
txtCodigoRe.setBounds(140,180,120,20);


clientesRe=new JButton("REGISTRO_CLIENTES");
clientesRe.setBounds(30,250,200,20);
reservar=new JButton("RESERVACIONES");
reservar.setBounds(30,150,200,20);
paqueteIndividual=new JButton("PAQUETE_INDIVIDUAL");
paqueteIndividual.setBounds(30,300,200,20);
paqueteFamiliar=new JButton("PAQUETE_FAMILIAR");
paqueteFamiliar.setBounds(30,350,200,20);
paqueteNegocios=new JButton("PAQUETE_NEGOCIOS");
paqueteNegocios.setBounds(30,400,200,20);
paqueteExpress=new JButton("PAQUETE_EXPRESS");
paqueteExpress.setBounds(30,450,200,20);
paquetePersonalizado=new JButton("PAQUETE_PERSONALIZADO");
paquetePersonalizado.setBounds(30,500,200,20);
Reservaciones =new JButton();
Reservaciones.setBounds(30,600,200,20);
modCarga=new JButton("Modulo de Carga");
modCarga.setBounds(250,250,200,20);
modReportes=new JButton("Modulo de Reportes");
modReportes.setBounds(250,300,200,20);
paquetes=new JButton("Paquetes");
paquetes.setBounds(250,350,200,20);
add(codigo);
add(txtCodigoRe);


add(clientesRe);
add(reservar);
add(paqueteIndividual);
add(paqueteFamiliar);
add(paqueteNegocios);
add(paqueteExpress);
add(paquetePersonalizado);
add(modCarga);
add(modReportes);
add(paquetes);
add(tituloT);


//add(Reservaciones);



paqueteIndividual.addActionListener(this);
paqueteFamiliar.addActionListener(this);
paqueteNegocios.addActionListener(this);
paqueteExpress.addActionListener(this);
paquetePersonalizado.addActionListener(this);
reservar.addActionListener(this);
modCarga.addActionListener(this);
modReportes.addActionListener(this);
paquetes.addActionListener(this);

lamina_c la=new lamina_c();

add(la);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
la.setVisible(true);
setVisible(true);
} 

public static void main(String[] args){
new Frame_principal();


}
@Override
public void actionPerformed(ActionEvent e){
    
    
if(e.getSource()==paqueteIndividual){




     new frame_paqueteIn();



    
    

}
else if(e.getSource()==paqueteFamiliar){
   //Frame_clientes ins2=new frame_paquetePers();
     new frame_paqueteF();
}
else if(e.getSource()==paqueteNegocios){

} 
else if(e.getSource()==paqueteExpress){
  new frame_paqueteIn();
  
  
          
}
else if(e.getSource()==paquetePersonalizado){
    
    new frame_paquetePers();
}
else if(e.getSource()==paquetes){
    new Paquetes();
}
else if(e.getSource()==modCarga){
    new ModuloDeCarga();
    
}
if(e.getSource()==reservar){
new Reservaciones();
} 
else if(e.getSource()==modReportes){
    new ModuloDeReportes();
}
 

}
public class lamina_c extends JPanel{
@Override
public void paintComponent(Graphics c){
super.paintComponent(c);
File miImagen=new File("C:\\Users\\Sergio_RPR\\Documents\\NetBeansProjects\\Travel\\src\\travel\\Imagen\\FrameP.jpg");
 
 
 try{
     imagen_c=ImageIO.read(miImagen);
     
 }
 catch(IOException e){
     System.out.println("Imagen no encontrada");
 }
 c.drawImage(imagen_c, 20, 800, null);
 
}
 private Image imagen_c;   
    
}
}












