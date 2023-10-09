package Exceptions;

public class NotaValidaException extends Exception {
    public NotaValidaException() {
        System.err.println("Esta nota no es valida");
    }
}
