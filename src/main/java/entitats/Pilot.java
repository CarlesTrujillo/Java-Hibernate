package entitats;

import jakarta.persistence.Entity;
import java.sql.Date;

/**
 *
 * @author FPShare
 */
@Entity
public class Pilot extends Soldat implements interficies.TesteableEntity {

    private String clavePiloto;
    private float distanciaPilotadaKM;

    //@OneToOne
    //private Pilotada pilotada;    
    
    public Pilot(String clavePiloto, float distanciaPilotadaKM, int idSoldado, int edad, String nombreClave, float versionTransmisor, Date fechaAlistamiento, boolean operativo) {
        super(idSoldado, edad, nombreClave, versionTransmisor, fechaAlistamiento, operativo);
        this.clavePiloto = clavePiloto;
        this.distanciaPilotadaKM = distanciaPilotadaKM;
    }

    public String getClavePiloto() {
        return clavePiloto;
    }

    public void setClavePiloto(String clavePiloto) {
        this.clavePiloto = clavePiloto;
    }

    public float getDistanciaPilotadaKM() {
        return distanciaPilotadaKM;
    }

    public void setDistanciaPilotadaKM(float distanciaPilotadaKM) {
        this.distanciaPilotadaKM = distanciaPilotadaKM;
    }

    @Override
    public Integer getAtributIdentificador() {
        return idSoldado;
    }

    @Override
    public String getAtributString() {
        return nombreClave;
    }

    @Override
    public Float getAtributFloat() {
        return versionTransmisor;
    }

    @Override
    public Date getAtributDate() {
        return fechaAlistamiento;
    }

    @Override
    public Boolean getAtributBoolean() {
        return operativo;
    }

    @Override
    public void setAtributString(String s) {
        this.nombreClave = s;
    }

    @Override
    public void setAtributFloat(Float f) {
        this.versionTransmisor = f;
    }

    @Override
    public void setAtributDate(Date d) {
        this.fechaAlistamiento = d;
    }

    @Override
    public void setAtributBoolean(Boolean b) {
        this.operativo = b;
    }

}
