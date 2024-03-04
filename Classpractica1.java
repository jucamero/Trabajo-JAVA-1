import java.util.Scanner;

public class Classpractica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double num1,num2,num3,promedio;
        String nombre;

        System.out.println("Ingrese su nombre");
        nombre = scanner.next();
        System.out.println("Ingrese el primer número");
        num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número");
        num2 = scanner.nextDouble();
        System.out.println("Ingrese el tercer número");
        num3 = scanner.nextDouble();
        promedio = (num1+num2+num3)/3;
        System.out.println("El promedio de los números de " + nombre + " es " + promedio);




    }
}
