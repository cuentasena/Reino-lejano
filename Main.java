import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("GTA Los Santos ");
        System.out.print("eliga el nombre del personaje: ");
        String nombre = sc.nextLine();

        System.out.print("Guarda un secreto del personaje: ");
        String secreto = sc.nextLine();

        System.out.println("Elige tipo de personaje:");
        System.out.println("1. Pandillero");
        System.out.println("2. Policia");
        System.out.println("3. Hacker");
        System.out.print("Opcion: ");
        int tipo = sc.nextInt();

        Personaje p;

        if (tipo == 1) {
            p = new Gangster(nombre, secreto);
        } else if (tipo == 2) {
            p = new Policia(nombre, secreto);
        } else if (tipo == 3) {
            p = new Hacker(nombre, secreto);
        } else {
            System.out.println("No existe ese tipo, se creara un personaje npc (no jugable)");
            p = new Personaje(nombre, secreto);
        }

        p.saludar();
        p.accion();

        System.out.println("Intentando ver el secreto del personaje");
        System.out.println(p.getSecreto());

        System.out.println("Intentando cambiar secreto");
        p.cambiarSecreto("1234planB");

        sc.close();
        
        // p.secreto = "hack"; // no deja, en private
        // System.out.println(p.secreto); // error
    }
}
