
package travel;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Reservaciones extends JFrame implements ActionListener{
public JLabel    codigoDpi;
public JTextField txtCodigoDpi;
public JButton   comprar,mostrar;
public JTextArea mostrarPaquete;
public JScrollPane scroll;   
frame_paqueteF pf;

Paquetes paq;
Pila_clientes pil;
Pila_cruceros pilCr;
String clientesInfo="";
public static String reservacionInfo="";


    public Reservaciones(){
    
 
    setExtendedState(6);
    setLayout(null);
       
    
    codigoDpi=new JLabel("CODIGO :");
    codigoDpi.setBounds(50,50,150,20);
    txtCodigoDpi=new JTextField();
    txtCodigoDpi.setBounds(200,50,220,20);
    mostrar=new JButton("Mostrar");
    mostrar.setBounds(450,50,150,20);
    
    mostrarPaquete=new JTextArea();
    mostrarPaquete.setBounds(20,100,1100,500);
    
    //mostrarPaquete.setEditable(false);
    
    
    
    add(codigoDpi);
    add(txtCodigoDpi);
    add(mostrar);
    add(mostrarPaquete);
   
    
    mostrar.addActionListener(this);
    setVisible(true);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}

@Override
public void actionPerformed(ActionEvent e){
if(e.getSource()==mostrar){
    String aux=txtCodigoDpi.getText();
    Datos_clientes not;
    Datos_Cruceros not2;
for(int i=0;i<pil.tamanio;i++){
    not=(Datos_clientes)pil.clientes[i];
    
if(not!=null){
  if(aux.equals(not.getCodigo())){
      
   clientesInfo+=not.getCodigo()+" "+not.getNombres()+" "+not.getApellidos()+" "+not.getNumeroTa()+" "+
                 not.getFechaN()+" "+not.getNumero()+" "+not.getDireccion() +"\n";
   
   Calendar Cal= Calendar.getInstance(); 
   String fec= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR)+" "
        +Cal.get(Cal.HOUR_OF_DAY)+":"+Cal.get(Cal.MINUTE)+":"+Cal.get(Cal.SECOND); 
   
   
    mostrarPaquete.setText(clientesInfo + "\n" + fec + "\n" + pf.txtCombo4.getText() );
    reservacionInfo+=clientesInfo + " " + fec;
    
   
   
  }
}
}
       for(int i=0;i<pilCr.tamanio;i++){
          not2=(Datos_Cruceros)pilCr.cruceros[i];
          if(not2!=null){
              if(aux.equals(not2.getCodigoCr())){
                  
                  mostrarPaquete.setText("Paquete Cruceros");
              }
          }
      }
  }
      
  }
   
   



    
 
    


public static void main(String[] args){
    
    new Reservaciones();
}
}