

package pe.com.capacitacion.bean;

//import java.io.Serializable;


public class Libro {
    
    private String autor;
    private String edicion;
    private String titulo;
    private int anio;
    
    public Libro(Libro lib) {
        this.autor   = lib.getAutor();
        this.edicion = lib.getEdicion();
        this.titulo  = lib.getTitulo();
        this.anio    = lib.getAnio();
    }
    
    public Libro(String autor, String edicion, String titulo, int anio) {
        this.autor   = autor;
        this.edicion = edicion;
        this.titulo  = titulo;
        this.anio    = anio;
    }

    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }


    public String getTitulo() {
        return titulo;
    }

 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }


    public void setAnio(int anio) {
        this.anio = anio;
    }
    public String toString(){
        return "Autor : "+this.getAutor()+"\nEdicion : "+this.getEdicion()+"\nTitulo : "+this.getTitulo()+"\nAnio : "+this.getAnio();
    }
    
}
