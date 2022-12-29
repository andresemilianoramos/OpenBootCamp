public class TryCatch {
    public static void main(String[] args) {

        try {
            int result = 5/0;
        } catch (ArithmeticException e){
            e.printStackTrace(); /* si omitimos esto el codigo
            no idicaria cual es el error
            */
        } finally {
            System.out.println("cierre de recursos");// es como dejar un mensaje
        }

        System.out.println("\nEl programa corre aun teniendo errores");
    }
}
