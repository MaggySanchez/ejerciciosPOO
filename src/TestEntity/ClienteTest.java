package TestEntity;

import Clases.Cliente;
import Clases.Producto;
import Exeptions.ExeptionInvalidProduct;
import Exeptions.ExeptionMaximunSize;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    static Cliente cliente3;

    @BeforeAll
    static void crearCliente() throws ExeptionInvalidProduct, ExeptionMaximunSize {
        System.out.println("Comienza el test");
        cliente3 = new Cliente("Roberto","Carlos","cualquiera@gmail.com");
    }

    @ParameterizedTest
    @ValueSource (ints = {-3, -15, -1})
    void setEdadExceptions(Integer edad) {
        assertThrows(IllegalArgumentException.class, ()-> cliente3.setEdad(edad));
    }

    @ParameterizedTest
    @ValueSource (ints = {5, 18})
    void setEdadValoresValidos(Integer edad) {
        cliente3.setEdad(edad);
        assertSame(cliente3.getEdad(), edad);
    }
   @Test
    void mostrarNombreCompletoTest() {
        assertEquals("Carlos, Roberto.", cliente3.mostrarNombreCompleto());
    }

    @Test
    void nombreYPrecioProductosTest() {
        /*int contador = 0;
        for (String nyp: cliente3.nombreYPrecioProductos()) {
            assertSame(nyp, (cliente3.getProductos().get(contador).getNombre()) + ": " + cliente3.getProductos().get(contador).getPrecio());
            contador += 1;
        }*/
        /*No logre resolver esto porque al array de productos est vacio y no puede cargarlo en las precondiciones.*/
    }

    @Test
    void ingresarProductoInvalido() {
        /*Esta test al ingresar el producto por consola, no se como hacer el test*/
    }

    @Test
    void esMayorTest() {
        cliente3.setEdad(25);
        assertTrue(cliente3.esMayor());
        cliente3.setEdad(15);
        assertFalse(cliente3.esMayor());
    }
}