import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ClassPractica5 {
    public static void main(String[] args) {
//Ejercicio hecho con programación funcional
        List<String> palabras = Arrays.asList("Java", "Stream", "Ejemplo", "Programación", "Funcional");

        palabras.stream().filter(palabra -> palabra.length() > 5).forEach(System.out::println);




    }
}
