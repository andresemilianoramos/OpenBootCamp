import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {

        Map<String, String> personas = new HashMap<>();

        personas.put("y6378931x","Andres Ramos");
        personas.put("y6785456x","Santiago Cevallos");

        System.out.println(personas);

        // para iterar sobre el mapa:

        for (String value: personas.keySet()) {
            System.out.println(value);
        }
        for (String value: personas.values()){
            System.out.println(value);
        }
        for (Map.Entry<String, String>pair : personas.entrySet()){
            System.out.println(pair.getKey() + " / " + pair.getValue());
        }
    }
}
