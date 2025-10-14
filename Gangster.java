public class Gangster extends Personaje {

    public Gangster(String n, String s) {
        super(n, s);
    }

    public void accion() {
        System.out.println(getNombre() + " roba un auto y se escapa por grove street");
    }
}