
package persona;

import cuerpo.Calificacion;
import cuerpo.Textos;
import java.util.Scanner;
import java.util.ArrayList;


public  class Estudiante implements Persona{
    //arreglos
       public static ArrayList<Estudiante> estudiantes1 = new ArrayList<Estudiante>();
       public static ArrayList<Estudiante> estudiantes2 = new ArrayList<Estudiante>();
       public static ArrayList<Estudiante> estudiantes3 = new ArrayList<Estudiante>();
    
    
    //var    
    private String nombre;
    private String matricula;
    
    //objetos
    Scanner in = new Scanner(System.in);
        Textos txt = new Textos();
        Calificacion calf = new Calificacion();
        
    
    //get and set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    

       //inscribir al estudiante
    @Override
    public void inscribir(){

    }
    
    
        //retirar materia estudiante
    @Override
    public void retirar(){
        System.out.println("Digite tu posicion como estudiante");
         int idRet = in.nextInt();  
         
         
         if(idRet >= estudiantes1.size()){
             txt.mostrarOperacionNoValida();
             in.nextLine();
         } else{
             estudiantes1.remove(idRet);
         }
    }
    
    
        //mostrar alestudiante y calificarlo despues
    @Override
    public void mostrar(){
        Estudiante est;
        
        //para volverlo true menu del yes o no
       // salir = true;
        
        
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
