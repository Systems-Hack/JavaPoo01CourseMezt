
package javapoo01coursemezt.herencia;

import java.util.Date;

public class Alumno extends Persona {
    
    protected String codigoAlumno;
    protected String nivelEstudio;
    protected String numeroInscripcion;
    protected Date fechaInsercion;

    public Alumno(String codigoAlumno, String nivelEstudio, String numeroInscripcion, Date fechaInsercion) {
        this.codigoAlumno = codigoAlumno;
        this.nivelEstudio = nivelEstudio;
        this.numeroInscripcion = numeroInscripcion;
        this.fechaInsercion = fechaInsercion;
    }

    public Alumno(String codigoAlumno, String nivelEstudio, String numeroInscripcion, Date fechaInsercion, String id, String nombre, String apellido, int edad, String documento) {
        super(id, nombre, apellido, edad, documento);
        this.codigoAlumno = codigoAlumno;
        this.nivelEstudio = nivelEstudio;
        this.numeroInscripcion = numeroInscripcion;
        this.fechaInsercion = fechaInsercion;
    }
    
    public void mostrarDatos () {
        System.out.println("DATOS DEL ALUMNO");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Documento: " + getDocumento());
        System.out.println("Codigo de Alumno: " + codigoAlumno);
        System.out.println("Nivel Estudio: " + nivelEstudio);
        System.out.println("Numero Inscripcion: " + numeroInscripcion);
        System.out.println("Fecha Insercion: " + fechaInsercion);
    }
    
    public String mostrarDatosInLine () {
        return "Nombre: " + getNombre() + " Apellido: " + getApellido() + " Edad: " + getEdad() + "Documento: " + getDocumento()
                + " Codigo de Alumno: " + codigoAlumno + " Nivel Estudio: " + nivelEstudio + " Numero Inscripcion: " + numeroInscripcion
                + " Fecha Insercion: " + fechaInsercion;
    }


    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
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
