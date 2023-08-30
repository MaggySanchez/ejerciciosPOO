public class Usuario {
    private String nombre;
    private String clave;
    private String correo;

    public Usuario(String nombre, String clave, String correo) {
        this.nombre = nombre;
        this.clave = clave;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", clave='" + clave + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
