public class Policia extends Personaje {

    public Policia(String n, String s){
        super(n, s);
    }

    public void accion(){
        System.out.println(getNombre() + " persigue a los sospechosos ");
    }
}