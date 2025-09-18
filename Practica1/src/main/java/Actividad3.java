import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args){
        //Solicitar nombre, edad y poner  mensaje de bienvenida personalizado
        Scanner cs = new Scanner (System.in);
        System.out.println("Ingrese su nombre:     ");
        String nombre = cs.nextLine();
        System.out.println("Ingrese su edad:");
        int edad = cs.nextInt ();
        System.out.println("Hola" + nombre+  "bienvenid@  al nuevo curso de DAM 2025");
    }
}