package org.example;

import java.util.Objects;
//Schritt 2: Erstellt eine Klasse 'MusicPlayer', die das 'Playable'-Interface implementiert. Implementiert die 'play'-Methode, um einen Song abzuspielen.
public class MusicPlayer implements Playable{
    private boolean isOn = true;
    public MusicPlayer() {
    }

    public MusicPlayer(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicPlayer that = (MusicPlayer) o;
        return isOn == that.isOn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isOn);
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "isOn=" + isOn +
                '}';
    }

    @Override
    public void play() {
        if(isOn == true){
            System.out.println("Der Song wurde abgespielt");
        }
    }
}
