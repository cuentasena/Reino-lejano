public class Hacker extends Personaje {

    public Hacker(String n, String s) {
        super(n, s);
    }

    public void accion() {
        System.out.println(getNombre() + " hackea las camaras del banco y entra al sistema");
    }

}