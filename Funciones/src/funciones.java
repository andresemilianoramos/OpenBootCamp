public class funciones {
    public static void main(String[] args) {
        holamundo();

        holamundo("Andres");
        holamundo("Miguel");

        String texto = devolverHola();
        System.out.println(texto);
    }

    public static void holamundo(){
        System.out.println("hola mundo");
    }
    public static void holamundo(String nombre){
        System.out.println("hola "+ nombre);
    }
    private static String devolverHola(){
        // ya que no es void la salida
        //se expresa con return
        return "hola";
    }
}
