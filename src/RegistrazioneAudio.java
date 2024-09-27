public class RegistrazioneAudio implements Riproducibile{
    String titolo;
    private int durata;
    private int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        this.titolo = titolo;
        this.durata = durata;
        this.volume = volume;
    }

    @Override
    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void play() {
        for (int i= 0; i < durata; i++) {
            System.out.println(titolo + "!".repeat(volume));
        }
    }

    @Override
    public String getTitolo() {
        return titolo;
    }

    public int alzaVolume() {
        return volume++;
    }

    public int abbassaVolume() {
        return volume--;
    }
}
