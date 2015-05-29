
package pe.com.capacitacion.biblioteca;

import java.util.Scanner;
import pe.com.capacitacion.bean.Libro;
import pe.com.capacitacion.bean.PlanLector;
import pe.com.capacitacion.dao.InterfaceLibroDao;
import pe.com.capacitacion.dao.InterfacePlanLectorDao;
import pe.com.capacitacion.dao.LibroDao;
import pe.com.capacitacion.dao.PlanLectorDao;

public class Biblioteca {

    public static void main(String[] args) {
        int opc1,anio=0;
        String cadena;
        Scanner entrada=new Scanner(System.in);
        InterfaceLibroDao libroDao = new LibroDao();
        InterfacePlanLectorDao planDao=new PlanLectorDao();
        do{
             Libro libro ;
             PlanLector planLect;
            do{
                System.out.println("-----------------------------");
                System.out.println("MENU BIBLIOTECA(Buscar Libro)");
                System.out.println("<1>Buscar Libro Por Autor");
                System.out.println("<2>Buscar Libro Por Edicion");
                System.out.println("<3>Buscar Libro Por Titulo");
                System.out.println("<4>Buscar Libro Por Anio");
                System.out.println("<5>Buscar Libro Por Grado de Estudio(inicial,primaria o secunadria");
                System.out.println("<6>Salir");
                System.out.print("Ingresar Opcion : ");
                opc1=entrada.nextInt();
             }while(opc1<1||opc1>6);
                switch(opc1){
                    case 1:
                           System.out.println("Ingresar Autor:");
                           cadena=entrada.next();
                           System.out.println(cadena);
                           libro = libroDao.buscarPorAutor(cadena);
                           if(!(libro==null))
                           {
                               System.out.println(libro.toString()); 
                           }else
                           {
                               System.out.println("No se encntro Libro por ese Autor");
                           }
                           break;
                    case 2:
                           entrada.nextLine();
                           System.out.println("Ingresar Edicion:");
                           cadena=entrada.nextLine();//antes de ejecutar la entrada  de nextLine poner esto esto va despues de ingresar in int ,float,double
                           System.out.println(cadena);
                           libro = libroDao.buscarPorEdicion(cadena);
                           if(!(libro==null))
                           {
                               System.out.println(libro.toString());
                           }else
                           {
                               System.out.println("No se encntro Libro por ese Edicion");
                           }
                           break;
                     case 3:
                           entrada.nextLine();//antes de ejecutar la entrada  de nextLine poner esto esto va despues de ingresar in int ,float,double
                           System.out.println("Ingresar Titulo:");
                           cadena=entrada.nextLine();
                           System.out.println(cadena);
                           libro = libroDao.buscarPorTitulo(cadena);
                           if(!(libro==null))
                           {
                               System.out.println(libro.toString()); 
                           }else
                           {
                               System.out.println("No se encntro Libro por ese Edicion");
                           }
                           break;
                      case 4:
                           entrada.nextLine();//antes de ejecutar la entrada  de nextLine poner esto esto va despues de ingresar in int ,float,double
                           System.out.println("Ingresar Anio:");
                           anio=entrada.nextInt();
                           System.out.println(anio);
                           libro = libroDao.buscarPorAnio(anio);
                           if(!(libro==null))
                           {
                               System.out.println(libro.toString()); 
                           }else
                           {
                               System.out.println("No se encntro Libro por ese Edicion");
                           }
                           break;
                      case 5:
                           entrada.nextLine();//antes de ejecutar la entrada  de nextLine poner esto esto va despues de ingresar in int ,float,double
                           System.out.println("Ingresar Grado de Estudios:");
                           cadena=entrada.next();
                           System.out.println(cadena);
                           planDao.buscarPorGradoEstudio(cadena); 
                           break;      
                     case 6: System.out.println(" Gracias!!!");
                         
                }
           
        }while(opc1!=6);
       
        
    }
    
}
