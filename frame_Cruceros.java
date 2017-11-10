
package travel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.*;


public class frame_Cruceros extends JFrame implements ActionListener {
public JLabel     codigoCr,fechaCr,capacidadCr,numeroHabCr,cantidadDiasCr,claseHabCr;
public JTextField txtCodigoCr,txtFechaCr,txtCapacidadCr,txtNumHabCr,txtCanDiasCr,txtClaseHabCr;
public JComboBox  combo1,combo2,combo3,combo4,combo5;
public JTextField txtCombo1,txtCombo2;
public JTextArea  txaMostrar;
public JButton    jbtMostrar,jbtReservar,jbtGuardar,jbtIniciar,jbtLogout;
Pila_cruceros pilCr;


public frame_Cruceros (){
    setBounds(20,50,800,600);
    setLayout(null);
    
    codigoCr=new JLabel("Codigo Crucero :");
    codigoCr.setBounds(20,50,150,15);
    fechaCr=new JLabel("Fecha de salida/llegada :");
    fechaCr.setBounds(20,75,150,15);
    capacidadCr=new JLabel("Capacidad del crucero :");
    capacidadCr.setBounds(20,100,150,15);
    numeroHabCr=new JLabel("Numero de Habitaacion :");
    numeroHabCr.setBounds(20,125,150,15);
    cantidadDiasCr=new JLabel("Cantidad de dias :");
    cantidadDiasCr.setBounds(20,150,150,15);
    claseHabCr=new JLabel("Clase de habitacion :");
    claseHabCr.setBounds(20,175,150,15);
    
    txtCodigoCr=new JTextField();
    txtCodigoCr.setBounds(180,50,150,20);
    txtFechaCr=new JTextField();
    txtFechaCr.setBounds(180,75,150,20);
    txtCapacidadCr=new JTextField();
    txtCapacidadCr.setBounds(180,100,150,20);
    txtNumHabCr=new JTextField();
    txtNumHabCr.setBounds(180,125,150,20);
    txtCanDiasCr=new JTextField();
    txtCanDiasCr.setBounds(180,150,150,20);
    txtClaseHabCr=new JTextField();
    txtClaseHabCr.setBounds(180,175,150,20);
    
    jbtMostrar=new JButton("Mostrar");
    jbtMostrar.setBounds(450,275,150,20);
    jbtReservar=new JButton("Reservar");
    jbtReservar.setBounds(600,275,150,20);
    jbtIniciar=new JButton("Iniciar");
    jbtIniciar.setBounds(600,250,150,20);
    jbtGuardar=new JButton("Guardar");
    jbtGuardar.setBounds(20,200,150,20);
    jbtLogout=new JButton("Lgout");
    jbtLogout.setBounds(450,250,150,20);
    
    
    combo1=new JComboBox();
    combo1.addItem("Casino");
    combo1.addItem("Area de juegos");
    combo1.addItem("Teatro");
    combo1.addItem("Campo de golf");
    combo1.addItem("Concierto");
    combo1.addItem("");
    combo1.setBounds(350,50,180,20);
    
    txtCombo1=new JTextField();
    txtCombo1.setBounds(350,80,180,20);
    
    
    combo2=new JComboBox();
    combo2.addItem("1 semana");
    combo2.addItem("2 semanas");
    combo2.addItem("3 semanas");
    combo2.addItem("1 mes");
    combo2.setBounds(550,50,180,20);
    
    txtCombo2=new JTextField();
    txtCombo2.setBounds(550,80,180,20);
    
    txaMostrar=new JTextArea();
    txaMostrar.setBounds(20,300,700,200);
    
    
    
    add(codigoCr);
    add(fechaCr);
    add(capacidadCr);
    add(numeroHabCr);
    add(cantidadDiasCr);
    add(claseHabCr);
    
    add(txtCodigoCr);
    add(txtFechaCr);
    add(txtCapacidadCr);
    add(txtNumHabCr);
    add(txtCanDiasCr);
    add(txtClaseHabCr);
    
    add(txtCombo1);
    add(txtCombo2);
    
    add(combo1);
    add(combo2);
    
    add(jbtMostrar);
    add(jbtReservar);
    add(jbtGuardar);
    add(jbtIniciar);
    add(jbtLogout);
    
    add(txaMostrar);
    
    jbtGuardar.addActionListener(this);
    jbtMostrar.addActionListener(this);
    jbtReservar.addActionListener(this);
    jbtIniciar.addActionListener(this);
    jbtLogout.addActionListener(this);
    
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }

@Override
public void actionPerformed(ActionEvent e){
if(e.getSource()==jbtIniciar){
    pilCr=new Pila_cruceros(100);
    }
    else if(e.getSource()==jbtGuardar){
String codCr=txtCodigoCr.getText();
String fechaSaCr=txtFechaCr.getText();
String capacidadCr=txtCapacidadCr.getText();
String numeroHabCr=txtNumHabCr.getText();
String cantidadDiasCr=txtCanDiasCr.getText();
String claseHabCr=txtClaseHabCr.getText();
Datos_Cruceros dCr=new Datos_Cruceros(codCr, fechaSaCr, fechaSaCr, capacidadCr, numeroHabCr, cantidadDiasCr, claseHabCr);
pilCr.Apilar(dCr);
}  
else if(e.getSource()==jbtMostrar){
    String s=pilCr.Reporte();

    txaMostrar.setText(s);
}
else if(e.getSource()==jbtLogout){
    new Frame_principal();
    
}
else if(e.getSource()==jbtReservar){
    new Reservaciones();
    
}
}
public static void main(String[] args){
    new frame_Cruceros();
}

}
