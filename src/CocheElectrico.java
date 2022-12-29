public class CocheElectrico extends coche {
    //hereda de la clase coche
    String motorElectrico;

    public CocheElectrico(){

    }
    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                "} ";
    }
}
