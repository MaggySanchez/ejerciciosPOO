import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        agregarUsuario();
    }

    public static void agregarUsuario() {
        Scanner scanner = new Scanner(System.in);
        List<Object> usuarios = new ArrayList<>();
        boolean repetir = true;
        do {
            System.out.println("Ingrese su nombre de usuario");
            String nuevoNombre = scanner.nextLine();
            System.out.println("Ingrese su clave");
            String nuevaCLave = scanner.nextLine();
            System.out.println("Ingrese su email");
            String nuevoEmail = scanner.nextLine();
            Usuario nuevoUsuario = new Usuario(nuevoNombre, nuevaCLave, nuevoEmail);
            usuarios.add(nuevoUsuario);
            System.out.println("¿Desea agregar un nuevo usuario?");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("NO")) {
                repetir = false;
            }
        } while (repetir);
        System.out.println(usuarios);
    }
}