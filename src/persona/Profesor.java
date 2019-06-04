
package persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Profesor  implements Persona {
    //objetos
        Scanner in = new Scanner(System.in);
        
    //arreglos
         public static ArrayList<Profesor> profesores = new ArrayList<Profesor>();
        
    
    //var
       private String nombre; 
       private String codigo; 
       private String cedula; 
       private String seccion;
       private String materia;

       
       //get and set
    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }  

    //inscribir al profesor
    @Override
    public void inscribir() {
               Profesor pro = new Profesor();
        
        System.out.print("\nNombre del profesor: ");
        pro.setNombre(in.nextLine());
        
        System.out.print("\nCodigo del profesor: ");
        pro.setCodigo(in.nextLine());
        
        System.out.print("\nCedula del profesor: ");
        pro.setCedula(in.nextLine());
        
        System.out.print("\nSeccion del profesor: ");
        pro.setSeccion(in.nextLine());
        
        System.out.print("\nMateria del profesor: ");
        pro.setMateria(in.nextLine());
        
        profesores.add(pro);
        System.out.print("\n-- El profesor se agrego sin errores -- (Precione cualquier tecla)");
        in.nextLine();
    }

    //mostrar al profesor
    @Override
    public void mostrar() {
                Profesor pro;
        
        //ciclo for
        for(int i = 0; i < profesores.size(); i++){
            pro = profesores.get(i);
            
            System.out.println("Nombre: " +pro.getNombre());
            System.out.println("Codigo: "+pro.getCodigo());
            System.out.println("Cedula: "+pro.getCedula());
            System.out.println("Seccion: "+pro.getSeccion());
            System.out.println("Materia: "+pro.getMateria());
            System.out.println();
            System.out.println("\n  ----Escribe cualquier tecla----");
            in.nextLine();
        }
    }

    //retirarprofesor (no lo tengo aplicado en esta version)
    @Override
    public void retirar() {
       System.out.println("No puedes retirar a un profesor");
    }
}
