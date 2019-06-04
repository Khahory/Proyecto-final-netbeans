package materias;

import cuerpo.Calificacion;
import cuerpo.Textos;
import java.util.Scanner;
import persona.*;
import static persona.Estudiante.estudiantes2;

public class Program2 implements Materia {

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
        estudiantes2.add(est);
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

        if (idRet >= estudiantes2.size()) {
            txt.mostrarOperacionNoValida();
            in.nextLine();
        } else {
            estudiantes2.remove(idRet);
        }
    }

    //mostrar al estudiante inscrito
    @Override
    public void mostrarEst() {
        Estudiante est;

        //para volverlo true menu del yes o no
        // salir = true;
        //ciclo for
        for (int x = 0; x < estudiantes2.size(); x++) {

            est = estudiantes2.get(x);
            System.out.println(x + " => " + "Nombre: " + est.getNombre()
                    + "  " + "Matricula: " + est.getMatricula());
        }

        //para calificar al est
        calf.calificarEst();
    }
}
