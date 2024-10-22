public class Rettangolo extends Forma{

    // Costruttore
    public Rettangolo(double larghezza, double altezza) {
        //eredita il costruttore del padre
        super(larghezza,altezza);
    }

    // Eredita lo stesso nome, ma ha un comportamento diverso
    @Override
    public void calcolaArea() {
        //Super che eredita il messaggio da stampare
        super.calcolaArea();
        //Calcolo dell'area
        double area = getAltezza() * getLarghezza();
        System.out.println("L'area del rettangolo : " + area);
    }
}
