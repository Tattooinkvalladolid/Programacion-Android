package es.officetattoo.www.clase19recycleviewtarea1movies;

public class Movie {


    String titulo;
    String genero;
    String descripcion;
    String imagen;

    //Constructor de clase Movie
    public Movie(String titulo, String genero, String descripcion, String imagen) {
        this.titulo = titulo;
        this.genero = genero;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    //Los Geters de las variables
    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //Los Seter de las variables
    public String getImagen() {
        return imagen;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

}
