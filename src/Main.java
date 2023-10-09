import Clases.Alumno;
import Exceptions.AlumnoRepetidoException;
import Exceptions.NotaValidaException;

import java.util.*;

public class Main {
    public static void main(String[] args) throws AlumnoRepetidoException, NotaValidaException {
        Scanner scanner = new Scanner(System.in);

        /*int num1, num2, resultado;

        System.out.println("Ingrese el primer numero, debe ser entero. ");
        num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero, deber ser entero.");
        num2 = scanner.nextInt();

        try {
            resultado = num1/num2;
            System.out.println("El resultado de la division es " + resultado);
        }
        catch (ArithmeticException exception) {
            System.err.println("Se intento dividir por 0");
        }

        System.out.println("Ingrese un numero");
        String numero;

        numero = scanner.nextLine();
        System.out.println(numero.getClass());

        try {
            Integer numeroTransformado = Integer.parseInt(numero);
            System.out.println(numeroTransformado + " es " +numeroTransformado.getClass());
        }
        catch (NumberFormatException exception) {
            System.err.println("El numero ingresado no es valido.");
        }*/

        Set <Alumno> alumnos = new HashSet<>();

        Alumno alumno1 = new Alumno("Camila gomez");
        Alumno alumno2 = new Alumno("Tamara Gomez");
        Alumno alumno3 = new Alumno("Romina Acevedo");

        agregarAlumno(alumnos, alumno1);
        agregarAlumno(alumnos, alumno2);
        agregarAlumno(alumnos,alumno3);
        //agregarAlumno(alumnos,alumno1);

        System.out.println(alumnos);

        buscarAlumno(alumnos);
        buscarAlumno(alumnos);

        //alumno1.agregarCalificacion(20.0);
        alumno1.agregarCalificacion(7.5);
        //alumno1.agregarCalificacion(-1.5);
        alumno1.agregarCalificacion(6.5);
        alumno1.agregarCalificacion(8.0);
        alumno1.sacarPromedio();




    }

    public static void buscarAlumno(Set<Alumno> alumnos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno que desea ubicar.");
        String nombre = scanner.nextLine();

        try {
            for (Alumno alumno: alumnos) {
                if (Objects.equals(alumno.getNombre(), nombre)) {
                    System.out.println(alumno);
                }
            }
        }
        catch (NoSuchElementException exception) {
            System.err.println("El alumno no fue encontrado");
        }
        finally {
            System.out.println("Se ha realizado la busqueda.");
        }
    }

    public static void agregarAlumno(Set<Alumno> alumnos, Alumno alumno) throws AlumnoRepetidoException {
        if (alumnos.contains(alumno)) {
            throw new AlumnoRepetidoException();
        } else {
            alumnos.add(alumno);
            System.out.println("El alumno fue agregado correctamente.");
        }
    }

}