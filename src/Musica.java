public class Musica extends Hobbies{
    public Musica(String nombre, String tipo, int tiempoDedicado) {
        super(nombre, tipo, tiempoDedicado);
    }

    public void tipo(){
        System.out.println("El genero de la canción es: "+ this.getTipo());
    }
    public void tiempoDedicado(){
        System.out.println("El tiempo dedicado es de: "+ this.getTiempoDedicado());

    }
}
