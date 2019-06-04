
package cuerpo;

import java.util.Scanner;
import materias.*;
import persona.*;

public class Menu {

    //variables
    boolean seguir = true;
    private String tipo;
    private String accionEst;
    private String accionPro;
    private String materia;
    private String seccion;
    private String retirarMate;

    //objetos
    Admin adm = new Admin();
    Scanner in = new Scanner(System.in);
    Textos txt = new Textos();
    Mensaje mns = new Mensaje();
    Program1 prog1 = new Program1();
    Program2 prog2 = new Program2();
    Program3 prog3 = new Program3();

    //metodo menu
    public void menu() {
        while (seguir) {
            txt.mostrarMenu();
            tipo = in.nextLine();

            //caso #1 estudiante, profesor o admin
            switch (tipo) {
                case "admin Angel":
                    prog1.inscribirProfe_mostrarProfe();
                    break;

                case "admin Alberto":
                    prog1.inscribirProfe_mostrarProfe();
                    break;

                case "e":
                    txt.mostrarSeleccionarOperacion();
                    accionEst = in.nextLine();

                    //caso #2 insc, reti o solicitar
                    switch (accionEst) {
                        case "i":
                            txt.mostrarSeleccionarMateria();
                            materia = in.nextLine();

                            //caso #3
                            switch (materia) {
                                case "1":
                                    //datos del usuario
                                    prog1.inscribirEst();
                                    break;

                                case "2":
                                    //datos del usuario
                                    prog2.inscribirEst();
                                    break;

                                case "3":
                                    //datos del usuario
                                    prog3.inscribirEst();
                                    break;

                                default:
                                    txt.mostrarOperacionNoValida();
                                    break;
                            }

                            //caso #4 prog 1, prog 2, prog 3
                            switch (materia) {
                                case "1":
                                    txt.mostrarSeleccionarSeccion();
                                    seccion = in.nextLine();

                                    //caso #5 seccion 1, seccion 2, seccion 3
                                    switch (seccion) {
                                        case "1":
                                            txt.mostrarSe_a_Inscrito();
                                            in.nextLine();
                                            break;

                                        case "2":
                                            txt.mostrarSe_a_Inscrito();
                                            in.nextLine();
                                            break;

                                        case "3":
                                            txt.mostrarSe_a_Inscrito();
                                            in.nextLine();
                                            break;

                                        default:
                                            txt.mostrarOperacionNoValida();
                                            in.nextLine();
                                            break;
                                    }
                                    break;
                                case "2":
                                    txt.mostrarSeleccionarSeccion();
                                    seccion = in.nextLine();

                                    //caso #5 seccion 1, seccion 2, seccion 3
                                    switch (seccion) {
                                        case "1":
                                            txt.mostrarSe_a_Inscrito();
                                            in.nextLine();
                                            break;

                                        case "2":
                                            txt.mostrarSe_a_Inscrito();
                                            in.nextLine();
                                            break;

                                        case "3":
                                            txt.mostrarSe_a_Inscrito();
                                            in.nextLine();
                                            break;

                                        default:
                                            txt.mostrarOperacionNoValida();
                                            in.nextLine();
                                            break;
                                    }
                                    break;
                                case "3":
                                    txt.mostrarSeleccionarSeccion();
                                    seccion = in.nextLine();

                                    //caso #5 seccion 1, seccion 2, seccion 3
                                    switch (seccion) {
                                        case "1":
                                            txt.mostrarSe_a_Inscrito();
                                            in.nextLine();
                                            break;

                                        case "2":
                                            txt.mostrarSe_a_Inscrito();
                                            in.nextLine();
                                            break;

                                        case "3":
                                            txt.mostrarSe_a_Inscrito();
                                            in.nextLine();
                                            break;

                                        default:
                                            txt.mostrarOperacionNoValida();
                                            in.nextLine();
                                            break;
                                    }
                                    break;
                                default:
                                    txt.mostrarOperacionNoValida();
                                    in.nextLine();
                                    break;
                            }

                            break;

                        case "retirar":
                            System.out.println("Que materia deseas retirar? (programacio 1, 2 y 3)");
                            retirarMate = in.nextLine();

                            switch (retirarMate) {
                                case "1":
                                    prog1.retirarEst();
                                    break;

                                case "2":
                                    prog2.retirarEst();
                                    break;

                                case "3":
                                    prog3.retirarEst();
                                    break;

                                default:
                                    txt.mostrarOperacionNoValida();
                                    in.nextLine();
                                    break;
                            }

                            break;

                        case "solicitar":
                            mns.esribirAusencia();

                            break;

                        default:
                            txt.mostrarOperacionNoValida();
                            in.nextLine();
                            break;
                    }
                    break;

                case "p":
                    System.out.println("Digita la materia de programacion (1, 2 o 3) o VER para ver solicitudes de ausencias ");
                    accionPro = in.nextLine();
                    switch (accionPro) {
                        case "ver":
                            mns.mostraAusencia();
                            break;

                        case "1":
                            System.out.println("*-- Estos son tus estudiantes --*");
                            prog1.mostrarEst();
                            System.out.println();
                            break;

                        case "2":
                            System.out.println("*-- Estos son tus estudiantes --*");
                            prog2.mostrarEst();
                            System.out.println();
                            break;

                        case "3":
                            System.out.println("*-- Estos son tus estudiantes --*");
                            prog3.mostrarEst();
                            System.out.println();
                            break;

                        default:
                            txt.mostrarOperacionNoValida();
                            in.nextLine();
                            break;
                    }
                    break;

                case "x":
                    seguir = false;
                    break;

                default:
                    txt.mostrarOperacionNoValida();
                    in.nextLine();
                    break;
            }
        }
    }
}
