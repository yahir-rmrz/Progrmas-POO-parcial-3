
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yahir
 */
public class LeerArchivo {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader leer = new BufferedReader(new FileReader("datos.txt"));
            String renglon = "";
            String aux = "";
            while((renglon = leer.readLine()) != null){
               aux += renglon + "\n";
            }
            
            leer.close();
            JOptionPane.showMessageDialog(null, aux);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
