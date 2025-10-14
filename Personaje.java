public class Personaje {
    private String nombre;
    private String secreto; // dato privado que no cualquiera puede cambiar

    public Personaje(String n, String s) {
        this.nombre = n;
        this.secreto = s;
    }

    public void saludar() {
        System.out.println("Yo soy " + nombre + " y estoy por las calles de Los Santos.");
    }

    public void accion() {
        System.out.println(nombre + " camina por la ciudad sin hacer mucho.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        if (n != null && n.trim().length() > 2) {
            this.nombre = n.trim();
        } else {
            System.out.println("Nombre no válido (debe tener más de 2 caracteres).");
        }
    }

    public String getSecreto() {
        return secreto; // Devolver el verdadero secreto, no "Secreto" fijo
    }

    public void cambiarSecreto(String nuevo) {
        if (nuevo != null && nuevo.trim().length() > 3) {
            this.secreto = nuevo.trim();
            System.out.println("El secreto fue actualizado.");
        } else {
            System.out.println("No se puede poner un secreto tan corto.");
        }
    }
}
