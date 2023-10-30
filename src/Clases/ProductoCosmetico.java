package Clases;

public class ProductoCosmetico extends Producto{
    private String pao;

    public ProductoCosmetico(int id, String nombre, Double precio, String descripcion, String pao) {
        super(id, nombre, precio, descripcion);
        this.pao = pao;
    }

    public ProductoCosmetico() {}

    public String getPao() {
        return pao;
    }

    public void setPao(String pao) {
        this.pao = pao;
    }

    @Override
    public String toString() {
        return "ProductoCosmetico{" +
                "pao='" + pao + '\'' +
                '}';
    }
}
