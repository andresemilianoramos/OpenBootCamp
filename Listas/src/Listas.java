import java.util.ArrayList;
import java.util.List;

public class Listas {
    // trabajaremos con listas dinamicas...

    public static void main(String[] args) {
        // tenemos la interfaz LIST<>,
        // la cual posee una serie de metodos


        // necesitamos una implementacion: ArrayList<>()

        List<String> nombres = new ArrayList<>();

        // con el metodo ADD agregamos elementos:

        nombres.add("Andres");
        nombres.add("Ramon");
        nombres.add("Santiago");
        nombres.add("Miguel");

        System.out.println(nombres);

        //iteramos utilizando el bucle FOR- EACh:

        for (String nombre : nombres
        ) {
            System.out.println(nombre);
        }

    }
}
