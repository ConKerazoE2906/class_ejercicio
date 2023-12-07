public class Hobbies {
    String Nombre;
    String Tipo;
    int TiempoDedicado;

    public Hobbies(String nombre, String tipo, int tiempoDedicado) {
        Nombre = nombre;
        Tipo = tipo;
        TiempoDedicado = tiempoDedicado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getTiempoDedicado() {
        return TiempoDedicado;
    }

    public void setTiempoDedicado(int tiempoDedicado) {
        TiempoDedicado = tiempoDedicado;
    }
}
