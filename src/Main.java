public class Main {
        public static void main(String[] args) {
            // Creazione di un oggetto Rettangolo e calcolo dell'area
            Forma rettangolo = new Rettangolo (5, 10 );
            rettangolo.calcolaArea();

            //Creazione di un oggetto Triangolo e calcolo dell'area
            Forma triangolo = new Triangolo(10,15);
            triangolo.calcolaArea();
        }
    }