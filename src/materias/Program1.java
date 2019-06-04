
package materias;
import persona.*;
import cuerpo.Textos;
import cuerpo.Calificacion;
import java.util.Scanner;
import static persona.Estudiante.estudiantes1;


public class Program1 implements Materia{
    //objetos
    Estudiante est = new Estudiante();
    Profesor profe = new Profesor();
    Calificacion calf = new Calificacion();
    Textos txt = new Textos();
    Scanner in = new Scanner(System.in);
    
        //inscribir al estudiante
    @Override
    public void inscribirEst() {
       Estudiante est = new Estudiante();
           
           System.out.println("\nCual es tu nombre?");
           est.setNombre(in.nextLine());
           

           System.out.println("\nCual es tu matricula?");
           est.setMatricula(in.nextLine());
           estudiantes1.add(est);
        
    }

        //incribir al profesor y mostrarlo mas adelante
    @Override
    public void inscribirProfe_mostrarProfe() {
       profe.inscribir();
       profe.mostrar();
    }

        //retirar al estudiante
    @Override
    public void retirarEst() {
        System.out.println("Digite tu posicion como estudiante");
         int idRet = in.nextInt();  
         
         
         if(idRet >= estudiantes1.size()){
             txt.mostrarOperacionNoValida();
             in.nextLine();
         } else{
             estudiantes1.remove(idRet);
         }
    }

        //mostrar al estudiante inscrito
    @Override
    public void mostrarEst() {
                Estudiante est;
        //ciclo for
               for( int x = 0; x < estudiantes1.size(); x++){
                   
                   est = estudiantes1.get(x);
                   System.out.println( x  +" => "   +"Nombre: " +est.getNombre()  
                           +"  "   +"Matricula: " +est.getMatricula());
               }
               
               //para calificar al est
               calf.calificarEst();
    }
}


