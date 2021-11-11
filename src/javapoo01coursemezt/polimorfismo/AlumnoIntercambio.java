
package javapoo01coursemezt.polimorfismo;

import java.util.Date;
import javapoo01coursemezt.herencia.Alumno;

public class AlumnoIntercambio extends Alumno {
    
    private String escuelaIntercambio;

    public AlumnoIntercambio(String escuelaIntercambio, String codigoAlumno, String nivelEstudio, String numeroInscripcion, Date fechaInsercion, String id, String nombre, String apellido, int edad, String documento) {
        super(codigoAlumno, nivelEstudio, numeroInscripcion, fechaInsercion, id, nombre, apellido, edad, documento);
        this.escuelaIntercambio = escuelaIntercambio;
    }

    public AlumnoIntercambio(String escuelaIntercambio, String codigoAlumno, String nivelEstudio, String numeroInscripcion, Date fechaInsercion) {
        super(codigoAlumno, nivelEstudio, numeroInscripcion, fechaInsercion);
        this.escuelaIntercambio = escuelaIntercambio;
    }
    
    @Override
    public void mostrarDatos () {
        System.out.println("DATOS DEL ALUMNO DE INTERCAMBIO");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Documento: " + getDocumento());
        System.out.println("Codigo de Alumno: " + getCodigoAlumno());
        System.out.println("Nivel Estudio: " + getNivelEstudio());
        System.out.println("Numero Inscripcion: " + getNumeroInscripcion());
        System.out.println("Fecha Insercion: " + getFechaInsercion());
        System.out.println("Escuela de intercambio: " + escuelaIntercambio);
    }
    
    @Override
    public String mostrarDatosInLine () {
        return "Nombre: " + getNombre() + " Apellido: " + getApellido() + " Edad: " + getEdad() + "Documento: " + getDocumento()
                + " Codigo de Alumno: " + codigoAlumno + " Nivel Estudio: " + nivelEstudio + " Numero Inscripcion: " + numeroInscripcion
                + " Fecha Insercion: " + fechaInsercion + " Escuela de Intercambio: " + escuelaIntercambio;
    }

    public String getEscuelaItercambio() {
        return escuelaIntercambio;
    }

    public void setEscuelaItercambio(String escuelaItercambio) {
        this.escuelaIntercambio = escuelaItercambio;
    }

    @Override
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    
    
    
    
}
