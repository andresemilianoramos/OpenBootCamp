public class switchCase {
    public static void main(String[] args) {

        String weather = "sunny";

        switch (weather){
            case "sunny":
                System.out.println("el tiempo es soleado");
                break;
            case "cloudy":
                System.out.println("esta nublado");
                break;
            default:
                System.out.println("no se ha podido identificar el clima");
        }
    }
}
