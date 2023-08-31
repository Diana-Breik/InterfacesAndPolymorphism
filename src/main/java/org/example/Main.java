package org.example;
//Schritt 5: In der 'main'-Methode erstellt ein Objekt der Klasse 'MediaController' und nutzt es, um sowohl einen Song als auch ein Video abzuspielen
//Schritt 6: In der 'main'-Methode initialisiert jeweils ein Objekt der Klasse 'MusicPlayer' und 'VideoPlayer' mit dem Interface 'Playable' (Polymorphismus).
public class Main {
    public static void main(String[] args) {
        MusicPlayer musicplayer = new MusicPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();
        MediaController mediaController = new MediaController();
        mediaController.playMedia(musicplayer);
        mediaController.playMedia(videoPlayer);
        System.out.println("--------------------------------------------");
        Playable musicplayer1 = new MusicPlayer();
        Playable videoPlayer1 = new VideoPlayer();
        musicplayer1.play();
        videoPlayer1.play();

    }
}