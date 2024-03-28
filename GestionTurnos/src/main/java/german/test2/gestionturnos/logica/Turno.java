package german.test2.gestionturnos.logica;

import java.util.Date;
import javax.persistence.*;

@Entity
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numero;
    private Date fecha;
    private String descripcion;
    private String estado;
    
    @ManyToOne
    private Ciudadano ciudadano;

    public Turno() {
    }

    public Turno(int numero, Date fecha, String descripcion, String estado, Ciudadano ciudadano) {
        this.numero = numero;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
        this.ciudadano = ciudadano;
    }

    public int getNumero() {
        return numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    
    
    
}
