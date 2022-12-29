public class ContinueBrake {
        public static void main(String[] args) {
        int count = 0;
        while(count < 10){
            count++;// condicion
            if(count == 6)
                break; // rompe el flujo de ejecucion
                // continue; //salta el codigo, no lo imprime y continua a la siguiente iteracion




            System.out.println("hola mundo"+count);
        }
        System.out.println("fin");
    }
}
