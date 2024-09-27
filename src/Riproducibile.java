public interface Riproducibile extends ElementoMultimediale {
    //dato che è un interfaccia posso usare extends che estende un altra interfaccia
    //implements in questo caso mi dà errore dato che sono due interfacce
    int getDurata();
    void play();
}
