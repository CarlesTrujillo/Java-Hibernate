package entitats;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author FPShare
 * @version 1.0
 *
 * Clase Aeronave para la creación de Aeronaves y después utilizarla en clases
 * inferiores.
 */
@Entity
public abstract class Aeronau implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idNave", nullable = false, unique = true)
    protected int idNave;
    
    @Column(name = "nombreNave")
    protected String nombreNave;
    
    @Column(name = "kmrecorridos")
    protected float kmRecorridos;
    
    @Column(name = "fechaconstruccion")
    protected Date fechaConstruccion;
    
    @Column(name = "operativa")
    protected boolean operativa;
    
    @Column(name = "estado")
    protected int estado;
    
   @ManyToMany(cascade = {CascadeType.ALL}, mappedBy = "aeronaus")
    protected List<Missio> missions;

    public Aeronau(int idNave, String nombreNave, float kmRecorridos, Date fechaConstruccion, boolean operativa, int estado, List<Missio> missions) {
        this.idNave = idNave;
        this.nombreNave = nombreNave;
        this.kmRecorridos = kmRecorridos;
        this.fechaConstruccion = fechaConstruccion;
        this.operativa = operativa;
        this.estado = estado;
        this.missions = missions;
    }

    public int getIdNave() {
        return idNave;
    }

    public void setIdNave(int idNave) {
        this.idNave = idNave;
    }

    public String getNombreNave() {
        return nombreNave;
    }

    public void setNombreNave(String nombreNave) {
        this.nombreNave = nombreNave;
    }

    public float getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(float kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public Date getFechaConstruccion() {
        return fechaConstruccion;
    }

    public void setFechaConstruccion(Date fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public boolean isOperativa() {
        return operativa;
    }

    public void setOperativa(boolean operativa) {
        this.operativa = operativa;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public List<Missio> getMissions() {
        return missions;
    }

    public void setMissions(List<Missio> missions) {
        this.missions = missions;
    }

}
