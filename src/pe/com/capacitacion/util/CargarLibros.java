
package pe.com.capacitacion.util;

import pe.com.capacitacion.bean.Libro;

public class CargarLibros {
    
   Libro libros[] = new Libro[10]; 
    
   public CargarLibros() {
       
       this.libros[0] = new Libro("Autor1", "1era Edicion", "Titulo01", 1990);
       this.libros[1] = new Libro("Autor2", "2da Edicion", "Titulo02", 1991);
       this.libros[2] = new Libro("Autor3", "3ra Edicion", "Titulo03", 1992);
       this.libros[3] = new Libro("Autor4", "4ta Edicion", "Titulo04", 1993);
       this.libros[4] = new Libro("Autor5", "5ta Edicion", "Titulo05", 1994);
       this.libros[5] = new Libro("Autor6", "6ta Edicion", "Titulo06", 1995);
       this.libros[6] = new Libro("Autor7", "10ma Edicion", "Titulo07", 1996);
       this.libros[7] = new Libro("Autor8", "11ava Edicion", "Titulo08", 1997);
       this.libros[8] = new Libro("Autor9", "12ava Edicion", "Titulo09", 1998);
       this.libros[9] = new Libro("Autor10", "13ava Edicion", "Titulo010", 1999);
   }
   
   public Libro[] getDataLibros() {       
       return this.libros;
   }
   
}
