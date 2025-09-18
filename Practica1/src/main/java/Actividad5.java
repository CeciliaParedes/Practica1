import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args){
        //Dos números enteros y mostrar las cuatro operaciones básicas
        int numero1;
        int numero2;
        int resultado;

        Scanner usuario = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        numero1 = usuario.nextInt();
        System.out.println("Ingrese el segundo número");
        numero2 = usuario.nextInt();
                resultado = numero1 + numero2;
                System.out.println("El resultado es:" + resultado);
                resultado = numero1 - numero2;
                System.out.print("El resultado es:" + resultado);
                resultado = numero1 * numero2;
                System.out.println("El resultado es:" + resultado);
                resultado = numero1 / numero2;
                System.out.println("El resultado es:" + resultado);




    }
}
