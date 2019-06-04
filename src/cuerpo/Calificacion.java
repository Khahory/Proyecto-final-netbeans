
package cuerpo;
import java.util.Scanner;


public class Calificacion {
    //objetos
    Scanner in = new Scanner(System.in);
    
    //var
    private int calificacion;
    private boolean salir = true;
    private String yesNo; 
    private String matriculaEst = "";
    
    //calificar al estudiante
    public void calificarEst(){
         while(salir){
                   
              System.out.println("quieres calificar al estudiante escogiedo su matricula? (yes o no)");
              yesNo = in.nextLine();
              
              switch(yesNo){
                  case "yes":
                      System.out.print("Matricula: ");
               matriculaEst = in.nextLine();
               if(matriculaEst.isEmpty()){
                 System.out.println("*-- Matricula incorrecta --*");
                   
               } else{
                   System.out.println("Cuantos puntos acumulo el alumno?");
                   calificacion = in.nextInt();
                   System.out.println("Ha calificado al estudiante con " +calificacion +" puntos"); 
                   
               }
               System.out.println("\n    ----Escribe cualquier tecla----");
               in.next();
               break;
               
                  case "no":
                      salir = false;
                      
                      break;
                      
                  default:
                      salir = false;
                      
                      break;
               }
             }
    }
}
