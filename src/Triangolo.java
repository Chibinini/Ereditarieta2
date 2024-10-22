public class Triangolo extends Forma {

    // Costruttore
    public Triangolo(double larghezza, double altezza) {
        //eredita il costruttore del padre
        super(larghezza,altezza);
    }

    // Eredita lo stesso nome, ma ha un comportamento diverso
    @Override
    public void calcolaArea() {
        //super che eredita il messaggio dalla classe padre
        super.calcolaArea();
        //Calcolo dell'area
        double area = getAltezza() * getLarghezza() / 2;
        System.out.println("L'area del rettangolo è: " + area);
    }
}
