import Clases.Cuenta;
import Clases.Persona;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(4569,5002.00);
        Cuenta cuenta2 = new Cuenta(4569,5002.00);
        Cuenta cuenta3 = new Cuenta(8964, 89663.00);
        Cuenta cuenta4 = new Cuenta(4569,96512.53);
        Cuenta cuenta5 = new Cuenta(9991, 1000.65);
        Cuenta cuenta6 = new Cuenta(8410, 963.25);
        Persona persona1 = new Persona("Magali", "Sanchez", 27);
        persona1.getNombreCompleto();
        persona1.esMayorDeEdad();
        persona1.agregarCuenta(cuenta1);
        persona1.agregarCuenta(cuenta2);
        persona1.agregarCuenta(cuenta3);
        persona1.agregarCuenta(cuenta4);
        persona1.agregarCuenta(cuenta5);
        persona1.agregarCuenta(cuenta6);
        persona1.getSaldoTotal();
        persona1.mostrarCuentas();
    }
}