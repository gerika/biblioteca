
package pe.com.capacitacion.dao;

import pe.com.capacitacion.bean.Libro;

public interface InterfaceLibroDao {
    
    public Libro buscarPorAutor(String autor);
    public Libro buscarPorEdicion(String edicion);
    public Libro buscarPorTitulo(String titulo);
    public Libro buscarPorAnio(int anio);
 
}
