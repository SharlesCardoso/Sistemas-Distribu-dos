/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Util.getSystemOut;
import View.Principal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Sharles Cardoso
 */
public class Wait {
    
    PrintStream console = System.out;
    getSystemOut systemOut;
    
    public void ForkWait() {
        try {
            systemOut = new getSystemOut();
            
            Process openProgram = Runtime.getRuntime().exec("notepad");

            String line;
            Process chkRunning = Runtime.getRuntime().exec("tasklist -FI \"STATUS eq running\"");
            BufferedReader input = new BufferedReader(new InputStreamReader(chkRunning.getInputStream()));
            while ((line = input.readLine()) != null) {
                if (line.contains("notepad.exe")) {

                    Pattern pattern = Pattern.compile("\\s{2,}"); //Procura por dois mais espaços em branco
                    Matcher matcher = pattern.matcher(line); //Conta os espaços em branco
                    line = matcher.replaceAll(" "); //Substitue por apenas um espaço em branco

                    String[] getPID = line.split(" ");
                    String PID = getPID[1];
                    String ProcessName = getPID[0];
                    System.out.println("\nProcesso Filho em Execução:\nID: " + PID + "\nNome: " + ProcessName);
                }
            }
            input.close();

            openProgram.waitFor();
            //openProgram.waitFor(5, TimeUnit.SECONDS);
            System.out.println("\nO Processo Filho Terminou !");

            System.setOut(console);

        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(Exec_Fork.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
