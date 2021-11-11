
package javapoo01coursemezt.objetos;

public class Clase {
    
    private String id;
    private String nombreClase;
    private String descripcion;
    private int horasEstudio;

    public Clase() {
    }

    public Clase(String id, String nombreClase, String descripcion) {
        this.id = id;
        this.nombreClase = nombreClase;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
}
