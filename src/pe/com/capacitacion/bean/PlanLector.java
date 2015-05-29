
package pe.com.capacitacion.bean;


public class PlanLector extends Libro {
    private String gradoEstudio;
    
    public PlanLector(Libro lib,String gradoEstudio) {
        super(lib);
        this.gradoEstudio = gradoEstudio;
    }
    
 
    public String getGradoEstudio() {
        return gradoEstudio;
    }
    public void setGradoEstudio(String gradoEstudio) {
        this.gradoEstudio = gradoEstudio;
    }
    public String toString(){
        return super.toString()+"\nGrado de Estudio : "+this.getGradoEstudio();
    }

//crear un PlanLector que es un Libro, tiene el grado de estudio

}
