import Clases.Cliente;
import Exeptions.ExeptionInvalidProduct;
import Exeptions.ExeptionMaximunSize;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ExeptionInvalidProduct, ExeptionMaximunSize {
        Cliente cliente1 = new Cliente("Ricardo","Sanchez","ricarito@gmail.com");
        Cliente cliente2 = new Cliente("Lucas","Gomes","lucas.g@gmail.com");

        try {
            cliente1.setEdad(15);
            System.out.println(cliente1.getEdad());
        } catch (IllegalArgumentException e) {
            System.err.println("La edad ingresada es invalida");
        }

        try {
            cliente2.setEdad(-3);
            System.out.println(cliente2.getEdad());
        } catch (IllegalArgumentException e) {
            System.err.println("La edad ingresada es invalida");
        }

        try {
            cliente1.ingresarProducto();
        } catch (ExeptionInvalidProduct e) {
            System.err.println("Codigo incorrecto");
        } catch (ExeptionMaximunSize x) {
            System.err.println("El carrito esta lleno");
        }

    }
}