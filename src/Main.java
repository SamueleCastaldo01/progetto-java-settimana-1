import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //grazie all'interfaccia posso creare un array comune a tutti
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        // for per creare gli oggetti
        for (int i = 0; i < 5; i++) {
            System.out.print("Inserisci il tipo di elemento (1 = Immagine, 2 = Audio, 3 = Video): ");
            int tipo = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline rimasto

            //metto il titolo per primo dato che è obbligatorio per tutti
            System.out.print("Inserisci il titolo: ");
            String titolo = scanner.nextLine();

            //gestisco i vari casi, con uno switch per richiamare i metodi giusti, per l'oggetto giusto
            switch (tipo) {
                case 1:
                    System.out.print("Inserisci la luminosità: ");
                    int luminositaImg = scanner.nextInt();
                    elementi[i] = new Immagine(titolo, luminositaImg); //instanzia l'oggetto
                    break;
                case 2:
                    System.out.print("Inserisci la durata: ");
                    int durataAudio = scanner.nextInt();
                    System.out.print("Inserisci il volume: ");
                    int volumeAudio = scanner.nextInt();
                    elementi[i] = new RegistrazioneAudio(titolo, durataAudio, volumeAudio);
                    break;
                case 3:
                    System.out.print("Inserisci la durata: ");
                    int durataVideo = scanner.nextInt();
                    System.out.print("Inserisci il volume: ");
                    int volumeVideo = scanner.nextInt();
                    System.out.print("Inserisci la luminosità: ");
                    int luminositaVideo = scanner.nextInt();
                    elementi[i] = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                    break;
                default:
                    System.out.print("Scelta non valida.");
                    i--; // serve per ripere il ciclo, incaso in cui sbagliano a inserire
                    break;
            }
        }

        // Programma per visualizzare il play oppure lo show in caso dell'immagine
        int opzione;
        do {
            System.out.print("Scegli quale elemento eseguire (1-5) o 0 per uscire: ");
            opzione = scanner.nextInt();

            if (opzione > 0 && opzione <= 5) {
                ElementoMultimediale elemento = elementi[opzione - 1];

                if (elemento instanceof Immagine) { //caso Immagine
                    ((Immagine) elemento).show();
                } else if (elemento instanceof Riproducibile) { //caso Video o RegistrazioneAudio
                    ((Riproducibile) elemento).play();
                }
            } else if (opzione != 0) {
                //quindi ripete tranquillamente il ciclo
                System.out.println("Scelta non valida.");
            }
        } while (opzione != 0); //solo quando sarà uguale a 0 allora in quel caso uscirà dal ciclo

        scanner.close();
    }
}

/*
Struttura:
interfaccia Elemento multimediale
interfaccia Riproducibile che estende l'interfaccia Elemento Multimediale
class Immagine che implementa l'interfaccia Elemento Multimediale
class RegistrazioneAudio che implementa Riproducibile
class Video che estende Registrazione Audio

Struttura dell'ereditarietà
ElementoMultimediale > Riproducibile
ElementoMultimediale > Immagine
ElementoMultimediale > Riproducibile > RegistrazioneAudio
ElementoMultimediale > Riproducibile > RegistrazioneAudio > Video
 */