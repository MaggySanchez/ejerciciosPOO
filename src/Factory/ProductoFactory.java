package Factory;

import Clases.Producto;
import Clases.ProductoComestible;
import Clases.ProductoCosmetico;
import Exeptions.ExeptionInvalidProduct;

import java.util.Objects;

public class ProductoFactory {
    private static ProductoFactory instance;

    public static ProductoFactory getInstance() {
        if (instance == null) {
            instance = new ProductoFactory();
        }
        return instance;
    }

    public Producto crearProducto(String codigo) throws ExeptionInvalidProduct {
        Producto newProducto = null;
        if (Objects.equals(codigo, "01")) {
            newProducto = new ProductoComestible();
        } else if (Objects.equals(codigo, "02")) {
            newProducto = new ProductoCosmetico();
        } else {
            throw new ExeptionInvalidProduct();
        }
        return newProducto;
    }
}
