
package pe.com.capacitacion.dao;

import pe.com.capacitacion.bean.Libro;
import pe.com.capacitacion.util.CargarLibros;


public class LibroDao implements InterfaceLibroDao {
    
    Libro libros[] = new Libro[10];
    
    public LibroDao () {
        CargarLibros dataLibros = new CargarLibros();
        this.libros = dataLibros.getDataLibros();       
    }
    
    public Libro buscarPorAutor(String autor) {
         Libro libro=null;
        for(int i=0; i< this.libros.length; i++) { 
            if(this.libros[i].getAutor().equalsIgnoreCase(autor)) {
                 libro=this.libros[i];
                break;
            }
        }
        return libro;
    }

    public Libro buscarPorEdicion(String edicion) {
        Libro libro=null;
        for(int i=0;i<this.libros.length;i++){
            if(this.libros[i].getEdicion().equalsIgnoreCase(edicion)){
                libro=this.libros[i];
                break;
            }
        }
        return libro;
    }

    public Libro buscarPorTitulo(String titulo) {
        Libro libro=null;
        for (int i=0;i<this.libros.length;i++){
            if(this.libros[i].getTitulo().equalsIgnoreCase(titulo)){
                libro=this.libros[i];
            }
        }
        return libro;  
    }

    public Libro buscarPorAnio(int anio) {
        Libro libro=null;
        for(int i=0;i<this.libros.length;i++){
           if(this.libros[i].getAnio()==anio){
              libro=this.libros[i];
           } 
        }
        return libro;
    }
}
