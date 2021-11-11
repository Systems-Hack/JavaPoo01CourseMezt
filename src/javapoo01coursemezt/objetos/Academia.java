
package javapoo01coursemezt.objetos;

public class Academia {
    
    private String id;
    private String nombre;

    public Academia(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Academia() {
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

    @Override
    public String toString() {
        return "Academia{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
    
}
