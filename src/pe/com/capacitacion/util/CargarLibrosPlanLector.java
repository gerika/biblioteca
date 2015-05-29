
package pe.com.capacitacion.util;

import pe.com.capacitacion.bean.Libro;
import pe.com.capacitacion.bean.PlanLector;


public class CargarLibrosPlanLector {
     PlanLector planLector[] = new PlanLector[10]; 
     CargarLibros dataLibros = new CargarLibros();
     Libro libros[]=new Libro[10];
     String plan[] = {"Inicial","primaria","Inicial","primaria","Inicial","primaria","secundaria","secundaria","Inicial","secundaria"};
   public CargarLibrosPlanLector() {
       this.libros=this.dataLibros.getDataLibros();
        for(int i=0;i<this.libros.length;i++){
            planLector[i]=new PlanLector(this.libros[i],plan[i]);
        }
   }
   
   public PlanLector[] getDataPlanLector() {       
       return this.planLector;
   }
}
