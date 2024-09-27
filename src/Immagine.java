public class Immagine implements ElementoMultimediale {
    private String titolo;
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        this.titolo = titolo;
        this.luminosita = luminosita;
    }

    @Override
    public String getTitolo() {
        return titolo;
    }

    public int aumentaLuminosita() {
        return luminosita++;
    }

    public int diminuisciLuminosita() {
        return luminosita--;
    }

    public void show() {
        //repeat è un metodo della classe string che ripete quella stringa n volte
        System.out.println(titolo + " " + "*".repeat(luminosita));
    }

}
