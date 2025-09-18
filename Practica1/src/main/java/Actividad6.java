import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese el número:");
        numero = teclado.nextInt();
        if (numero % 2 == 0)  {
            System.out.println(numero + "es un número par.");
        }else{
            System.out.println(numero + "  no es un número par.");
        }
    }
}
