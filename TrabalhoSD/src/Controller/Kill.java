package Controller;

import Util.getSystemOut;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Kill {

    PrintStream console = System.out;
    getSystemOut systemOut;
    
    public void Kill(String arg) {
        try {
            systemOut = new getSystemOut();

            Runtime.getRuntime().exec("taskkill /f /pid " + arg);
            System.out.println("\nProcesso " + arg + " Finalizado com Sucesso !");

            System.setOut(console);
        } catch (IOException ex) {
            Logger.getLogger(Kill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
