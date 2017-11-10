
package travel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import travel.nodo.pila;

public class ModuloDeCarga extends JFrame implements ActionListener{
public JLabel aero,hotel,cruceros,entidadF,clientes,destinosT,lugares,paquetes,reservaciones,rentaA,asientos,habit,camarotes;
public JTextField txtAero,txtHotel,txtCruceros,txtEntidadF,txtClientes,txtDestinosT,txtLugares,txtPaquetes,txtReservaciones;
public JTextField txtRentaA,txtAsientos,txtHabit,txtCamarotes;
public JButton    jbtAero,jbtHotel,jbtCruceros,jbtEntidadF,jbtClientes,jbtDestinosT,jbtLugares,jbtPaquetes,jbtReservaciones;
public JButton    jbtRentaA,jbtAsientos,jbtHabit,jbtCamarotes;
public static JTextArea  mostrarTxt;
nodo nod;
public static pila pil;
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
  

public ModuloDeCarga(){
    setBounds(200,40,900,650);
    setLayout(null);
   
    aero=new JLabel("Aerolineas");
    aero.setBounds(20,40,150,15);
    hotel=new JLabel("Hoteles");
    hotel.setBounds(20,70,150,15);
    cruceros=new JLabel("Cruceros");
    cruceros.setBounds(20,100,150,15);
    entidadF=new JLabel("Entidad Financiera");
    entidadF.setBounds(20,130,150,15);
    clientes=new JLabel("Clientes");
    clientes.setBounds(20,160,150,15);
    destinosT=new JLabel("Destinos Turisticos");
    destinosT.setBounds(20,190,150,15);
    lugares=new JLabel("Lugares");
    lugares.setBounds(20,220,150,15 );
    paquetes=new JLabel("Paquetes");
    paquetes.setBounds(20,250,150,15);
    reservaciones=new JLabel("Reservaciones");
    reservaciones.setBounds(20,280,150,15);
    rentaA=new JLabel("Renta de Autos");
    rentaA.setBounds(20,310,150,15);
    asientos=new JLabel("Asientos");
    asientos.setBounds(20,340,150,15);
    habit=new JLabel("Habitaciones");
    habit.setBounds(20,370,150,15);
    camarotes=new JLabel("Camarotes");
    camarotes.setBounds(20,400,150,15);
    
    txtAero=new JTextField();
    txtAero.setBounds(200,40,150,20);
    txtHotel=new JTextField();
    txtHotel.setBounds(200,70,150,20);
    txtCruceros=new JTextField();
    txtCruceros.setBounds(200,100,150,20);
    txtEntidadF=new JTextField();
    txtEntidadF.setBounds(200,130,150,20);
    txtClientes=new JTextField();
    txtClientes.setBounds(200,160,150,20);
    txtDestinosT=new JTextField();
    txtDestinosT.setBounds(200,190,150,20);
    txtLugares=new JTextField();
    txtLugares.setBounds(200,220,150,20);
    txtPaquetes=new JTextField();
    txtPaquetes.setBounds(200,250,150,20);
    txtReservaciones=new JTextField();
    txtReservaciones.setBounds(200,280,150,20);
    txtRentaA=new JTextField();
    txtRentaA.setBounds(200,310,150,20);
    txtAsientos=new JTextField();
    txtAsientos.setBounds(200,340,150,20);
    txtHabit=new JTextField();
    txtHabit.setBounds(200,370,150,20);
    txtCamarotes=new JTextField();
    txtCamarotes.setBounds(200,400,150,20);
    
    jbtAero=new JButton("Reporte");
    jbtAero.setBounds(375,40,100,20);
    jbtHotel=new JButton("Reporte");
    jbtHotel.setBounds(375,70,100,20);
    jbtCruceros=new JButton("Reporte");
    jbtCruceros.setBounds(375,100,100,20);
    jbtEntidadF=new JButton("Reporte");
    jbtEntidadF.setBounds(375,130,100,20);
    jbtClientes=new JButton("Reporte");
    jbtClientes.setBounds(375,160,100,20);
    jbtDestinosT=new JButton("Reporte");
    jbtDestinosT.setBounds(375,190,100,20);
    jbtLugares=new JButton("Reporte");
    jbtLugares.setBounds(375,220,100,20);
    jbtPaquetes=new JButton("Reporte");
    jbtPaquetes.setBounds(375,250,100,20);
    jbtReservaciones=new JButton("Reporte");
    jbtReservaciones.setBounds(375,280,100,20);
    jbtRentaA=new JButton("Reporte");
    jbtRentaA.setBounds(375,310,100,20);
    jbtAsientos=new JButton("Reporte");
    jbtAsientos.setBounds(375,340,100,20);
    jbtHabit=new JButton("Reporte");
    jbtHabit.setBounds(375,370,100,20);
    jbtCamarotes=new JButton("Reporte");
    jbtCamarotes.setBounds(375,400,100,20);
    
    mostrarTxt =new JTextArea();
    mostrarTxt.setBounds(20,420,800,300);
            
    
    add(aero);
    add(hotel);
    add(cruceros);
    add(entidadF);
    add(clientes);
    add(destinosT);
    add(lugares);
    add(paquetes);
    add(reservaciones);
    add(rentaA);
    add(asientos);
    add(habit);
    add(camarotes);
    
    
    add(txtAero);
    add(txtHotel);
    add(txtCruceros);
    add(txtEntidadF);
    add(txtClientes);
    add(txtDestinosT);
    add(txtLugares);
    add(txtPaquetes);
    add(txtReservaciones);
    add(txtRentaA);
    add(txtAsientos);
    add(txtHabit);
    add(txtCamarotes);
    
    add(jbtAero);
    add(jbtHotel);
    add(jbtCruceros);
    add(jbtEntidadF);
    add(jbtClientes);
    add(jbtDestinosT);
    add(jbtLugares);
    add(jbtPaquetes);
    add(jbtReservaciones);
    add(jbtRentaA);
    add(jbtAsientos);
    add(jbtHabit);
    add(jbtCamarotes);
    
    add(mostrarTxt);
    
    jbtAero.addActionListener(this);
    jbtHotel.addActionListener(this);
    jbtCamarotes.addActionListener(this);
    
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
} 
@Override
public void actionPerformed(ActionEvent e){
if(e.getSource()==jbtAero){
    
    String url=txtAero.getText();
    ProcessBuilder p=new ProcessBuilder();
    p.command("cmd.exe","/c",url);
    try {
        p.start();
    } catch (IOException ex) {
        Logger.getLogger(ModuloDeCarga.class.getName()).log(Level.SEVERE, null, ex);
    }
}
else if(e.getSource()==jbtHotel){
   String aux=txtHotel.getText();
    try {
        nod.muestraArchivo(aux);  //aux direccion de la url del  archivo
    } catch (IOException ex) {
        Logger.getLogger(ModuloDeCarga.class.getName()).log(Level.SEVERE, null, ex);
    }
}
else if(e.getSource()==jbtCruceros){
    String aux=txtCruceros.getText();
    try {
       
        nod.muestraArchivo(aux);
        
    } catch (IOException ex) {
        Logger.getLogger(ModuloDeCarga.class.getName()).log(Level.SEVERE, null, ex);
    }
} 
else if(e.getSource()==jbtEntidadF){
    String aux=txtEntidadF.getText();
    try {
        nod.muestraArchivo(aux);
    } catch (IOException ex) {
        Logger.getLogger(ModuloDeCarga.class.getName()).log(Level.SEVERE, null, ex);
    }
}
else if(e.getSource()==jbtClientes){
    String aux=txtClientes.getText();
    try {
        nod.muestraArchivo(aux);
    } catch (IOException ex) {
        Logger.getLogger(ModuloDeCarga.class.getName()).log(Level.SEVERE, null, ex);
    }
}
else if(e.getSource()==jbtDestinosT){
    String aux=txtDestinosT.getText();
    try {
        nod.muestraArchivo(aux);
    } catch (IOException ex) {
        Logger.getLogger(ModuloDeCarga.class.getName()).log(Level.SEVERE, null, ex);
    }
}
else if(e.getSource()==jbtLugares){
 String aux=txtLugares.getText();
    try {
        nod.muestraArchivo(aux);
    } catch (IOException ex) {
        Logger.getLogger(ModuloDeCarga.class.getName()).log(Level.SEVERE, null, ex);
    }   
}
else if(e.getSource()==jbtPaquetes){
   String aux=txtPaquetes.getText();
    try {
        nod.muestraArchivo(aux);
    } catch (IOException ex) {
        Logger.getLogger(ModuloDeCarga.class.getName()).log(Level.SEVERE, null, ex);
    } 
}
else if(e.getSource()==jbtReservaciones){
    String aux=txtReservaciones.getText();
    try {
        nod.muestraArchivo(aux);
    } catch (IOException ex) {
        Logger.getLogger(ModuloDeCarga.class.getName()).log(Level.SEVERE, null, ex);
    }
}
else if(e.getSource()==jbtRentaA){
    String aux=txtRentaA.getText();
    try {
        nod.muestraArchivo(aux);
    } catch (IOException ex) {
        Logger.getLogger(ModuloDeCarga.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}
else if(e.getSource()==jbtAsientos){
String aux=txtAsientos.getText();
    try {
        nod.muestraArchivo(aux);
    } catch (IOException ex) {
        Logger.getLogger(ModuloDeCarga.class.getName()).log(Level.SEVERE, null, ex);
    }
}
else if(e.getSource()==jbtHabit){
    String aux=txtHabit.getText();
    try {
        nod.muestraArchivo(aux);
        
    } catch (IOException ex) {
        Logger.getLogger(ModuloDeCarga.class.getName()).log(Level.SEVERE, null, ex);
    }
}
else if(e.getSource()==jbtCamarotes){
   String aux=txtCamarotes.getText();
    try {
        nod.muestraArchivo(aux);
        
    } catch (IOException ex) {
        Logger.getLogger(ModuloDeCarga.class.getName()).log(Level.SEVERE, null, ex);
    } 
    
    }

     
    }


 

public static void main(String[] args){
  new ModuloDeCarga();
  
}

}

