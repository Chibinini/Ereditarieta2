class Forma {

    //fields
    private double larghezza;
    private double altezza;

    //Costruttore
    public Forma (double larghezza, double altezza){
        this.larghezza = larghezza;
        this.altezza = altezza;
    }

    //Metodo che stampa il messaggio
    public void calcolaArea() {
        System.out.println("Calcolo generale ");

    }
    //getter
    public double getLarghezza() {
        return larghezza;
    }
    //setter
    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }
}
