
package cuerpo;

import java.util.ArrayList;
import java.util.Scanner;


public class Mensaje {
    //objetos
    Scanner in =  new Scanner(System.in);
    
    //arreglo
    public static ArrayList<MensajeAu> mensajes = new ArrayList<MensajeAu>();
    
    
        //escribir mensaje de ausencia
    public void esribirAusencia(){
         MensajeAu mns = new MensajeAu();
         System.out.println("Motivo por el cual no asistiras (escribe tu nombre y matricula tambien)");
         mns.setMensaje(in.nextLine());
         mensajes.add(mns);
         System.out.println("----Mensaje enviado----" );
         System.out.println("\n  ----Escribe cualquier tecla----");
         in.nextLine();
    }
    
    //mostrar mensaje de ausencia
    public void mostraAusencia(){
        MensajeAu mns;
        
        //ciclo for
        for(int i = 0; i < mensajes.size(); i++){
            mns = mensajes.get(i);
            
            System.out.println("\n************" );
            System.out.println("*Mensaje #" +i +"*" );
            System.out.println("************" );
            System.out.println("\n" +mns.getMensaje());
            System.out.println("\n  ----Escribe cualquier tecla----");
            in.nextLine();
        }
    }
}
