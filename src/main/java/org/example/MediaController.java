package org.example;
//Schritt 4: Erstellt eine Klasse 'MediaController', die eine Methode 'playMedia' enthält. Diese Methode soll ein 'Playable'-Objekt als Parameter akzeptieren und die 'play'-Methode aufrufen.
public class MediaController {
    public MediaController() {
    }


     public void playMedia(Playable playable){
        playable.play();
        System.out.println("  -> Das ist die Klasse MediaController");
    }


}
