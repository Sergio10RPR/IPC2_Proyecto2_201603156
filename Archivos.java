
package travel;
import java.io.*;
import java.util.Formatter;
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;

public class Archivos {
frame_paqueteF pf;
String barra=File.separator;
String ubicacion=System.getProperty("user.dir")+barra+"Registros"+barra;

public void crear(){

String archivo=pf.txtCodigoA.getText()+".txt";
File crea_Ubicacion=new File(ubicacion);
File crea_Archivo=new File(ubicacion+archivo);

if(pf.txtCodigoA.getText().equals("")){
    JOptionPane.showInputDialog("ERROR");
}

else{
    try {
        if(crea_Archivo.exists()){
    
    JOptionPane.showInputDialog("Si hay Ide");
    
}  else{
            
    crea_Ubicacion.mkdirs();
            Formatter crea =new Formatter(ubicacion+archivo);
            crea.format("%s\r\n%s\r\n%s\r\n%s\r\n%s", "codigo=" + pf.txtCodigoA.getText(),"Nombres=" + pf.txtNombresA.getText()
            +"Apellidos= " + pf.txtApellidos);
            crea.close();
            System.out.println("Se ha creado el archivo");
        }
    }catch(Exception e){
        System.out.println("No se pudo crear el archivo");
    }
    
   
    
}
}
}
