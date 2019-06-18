import java.util.Arrays;
import java.util.List;

/**
 * Created by Andrés Ramos Seguí.
 */

public class Main {


    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        lista.stream().forEach((n) -> System.out.println(n));

        () -> System.out.println("Zero parameter");


        // -> System.out.println(message);
        //((message) -> System.out.println(message));

        lista.stream().filter((x) -> x >5).forEach((n) -> System.out.println(n));
    }

}
