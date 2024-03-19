package panaderia;

public class Pan {
    // Variables
    private String nombre;
    private float precio;

    // Getters
    public String getNombre() {
        return nombre;
    }
    public float getPrecio() {
        return precio;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    // Constructor
    public Pan(){
        this("Barra", 0.50f);
    }
    public Pan(String nombre){
        this( nombre , 0.50f );
    }
    public Pan(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
    }
}
