
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yahir
 */
public class creacion {
  
    public static void main(String[] args) {
         
       
        FileWriter archivo = null;
        try {
            String r = "n";
            archivo = new FileWriter("datos.txt");
            do{
                archivo.write(JOptionPane.showInputDialog("Escribe un dato"+"\n"));
            }while(r.equals("s"));
            archivo.close();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(creacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            try {
                archivo.close();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(creacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
      
           
        
        
        
    }
    
}
