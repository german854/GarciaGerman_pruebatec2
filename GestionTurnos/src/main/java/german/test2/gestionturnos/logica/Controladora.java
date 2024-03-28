package german.test2.gestionturnos.logica;

import german.test2.gestionturnos.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
        
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
     public void crearCiudadano (Ciudadano ciudadano) {
        controlPersis.crearPersona(ciudadano);
    }
    
    public void eliminarCiudadano (String nombre) {
        controlPersis.eliminarPersona(nombre);
    }
    
    public List<Ciudadano> traerCiudadanos () {
        return controlPersis.traerCiudadano();
    }
    
    public void editarCiudadano (Ciudadano ciudadano) {
        controlPersis.editarCiudadano(ciudadano);
    }
    
}

