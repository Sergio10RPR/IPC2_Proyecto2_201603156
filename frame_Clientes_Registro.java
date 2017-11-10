
package travel;
import javax.swing.*;

public class frame_Clientes_Registro extends JFrame {
public JLabel codigo,nombres,apellidos,numeroTar,fechaN,numero,direccion;
public static JTextField txtCodigoRe,txtNombresRe,txtApellidosRe,txtNumeroTarRe,txtFechaNaRe,txtNumeroRe,txtDireccionRe;
public JComboBox combo1,combo2;       
public frame_Clientes_Registro(){
setExtendedState(6);
setLayout(null);

combo1=new JComboBox();

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

txtCodigoRe =new JTextField();
txtCodigoRe.setBounds(200,50,150,20);
txtNombresRe =new JTextField();
txtNombresRe.setBounds(200,75,150,20);
txtApellidosRe=new JTextField();
txtApellidosRe.setBounds(200,100,150,20);
txtNumeroTarRe=new JTextField();
txtNumeroTarRe.setBounds(200,125,150,20);
txtFechaNaRe=new JTextField();
txtFechaNaRe.setBounds(200,150,150,20);
txtNumeroRe=new JTextField();
txtNumeroRe.setBounds(200,175,150,20);
txtDireccionRe=new JTextField();
txtDireccionRe.setBounds(200,200,150,20);

add(codigo);
add(nombres);
add(apellidos);
add(numeroTar);
add(fechaN);
add(numero);
add(direccion);

add(txtCodigoRe);
add(txtNombresRe);
add(txtApellidosRe);
add(txtNumeroTarRe);
add(txtFechaNaRe);
add(txtNumeroRe);
add(txtDireccionRe);


setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);

}  
public static void main(String[] args){
new frame_Clientes_Registro();

   
}
}
