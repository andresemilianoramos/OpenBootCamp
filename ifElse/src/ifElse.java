import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.text.StyledEditorKit;

public class ifElse {
    public static void main(String[] args) {

        boolean check = 5 < 10;

        int number1 = 5;
        int number2 = 50;
        int number3 = 30;


        if (number1<number2 && number2<number3){
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }
        System.out.println("\n==== Fin ====");
    }
}
