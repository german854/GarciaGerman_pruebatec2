package german.test2.gestionturnos.persistencia;


import german.test2.gestionturnos.logica.Ciudadano;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import german.test2.gestionturnos.persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    CiudadanoJpaController ciudadanoJPA = new CiudadanoJpaController();
    
        public void crearPersona (Ciudadano ciudadano) {
        ciudadanoJPA.create(ciudadano);
    }
    
    public void eliminarPersona (String nombre) {
        try {
            ciudadanoJPA.destroy(nombre);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Ciudadano> traerCiudadanos () {
    return ciudadanoJPA.findCiudadanoEntities();
    }
    
    public void editarPersona (Ciudadano ciudadano) {
        try {
            ciudadanoJPA.edit(ciudadano);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Ciudadano> traerCiudadano() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void editarCiudadano(Ciudadano ciudadano) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
