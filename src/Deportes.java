public class Deportes extends Hobbies{
    public Deportes(String nombre, String tipo, int tiempoDedicado) {
        super(nombre, tipo, tiempoDedicado);
    }

    public void nombre(){
        System.out.println("El nombre del deporte es: "+ this.getNombre());

    }
    public void tipo(){
        System.out.println("El nombre del deporte es: "+ this.getTipo());
    }
    public void tiempoDedicado(){
        System.out.println("El tiempo dedicado es de: "+ this.getTiempoDedicado());

    }
}
