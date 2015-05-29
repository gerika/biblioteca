
package pe.com.capacitacion.dao;

import pe.com.capacitacion.bean.PlanLector;
import pe.com.capacitacion.util.CargarLibrosPlanLector;


public class PlanLectorDao implements InterfacePlanLectorDao {
     PlanLector planLector[]=new PlanLector[10];
    public PlanLectorDao() {
        CargarLibrosPlanLector librosPlan=new CargarLibrosPlanLector() ;
        this.planLector=librosPlan.getDataPlanLector();
    }
    public void buscarPorGradoEstudio(String gradoEstudio) {
        PlanLector planLibroLector=null;
        for(int i=0;i<this.planLector.length;i++){
            if(this.planLector[i].getGradoEstudio().equalsIgnoreCase(gradoEstudio)){
                planLibroLector=this.planLector[i];
                System.out.println((i+1)+".-"+planLibroLector.toString());
            }
        }
       
    }
    
}
