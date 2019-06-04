
package cuerpo;


public class Textos {
    
    public void mostrarMenu(){
        System.out.println("\n********************************");
       System.out.println("*Bienvenido/a al menu de inicio*");
       System.out.println("********************************");
       System.out.println("x para salir");
       System.out.println("\nUsted es un profesor, un estudiante o un admin?");
    }
    
    
    public void mostrarOperacionNoValida(){
        System.out.println("Opcion no valida");
        System.out.println("\n    ----Escribe cualquier tecla----");
    }
    
    
    public void mostrarSe_a_Inscrito(){
        System.out.println("\n----Se ha inscrito exitosamente----");
        System.out.println("\n  ----Escribe cualquier tecla----");
    }
    
    
    public void mostrarSeleccionarSeccion(){
        System.out.println("\nEn que seccion deseas estar (elija con los numeros)");
        System.out.print("   " +"*Seccion 1*" +"   " 
        +"*Seccion 2*" +"   " +"*Secion 3*\n");
    }
    
    
    public void mostrarSeleccionarMateria(){
        System.out.println("\nEn que asignatura deseas inscribirte (elija con los numeros)");
        System.out.print("   " +"*Programacion 1*" +"   " 
        +"*Programacion 2*" +"   " +"*Programacion 3*\n");
    }
    
    public void mostrarSeleccionarOperacion(){
        System.out.println("\nQue operacion desea realizar?");
        System.out.print("   " +"*Inscribirme*" +"   " +"*Retirar*" +"   "
        +"*Solicitar ausencia*\n");
    }
}
