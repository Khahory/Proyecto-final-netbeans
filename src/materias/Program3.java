
package materias;
import cuerpo.Calificacion;
import cuerpo.Textos;
import java.util.Scanner;
import persona.*;
import static persona.Estudiante.estudiantes3;


public class Program3 implements Materia{
    //objetos
    Estudiante est = new Estudiante();
    Profesor profe = new Profesor();
        Textos txt = new Textos();
        Calificacion calf = new Calificacion();
    Scanner in = new Scanner(System.in);
    
    //inscribir al estudiante
    @Override
    public void inscribirEst() {
       Estudiante est = new Estudiante();
           
           System.out.println("\nCual es tu nombre?");
           est.setNombre(in.nextLine());
           

           System.out.println("\nCual es tu matricula?");
           est.setMatricula(in.nextLine());
           estudiantes3.add(est);      
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
         
         
         if(idRet >= estudiantes3.size()){
             txt.mostrarOperacionNoValida();
             in.nextLine();
         } else{
             estudiantes3.remove(idRet);
         }
    }

    //mostrar al estudiante inscrito
    @Override
    public void mostrarEst() {
                Estudiante est;
      
        //ciclo for
               for( int x = 0; x < estudiantes3.size(); x++){
                   
                   est = estudiantes3.get(x);
                   System.out.println( x  +" => "   +"Nombre: " +est.getNombre()  
                           +"  "   +"Matricula: " +est.getMatricula());
               }
               
               //para calificar al est
               calf.calificarEst();
    }
}
