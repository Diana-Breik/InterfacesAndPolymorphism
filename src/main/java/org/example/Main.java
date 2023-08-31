package org.example;
//Schritt 5: In der 'main'-Methode erstellt ein Objekt der Klasse 'MediaController' und nutzt es, um sowohl einen Song als auch ein Video abzuspielen
//Schritt 6: In der 'main'-Methode initialisiert jeweils ein Objekt der Klasse 'MusicPlayer' und 'VideoPlayer' mit dem Interface 'Playable' (Polymorphismus).
public class Main {
    public static void main(String[] args) {

        MediaController mediaController = new MediaController();

        // Weise 1: Entweder erzeugen wir die Objekte zuerst und dann übergeben wir sie als Parameter ->
        //MusicPlayer musicplayer = new MusicPlayer();
        // VideoPlayer videoPlayer = new VideoPlayer();
        //mediaController.playMedia(musicplayer);
        //mediaController.playMedia(videoPlayer);

        // Weise 2: Oder die neuen Objekte erzeugen wir sofort innerhalb den Klammern als Parameter ->
        mediaController.playMedia(new MusicPlayer());
        mediaController.playMedia(new VideoPlayer());

        System.out.println("--------------------------------------------");

        // Polymorphism
        Playable musicplayer1 = new MusicPlayer();
        Playable videoPlayer1 = new VideoPlayer();
        musicplayer1.play();
        videoPlayer1.play();

        System.out.println("--------------------------------------------");

        //ick kann nur die Elemente, die auch innerhalb des Typs sind, greifen, das bedeutet:
        //Playable musicplayer2 = new MusicPlayer();// mit diesem Befehl kann ich ENTWEDER nur die Elemente und Methoden greifen,die sowohl in der Klasse "MusicPlayer" als auch in "Playable" sind, ODER die in "Playable" sind.
        MusicPlayer musicplayer2 = new MusicPlayer();//in diesem Fall kann ich alle Dinge, die in "MusicPlayer" sind, wieder greifen, weil der Typ da auch "MusicPlayer" ist.
        System.out.println(musicplayer2.isOn);
    }
}