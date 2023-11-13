package TestEntity;

import Clases.Cliente;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    static Cliente cliente3;

    @BeforeAll
    static void crearCliente(){
        System.out.println("Comienza el test");
        cliente3 = new Cliente("Roberto","Carlos","cualquiera@gmail.com");
        cliente3.setEdad(25);
    }

    @ParameterizedTest
    @ValueSource (ints = {-3, -15, -1})
    void setEdadExceptions(Integer edad) {
        assertThrows(IllegalArgumentException.class, ()-> cliente3.setEdad(edad));
    }

    @ParameterizedTest
    @ValueSource (ints = {5, 18})
    void setEdadValoresValidos(Integer edad) {
        assertEquals(cliente3.getEdad(), edad);
    }
   @Test
    void mostrarNombreCompleto() {
        assertEquals("Carlos, Roberto.", cliente3.mostrarNombreCompleto());
    }

    @Test
    void nombreYPrecioProductos() {
    }

    @ParameterizedTest
    void ingresarProducto() {
    }

    @ParameterizedTest
    void esMayor() {
    }
}