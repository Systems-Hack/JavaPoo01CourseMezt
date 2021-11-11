
package javapoo01coursemezt.herencia;

import java.util.Date;

public class Profesor extends Persona {
    
    private String codigoProfesor;
    private String aniosExperiencia;
    private String numeroInscripcion;
    private Date fechaInsercion;

    public Profesor(String codigoProfesor, String aniosExperiencia, String numeroInscripcion, Date fechaInsercion) {
        this.codigoProfesor = codigoProfesor;
        this.aniosExperiencia = aniosExperiencia;
        this.numeroInscripcion = numeroInscripcion;
        this.fechaInsercion = fechaInsercion;
    }

    public Profesor(String codigoProfesor, String aniosExperiencia, String numeroInscripcion, Date fechaInsercion, String id, String nombre, String apellido, int edad, String documento) {
        super(id, nombre, apellido, edad, documento);
        this.codigoProfesor = codigoProfesor;
        this.aniosExperiencia = aniosExperiencia;
        this.numeroInscripcion = numeroInscripcion;
        this.fechaInsercion = fechaInsercion;
    }

    public Profesor() {
    }

    public String getCodigoProfesor() {
        return codigoProfesor;
    }

    public void setCodigoProfesor(String codigoProfesor) {
        this.codigoProfesor = codigoProfesor;
    }

    public String getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(String aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public void setNumeroInscripcion(String numeroInscripcion) {
        this.numeroInscripcion = numeroInscripcion;
    }

    public Date getFechaInsercion() {
        return fechaInsercion;
    }

    public void setFechaInsercion(Date fechaInsercion) {
        this.fechaInsercion = fechaInsercion;
    }
    
    
}
