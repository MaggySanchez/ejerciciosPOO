package Exceptions;

public class AlumnoRepetidoException extends Exception{
    public AlumnoRepetidoException() {
        System.err.println("El alumno ya existe");
    }
}
