public class Video extends RegistrazioneAudio {
    private int luminosita;


    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata, volume);
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void play() {
        for(int i =0; i<getDurata(); i++) {
            System.out.println(titolo + "!".repeat(getVolume()) + " " + "*".repeat(luminosita));
        }
    }

    public int aumentaLuminosita() {
        if(luminosita < 10) {
            luminosita++;
        }
        return luminosita++;
    }

    public int diminuisciLuminosita() {
        if(luminosita > 0) {
            luminosita--;
        }
        return luminosita;
    }
}
