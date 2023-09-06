package Clases;

import java.util.Date;

public class Articulo {
    private String titulo;
    private String autor;
    private String tema;
    private Date fecha;

    public Articulo(String titulo, String autor, String tema, Date fecha) {
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", tema='" + tema + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
