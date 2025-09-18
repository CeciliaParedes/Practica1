import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args){
        //Constante con el valor Pi calcular área de un círculo
        double Pi;
        Pi = 3.1416;
        double numero;
        double numero1;
        numero1 = 2;
        double resultado;
        Scanner sc = new Scanner( System.in);
        System.out.println("Ingrese el radio del círculo");
        numero = sc.nextDouble();
        System.out.println(" El área del círculo es:" +Pi*numero*numero);
        System.out.println(" El diámetro del círculo es:"  +numero*numero1);


    }
}
