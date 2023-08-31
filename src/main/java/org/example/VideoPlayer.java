package org.example;

import java.util.Objects;
//Schritt 3: Erstellt eine Klasse 'VideoPlayer', die ebenfalls das 'Playable'-Interface implementiert. Implementiert die 'play'-Methode, um ein Video abzuspielen.
public class VideoPlayer implements Playable{
    private boolean videoOn = true;
    public VideoPlayer() {
    }

    public VideoPlayer(boolean videoOn) {
        this.videoOn = videoOn;
    }

    public boolean isVideoOn() {
        return videoOn;
    }

    public void setVideoOn(boolean videoOn) {
        this.videoOn = videoOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoPlayer that = (VideoPlayer) o;
        return videoOn == that.videoOn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoOn);
    }

    @Override
    public String toString() {
        return "VideoPlayer{" +
                "videoOn=" + videoOn +
                '}';
    }

    @Override
    public void play() {
        if(videoOn == true){
            System.out.println("Das video wurde abgespielt");
        }
    }
}
