public class Actividad {
    private String ciudad;
    private String nombre;
    private String tipo;

    public Actividad(String ciudad, String nombre, String tipo) {
        this.ciudad = ciudad;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }


    public String toString() {
        return nombre + " - " + tipo + " (" + ciudad + ")";
    }
}


