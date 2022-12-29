public class cocheMain {
    public static void main(String[] args) {

        String coche = "alfa romeo";
        coche cocheObj = new coche();

        coche cocheObj2 = new coche("rojo", "honda", "civic",130.45,5.4);
        cocheObj2.acelerar(50);
                System.out.println(cocheObj2);


    CocheElectrico cocheElectrico = new CocheElectrico();

    cocheElectrico.motorElectrico = "ejemplo motor";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico();
    }
}
